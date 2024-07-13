package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xcarreras_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xcarreras) ","b4xcarreras",8,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xcarreras","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 16;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="Root = Root1";
Debug.ShouldStop(65536);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 19;BA.debugLine="Root.LoadLayout(\"PageCarreras\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("PageCarreras")),__ref.getField(false, "ba"));
 BA.debugLineNum = 20;BA.debugLine="apiCarreras.Initialize(\"https://appuniapivaca.azu";
Debug.ShouldStop(524288);
__ref.getField(false,"_apicarreras" /*RemoteObject*/ ).runClassMethod (b4a.example.carreras.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("https://appuniapivaca.azurewebsites.net/api/Carreras")));
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
b4xcarreras._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xcarreras._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
b4xcarreras._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xcarreras._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private txtId As EditText";
b4xcarreras._txtid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtid",b4xcarreras._txtid);
 //BA.debugLineNum = 5;BA.debugLine="Private txtNombre As EditText";
b4xcarreras._txtnombre = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtnombre",b4xcarreras._txtnombre);
 //BA.debugLineNum = 6;BA.debugLine="Private txtUniversidadId As EditText";
b4xcarreras._txtuniversidadid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtuniversidadid",b4xcarreras._txtuniversidadid);
 //BA.debugLineNum = 7;BA.debugLine="Private apiCarreras As Carreras";
