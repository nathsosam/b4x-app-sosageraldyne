package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class universidades_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private jsonParser As JSONParser";
universidades._jsonparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");__ref.setField("_jsonparser",universidades._jsonparser);
 //BA.debugLineNum = 5;BA.debugLine="Private apiJob As HttpJob";
universidades._apijob = RemoteObject.createNew ("b4a.example.httpjob");__ref.setField("_apijob",universidades._apijob);
 //BA.debugLineNum = 6;BA.debugLine="Public apiURL As String";
universidades._apiurl = RemoteObject.createImmutable("");__ref.setField("_apiurl",universidades._apiurl);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createuniversidad(RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _ubicacion) throws Exception{
try {
		Debug.PushSubsStack("CreateUniversidad (universidades) ","universidades",6,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("createuniversidad")) { return __ref.runUserSub(false, "universidades","createuniversidad", __ref, _id, _nombre, _ubicacion);}
ResumableSub_CreateUniversidad rsub = new ResumableSub_CreateUniversidad(null,__ref,_id,_nombre,_ubicacion);
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
public static class ResumableSub_CreateUniversidad extends BA.ResumableSub {
public ResumableSub_CreateUniversidad(b4a.example.universidades parent,RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _ubicacion) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._ubicacion = _ubicacion;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.universidades parent;
RemoteObject _id;
RemoteObject _nombre;
RemoteObject _ubicacion;
RemoteObject _universidad = RemoteObject.declareNull("b4a.example.universidad");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CreateUniversidad (universidades) ","universidades",6,__ref.getField(false, "ba"),__ref,15);
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
Debug.locals.put("ubicacion", _ubicacion);
 BA.debugLineNum = 16;BA.debugLine="Dim universidad As Universidad";
Debug.ShouldStop(32768);
_universidad = RemoteObject.createNew ("b4a.example.universidad");Debug.locals.put("universidad", _universidad);
 BA.debugLineNum = 17;BA.debugLine="Dim json As String";
Debug.ShouldStop(65536);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 18;BA.debugLine="Dim data As Map";
Debug.ShouldStop(131072);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("data", _data);
 BA.debugLineNum = 20;BA.debugLine="universidad.Initialize()";
Debug.ShouldStop(524288);
_universidad.runClassMethod (b4a.example.universidad.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 21;BA.debugLine="json = \"{'id': \" & id & \", 'nombre': '\" & nomb";
Debug.ShouldStop(1048576);
_json = RemoteObject.concat(RemoteObject.createImmutable("{'id': "),_id,RemoteObject.createImmutable(", 'nombre': '"),_nombre,RemoteObject.createImmutable("', 'ubicacion': '"),_ubicacion,RemoteObject.createImmutable("'}"));Debug.locals.put("json", _json);
 BA.debugLineNum = 23;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 24;BA.debugLine="apiJob.PostString(apiURL, json)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_apiurl" /*RemoteObject*/ )),(Object)(_json));
 BA.debugLineNum = 25;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/";
Debug.ShouldStop(16777216);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 26;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "universidades", "createuniversidad"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 27;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(67108864);
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
 BA.debugLineNum = 28;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 29;BA.debugLine="data = jsonParser.NextObject";
Debug.ShouldStop(268435456);
_data = __ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runMethod(false,"NextObject");Debug.locals.put("data", _data);
 BA.debugLineNum = 30;BA.debugLine="universidad.Id = data.Get(\"id\")";
Debug.ShouldStop(536870912);
_universidad.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 31;BA.debugLine="universidad.Nombre = data.Get(\"nombre\")";
Debug.ShouldStop(1073741824);
_universidad.setField ("_nombre" /*RemoteObject*/ ,BA.ObjectToString(_data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nombre"))))));
 BA.debugLineNum = 32;BA.debugLine="universidad.Ubicacion = data.Get(\"ubicacio";
Debug.ShouldStop(-2147483648);
_universidad.setField ("_ubicacion" /*RemoteObject*/ ,BA.ObjectToString(_data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ubicacion"))))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 34;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("LogImpl","338731795",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 36;BA.debugLine="Return universidad";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_universidad));return;};
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
public static RemoteObject  _deleteuniversidad(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("DeleteUniversidad (universidades) ","universidades",6,__ref.getField(false, "ba"),__ref,116);
if (RapidSub.canDelegate("deleteuniversidad")) { return __ref.runUserSub(false, "universidades","deleteuniversidad", __ref, _id);}
ResumableSub_DeleteUniversidad rsub = new ResumableSub_DeleteUniversidad(null,__ref,_id);
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
public static class ResumableSub_DeleteUniversidad extends BA.ResumableSub {
public ResumableSub_DeleteUniversidad(b4a.example.universidades parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.universidades parent;
RemoteObject _id;
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DeleteUniversidad (universidades) ","universidades",6,__ref.getField(false, "ba"),__ref,116);
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
 BA.debugLineNum = 117;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 118;BA.debugLine="apiJob.Delete(apiURL & \"/\" & id)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_delete" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 120;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "universidades", "deleteuniversidad"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 121;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 122;BA.debugLine="Return True";
Debug.ShouldStop(33554432);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 124;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","338993928",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 125;BA.debugLine="Return False";
Debug.ShouldStop(268435456);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 127;BA.debugLine="End Sub";
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("Initialize (universidades) ","universidades",6,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "universidades","initialize", __ref, _ba, _url);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("url", _url);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(url As String)";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="apiURL = url";
Debug.ShouldStop(1024);
__ref.setField ("_apiurl" /*RemoteObject*/ ,_url);
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _readalluniversidades(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ReadAllUniversidades (universidades) ","universidades",6,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("readalluniversidades")) { return __ref.runUserSub(false, "universidades","readalluniversidades", __ref);}
ResumableSub_ReadAllUniversidades rsub = new ResumableSub_ReadAllUniversidades(null,__ref);
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
public static class ResumableSub_ReadAllUniversidades extends BA.ResumableSub {
public ResumableSub_ReadAllUniversidades(b4a.example.universidades parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.universidades parent;
RemoteObject _universidades = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _universidad = RemoteObject.declareNull("b4a.example.universidad");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");
int _i = 0;
int step14;
int limit14;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ReadAllUniversidades (universidades) ","universidades",6,__ref.getField(false, "ba"),__ref,40);
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
 BA.debugLineNum = 41;BA.debugLine="Dim universidades As List";
Debug.ShouldStop(256);
_universidades = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("universidades", _universidades);
 BA.debugLineNum = 42;BA.debugLine="Dim universidad As Universidad";
Debug.ShouldStop(512);
_universidad = RemoteObject.createNew ("b4a.example.universidad");Debug.locals.put("universidad", _universidad);
 BA.debugLineNum = 43;BA.debugLine="Dim map As Map";
Debug.ShouldStop(1024);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 44;BA.debugLine="Dim lst As List";
Debug.ShouldStop(2048);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 46;BA.debugLine="universidades.Initialize";
Debug.ShouldStop(8192);
_universidades.runVoidMethod ("Initialize");
 BA.debugLineNum = 48;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(32768);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 49;BA.debugLine="Log(\"Request URL: \" & apiURL)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","338797321",RemoteObject.concat(RemoteObject.createImmutable("Request URL: "),__ref.getField(true,"_apiurl" /*RemoteObject*/ )),0);
 BA.debugLineNum = 50;BA.debugLine="apiJob.Download(apiURL)";
Debug.ShouldStop(131072);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_apiurl" /*RemoteObject*/ )));
 BA.debugLineNum = 51;BA.debugLine="Wait For(apiJob) JobDone(resultado As HttpJob)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "universidades", "readalluniversidades"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
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
parent.__c.runVoidMethod ("LogImpl","338797325",RemoteObject.concat(RemoteObject.createImmutable("Response: "),_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )),0);
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
 BA.debugLineNum = 58;BA.debugLine="Dim universidad As Universidad";
Debug.ShouldStop(33554432);
_universidad = RemoteObject.createNew ("b4a.example.universidad");Debug.locals.put("universidad", _universidad);
 BA.debugLineNum = 59;BA.debugLine="universidad.Initialize";
Debug.ShouldStop(67108864);
_universidad.runClassMethod (b4a.example.universidad.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 60;BA.debugLine="universidad.Id = map.Get(\"id\")";
Debug.ShouldStop(134217728);
_universidad.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 61;BA.debugLine="universidad.Nombre = map.Get(\"nombre\")";
Debug.ShouldStop(268435456);
_universidad.setField ("_nombre" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nombre"))))));
 BA.debugLineNum = 62;BA.debugLine="universidad.Ubicacion = map.Get(\"ubica";
Debug.ShouldStop(536870912);
_universidad.setField ("_ubicacion" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ubicacion"))))));
 BA.debugLineNum = 63;BA.debugLine="universidades.Add(universidad)";
Debug.ShouldStop(1073741824);
_universidades.runVoidMethod ("Add",(Object)((_universidad)));
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
parent.__c.runVoidMethod ("LogImpl","338797338",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 67;BA.debugLine="Log(\"Response: \" & resultado.GetString)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","338797339",RemoteObject.concat(RemoteObject.createImmutable("Response: "),_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 70;BA.debugLine="Return universidades";
Debug.ShouldStop(32);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_universidades));return;};
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
public static RemoteObject  _readuniversidadbyid(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("ReadUniversidadById (universidades) ","universidades",6,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("readuniversidadbyid")) { return __ref.runUserSub(false, "universidades","readuniversidadbyid", __ref, _id);}
ResumableSub_ReadUniversidadById rsub = new ResumableSub_ReadUniversidadById(null,__ref,_id);
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
public static class ResumableSub_ReadUniversidadById extends BA.ResumableSub {
public ResumableSub_ReadUniversidadById(b4a.example.universidades parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.universidades parent;
RemoteObject _id;
RemoteObject _universidad = RemoteObject.declareNull("b4a.example.universidad");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ReadUniversidadById (universidades) ","universidades",6,__ref.getField(false, "ba"),__ref,74);
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
 BA.debugLineNum = 75;BA.debugLine="Dim universidad As Universidad";
Debug.ShouldStop(1024);
_universidad = RemoteObject.createNew ("b4a.example.universidad");Debug.locals.put("universidad", _universidad);
 BA.debugLineNum = 76;BA.debugLine="universidad.Initialize";
Debug.ShouldStop(2048);
_universidad.runClassMethod (b4a.example.universidad.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 78;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(8192);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 79;BA.debugLine="Dim url As String = apiURL & \"/\" & id";
Debug.ShouldStop(16384);
_url = RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id);Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 80;BA.debugLine="Log(\"Request URL: \" & url)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("LogImpl","338862854",RemoteObject.concat(RemoteObject.createImmutable("Request URL: "),_url),0);
 BA.debugLineNum = 81;BA.debugLine="apiJob.Download(url)";
Debug.ShouldStop(65536);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_url));
 BA.debugLineNum = 82;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "universidades", "readuniversidadbyid"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 83;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(262144);
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
 BA.debugLineNum = 84;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(524288);
__ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 85;BA.debugLine="Dim map As Map = jsonParser.NextObject";
Debug.ShouldStop(1048576);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map = __ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runMethod(false,"NextObject");Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 86;BA.debugLine="universidad.Id = map.Get(\"id\")";
Debug.ShouldStop(2097152);
_universidad.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 87;BA.debugLine="universidad.Nombre = map.Get(\"nombre\")";
Debug.ShouldStop(4194304);
_universidad.setField ("_nombre" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nombre"))))));
 BA.debugLineNum = 88;BA.debugLine="universidad.Ubicacion = map.Get(\"ubicacion";
Debug.ShouldStop(8388608);
_universidad.setField ("_ubicacion" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ubicacion"))))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 90;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","338862864",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 92;BA.debugLine="Return universidad";
Debug.ShouldStop(134217728);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_universidad));return;};
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
public static RemoteObject  _updateuniversidad(RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _ubicacion) throws Exception{
try {
		Debug.PushSubsStack("UpdateUniversidad (universidades) ","universidades",6,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("updateuniversidad")) { return __ref.runUserSub(false, "universidades","updateuniversidad", __ref, _id, _nombre, _ubicacion);}
ResumableSub_UpdateUniversidad rsub = new ResumableSub_UpdateUniversidad(null,__ref,_id,_nombre,_ubicacion);
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
public static class ResumableSub_UpdateUniversidad extends BA.ResumableSub {
public ResumableSub_UpdateUniversidad(b4a.example.universidades parent,RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _ubicacion) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._ubicacion = _ubicacion;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.universidades parent;
RemoteObject _id;
RemoteObject _nombre;
RemoteObject _ubicacion;
RemoteObject _universidad = RemoteObject.declareNull("b4a.example.universidad");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("UpdateUniversidad (universidades) ","universidades",6,__ref.getField(false, "ba"),__ref,96);
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
Debug.locals.put("ubicacion", _ubicacion);
 BA.debugLineNum = 97;BA.debugLine="Dim universidad As Universidad";
Debug.ShouldStop(1);
_universidad = RemoteObject.createNew ("b4a.example.universidad");Debug.locals.put("universidad", _universidad);
 BA.debugLineNum = 98;BA.debugLine="Dim json As String";
Debug.ShouldStop(2);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 100;BA.debugLine="universidad.Initialize()";
Debug.ShouldStop(8);
_universidad.runClassMethod (b4a.example.universidad.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 101;BA.debugLine="json = \"{'id': \" & id & \", 'nombre': '\" & nomb";
Debug.ShouldStop(16);
_json = RemoteObject.concat(RemoteObject.createImmutable("{'id': "),_id,RemoteObject.createImmutable(", 'nombre': '"),_nombre,RemoteObject.createImmutable("', 'ubicacion': '"),_ubicacion,RemoteObject.createImmutable("'}"));Debug.locals.put("json", _json);
 BA.debugLineNum = 103;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(64);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 104;BA.debugLine="apiJob.PutString(apiURL & \"/\" & id, json)";
Debug.ShouldStop(128);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_putstring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)),(Object)(_json));
 BA.debugLineNum = 105;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/";
Debug.ShouldStop(256);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 106;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "universidades", "updateuniversidad"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 107;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(1024);
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
 BA.debugLineNum = 108;BA.debugLine="Return True";
Debug.ShouldStop(2048);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 110;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","338928398",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_resultado.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 111;BA.debugLine="Return False";
Debug.ShouldStop(16384);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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