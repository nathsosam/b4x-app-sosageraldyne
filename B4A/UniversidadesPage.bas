B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
' UniversidadesPage module
Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private ListView1 As ListView
	Private BtnAdd As Button
	Private BtnEdit As Button
	Private BtnDelete As Button
	Private apiHandler As UniversidadesAPIHandler
	Private selectedUniversity As Map
End Sub

Public Sub Initialize
	apiHandler.Initialize("https://appuniapivaca.azurewebsites.net/api/Universidades")
End Sub

Public Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("UniversidadesLayout")
	LoadUniversidades
End Sub

' Cargar universidades desde la API
Sub LoadUniversidades
	Dim result As ResumableSub = apiHandler.ReadAll
	Wait For (result) Complete (universidades As List)
	If universidades <> Null Then
		ListView1.Clear
		For Each universidad As Map In universidades
			ListView1.AddSingleLine2(universidad.Get("nombre"), universidad)
		Next
	Else
		xui.MsgboxAsync("Error loading universities", "Error")
	End If
End Sub

' Agregar universidad
Sub BtnAdd_Click
	Dim data As Map
	data.Initialize
	data.Put("id", 0)
	data.Put("nombre", "Nueva Universidad")
	data.Put("ubicacion", "Ubicación")
	Dim result As ResumableSub = apiHandler.Create(data)
	Wait For (result) Complete (success As Boolean)
	If success Then
		LoadUniversidades
	Else
		xui.MsgboxAsync("Error adding university", "Error")
	End If
End Sub

' Editar universidad
Sub BtnEdit_Click
	If selectedUniversity = Null Then
		xui.MsgboxAsync("Please select a university to edit.", "Edit University")
		Return
	End If
	Dim data As Map
	data.Initialize
	data.Put("id", selectedUniversity.Get("id"))
	data.Put("nombre", selectedUniversity.Get("nombre") & " - Editado")
	data.Put("ubicacion", selectedUniversity.Get("ubicacion"))
	Dim result As ResumableSub = apiHandler.Update(selectedUniversity.Get("id"), data)
	Wait For (result) Complete (success As Boolean)
	If success Then
		LoadUniversidades
	Else
		xui.MsgboxAsync("Error updating university", "Error")
	End If
End Sub

' Eliminar universidad
Sub BtnDelete_Click
	If selectedUniversity = Null Then
		xui.MsgboxAsync("Please select a university to delete.", "Delete University")
		Return
	End If
	Dim result As ResumableSub = apiHandler.Delete(selectedUniversity.Get("id"))
	Wait For (result) Complete (success As Boolean)
	If success Then
		LoadUniversidades
	Else
		xui.MsgboxAsync("Error deleting university", "Error")
	End If
End Sub

' Evento ItemClick del ListView
Sub ListView1_ItemClick (Position As Int, Value As Object)
	selectedUniversity = Value
End Sub
