package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class carreras_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private jsonParser As JSONParser";
carreras._jsonparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");__ref.setField("_jsonparser",carreras._jsonparser);
 //BA.debugLineNum = 4;BA.debugLine="Private apiJob As HttpJob";
carreras._apijob = RemoteObject.createNew ("b4a.example.httpjob");__ref.setField("_apijob",carreras._apijob);
 //BA.debugLineNum = 5;BA.debugLine="Public apiURL As String";
carreras._apiurl = RemoteObject.createImmutable("");__ref.setField("_apiurl",carreras._apiurl);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createcarrera(RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _universidadid) throws Exception{
try {
		Debug.PushSubsStack("CreateCarrera (carreras) ","carreras",4,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("createcarrera")) { return __ref.runUserSub(false, "carreras","createcarrera", __ref, _id, _nombre, _universidadid);}
ResumableSub_CreateCarrera rsub = new ResumableSub_CreateCarrera(null,__ref,_id,_nombre,_universidadid);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CreateCarrera extends BA.ResumableSub {
public ResumableSub_CreateCarrera(b4a.example.carreras parent,RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _universidadid) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._universidadid = _universidadid;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.carreras parent;
RemoteObject _id;
RemoteObject _nombre;
RemoteObject _universidadid;
RemoteObject _carrera = RemoteObject.declareNull("b4a.example.carrera");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CreateCarrera (carreras) ","carreras",4,__ref.getField(false, "ba"),__ref,14);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
Debug.locals.put("nombre", _nombre);
Debug.locals.put("universidadId", _universidadid);
 BA.debugLineNum = 15;BA.debugLine="Dim carrera As Carrera";
Debug.ShouldStop(16384);
_carrera = RemoteObject.createNew ("b4a.example.carrera");Debug.locals.put("carrera", _carrera);
 BA.debugLineNum = 16;BA.debugLine="Dim json As String";
Debug.ShouldStop(32768);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 17;BA.debugLine="Dim data As Map";
Debug.ShouldStop(65536);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("data", _data);
 BA.debugLineNum = 19;BA.debugLine="carrera.Initialize()";
Debug.ShouldStop(262144);
_carrera.runClassMethod (b4a.example.carrera.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 20;BA.debugLine="json = \"{'id': \" & id & \", 'nombre': '\" & nomb";
Debug.ShouldStop(524288);
_json = RemoteObject.concat(RemoteObject.createImmutable("{'id': "),_id,RemoteObject.createImmutable(", 'nombre': '"),_nombre,RemoteObject.createImmutable("', 'universidadId': "),_universidadid,RemoteObject.createImmutable("}"));Debug.locals.put("json", _json);
 BA.debugLineNum = 22;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 23;BA.debugLine="apiJob.PostString(apiURL, json)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_apiurl" /*RemoteObject*/ )),(Object)(_json));
 BA.debugLineNum = 24;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/";
Debug.ShouldStop(8388608);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 25;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "carreras", "createcarrera"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 26;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(33554432);
if (true) break;

case 1:
//if
this.state = 6;
if (_resultado.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 27;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 28;BA.debugLine="data = jsonParser.NextObject";
Debug.ShouldStop(134217728);
_data = __ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runMethod(false,"NextObject");Debug.locals.put("data", _data);
 BA.debugLineNum = 29;BA.debugLine="carrera.Id = data.Get(\"id\")";
Debug.ShouldStop(268435456);
_carrera.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 30;BA.debugLine="carrera.Nombre = data.Get(\"nombre\")";
Debug.ShouldStop(536870912);
_carrera.setField ("_nombre" /*RemoteObject*/ ,BA.ObjectToString(_data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nombre"))))));
 BA.debugLineNum = 31;BA.debugLine="carrera.UniversidadId = data.Get(\"universi";
Debug.ShouldStop(1073741824);
_carrera.setField ("_universidadid" /*RemoteObject*/ ,BA.numberCast(int.class, _data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("universidadId"))))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 33;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","338404115",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 36;BA.debugLine="Return carrera";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_carrera));return;};
 BA.debugLineNum = 37;BA.debugLine="End Sub";
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
public static void  _jobdone(RemoteObject __ref,RemoteObject _resultado) throws Exception{
}
public static RemoteObject  _deletecarrera(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("DeleteCarrera (carreras) ","carreras",4,__ref.getField(false, "ba"),__ref,120);
if (RapidSub.canDelegate("deletecarrera")) { return __ref.runUserSub(false, "carreras","deletecarrera", __ref, _id);}
ResumableSub_DeleteCarrera rsub = new ResumableSub_DeleteCarrera(null,__ref,_id);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DeleteCarrera extends BA.ResumableSub {
public ResumableSub_DeleteCarrera(b4a.example.carreras parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.carreras parent;
RemoteObject _id;
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DeleteCarrera (carreras) ","carreras",4,__ref.getField(false, "ba"),__ref,120);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
 BA.debugLineNum = 121;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 122;BA.debugLine="apiJob.Delete(apiURL & \"/\" & id)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_delete" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 124;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "carreras", "deletecarrera"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 125;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 6;
if (_resultado.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 126;BA.debugLine="Return True";
Debug.ShouldStop(536870912);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 128;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","338666248",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 130;BA.debugLine="Return False";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("Initialize (carreras) ","carreras",4,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "carreras","initialize", __ref, _ba, _url);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("url", _url);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(url As String)";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="apiURL = url";
Debug.ShouldStop(512);
__ref.setField ("_apiurl" /*RemoteObject*/ ,_url);
 BA.debugLineNum = 11;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _readallcarreras(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ReadAllCarreras (carreras) ","carreras",4,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("readallcarreras")) { return __ref.runUserSub(false, "carreras","readallcarreras", __ref);}
ResumableSub_ReadAllCarreras rsub = new ResumableSub_ReadAllCarreras(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ReadAllCarreras extends BA.ResumableSub {
public ResumableSub_ReadAllCarreras(b4a.example.carreras parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.carreras parent;
RemoteObject _carreras = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _carrera = RemoteObject.declareNull("b4a.example.carrera");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");
int _i = 0;
int step14;
int limit14;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ReadAllCarreras (carreras) ","carreras",4,__ref.getField(false, "ba"),__ref,40);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 41;BA.debugLine="Dim carreras As List";
Debug.ShouldStop(256);
_carreras = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("carreras", _carreras);
 BA.debugLineNum = 42;BA.debugLine="Dim carrera As Carrera";
Debug.ShouldStop(512);
_carrera = RemoteObject.createNew ("b4a.example.carrera");Debug.locals.put("carrera", _carrera);
 BA.debugLineNum = 43;BA.debugLine="Dim map As Map";
Debug.ShouldStop(1024);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 44;BA.debugLine="Dim lst As List";
Debug.ShouldStop(2048);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 46;BA.debugLine="carreras.Initialize";
Debug.ShouldStop(8192);
_carreras.runVoidMethod ("Initialize");
 BA.debugLineNum = 48;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(32768);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 49;BA.debugLine="Log(\"Request URL: \" & apiURL)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","338469641",RemoteObject.concat(RemoteObject.createImmutable("Request URL: "),__ref.getField(true,"_apiurl" /*RemoteObject*/ )),0);
 BA.debugLineNum = 50;BA.debugLine="apiJob.Download(apiURL)";
Debug.ShouldStop(131072);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_apiurl" /*RemoteObject*/ )));
 BA.debugLineNum = 51;BA.debugLine="Wait For(apiJob) JobDone(resultado As HttpJob)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "carreras", "readallcarreras"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 52;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 10;
if (_resultado.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 53;BA.debugLine="Log(\"Response: \" & resultado.GetString)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("LogImpl","338469645",RemoteObject.concat(RemoteObject.createImmutable("Response: "),_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )),0);
 BA.debugLineNum = 54;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 55;BA.debugLine="lst = jsonParser.NextArray";
Debug.ShouldStop(4194304);
_lst = __ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runMethod(false,"NextArray");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 56;BA.debugLine="For i = 0 To lst.Size - 1";
Debug.ShouldStop(8388608);
if (true) break;

case 4:
//for
this.state = 7;
step14 = 1;
limit14 = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 12;
if (true) break;

case 12:
//C
this.state = 7;
if ((step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14)) this.state = 6;
if (true) break;

case 13:
//C
this.state = 12;
_i = ((int)(0 + _i + step14)) ;
Debug.locals.put("i", _i);
if (true) break;

case 6:
//C
this.state = 13;
 BA.debugLineNum = 57;BA.debugLine="map = lst.Get(i)";
Debug.ShouldStop(16777216);
_map = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("map", _map);
 BA.debugLineNum = 58;BA.debugLine="Dim carrera As Carrera";
Debug.ShouldStop(33554432);
_carrera = RemoteObject.createNew ("b4a.example.carrera");Debug.locals.put("carrera", _carrera);
 BA.debugLineNum = 59;BA.debugLine="carrera.Initialize";
Debug.ShouldStop(67108864);
_carrera.runClassMethod (b4a.example.carrera.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 60;BA.debugLine="carrera.Id = map.Get(\"id\")";
Debug.ShouldStop(134217728);
_carrera.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 61;BA.debugLine="carrera.Nombre = map.Get(\"nombre\")";
Debug.ShouldStop(268435456);
_carrera.setField ("_nombre" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nombre"))))));
 BA.debugLineNum = 62;BA.debugLine="carrera.UniversidadId = map.Get(\"unive";
Debug.ShouldStop(536870912);
_carrera.setField ("_universidadid" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("universidadId"))))));
 BA.debugLineNum = 63;BA.debugLine="carreras.Add(carrera)";
Debug.ShouldStop(1073741824);
_carreras.runVoidMethod ("Add",(Object)((_carrera)));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
Debug.locals.put("i", _i);
;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 66;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("LogImpl","338469658",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 67;BA.debugLine="Log(\"Response: \" & resultado.GetString)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","338469659",RemoteObject.concat(RemoteObject.createImmutable("Response: "),_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 71;BA.debugLine="Return carreras";
Debug.ShouldStop(64);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_carreras));return;};
 BA.debugLineNum = 72;BA.debugLine="End Sub";
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
public static RemoteObject  _readcarrerabyid(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("ReadCarreraById (carreras) ","carreras",4,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("readcarrerabyid")) { return __ref.runUserSub(false, "carreras","readcarrerabyid", __ref, _id);}
ResumableSub_ReadCarreraById rsub = new ResumableSub_ReadCarreraById(null,__ref,_id);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ReadCarreraById extends BA.ResumableSub {
public ResumableSub_ReadCarreraById(b4a.example.carreras parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.carreras parent;
RemoteObject _id;
RemoteObject _carrera = RemoteObject.declareNull("b4a.example.carrera");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ReadCarreraById (carreras) ","carreras",4,__ref.getField(false, "ba"),__ref,75);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
 BA.debugLineNum = 76;BA.debugLine="Dim carrera As Carrera";
Debug.ShouldStop(2048);
_carrera = RemoteObject.createNew ("b4a.example.carrera");Debug.locals.put("carrera", _carrera);
 BA.debugLineNum = 77;BA.debugLine="carrera.Initialize";
Debug.ShouldStop(4096);
_carrera.runClassMethod (b4a.example.carrera.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 79;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(16384);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 80;BA.debugLine="Dim url As String = apiURL & \"/\" & id";
Debug.ShouldStop(32768);
_url = RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id);Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 81;BA.debugLine="Log(\"Request URL: \" & url)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","338535174",RemoteObject.concat(RemoteObject.createImmutable("Request URL: "),_url),0);
 BA.debugLineNum = 82;BA.debugLine="apiJob.Download(url)";
Debug.ShouldStop(131072);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_url));
 BA.debugLineNum = 83;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "carreras", "readcarrerabyid"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 84;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 6;
if (_resultado.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 85;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 86;BA.debugLine="Dim map As Map = jsonParser.NextObject";
Debug.ShouldStop(2097152);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map = __ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runMethod(false,"NextObject");Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 87;BA.debugLine="carrera.Id = map.Get(\"id\")";
Debug.ShouldStop(4194304);
_carrera.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 88;BA.debugLine="carrera.Nombre = map.Get(\"nombre\")";
Debug.ShouldStop(8388608);
_carrera.setField ("_nombre" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nombre"))))));
 BA.debugLineNum = 89;BA.debugLine="carrera.UniversidadId = map.Get(\"universid";
Debug.ShouldStop(16777216);
_carrera.setField ("_universidadid" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("universidadId"))))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 91;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","338535184",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 94;BA.debugLine="Return carrera";
Debug.ShouldStop(536870912);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_carrera));return;};
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
public static RemoteObject  _updatecarrera(RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _universidadid) throws Exception{
try {
		Debug.PushSubsStack("UpdateCarrera (carreras) ","carreras",4,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("updatecarrera")) { return __ref.runUserSub(false, "carreras","updatecarrera", __ref, _id, _nombre, _universidadid);}
ResumableSub_UpdateCarrera rsub = new ResumableSub_UpdateCarrera(null,__ref,_id,_nombre,_universidadid);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_UpdateCarrera extends BA.ResumableSub {
public ResumableSub_UpdateCarrera(b4a.example.carreras parent,RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _universidadid) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._universidadid = _universidadid;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.carreras parent;
RemoteObject _id;
RemoteObject _nombre;
RemoteObject _universidadid;
RemoteObject _carrera = RemoteObject.declareNull("b4a.example.carrera");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("UpdateCarrera (carreras) ","carreras",4,__ref.getField(false, "ba"),__ref,98);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
Debug.locals.put("nombre", _nombre);
Debug.locals.put("universidadId", _universidadid);
 BA.debugLineNum = 99;BA.debugLine="Dim carrera As Carrera";
Debug.ShouldStop(4);
_carrera = RemoteObject.createNew ("b4a.example.carrera");Debug.locals.put("carrera", _carrera);
 BA.debugLineNum = 100;BA.debugLine="Dim json As String";
Debug.ShouldStop(8);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 102;BA.debugLine="carrera.Initialize()";
Debug.ShouldStop(32);
_carrera.runClassMethod (b4a.example.carrera.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 103;BA.debugLine="json = \"{'id': \" & id & \", 'nombre': '\" & nomb";
Debug.ShouldStop(64);
_json = RemoteObject.concat(RemoteObject.createImmutable("{'id': "),_id,RemoteObject.createImmutable(", 'nombre': '"),_nombre,RemoteObject.createImmutable("', 'universidadId': "),_universidadid,RemoteObject.createImmutable("}"));Debug.locals.put("json", _json);
 BA.debugLineNum = 105;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(256);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 106;BA.debugLine="apiJob.PutString(apiURL & \"/\" & id, json)";
Debug.ShouldStop(512);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_putstring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)),(Object)(_json));
 BA.debugLineNum = 107;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/";
Debug.ShouldStop(1024);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 109;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "carreras", "updatecarrera"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 110;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 6;
if (_resultado.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 111;BA.debugLine="Return True";
Debug.ShouldStop(16384);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 113;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","338600719",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 115;BA.debugLine="Return False";
Debug.ShouldStop(262144);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
}