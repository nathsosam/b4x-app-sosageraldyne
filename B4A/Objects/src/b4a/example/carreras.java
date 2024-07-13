package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class carreras extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.carreras");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.carreras.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.JSONParser _jsonparser = null;
public b4a.example.httpjob _apijob = null;
public String _apiurl = "";
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public String  _class_globals(b4a.example.carreras __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="carreras";
RDebugUtils.currentLine=38010880;
 //BA.debugLineNum = 38010880;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=38010881;
 //BA.debugLineNum = 38010881;BA.debugLine="Private jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=38010882;
 //BA.debugLineNum = 38010882;BA.debugLine="Private apiJob As HttpJob";
_apijob = new b4a.example.httpjob();
RDebugUtils.currentLine=38010883;
 //BA.debugLineNum = 38010883;BA.debugLine="Public apiURL As String";
_apiurl = "";
RDebugUtils.currentLine=38010884;
 //BA.debugLineNum = 38010884;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _createcarrera(b4a.example.carreras __ref,int _id,String _nombre,int _universidadid) throws Exception{
RDebugUtils.currentModule="carreras";
if (Debug.shouldDelegate(ba, "createcarrera", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "createcarrera", new Object[] {_id,_nombre,_universidadid}));}
ResumableSub_CreateCarrera rsub = new ResumableSub_CreateCarrera(this,__ref,_id,_nombre,_universidadid);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CreateCarrera extends BA.ResumableSub {
public ResumableSub_CreateCarrera(b4a.example.carreras parent,b4a.example.carreras __ref,int _id,String _nombre,int _universidadid) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._universidadid = _universidadid;
this.__ref = parent;
}
b4a.example.carreras __ref;
b4a.example.carreras parent;
int _id;
String _nombre;
int _universidadid;
b4a.example.carrera _carrera = null;
String _json = "";
anywheresoftware.b4a.objects.collections.Map _data = null;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="carreras";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=38404097;
 //BA.debugLineNum = 38404097;BA.debugLine="Dim carrera As Carrera";
_carrera = new b4a.example.carrera();
RDebugUtils.currentLine=38404098;
 //BA.debugLineNum = 38404098;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=38404099;
 //BA.debugLineNum = 38404099;BA.debugLine="Dim data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=38404101;
 //BA.debugLineNum = 38404101;BA.debugLine="carrera.Initialize()";
_carrera._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=38404102;
 //BA.debugLineNum = 38404102;BA.debugLine="json = \"{'id': \" & id & \", 'nombre': '\" & nomb";
_json = "{'id': "+BA.NumberToString(_id)+", 'nombre': '"+_nombre+"', 'universidadId': "+BA.NumberToString(_universidadid)+"}";
RDebugUtils.currentLine=38404104;
 //BA.debugLineNum = 38404104;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=38404105;
 //BA.debugLineNum = 38404105;BA.debugLine="apiJob.PostString(apiURL, json)";
__ref._apijob /*b4a.example.httpjob*/ ._poststring /*String*/ (null,__ref._apiurl /*String*/ ,_json);
RDebugUtils.currentLine=38404106;
 //BA.debugLineNum = 38404106;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/";
__ref._apijob /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=38404107;
 //BA.debugLineNum = 38404107;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "carreras", "createcarrera"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=38404108;
 //BA.debugLineNum = 38404108;BA.debugLine="If resultado.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_resultado._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=38404109;
 //BA.debugLineNum = 38404109;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=38404110;
 //BA.debugLineNum = 38404110;BA.debugLine="data = jsonParser.NextObject";
_data = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextObject();
RDebugUtils.currentLine=38404111;
 //BA.debugLineNum = 38404111;BA.debugLine="carrera.Id = data.Get(\"id\")";
_carrera._id /*int*/  = (int)(BA.ObjectToNumber(_data.Get((Object)("id"))));
RDebugUtils.currentLine=38404112;
 //BA.debugLineNum = 38404112;BA.debugLine="carrera.Nombre = data.Get(\"nombre\")";
_carrera._nombre /*String*/  = BA.ObjectToString(_data.Get((Object)("nombre")));
RDebugUtils.currentLine=38404113;
 //BA.debugLineNum = 38404113;BA.debugLine="carrera.UniversidadId = data.Get(\"universi";
_carrera._universidadid /*int*/  = (int)(BA.ObjectToNumber(_data.Get((Object)("universidadId"))));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=38404115;
 //BA.debugLineNum = 38404115;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
