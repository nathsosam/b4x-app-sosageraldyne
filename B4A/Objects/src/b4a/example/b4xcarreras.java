package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xcarreras extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xcarreras");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xcarreras.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtid = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtnombre = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtuniversidadid = null;
public b4a.example.carreras _apicarreras = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public Object  _initialize(b4a.example.b4xcarreras __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xcarreras";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=39321600;
 //BA.debugLineNum = 39321600;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=39321601;
 //BA.debugLineNum = 39321601;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=39321602;
 //BA.debugLineNum = 39321602;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.b4xcarreras __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcarreras";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=39387136;
 //BA.debugLineNum = 39387136;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=39387137;
 //BA.debugLineNum = 39387137;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=39387139;
 //BA.debugLineNum = 39387139;BA.debugLine="Root.LoadLayout(\"PageCarreras\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("PageCarreras",ba);
RDebugUtils.currentLine=39387140;
 //BA.debugLineNum = 39387140;BA.debugLine="apiCarreras.Initialize(\"https://appuniapivaca.azu";
__ref._apicarreras /*b4a.example.carreras*/ ._initialize /*String*/ (null,ba,"https://appuniapivaca.azurewebsites.net/api/Carreras");
RDebugUtils.currentLine=39387141;
 //BA.debugLineNum = 39387141;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4xcarreras __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcarreras";
RDebugUtils.currentLine=39256064;
 //BA.debugLineNum = 39256064;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=39256065;
 //BA.debugLineNum = 39256065;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=39256066;
 //BA.debugLineNum = 39256066;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=39256067;
 //BA.debugLineNum = 39256067;BA.debugLine="Private txtId As EditText";
_txtid = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=39256068;
 //BA.debugLineNum = 39256068;BA.debugLine="Private txtNombre As EditText";
_txtnombre = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=39256069;
 //BA.debugLineNum = 39256069;BA.debugLine="Private txtUniversidadId As EditText";
_txtuniversidadid = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=39256070;
 //BA.debugLineNum = 39256070;BA.debugLine="Private apiCarreras As Carreras";
_apicarreras = new b4a.example.carreras();
RDebugUtils.currentLine=39256071;
 //BA.debugLineNum = 39256071;BA.debugLine="End Sub";
return "";
}
public void  _cmdactualizar_click(b4a.example.b4xcarreras __ref) throws Exception{
RDebugUtils.currentModule="b4xcarreras";
if (Debug.shouldDelegate(ba, "cmdactualizar_click", false))
	 {Debug.delegate(ba, "cmdactualizar_click", null); return;}
ResumableSub_cmdActualizar_Click rsub = new ResumableSub_cmdActualizar_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_cmdActualizar_Click extends BA.ResumableSub {
public ResumableSub_cmdActualizar_Click(b4a.example.b4xcarreras parent,b4a.example.b4xcarreras __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.b4xcarreras __ref;
b4a.example.b4xcarreras parent;
boolean _r = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xcarreras";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=39911425;
 //BA.debugLineNum = 39911425;BA.debugLine="If txtId.Text.Trim = \"\" Or txtNombre.Text.Trim =";
if (true) break;

case 1:
//if
this.state = 4;
if ((__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim()).equals("") || (__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim()).equals("") || (__ref._txtuniversidadid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim()).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=39911426;
 //BA.debugLineNum = 39911426;BA.debugLine="Msgbox(\"Por favor, complete todos los campos\", \"";
parent.__c.Msgbox(BA.ObjectToCharSequence("Por favor, complete todos los campos"),BA.ObjectToCharSequence("Error"),ba);
RDebugUtils.currentLine=39911427;
 //BA.debugLineNum = 39911427;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=39911430;
 //BA.debugLineNum = 39911430;BA.debugLine="Wait For (apiCarreras.UpdateCarrera(txtId.Text, t";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xcarreras", "cmdactualizar_click"), __ref._apicarreras /*b4a.example.carreras*/ ._updatecarrera /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())),__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),(int)(Double.parseDouble(__ref._txtuniversidadid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 11;
return;
case 11:
//C
this.state = 5;
_r = (Boolean) result[1];
;
RDebugUtils.currentLine=39911431;
 //BA.debugLineNum = 39911431;BA.debugLine="If r = True Then";
if (true) break;

case 5:
//if
this.state = 10;
if (_r==parent.__c.True) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=39911432;
 //BA.debugLineNum = 39911432;BA.debugLine="Msgbox(\"Registro Actualizado\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Registro Actualizado"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=39911434;
 //BA.debugLineNum = 39911434;BA.debugLine="Msgbox(\"No hay datos\", \"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No hay datos"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=39911436;
 //BA.debugLineNum = 39911436;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _cmdcrear_click(b4a.example.b4xcarreras __ref) throws Exception{
RDebugUtils.currentModule="b4xcarreras";
if (Debug.shouldDelegate(ba, "cmdcrear_click", false))
	 {Debug.delegate(ba, "cmdcrear_click", null); return;}
ResumableSub_cmdCrear_Click rsub = new ResumableSub_cmdCrear_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_cmdCrear_Click extends BA.ResumableSub {
public ResumableSub_cmdCrear_Click(b4a.example.b4xcarreras parent,b4a.example.b4xcarreras __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.b4xcarreras __ref;
b4a.example.b4xcarreras parent;
b4a.example.carrera _c = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xcarreras";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=39845889;
 //BA.debugLineNum = 39845889;BA.debugLine="If txtNombre.Text.Trim = \"\" Or txtUniversidadId.T";
if (true) break;

case 1:
//if
this.state = 4;
if ((__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim()).equals("") || (__ref._txtuniversidadid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim()).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=39845890;
 //BA.debugLineNum = 39845890;BA.debugLine="Msgbox(\"Por favor, complete todos los campos\", \"";
parent.__c.Msgbox(BA.ObjectToCharSequence("Por favor, complete todos los campos"),BA.ObjectToCharSequence("Error"),ba);
RDebugUtils.currentLine=39845891;
 //BA.debugLineNum = 39845891;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=39845894;
 //BA.debugLineNum = 39845894;BA.debugLine="Wait For (apiCarreras.CreateCarrera(0, txtNombre.";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xcarreras", "cmdcrear_click"), __ref._apicarreras /*b4a.example.carreras*/ ._createcarrera /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int) (0),__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),(int)(Double.parseDouble(__ref._txtuniversidadid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 11;
return;
case 11:
//C
this.state = 5;
_c = (b4a.example.carrera) result[1];
;
RDebugUtils.currentLine=39845895;
 //BA.debugLineNum = 39845895;BA.debugLine="If c.Id > 0 Then";
if (true) break;

case 5:
//if
this.state = 10;
if (_c._id /*int*/ >0) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=39845896;
 //BA.debugLineNum = 39845896;BA.debugLine="txtId.Text = c.Id";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_c._id /*int*/ ));
RDebugUtils.currentLine=39845897;
 //BA.debugLineNum = 39845897;BA.debugLine="Msgbox(\"Insertado el registro\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Insertado el registro"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=39845899;
 //BA.debugLineNum = 39845899;BA.debugLine="Msgbox(\"No se pudo insertar el registro\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No se pudo insertar el registro"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=39845901;
 //BA.debugLineNum = 39845901;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _cmdeliminar_click(b4a.example.b4xcarreras __ref) throws Exception{
RDebugUtils.currentModule="b4xcarreras";
if (Debug.shouldDelegate(ba, "cmdeliminar_click", false))
	 {Debug.delegate(ba, "cmdeliminar_click", null); return;}
ResumableSub_cmdEliminar_Click rsub = new ResumableSub_cmdEliminar_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_cmdEliminar_Click extends BA.ResumableSub {
public ResumableSub_cmdEliminar_Click(b4a.example.b4xcarreras parent,b4a.example.b4xcarreras __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.b4xcarreras __ref;
b4a.example.b4xcarreras parent;
boolean _r = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xcarreras";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=39976961;
 //BA.debugLineNum = 39976961;BA.debugLine="If txtId.Text.Trim = \"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim()).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=39976962;
 //BA.debugLineNum = 39976962;BA.debugLine="Msgbox(\"Por favor, ingrese un ID\", \"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Por favor, ingrese un ID"),BA.ObjectToCharSequence("Error"),ba);
RDebugUtils.currentLine=39976963;
 //BA.debugLineNum = 39976963;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=39976966;
 //BA.debugLineNum = 39976966;BA.debugLine="Wait For (apiCarreras.DeleteCarrera(txtId.Text))";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xcarreras", "cmdeliminar_click"), __ref._apicarreras /*b4a.example.carreras*/ ._deletecarrera /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 11;
return;
case 11:
//C
this.state = 5;
_r = (Boolean) result[1];
;
RDebugUtils.currentLine=39976967;
 //BA.debugLineNum = 39976967;BA.debugLine="If r = True Then";
if (true) break;

case 5:
//if
this.state = 10;
if (_r==parent.__c.True) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=39976968;
 //BA.debugLineNum = 39976968;BA.debugLine="Msgbox(\"Registro Borrado\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Registro Borrado"),BA.ObjectToCharSequence("OK"),ba);
RDebugUtils.currentLine=39976969;
 //BA.debugLineNum = 39976969;BA.debugLine="txtId.Text = \"\"";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=39976970;
 //BA.debugLineNum = 39976970;BA.debugLine="txtNombre.Text = \"\"";
__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=39976971;
 //BA.debugLineNum = 39976971;BA.debugLine="txtUniversidadId.Text = \"\"";
__ref._txtuniversidadid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=39976973;
 //BA.debugLineNum = 39976973;BA.debugLine="Msgbox(\"No hay datos\", \"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No hay datos"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=39976975;
 //BA.debugLineNum = 39976975;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _cmdleer_click(b4a.example.b4xcarreras __ref) throws Exception{
RDebugUtils.currentModule="b4xcarreras";
if (Debug.shouldDelegate(ba, "cmdleer_click", false))
	 {Debug.delegate(ba, "cmdleer_click", null); return;}
ResumableSub_cmdLeer_Click rsub = new ResumableSub_cmdLeer_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_cmdLeer_Click extends BA.ResumableSub {
public ResumableSub_cmdLeer_Click(b4a.example.b4xcarreras parent,b4a.example.b4xcarreras __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.b4xcarreras __ref;
b4a.example.b4xcarreras parent;
b4a.example.carrera _c = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xcarreras";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=39780353;
 //BA.debugLineNum = 39780353;BA.debugLine="If txtId.Text.Trim = \"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim()).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=39780354;
 //BA.debugLineNum = 39780354;BA.debugLine="Msgbox(\"Por favor, ingrese un ID\", \"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Por favor, ingrese un ID"),BA.ObjectToCharSequence("Error"),ba);
RDebugUtils.currentLine=39780355;
 //BA.debugLineNum = 39780355;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=39780358;
 //BA.debugLineNum = 39780358;BA.debugLine="Wait For (apiCarreras.ReadCarreraById(txtId.Text)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xcarreras", "cmdleer_click"), __ref._apicarreras /*b4a.example.carreras*/ ._readcarrerabyid /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 11;
return;
case 11:
//C
this.state = 5;
_c = (b4a.example.carrera) result[1];
;
RDebugUtils.currentLine=39780359;
 //BA.debugLineNum = 39780359;BA.debugLine="If c.Id > 0 Then";
if (true) break;

case 5:
//if
this.state = 10;
if (_c._id /*int*/ >0) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=39780360;
 //BA.debugLineNum = 39780360;BA.debugLine="txtId.Text = c.Id";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_c._id /*int*/ ));
RDebugUtils.currentLine=39780361;
 //BA.debugLineNum = 39780361;BA.debugLine="txtNombre.Text = c.Nombre";
__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_c._nombre /*String*/ ));
RDebugUtils.currentLine=39780362;
 //BA.debugLineNum = 39780362;BA.debugLine="txtUniversidadId.Text = c.UniversidadId";
__ref._txtuniversidadid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_c._universidadid /*int*/ ));
RDebugUtils.currentLine=39780363;
 //BA.debugLineNum = 39780363;BA.debugLine="Msgbox(\"Registro leído con éxito\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Registro leído con éxito"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=39780365;
 //BA.debugLineNum = 39780365;BA.debugLine="Msgbox(\"No hay datos\", \"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No hay datos"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=39780367;
 //BA.debugLineNum = 39780367;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _cmdmenu_click(b4a.example.b4xcarreras __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcarreras";
if (Debug.shouldDelegate(ba, "cmdmenu_click", false))
	 {return ((String) Debug.delegate(ba, "cmdmenu_click", null));}
RDebugUtils.currentLine=40042496;
 //BA.debugLineNum = 40042496;BA.debugLine="Private Sub cmdMenu_Click";
RDebugUtils.currentLine=40042497;
 //BA.debugLineNum = 40042497;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
_b4xpages._showpage /*String*/ (ba,"MainPage");
RDebugUtils.currentLine=40042498;
 //BA.debugLineNum = 40042498;BA.debugLine="End Sub";
return "";
}
}