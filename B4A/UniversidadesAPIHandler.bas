B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
' UniversidadesAPIHandler module
Sub Class_Globals
	Private jsonParser As JSONParser
	Private apiJob As HttpJob
	Public ApiURL As String
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize (url As String)
	ApiURL = url
End Sub

Public Sub ReadAll() As ResumableSub
	Dim deps As List
	deps.Initialize
	apiJob.Initialize("", Me)
	apiJob.Download(ApiURL)
	Wait For (apiJob) JobDone(apiJob As HttpJob)
	If apiJob.Success Then
		jsonParser.Initialize(apiJob.GetString)
		Dim lst As List = jsonParser.NextArray
		For Each map As Map In lst
			deps.Add(map)
		Next
	Else
		Log("Error: " & apiJob.ErrorMessage)
	End If
	Return deps
End Sub

Public Sub Read_ById(id As Int) As ResumableSub
	apiJob.Initialize("", Me)
	apiJob.Download(ApiURL & "/" & id)
	Dim item As Map
	Wait For (apiJob) JobDone(apiJob As HttpJob)
	If apiJob.Success Then
		jsonParser.Initialize(apiJob.GetString)
		item = jsonParser.NextObject
	Else
		Log("Error: " & apiJob.ErrorMessage)
	End If
	Return item
End Sub

Public Sub Create(data As Map) As ResumableSub
	Dim json As String = MapToJson(data)
	apiJob.Initialize("", Me)
	apiJob.PostString(ApiURL, json)
	apiJob.GetRequest.SetContentType("application/json")
	Wait For (apiJob) JobDone(apiJob As HttpJob)
	Return apiJob.Success
End Sub

Public Sub Update(id As Int, data As Map) As ResumableSub
	Dim json As String = MapToJson(data)
	apiJob.Initialize("", Me)
	apiJob.PutString(ApiURL & "/" & id, json)
	apiJob.GetRequest.SetContentType("application/json")
	Wait For (apiJob) JobDone(apiJob As HttpJob)
	Return apiJob.Success
End Sub

Public Sub Delete(id As Int) As ResumableSub
	apiJob.Initialize("", Me)
	apiJob.Delete(ApiURL & "/" & id)
	Wait For (apiJob) JobDone(apiJob As HttpJob)
	Return apiJob.Success
End Sub

Private Sub MapToJson(data As Map) As String
	Dim jsonGenerator As JSONGenerator
	jsonGenerator.Initialize(data)
	Return jsonGenerator.ToString
End Sub