parent.__c.LogImpl("338404115","Error: "+_resultado._errormessage /*String*/ ,0);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=38404118;
 //BA.debugLineNum = 38404118;BA.debugLine="Return carrera";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_carrera));return;};
RDebugUtils.currentLine=38404119;
 //BA.debugLineNum = 38404119;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _deletecarrera(b4a.example.carreras __ref,int _id) throws Exception{
RDebugUtils.currentModule="carreras";
if (Debug.shouldDelegate(ba, "deletecarrera", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "deletecarrera", new Object[] {_id}));}
ResumableSub_DeleteCarrera rsub = new ResumableSub_DeleteCarrera(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DeleteCarrera extends BA.ResumableSub {
public ResumableSub_DeleteCarrera(b4a.example.carreras parent,b4a.example.carreras __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.carreras __ref;
b4a.example.carreras parent;
int _id;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="carreras";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=38666241;
 //BA.debugLineNum = 38666241;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=38666242;
 //BA.debugLineNum = 38666242;BA.debugLine="apiJob.Delete(apiURL & \"/\" & id)";
__ref._apijob /*b4a.example.httpjob*/ ._delete /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=38666244;
 //BA.debugLineNum = 38666244;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "carreras", "deletecarrera"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=38666245;
 //BA.debugLineNum = 38666245;BA.debugLine="If resultado.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_resultado._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=38666246;
 //BA.debugLineNum = 38666246;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=38666248;
 //BA.debugLineNum = 38666248;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
parent.__c.LogImpl("338666248","Error: "+_resultado._errormessage /*String*/ ,0);
RDebugUtils.currentLine=38666250;
 //BA.debugLineNum = 38666250;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=38666252;
 //BA.debugLineNum = 38666252;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4a.example.carreras __ref,anywheresoftware.b4a.BA _ba,String _url) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="carreras";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_url}));}
RDebugUtils.currentLine=38076416;
 //BA.debugLineNum = 38076416;BA.debugLine="Public Sub Initialize(url As String)";
RDebugUtils.currentLine=38076417;
 //BA.debugLineNum = 38076417;BA.debugLine="apiURL = url";
__ref._apiurl /*String*/  = _url;
RDebugUtils.currentLine=38076418;
 //BA.debugLineNum = 38076418;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _readallcarreras(b4a.example.carreras __ref) throws Exception{
RDebugUtils.currentModule="carreras";
if (Debug.shouldDelegate(ba, "readallcarreras", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "readallcarreras", null));}
ResumableSub_ReadAllCarreras rsub = new ResumableSub_ReadAllCarreras(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ReadAllCarreras extends BA.ResumableSub {
public ResumableSub_ReadAllCarreras(b4a.example.carreras parent,b4a.example.carreras __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.carreras __ref;
b4a.example.carreras parent;
anywheresoftware.b4a.objects.collections.List _carreras = null;
b4a.example.carrera _carrera = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.List _lst = null;
b4a.example.httpjob _resultado = null;
int _i = 0;
int step14;
int limit14;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="carreras";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=38469633;
 //BA.debugLineNum = 38469633;BA.debugLine="Dim carreras As List";
_carreras = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=38469634;
 //BA.debugLineNum = 38469634;BA.debugLine="Dim carrera As Carrera";
_carrera = new b4a.example.carrera();
RDebugUtils.currentLine=38469635;
 //BA.debugLineNum = 38469635;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=38469636;
 //BA.debugLineNum = 38469636;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=38469638;
 //BA.debugLineNum = 38469638;BA.debugLine="carreras.Initialize";
_carreras.Initialize();
RDebugUtils.currentLine=38469640;
 //BA.debugLineNum = 38469640;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=38469641;
 //BA.debugLineNum = 38469641;BA.debugLine="Log(\"Request URL: \" & apiURL)";
parent.__c.LogImpl("338469641","Request URL: "+__ref._apiurl /*String*/ ,0);
RDebugUtils.currentLine=38469642;
 //BA.debugLineNum = 38469642;BA.debugLine="apiJob.Download(apiURL)";
__ref._apijob /*b4a.example.httpjob*/ ._download /*String*/ (null,__ref._apiurl /*String*/ );
RDebugUtils.currentLine=38469643;
 //BA.debugLineNum = 38469643;BA.debugLine="Wait For(apiJob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "carreras", "readallcarreras"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=38469644;
 //BA.debugLineNum = 38469644;BA.debugLine="If resultado.Success Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_resultado._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=38469645;
 //BA.debugLineNum = 38469645;BA.debugLine="Log(\"Response: \" & resultado.GetString)";
parent.__c.LogImpl("338469645","Response: "+_resultado._getstring /*String*/ (null),0);
RDebugUtils.currentLine=38469646;
 //BA.debugLineNum = 38469646;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=38469647;
 //BA.debugLineNum = 38469647;BA.debugLine="lst = jsonParser.NextArray";
_lst = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=38469648;
 //BA.debugLineNum = 38469648;BA.debugLine="For i = 0 To lst.Size - 1";
if (true) break;

case 4:
//for
this.state = 7;
step14 = 1;
limit14 = (int) (_lst.getSize()-1);
_i = (int) (0) ;
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
if (true) break;

case 6:
//C
this.state = 13;
RDebugUtils.currentLine=38469649;
 //BA.debugLineNum = 38469649;BA.debugLine="map = lst.Get(i)";
_map = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lst.Get(_i)));
RDebugUtils.currentLine=38469650;
 //BA.debugLineNum = 38469650;BA.debugLine="Dim carrera As Carrera";
_carrera = new b4a.example.carrera();
RDebugUtils.currentLine=38469651;
 //BA.debugLineNum = 38469651;BA.debugLine="carrera.Initialize";
_carrera._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=38469652;
 //BA.debugLineNum = 38469652;BA.debugLine="carrera.Id = map.Get(\"id\")";
_carrera._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=38469653;
 //BA.debugLineNum = 38469653;BA.debugLine="carrera.Nombre = map.Get(\"nombre\")";
_carrera._nombre /*String*/  = BA.ObjectToString(_map.Get((Object)("nombre")));
RDebugUtils.currentLine=38469654;
 //BA.debugLineNum = 38469654;BA.debugLine="carrera.UniversidadId = map.Get(\"unive";
_carrera._universidadid /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("universidadId"))));
RDebugUtils.currentLine=38469655;
 //BA.debugLineNum = 38469655;BA.debugLine="carreras.Add(carrera)";
