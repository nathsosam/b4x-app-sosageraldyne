package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class universidades extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.universidades");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.universidades.class).invoke(this, new Object[] {null});
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
public String  _class_globals(b4a.example.universidades __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="universidades";
RDebugUtils.currentLine=38273024;
 //BA.debugLineNum = 38273024;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=38273025;
 //BA.debugLineNum = 38273025;BA.debugLine="Private jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=38273026;
 //BA.debugLineNum = 38273026;BA.debugLine="Private apiJob As HttpJob";
_apijob = new b4a.example.httpjob();
RDebugUtils.currentLine=38273027;
 //BA.debugLineNum = 38273027;BA.debugLine="Public apiURL As String";
_apiurl = "";
RDebugUtils.currentLine=38273028;
 //BA.debugLineNum = 38273028;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _createuniversidad(b4a.example.universidades __ref,int _id,String _nombre,String _ubicacion) throws Exception{
RDebugUtils.currentModule="universidades";
if (Debug.shouldDelegate(ba, "createuniversidad", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "createuniversidad", new Object[] {_id,_nombre,_ubicacion}));}
ResumableSub_CreateUniversidad rsub = new ResumableSub_CreateUniversidad(this,__ref,_id,_nombre,_ubicacion);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CreateUniversidad extends BA.ResumableSub {
public ResumableSub_CreateUniversidad(b4a.example.universidades parent,b4a.example.universidades __ref,int _id,String _nombre,String _ubicacion) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._ubicacion = _ubicacion;
this.__ref = parent;
}
b4a.example.universidades __ref;
b4a.example.universidades parent;
int _id;
String _nombre;
String _ubicacion;
b4a.example.universidad _universidad = null;
String _json = "";
anywheresoftware.b4a.objects.collections.Map _data = null;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="universidades";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=38731777;
 //BA.debugLineNum = 38731777;BA.debugLine="Dim universidad As Universidad";
_universidad = new b4a.example.universidad();
RDebugUtils.currentLine=38731778;
 //BA.debugLineNum = 38731778;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=38731779;
 //BA.debugLineNum = 38731779;BA.debugLine="Dim data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=38731781;
 //BA.debugLineNum = 38731781;BA.debugLine="universidad.Initialize()";
_universidad._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=38731782;
 //BA.debugLineNum = 38731782;BA.debugLine="json = \"{'id': \" & id & \", 'nombre': '\" & nomb";
_json = "{'id': "+BA.NumberToString(_id)+", 'nombre': '"+_nombre+"', 'ubicacion': '"+_ubicacion+"'}";
RDebugUtils.currentLine=38731784;
 //BA.debugLineNum = 38731784;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=38731785;
 //BA.debugLineNum = 38731785;BA.debugLine="apiJob.PostString(apiURL, json)";
__ref._apijob /*b4a.example.httpjob*/ ._poststring /*String*/ (null,__ref._apiurl /*String*/ ,_json);
RDebugUtils.currentLine=38731786;
 //BA.debugLineNum = 38731786;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/";
__ref._apijob /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=38731787;
 //BA.debugLineNum = 38731787;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "universidades", "createuniversidad"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=38731788;
 //BA.debugLineNum = 38731788;BA.debugLine="If resultado.Success Then";
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
RDebugUtils.currentLine=38731789;
 //BA.debugLineNum = 38731789;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=38731790;
 //BA.debugLineNum = 38731790;BA.debugLine="data = jsonParser.NextObject";
_data = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextObject();
RDebugUtils.currentLine=38731791;
 //BA.debugLineNum = 38731791;BA.debugLine="universidad.Id = data.Get(\"id\")";
_universidad._id /*int*/  = (int)(BA.ObjectToNumber(_data.Get((Object)("id"))));
RDebugUtils.currentLine=38731792;
 //BA.debugLineNum = 38731792;BA.debugLine="universidad.Nombre = data.Get(\"nombre\")";
_universidad._nombre /*String*/  = BA.ObjectToString(_data.Get((Object)("nombre")));
RDebugUtils.currentLine=38731793;
 //BA.debugLineNum = 38731793;BA.debugLine="universidad.Ubicacion = data.Get(\"ubicacio";
_universidad._ubicacion /*String*/  = BA.ObjectToString(_data.Get((Object)("ubicacion")));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=38731795;
 //BA.debugLineNum = 38731795;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
