B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
'Clase API para Carreras
Sub Class_Globals
    Private jsonParser As JSONParser
    Private apiJob As HttpJob
    Public apiURL As String
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(url As String)
    apiURL = url
End Sub

' Método para crear una nueva carrera
Public Sub CreateCarrera(id As Int, nombre As String, universidadId As Int) As ResumableSub
    Dim carrera As Carrera
    Dim json As String
    Dim data As Map

    carrera.Initialize()
    json = "{'id': " & id & ", 'nombre': '" & nombre & "', 'universidadId': " & universidadId & "}"

    apiJob.Initialize("", Me)
    apiJob.PostString(apiURL, json)
    apiJob.GetRequest.SetContentType("application/json")
    Wait For(apiJob) jobDone(resultado As HttpJob)
    If resultado.Success Then
        jsonParser.Initialize(resultado.GetString)
        data = jsonParser.NextObject
        carrera.Id = data.Get("id")
        carrera.Nombre = data.Get("nombre")
        carrera.UniversidadId = data.Get("universidadId")
    Else
        Log("Error: " & resultado.ErrorMessage)
       
    End If
    Return carrera
End Sub

' Método para obtener todas las carreras
Public Sub ReadAllCarreras() As ResumableSub
    Dim carreras As List
    Dim carrera As Carrera
    Dim map As Map
    Dim lst As List

    carreras.Initialize

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
            Dim carrera As Carrera
            carrera.Initialize
            carrera.Id = map.Get("id")
            carrera.Nombre = map.Get("nombre")
            carrera.UniversidadId = map.Get("universidadId")
            carreras.Add(carrera)
        Next
    Else
        Log("Error: " & resultado.ErrorMessage)
        Log("Response: " & resultado.GetString)
        
    End If

    Return carreras
End Sub

' Método para obtener una carrera por ID
Public Sub ReadCarreraById(id As Int) As ResumableSub
    Dim carrera As Carrera
    carrera.Initialize

    apiJob.Initialize("", Me)
    Dim url As String = apiURL & "/" & id
    Log("Request URL: " & url)
    apiJob.Download(url)
    Wait For(apiJob) jobDone(resultado As HttpJob)
    If resultado.Success Then
        jsonParser.Initialize(resultado.GetString)
        Dim map As Map = jsonParser.NextObject
        carrera.Id = map.Get("id")
        carrera.Nombre = map.Get("nombre")
        carrera.UniversidadId = map.Get("universidadId")
    Else
        Log("Error: " & resultado.ErrorMessage)
        
    End If
    Return carrera
End Sub

' Método para actualizar una carrera
Public Sub UpdateCarrera(id As Int, nombre As String, universidadId As Int) As ResumableSub
    Dim carrera As Carrera
    Dim json As String

    carrera.Initialize()
    json = "{'id': " & id & ", 'nombre': '" & nombre & "', 'universidadId': " & universidadId & "}"

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

' Método para eliminar una carrera
Public Sub DeleteCarrera(id As Int) As ResumableSub
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