_carreras.Add((Object)(_carrera));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=38469658;
 //BA.debugLineNum = 38469658;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
parent.__c.LogImpl("338469658","Error: "+_resultado._errormessage /*String*/ ,0);
RDebugUtils.currentLine=38469659;
 //BA.debugLineNum = 38469659;BA.debugLine="Log(\"Response: \" & resultado.GetString)";
parent.__c.LogImpl("338469659","Response: "+_resultado._getstring /*String*/ (null),0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=38469663;
 //BA.debugLineNum = 38469663;BA.debugLine="Return carreras";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_carreras));return;};
RDebugUtils.currentLine=38469664;
 //BA.debugLineNum = 38469664;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _readcarrerabyid(b4a.example.carreras __ref,int _id) throws Exception{
RDebugUtils.currentModule="carreras";
if (Debug.shouldDelegate(ba, "readcarrerabyid", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "readcarrerabyid", new Object[] {_id}));}
ResumableSub_ReadCarreraById rsub = new ResumableSub_ReadCarreraById(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ReadCarreraById extends BA.ResumableSub {
public ResumableSub_ReadCarreraById(b4a.example.carreras parent,b4a.example.carreras __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.carreras __ref;
b4a.example.carreras parent;
int _id;
b4a.example.carrera _carrera = null;
String _url = "";
b4a.example.httpjob _resultado = null;
anywheresoftware.b4a.objects.collections.Map _map = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="carreras";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=38535169;
 //BA.debugLineNum = 38535169;BA.debugLine="Dim carrera As Carrera";
_carrera = new b4a.example.carrera();
RDebugUtils.currentLine=38535170;
 //BA.debugLineNum = 38535170;BA.debugLine="carrera.Initialize";
_carrera._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=38535172;
 //BA.debugLineNum = 38535172;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=38535173;
 //BA.debugLineNum = 38535173;BA.debugLine="Dim url As String = apiURL & \"/\" & id";
_url = __ref._apiurl /*String*/ +"/"+BA.NumberToString(_id);
RDebugUtils.currentLine=38535174;
 //BA.debugLineNum = 38535174;BA.debugLine="Log(\"Request URL: \" & url)";
parent.__c.LogImpl("338535174","Request URL: "+_url,0);
RDebugUtils.currentLine=38535175;
 //BA.debugLineNum = 38535175;BA.debugLine="apiJob.Download(url)";
__ref._apijob /*b4a.example.httpjob*/ ._download /*String*/ (null,_url);
RDebugUtils.currentLine=38535176;
 //BA.debugLineNum = 38535176;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "carreras", "readcarrerabyid"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=38535177;
 //BA.debugLineNum = 38535177;BA.debugLine="If resultado.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_resultado._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=38535178;
 //BA.debugLineNum = 38535178;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=38535179;
 //BA.debugLineNum = 38535179;BA.debugLine="Dim map As Map = jsonParser.NextObject";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextObject();
RDebugUtils.currentLine=38535180;
 //BA.debugLineNum = 38535180;BA.debugLine="carrera.Id = map.Get(\"id\")";
_carrera._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=38535181;
 //BA.debugLineNum = 38535181;BA.debugLine="carrera.Nombre = map.Get(\"nombre\")";
_carrera._nombre /*String*/  = BA.ObjectToString(_map.Get((Object)("nombre")));
RDebugUtils.currentLine=38535182;
 //BA.debugLineNum = 38535182;BA.debugLine="carrera.UniversidadId = map.Get(\"universid";
_carrera._universidadid /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("universidadId"))));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=38535184;
 //BA.debugLineNum = 38535184;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