parent.__c.LogImpl("338731795","Error: "+_resultado._errormessage /*String*/ ,0);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=38731797;
 //BA.debugLineNum = 38731797;BA.debugLine="Return universidad";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_universidad));return;};
RDebugUtils.currentLine=38731798;
 //BA.debugLineNum = 38731798;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _deleteuniversidad(b4a.example.universidades __ref,int _id) throws Exception{
RDebugUtils.currentModule="universidades";
if (Debug.shouldDelegate(ba, "deleteuniversidad", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "deleteuniversidad", new Object[] {_id}));}
ResumableSub_DeleteUniversidad rsub = new ResumableSub_DeleteUniversidad(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DeleteUniversidad extends BA.ResumableSub {
public ResumableSub_DeleteUniversidad(b4a.example.universidades parent,b4a.example.universidades __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.universidades __ref;
b4a.example.universidades parent;
int _id;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="universidades";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=38993921;
 //BA.debugLineNum = 38993921;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=38993922;
 //BA.debugLineNum = 38993922;BA.debugLine="apiJob.Delete(apiURL & \"/\" & id)";
__ref._apijob /*b4a.example.httpjob*/ ._delete /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=38993924;
 //BA.debugLineNum = 38993924;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "universidades", "deleteuniversidad"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=38993925;
 //BA.debugLineNum = 38993925;BA.debugLine="If resultado.Success Then";
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
RDebugUtils.currentLine=38993926;
 //BA.debugLineNum = 38993926;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=38993928;
 //BA.debugLineNum = 38993928;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
parent.__c.LogImpl("338993928","Error: "+_resultado._errormessage /*String*/ ,0);
RDebugUtils.currentLine=38993929;
 //BA.debugLineNum = 38993929;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=38993931;
 //BA.debugLineNum = 38993931;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4a.example.universidades __ref,anywheresoftware.b4a.BA _ba,String _url) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="universidades";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_url}));}
RDebugUtils.currentLine=38338560;
 //BA.debugLineNum = 38338560;BA.debugLine="Public Sub Initialize(url As String)";
RDebugUtils.currentLine=38338561;
 //BA.debugLineNum = 38338561;BA.debugLine="apiURL = url";
__ref._apiurl /*String*/  = _url;
RDebugUtils.currentLine=38338562;
 //BA.debugLineNum = 38338562;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _readalluniversidades(b4a.example.universidades __ref) throws Exception{
RDebugUtils.currentModule="universidades";
if (Debug.shouldDelegate(ba, "readalluniversidades", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "readalluniversidades", null));}
ResumableSub_ReadAllUniversidades rsub = new ResumableSub_ReadAllUniversidades(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ReadAllUniversidades extends BA.ResumableSub {
public ResumableSub_ReadAllUniversidades(b4a.example.universidades parent,b4a.example.universidades __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.universidades __ref;
b4a.example.universidades parent;
anywheresoftware.b4a.objects.collections.List _universidades = null;
b4a.example.universidad _universidad = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.List _lst = null;
b4a.example.httpjob _resultado = null;
int _i = 0;
int step14;
int limit14;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="universidades";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=38797313;
 //BA.debugLineNum = 38797313;BA.debugLine="Dim universidades As List";
_universidades = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=38797314;
 //BA.debugLineNum = 38797314;BA.debugLine="Dim universidad As Universidad";
_universidad = new b4a.example.universidad();
RDebugUtils.currentLine=38797315;
 //BA.debugLineNum = 38797315;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=38797316;
 //BA.debugLineNum = 38797316;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=38797318;
 //BA.debugLineNum = 38797318;BA.debugLine="universidades.Initialize";
_universidades.Initialize();
RDebugUtils.currentLine=38797320;
 //BA.debugLineNum = 38797320;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=38797321;
 //BA.debugLineNum = 38797321;BA.debugLine="Log(\"Request URL: \" & apiURL)";
parent.__c.LogImpl("338797321","Request URL: "+__ref._apiurl /*String*/ ,0);
RDebugUtils.currentLine=38797322;
 //BA.debugLineNum = 38797322;BA.debugLine="apiJob.Download(apiURL)";
__ref._apijob /*b4a.example.httpjob*/ ._download /*String*/ (null,__ref._apiurl /*String*/ );
RDebugUtils.currentLine=38797323;
 //BA.debugLineNum = 38797323;BA.debugLine="Wait For(apiJob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "universidades", "readalluniversidades"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=38797324;
 //BA.debugLineNum = 38797324;BA.debugLine="If resultado.Success Then";
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
RDebugUtils.currentLine=38797325;
 //BA.debugLineNum = 38797325;BA.debugLine="Log(\"Response: \" & resultado.GetString)";
parent.__c.LogImpl("338797325","Response: "+_resultado._getstring /*String*/ (null),0);
RDebugUtils.currentLine=38797326;
 //BA.debugLineNum = 38797326;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=38797327;
 //BA.debugLineNum = 38797327;BA.debugLine="lst = jsonParser.NextArray";
_lst = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=38797328;
 //BA.debugLineNum = 38797328;BA.debugLine="For i = 0 To lst.Size - 1";
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
RDebugUtils.currentLine=38797329;
 //BA.debugLineNum = 38797329;BA.debugLine="map = lst.Get(i)";
_map = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lst.Get(_i)));
RDebugUtils.currentLine=38797330;
 //BA.debugLineNum = 38797330;BA.debugLine="Dim universidad As Universidad";
_universidad = new b4a.example.universidad();
RDebugUtils.currentLine=38797331;
 //BA.debugLineNum = 38797331;BA.debugLine="universidad.Initialize";
_universidad._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=38797332;
 //BA.debugLineNum = 38797332;BA.debugLine="universidad.Id = map.Get(\"id\")";
_universidad._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=38797333;
 //BA.debugLineNum = 38797333;BA.debugLine="universidad.Nombre = map.Get(\"nombre\")";
_universidad._nombre /*String*/  = BA.ObjectToString(_map.Get((Object)("nombre")));
RDebugUtils.currentLine=38797334;
 //BA.debugLineNum = 38797334;BA.debugLine="universidad.Ubicacion = map.Get(\"ubica";
_universidad._ubicacion /*String*/  = BA.ObjectToString(_map.Get((Object)("ubicacion")));
RDebugUtils.currentLine=38797335;
 //BA.debugLineNum = 38797335;BA.debugLine="universidades.Add(universidad)";
_universidades.Add((Object)(_universidad));
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
RDebugUtils.currentLine=38797338;
 //BA.debugLineNum = 38797338;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
parent.__c.LogImpl("338797338","Error: "+_resultado._errormessage /*String*/ ,0);
RDebugUtils.currentLine=38797339;
 //BA.debugLineNum = 38797339;BA.debugLine="Log(\"Response: \" & resultado.GetString)";
parent.__c.LogImpl("338797339","Response: "+_resultado._getstring /*String*/ (null),0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=38797342;
 //BA.debugLineNum = 38797342;BA.debugLine="Return universidades";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_universidades));return;};
RDebugUtils.currentLine=38797343;
 //BA.debugLineNum = 38797343;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _readuniversidadbyid(b4a.example.universidades __ref,int _id) throws Exception{
RDebugUtils.currentModule="universidades";
if (Debug.shouldDelegate(ba, "readuniversidadbyid", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "readuniversidadbyid", new Object[] {_id}));}
ResumableSub_ReadUniversidadById rsub = new ResumableSub_ReadUniversidadById(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ReadUniversidadById extends BA.ResumableSub {
public ResumableSub_ReadUniversidadById(b4a.example.universidades parent,b4a.example.universidades __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.universidades __ref;
b4a.example.universidades parent;
int _id;
b4a.example.universidad _universidad = null;
String _url = "";
b4a.example.httpjob _resultado = null;
anywheresoftware.b4a.objects.collections.Map _map = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="universidades";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=38862849;
 //BA.debugLineNum = 38862849;BA.debugLine="Dim universidad As Universidad";
_universidad = new b4a.example.universidad();
RDebugUtils.currentLine=38862850;
 //BA.debugLineNum = 38862850;BA.debugLine="universidad.Initialize";
_universidad._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=38862852;
 //BA.debugLineNum = 38862852;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=38862853;
 //BA.debugLineNum = 38862853;BA.debugLine="Dim url As String = apiURL & \"/\" & id";
_url = __ref._apiurl /*String*/ +"/"+BA.NumberToString(_id);
RDebugUtils.currentLine=38862854;
 //BA.debugLineNum = 38862854;BA.debugLine="Log(\"Request URL: \" & url)";
parent.__c.LogImpl("338862854","Request URL: "+_url,0);
RDebugUtils.currentLine=38862855;
 //BA.debugLineNum = 38862855;BA.debugLine="apiJob.Download(url)";
__ref._apijob /*b4a.example.httpjob*/ ._download /*String*/ (null,_url);
RDebugUtils.currentLine=38862856;
 //BA.debugLineNum = 38862856;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "universidades", "readuniversidadbyid"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=38862857;
 //BA.debugLineNum = 38862857;BA.debugLine="If resultado.Success Then";
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
RDebugUtils.currentLine=38862858;
 //BA.debugLineNum = 38862858;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=38862859;
 //BA.debugLineNum = 38862859;BA.debugLine="Dim map As Map = jsonParser.NextObject";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextObject();
RDebugUtils.currentLine=38862860;
 //BA.debugLineNum = 38862860;BA.debugLine="universidad.Id = map.Get(\"id\")";
_universidad._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=38862861;
 //BA.debugLineNum = 38862861;BA.debugLine="universidad.Nombre = map.Get(\"nombre\")";
_universidad._nombre /*String*/  = BA.ObjectToString(_map.Get((Object)("nombre")));
RDebugUtils.currentLine=38862862;
 //BA.debugLineNum = 38862862;BA.debugLine="universidad.Ubicacion = map.Get(\"ubicacion";
_universidad._ubicacion /*String*/  = BA.ObjectToString(_map.Get((Object)("ubicacion")));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=38862864;
 //BA.debugLineNum = 38862864;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
parent.__c.LogImpl("338862864","Error: "+_resultado._errormessage /*String*/ ,0);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=38862866;
 //BA.debugLineNum = 38862866;BA.debugLine="Return universidad";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_universidad));return;};
RDebugUtils.currentLine=38862867;
 //BA.debugLineNum = 38862867;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _updateuniversidad(b4a.example.universidades __ref,int _id,String _nombre,String _ubicacion) throws Exception{
RDebugUtils.currentModule="universidades";
if (Debug.shouldDelegate(ba, "updateuniversidad", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "updateuniversidad", new Object[] {_id,_nombre,_ubicacion}));}
ResumableSub_UpdateUniversidad rsub = new ResumableSub_UpdateUniversidad(this,__ref,_id,_nombre,_ubicacion);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_UpdateUniversidad extends BA.ResumableSub {
public ResumableSub_UpdateUniversidad(b4a.example.universidades parent,b4a.example.universidades __ref,int _id,String _nombre,String _ubicacion) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._ubicacion = _ubicacion;
this.__ref = parent;
}
b4a.example.universidades __ref;
b4a.example.universidades parent;
int _id;
String _nombre;
String _ubicacion;
b4a.example.universidad _universidad = null;
String _json = "";
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="universidades";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=38928385;
 //BA.debugLineNum = 38928385;BA.debugLine="Dim universidad As Universidad";
_universidad = new b4a.example.universidad();
RDebugUtils.currentLine=38928386;
 //BA.debugLineNum = 38928386;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=38928388;
 //BA.debugLineNum = 38928388;BA.debugLine="universidad.Initialize()";
_universidad._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=38928389;
 //BA.debugLineNum = 38928389;BA.debugLine="json = \"{'id': \" & id & \", 'nombre': '\" & nomb";
_json = "{'id': "+BA.NumberToString(_id)+", 'nombre': '"+_nombre+"', 'ubicacion': '"+_ubicacion+"'}";
RDebugUtils.currentLine=38928391;
 //BA.debugLineNum = 38928391;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=38928392;
 //BA.debugLineNum = 38928392;BA.debugLine="apiJob.PutString(apiURL & \"/\" & id, json)";
__ref._apijob /*b4a.example.httpjob*/ ._putstring /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id),_json);
RDebugUtils.currentLine=38928393;
 //BA.debugLineNum = 38928393;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/";
__ref._apijob /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=38928394;
 //BA.debugLineNum = 38928394;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "universidades", "updateuniversidad"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=38928395;
 //BA.debugLineNum = 38928395;BA.debugLine="If resultado.Success Then";
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
RDebugUtils.currentLine=38928396;
 //BA.debugLineNum = 38928396;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=38928398;
 //BA.debugLineNum = 38928398;BA.debugLine="Log(\"Error: \" & resultado.ErrorMessage)";
parent.__c.LogImpl("338928398","Error: "+_resultado._errormessage /*String*/ ,0);
RDebugUtils.currentLine=38928399;
 //BA.debugLineNum = 38928399;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=38928401;
 //BA.debugLineNum = 38928401;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}