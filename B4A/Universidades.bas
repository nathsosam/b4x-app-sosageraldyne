B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@

'Clase API para Universidades
Sub Class_Globals
    Private jsonParser As JSONParser
    Private apiJob As HttpJob
    Public apiURL As String
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(url As String)
    apiURL = url
End Sub

' Método para crear una nueva universidad
Public Sub CreateUniversidad(id As Int, nombre As String, ubicacion As String) As ResumableSub
    Dim universidad As Universidad
    Dim json As String
    Dim data As Map

    universidad.Initialize()
    json = "{'id': " & id & ", 'nombre': '" & nombre & "', 'ubicacion': '" & ubicacion & "'}"

    apiJob.Initialize("", Me)
    apiJob.PostString(apiURL, json)
    apiJob.GetRequest.SetContentType("application/json")
    Wait For(apiJob) jobDone(resultado As HttpJob)
    If resultado.Success Then
        jsonParser.Initialize(resultado.GetString)
        data = jsonParser.NextObject
        universidad.Id = data.Get("id")
        universidad.Nombre = data.Get("nombre")
        universidad.Ubicacion = data.Get("ubicacion")
    Else
        Log("Error: " & resultado.ErrorMessage)
    End If
    Return universidad
End Sub

' Método para obtener todas las universidades
Public Sub ReadAllUniversidades() As ResumableSub
    Dim universidades As List
    Dim universidad As Universidad
    Dim map As Map
    Dim lst As List

    universidades.Initialize

    apiJob.Initialize("", Me)
    Log("Request URL: " & apiURL)
    apiJob.Download(apiURL)
    Wait For(apiJob) JobDone(resultado As HttpJob)
    If resultado.Success Then
        Log("Response: " & resultado.GetString)
        jsonParser.Initialize(resultado.GetString)
        lst = jsonParser.NextArray
        For i = 0 To lst.Size - 1
            map = lst.Get(i)
            Dim universidad As Universidad
            universidad.Initialize
            universidad.Id = map.Get("id")
            universidad.Nombre = map.Get("nombre")
            universidad.Ubicacion = map.Get("ubicacion")
            universidades.Add(universidad)
        Next
    Else
        Log("Error: " & resultado.ErrorMessage)
        Log("Response: " & resultado.GetString)
    End If

    Return universidades
End Sub

' Método para obtener una universidad por ID
Public Sub ReadUniversidadById(id As Int) As ResumableSub
    Dim universidad As Universidad
    universidad.Initialize

    apiJob.Initialize("", Me)
    Dim url As String = apiURL & "/" & id
    Log("Request URL: " & url)
    apiJob.Download(url)
    Wait For(apiJob) jobDone(resultado As HttpJob)
    If resultado.Success Then
        jsonParser.Initialize(resultado.GetString)
        Dim map As Map = jsonParser.NextObject
        universidad.Id = map.Get("id")
        universidad.Nombre = map.Get("nombre")
        universidad.Ubicacion = map.Get("ubicacion")
    Else
        Log("Error: " & resultado.ErrorMessage)
    End If
    Return universidad
End Sub

' Método para actualizar una universidad
Public Sub UpdateUniversidad(id As Int, nombre As String, ubicacion As String) As ResumableSub
    Dim universidad As Universidad
    Dim json As String

    universidad.Initialize()
    json = "{'id': " & id & ", 'nombre': '" & nombre & "', 'ubicacion': '" & ubicacion & "'}"

    apiJob.Initialize("", Me)
    apiJob.PutString(apiURL & "/" & id, json)
    apiJob.GetRequest.SetContentType("application/json")
    Wait For(apiJob) jobDone(resultado As HttpJob)
    If resultado.Success Then
        Return True
    Else
        Log("Error: " & resultado.ErrorMessage)
        Return False
    End If
End Sub

' Método para eliminar una universidad
Public Sub DeleteUniversidad(id As Int) As ResumableSub
    apiJob.Initialize("", Me)
    apiJob.Delete(apiURL & "/" & id)

    Wait For(apiJob) jobDone(resultado As HttpJob)
    If resultado.Success Then
        Return True
    Else
        Log("Error: " & resultado.ErrorMessage)
        Return False
    End If
End Sub