parent.__c.LogImpl("338535184","Error: "+_resultado._errormessage /*String*/ ,0);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=38535187;
 //BA.debugLineNum = 38535187;BA.debugLine="Return carrera";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_carrera));return;};
RDebugUtils.currentLine=38535188;
 //BA.debugLineNum = 38535188;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _updatecarrera(b4a.example.carreras __ref,int _id,String _nombre,int _universidadid) throws Exception{
RDebugUtils.currentModule="carreras";
if (Debug.shouldDelegate(ba, "updatecarrera", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "updatecarrera", new Object[] {_id,_nombre,_universidadid}));}
ResumableSub_UpdateCarrera rsub = new ResumableSub_UpdateCarrera(this,__ref,_id,_nombre,_universidadid);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_UpdateCarrera extends BA.ResumableSub {
public ResumableSub_UpdateCarrera(b4a.example.carreras parent,b4a.example.carreras __ref,int _id,String _nombre,int _universidadid) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._universidadid = _universidadid;
this.__ref = parent;
}
b4a.example.carreras __ref;
b4a.example.carreras parent;
int _id;
String _nombre;
int _universidadid;
b4a.example.carrera _carrera = null;
String _json = "";
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="carreras";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=38600705;
 //BA.debugLineNum = 38600705;BA.debugLine="Dim carrera As Carrera";
_carrera = new b4a.example.carrera();
RDebugUtils.currentLine=38600706;
 //BA.debugLineNum = 38600706;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=38600708;
 //BA.debugLineNum = 38600708;BA.debugLine="carrera.Initialize()";
_carrera._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=38600709;
 //BA.debugLineNum = 38600709;BA.debugLine="json = \"{'id': \" & id & \", 'nombre': '\" & nomb";
_json = "{'id': "+BA.NumberToString(_id)+", 'nombre': '"+_nombre+"', 'universidadId': "+BA.NumberToString(_universidadid)+"}";
RDebugUtils.currentLine=38600711;
 //BA.debugLineNum = 38600711;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=38600712;
 //BA.debugLineNum = 38600712;BA.debugLine="apiJob.PutString(apiURL & \"/\" & id, json)";
__ref._apijob /*b4a.example.httpjob*/ ._putstring /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id),_json);
RDebugUtils.currentLine=38600713;
 //BA.debugLineNum = 38600713;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/";
__ref._apijob /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=38600715;
 //BA.debugLineNum = 38600715;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "carreras", "updatecarrera"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=38600716;
 //BA.debugLineNum = 38600716;BA.debugLine="If resultado.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_resultado._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=38600717;
 //BA.debugLineNum = 38600717;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=38600719;
 //BA.debugLineNum = 38600719;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
parent.__c.LogImpl("338600719","Error: "+_resultado._errormessage /*String*/ ,0);
RDebugUtils.currentLine=38600721;
 //BA.debugLineNum = 38600721;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=38600723;
 //BA.debugLineNum = 38600723;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}