b4xcarreras._apicarreras = RemoteObject.createNew ("b4a.example.carreras");__ref.setField("_apicarreras",b4xcarreras._apicarreras);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _cmdactualizar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmdActualizar_Click (b4xcarreras) ","b4xcarreras",8,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("cmdactualizar_click")) { __ref.runUserSub(false, "b4xcarreras","cmdactualizar_click", __ref); return;}
ResumableSub_cmdActualizar_Click rsub = new ResumableSub_cmdActualizar_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmdActualizar_Click extends BA.ResumableSub {
public ResumableSub_cmdActualizar_Click(b4a.example.b4xcarreras parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.b4xcarreras parent;
RemoteObject _r = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdActualizar_Click (b4xcarreras) ","b4xcarreras",8,__ref.getField(false, "ba"),__ref,57);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 58;BA.debugLine="If txtId.Text.Trim = \"\" Or txtNombre.Text.Trim =";
Debug.ShouldStop(33554432);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",__ref.getField(false,"_txtuniversidadid" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 59;BA.debugLine="Msgbox(\"Por favor, complete todos los campos\", \"";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Por favor, complete todos los campos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 60;BA.debugLine="Return";
Debug.ShouldStop(134217728);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 63;BA.debugLine="Wait For (apiCarreras.UpdateCarrera(txtId.Text, t";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xcarreras", "cmdactualizar_click"), __ref.getField(false,"_apicarreras" /*RemoteObject*/ ).runClassMethod (b4a.example.carreras.class, "_updatecarrera" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtuniversidadid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 11;
return;
case 11:
//C
this.state = 5;
_r = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("r", _r);
;
 BA.debugLineNum = 64;BA.debugLine="If r = True Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 5:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_r,parent.__c.getField(true,"True"))) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 65;BA.debugLine="Msgbox(\"Registro Actualizado\", \"OK\")";
Debug.ShouldStop(1);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro Actualizado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 67;BA.debugLine="Msgbox(\"No hay datos\", \"Error\")";
Debug.ShouldStop(4);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay datos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject __ref,RemoteObject _r) throws Exception{
}
public static void  _cmdcrear_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmdCrear_Click (b4xcarreras) ","b4xcarreras",8,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("cmdcrear_click")) { __ref.runUserSub(false, "b4xcarreras","cmdcrear_click", __ref); return;}
ResumableSub_cmdCrear_Click rsub = new ResumableSub_cmdCrear_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmdCrear_Click extends BA.ResumableSub {
public ResumableSub_cmdCrear_Click(b4a.example.b4xcarreras parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.b4xcarreras parent;
RemoteObject _c = RemoteObject.declareNull("b4a.example.carrera");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdCrear_Click (b4xcarreras) ","b4xcarreras",8,__ref.getField(false, "ba"),__ref,42);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 43;BA.debugLine="If txtNombre.Text.Trim = \"\" Or txtUniversidadId.T";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",__ref.getField(false,"_txtuniversidadid" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 44;BA.debugLine="Msgbox(\"Por favor, complete todos los campos\", \"";
Debug.ShouldStop(2048);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Por favor, complete todos los campos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 45;BA.debugLine="Return";
Debug.ShouldStop(4096);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 48;BA.debugLine="Wait For (apiCarreras.CreateCarrera(0, txtNombre.";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xcarreras", "cmdcrear_click"), __ref.getField(false,"_apicarreras" /*RemoteObject*/ ).runClassMethod (b4a.example.carreras.class, "_createcarrera" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtuniversidadid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 11;
return;
case 11:
//C
this.state = 5;
_c = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("c", _c);
;
 BA.debugLineNum = 49;BA.debugLine="If c.Id > 0 Then";
Debug.ShouldStop(65536);
if (true) break;

case 5:
//if
this.state = 10;
if (RemoteObject.solveBoolean(">",_c.getField(true,"_id" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 50;BA.debugLine="txtId.Text = c.Id";
Debug.ShouldStop(131072);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_c.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 51;BA.debugLine="Msgbox(\"Insertado el registro\", \"OK\")";
Debug.ShouldStop(262144);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Insertado el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 53;BA.debugLine="Msgbox(\"No se pudo insertar el registro\", \"OK\")";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se pudo insertar el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _cmdeliminar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmdEliminar_Click (b4xcarreras) ","b4xcarreras",8,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("cmdeliminar_click")) { __ref.runUserSub(false, "b4xcarreras","cmdeliminar_click", __ref); return;}
ResumableSub_cmdEliminar_Click rsub = new ResumableSub_cmdEliminar_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmdEliminar_Click extends BA.ResumableSub {
public ResumableSub_cmdEliminar_Click(b4a.example.b4xcarreras parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.b4xcarreras parent;
RemoteObject _r = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdEliminar_Click (b4xcarreras) ","b4xcarreras",8,__ref.getField(false, "ba"),__ref,71);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 72;BA.debugLine="If txtId.Text.Trim = \"\" Then";
Debug.ShouldStop(128);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 73;BA.debugLine="Msgbox(\"Por favor, ingrese un ID\", \"Error\")";
Debug.ShouldStop(256);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Por favor, ingrese un ID")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 74;BA.debugLine="Return";
Debug.ShouldStop(512);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 77;BA.debugLine="Wait For (apiCarreras.DeleteCarrera(txtId.Text))";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xcarreras", "cmdeliminar_click"), __ref.getField(false,"_apicarreras" /*RemoteObject*/ ).runClassMethod (b4a.example.carreras.class, "_deletecarrera" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 11;
return;
case 11:
//C
this.state = 5;
_r = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("r", _r);
;
 BA.debugLineNum = 78;BA.debugLine="If r = True Then";
Debug.ShouldStop(8192);
if (true) break;

case 5:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_r,parent.__c.getField(true,"True"))) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 79;BA.debugLine="Msgbox(\"Registro Borrado\", \"OK\")";
Debug.ShouldStop(16384);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro Borrado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 80;BA.debugLine="txtId.Text = \"\"";
Debug.ShouldStop(32768);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 81;BA.debugLine="txtNombre.Text = \"\"";
Debug.ShouldStop(65536);
__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 82;BA.debugLine="txtUniversidadId.Text = \"\"";
Debug.ShouldStop(131072);
__ref.getField(false,"_txtuniversidadid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 84;BA.debugLine="Msgbox(\"No hay datos\", \"Error\")";
Debug.ShouldStop(524288);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay datos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _cmdleer_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmdLeer_Click (b4xcarreras) ","b4xcarreras",8,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("cmdleer_click")) { __ref.runUserSub(false, "b4xcarreras","cmdleer_click", __ref); return;}
ResumableSub_cmdLeer_Click rsub = new ResumableSub_cmdLeer_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmdLeer_Click extends BA.ResumableSub {
public ResumableSub_cmdLeer_Click(b4a.example.b4xcarreras parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.b4xcarreras parent;
RemoteObject _c = RemoteObject.declareNull("b4a.example.carrera");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdLeer_Click (b4xcarreras) ","b4xcarreras",8,__ref.getField(false, "ba"),__ref,25);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 26;BA.debugLine="If txtId.Text.Trim = \"\" Then";
Debug.ShouldStop(33554432);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 27;BA.debugLine="Msgbox(\"Por favor, ingrese un ID\", \"Error\")";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Por favor, ingrese un ID")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 28;BA.debugLine="Return";
Debug.ShouldStop(134217728);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 31;BA.debugLine="Wait For (apiCarreras.ReadCarreraById(txtId.Text)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xcarreras", "cmdleer_click"), __ref.getField(false,"_apicarreras" /*RemoteObject*/ ).runClassMethod (b4a.example.carreras.class, "_readcarrerabyid" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 11;
return;
case 11:
//C
this.state = 5;
_c = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("c", _c);
;
 BA.debugLineNum = 32;BA.debugLine="If c.Id > 0 Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 5:
//if
this.state = 10;
if (RemoteObject.solveBoolean(">",_c.getField(true,"_id" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 33;BA.debugLine="txtId.Text = c.Id";
Debug.ShouldStop(1);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_c.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 34;BA.debugLine="txtNombre.Text = c.Nombre";
Debug.ShouldStop(2);
__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_c.getField(true,"_nombre" /*RemoteObject*/ )));
 BA.debugLineNum = 35;BA.debugLine="txtUniversidadId.Text = c.UniversidadId";
Debug.ShouldStop(4);
__ref.getField(false,"_txtuniversidadid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_c.getField(true,"_universidadid" /*RemoteObject*/ )));
 BA.debugLineNum = 36;BA.debugLine="Msgbox(\"Registro leído con éxito\", \"OK\")";
Debug.ShouldStop(8);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro leído con éxito")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 38;BA.debugLine="Msgbox(\"No hay datos\", \"Error\")";
Debug.ShouldStop(32);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay datos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _cmdmenu_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmdMenu_Click (b4xcarreras) ","b4xcarreras",8,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("cmdmenu_click")) { return __ref.runUserSub(false, "b4xcarreras","cmdmenu_click", __ref);}
 BA.debugLineNum = 88;BA.debugLine="Private Sub cmdMenu_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
Debug.ShouldStop(16777216);
b4xcarreras._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MainPage")));
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xcarreras) ","b4xcarreras",8,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xcarreras","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="Return Me";
Debug.ShouldStop(2048);
if (true) return __ref;
 BA.debugLineNum = 13;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}