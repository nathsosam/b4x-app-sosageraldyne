B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private txtId As EditText
	Private txtNombre As EditText
	Private txtUniversidadId As EditText
	Private apiCarreras As Carreras
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("PageCarreras")
	apiCarreras.Initialize("https://appuniapivaca.azurewebsites.net/api/Carreras")
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub cmdLeer_Click
	If txtId.Text.Trim = "" Then
		Msgbox("Por favor, ingrese un ID", "Error")
		Return
	End If

	Wait For (apiCarreras.ReadCarreraById(txtId.Text)) Complete (c As Carrera)
	If c.Id > 0 Then
		txtId.Text = c.Id
		txtNombre.Text = c.Nombre
		txtUniversidadId.Text = c.UniversidadId
		Msgbox("Registro leído con éxito", "OK")
	Else
		Msgbox("No hay datos", "Error")
	End If
End Sub

Private Sub cmdCrear_Click
	If txtNombre.Text.Trim = "" Or txtUniversidadId.Text.Trim = "" Then
		Msgbox("Por favor, complete todos los campos", "Error")
		Return
	End If

	Wait For (apiCarreras.CreateCarrera(0, txtNombre.Text, txtUniversidadId.Text)) Complete (c As Carrera)
	If c.Id > 0 Then
		txtId.Text = c.Id
		Msgbox("Insertado el registro", "OK")
	Else
		Msgbox("No se pudo insertar el registro", "OK")
	End If
End Sub

Private Sub cmdActualizar_Click
	If txtId.Text.Trim = "" Or txtNombre.Text.Trim = "" Or txtUniversidadId.Text.Trim = "" Then
		Msgbox("Por favor, complete todos los campos", "Error")
		Return
	End If

	Wait For (apiCarreras.UpdateCarrera(txtId.Text, txtNombre.Text, txtUniversidadId.Text)) Complete (r As Boolean)
	If r = True Then
		Msgbox("Registro Actualizado", "OK")
	Else
		Msgbox("No hay datos", "Error")
	End If
End Sub

Private Sub cmdEliminar_Click
	If txtId.Text.Trim = "" Then
		Msgbox("Por favor, ingrese un ID", "Error")
		Return
	End If

	Wait For (apiCarreras.DeleteCarrera(txtId.Text)) Complete (r As Boolean)
	If r = True Then
		Msgbox("Registro Borrado", "OK")
		txtId.Text = ""
		txtNombre.Text = ""
		txtUniversidadId.Text = ""
	Else
		Msgbox("No hay datos", "Error")
	End If
End Sub

Private Sub cmdMenu_Click
	B4XPages.ShowPage("MainPage")
End Sub
