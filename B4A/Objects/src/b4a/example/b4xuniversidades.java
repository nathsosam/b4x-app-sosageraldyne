package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xuniversidades extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xuniversidades");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xuniversidades.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.EditTextWrapper _txtubicacion = null;
public b4a.example.universidades _apiuniversidades = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public Object  _initialize(b4a.example.b4xuniversidades __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xuniversidades";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=39124992;
 //BA.debugLineNum = 39124992;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=39124993;
 //BA.debugLineNum = 39124993;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=39124994;
 //BA.debugLineNum = 39124994;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.b4xuniversidades __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xuniversidades";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=39190528;
 //BA.debugLineNum = 39190528;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=39190529;
 //BA.debugLineNum = 39190529;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=39190531;
 //BA.debugLineNum = 39190531;BA.debugLine="Root.LoadLayout(\"PageUniversidades\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("PageUniversidades",ba);
RDebugUtils.currentLine=39190532;
 //BA.debugLineNum = 39190532;BA.debugLine="apiUniversidades.Initialize(\"https://appuniapivac";
__ref._apiuniversidades /*b4a.example.universidades*/ ._initialize /*String*/ (null,ba,"https://appuniapivaca.azurewebsites.net/api/Universidades");
RDebugUtils.currentLine=39190533;
 //BA.debugLineNum = 39190533;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4xuniversidades __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xuniversidades";
RDebugUtils.currentLine=39059456;
 //BA.debugLineNum = 39059456;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=39059457;
 //BA.debugLineNum = 39059457;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=39059458;
 //BA.debugLineNum = 39059458;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=39059459;
 //BA.debugLineNum = 39059459;BA.debugLine="Private txtId As EditText";
_txtid = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=39059460;
 //BA.debugLineNum = 39059460;BA.debugLine="Private txtNombre As EditText";
_txtnombre = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=39059461;
 //BA.debugLineNum = 39059461;BA.debugLine="Private txtUbicacion As EditText";
_txtubicacion = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=39059462;
 //BA.debugLineNum = 39059462;BA.debugLine="Private apiUniversidades As Universidades";
_apiuniversidades = new b4a.example.universidades();
RDebugUtils.currentLine=39059463;
 //BA.debugLineNum = 39059463;BA.debugLine="End Sub";
return "";
}
public void  _cmdactualizar_click(b4a.example.b4xuniversidades __ref) throws Exception{
RDebugUtils.currentModule="b4xuniversidades";
if (Debug.shouldDelegate(ba, "cmdactualizar_click", false))
	 {Debug.delegate(ba, "cmdactualizar_click", null); return;}
ResumableSub_cmdActualizar_Click rsub = new ResumableSub_cmdActualizar_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_cmdActualizar_Click extends BA.ResumableSub {
public ResumableSub_cmdActualizar_Click(b4a.example.b4xuniversidades parent,b4a.example.b4xuniversidades __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.b4xuniversidades __ref;
b4a.example.b4xuniversidades parent;
boolean _r = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xuniversidades";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=39583745;
 //BA.debugLineNum = 39583745;BA.debugLine="If txtId.Text.Trim = \"\" Or txtNombre.Text.Trim =";
if (true) break;

case 1:
//if
this.state = 4;
if ((__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim()).equals("") || (__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim()).equals("") || (__ref._txtubicacion /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim()).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=39583746;
 //BA.debugLineNum = 39583746;BA.debugLine="Msgbox(\"Por favor, complete todos los campos\", \"";
parent.__c.Msgbox(BA.ObjectToCharSequence("Por favor, complete todos los campos"),BA.ObjectToCharSequence("Error"),ba);
RDebugUtils.currentLine=39583747;
 //BA.debugLineNum = 39583747;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=39583750;
 //BA.debugLineNum = 39583750;BA.debugLine="Wait For (apiUniversidades.UpdateUniversidad(txtI";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xuniversidades", "cmdactualizar_click"), __ref._apiuniversidades /*b4a.example.universidades*/ ._updateuniversidad /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())),__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),__ref._txtubicacion /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
this.state = 11;
return;
case 11:
//C
this.state = 5;
_r = (Boolean) result[1];
;
RDebugUtils.currentLine=39583751;
 //BA.debugLineNum = 39583751;BA.debugLine="If r = True Then";
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
RDebugUtils.currentLine=39583752;
 //BA.debugLineNum = 39583752;BA.debugLine="Msgbox(\"Registro Actualizado\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Registro Actualizado"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=39583754;
 //BA.debugLineNum = 39583754;BA.debugLine="Msgbox(\"No hay datos\", \"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No hay datos"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=39583756;
 //BA.debugLineNum = 39583756;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _cmdcrear_click(b4a.example.b4xuniversidades __ref) throws Exception{
RDebugUtils.currentModule="b4xuniversidades";
if (Debug.shouldDelegate(ba, "cmdcrear_click", false))
	 {Debug.delegate(ba, "cmdcrear_click", null); return;}
ResumableSub_cmdCrear_Click rsub = new ResumableSub_cmdCrear_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_cmdCrear_Click extends BA.ResumableSub {
public ResumableSub_cmdCrear_Click(b4a.example.b4xuniversidades parent,b4a.example.b4xuniversidades __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.b4xuniversidades __ref;
b4a.example.b4xuniversidades parent;
b4a.example.universidad _u = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xuniversidades";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=39518209;
 //BA.debugLineNum = 39518209;BA.debugLine="If txtNombre.Text.Trim = \"\" Or txtUbicacion.Text.";
if (true) break;

case 1:
//if
this.state = 4;
if ((__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim()).equals("") || (__ref._txtubicacion /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim()).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=39518210;
 //BA.debugLineNum = 39518210;BA.debugLine="Msgbox(\"Por favor, complete todos los campos\", \"";
parent.__c.Msgbox(BA.ObjectToCharSequence("Por favor, complete todos los campos"),BA.ObjectToCharSequence("Error"),ba);
RDebugUtils.currentLine=39518211;
 //BA.debugLineNum = 39518211;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=39518214;
 //BA.debugLineNum = 39518214;BA.debugLine="Wait For (apiUniversidades.CreateUniversidad(0, t";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xuniversidades", "cmdcrear_click"), __ref._apiuniversidades /*b4a.example.universidades*/ ._createuniversidad /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int) (0),__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),__ref._txtubicacion /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
this.state = 11;
return;
case 11:
//C
this.state = 5;
_u = (b4a.example.universidad) result[1];
;
RDebugUtils.currentLine=39518215;
 //BA.debugLineNum = 39518215;BA.debugLine="If u.Id > 0 Then";
if (true) break;

case 5:
//if
this.state = 10;
if (_u._id /*int*/ >0) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=39518216;
 //BA.debugLineNum = 39518216;BA.debugLine="txtId.Text = u.Id";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_u._id /*int*/ ));
RDebugUtils.currentLine=39518217;
 //BA.debugLineNum = 39518217;BA.debugLine="Msgbox(\"Insertado el registro\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Insertado el registro"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=39518219;
 //BA.debugLineNum = 39518219;BA.debugLine="Msgbox(\"No se pudo insertar el registro\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No se pudo insertar el registro"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=39518221;
 //BA.debugLineNum = 39518221;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _cmdeliminar_click(b4a.example.b4xuniversidades __ref) throws Exception{
RDebugUtils.currentModule="b4xuniversidades";
if (Debug.shouldDelegate(ba, "cmdeliminar_click", false))
	 {Debug.delegate(ba, "cmdeliminar_click", null); return;}
ResumableSub_cmdEliminar_Click rsub = new ResumableSub_cmdEliminar_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_cmdEliminar_Click extends BA.ResumableSub {
public ResumableSub_cmdEliminar_Click(b4a.example.b4xuniversidades parent,b4a.example.b4xuniversidades __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.b4xuniversidades __ref;
b4a.example.b4xuniversidades parent;
boolean _r = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xuniversidades";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=39649281;
 //BA.debugLineNum = 39649281;BA.debugLine="If txtId.Text.Trim = \"\" Then";
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
RDebugUtils.currentLine=39649282;
 //BA.debugLineNum = 39649282;BA.debugLine="Msgbox(\"Por favor, ingrese un ID\", \"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Por favor, ingrese un ID"),BA.ObjectToCharSequence("Error"),ba);
RDebugUtils.currentLine=39649283;
 //BA.debugLineNum = 39649283;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=39649286;
 //BA.debugLineNum = 39649286;BA.debugLine="Wait For (apiUniversidades.DeleteUniversidad(txtI";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xuniversidades", "cmdeliminar_click"), __ref._apiuniversidades /*b4a.example.universidades*/ ._deleteuniversidad /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 11;
return;
case 11:
//C
this.state = 5;
_r = (Boolean) result[1];
;
RDebugUtils.currentLine=39649287;
 //BA.debugLineNum = 39649287;BA.debugLine="If r = True Then";
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
RDebugUtils.currentLine=39649288;
 //BA.debugLineNum = 39649288;BA.debugLine="Msgbox(\"Registro Borrado\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Registro Borrado"),BA.ObjectToCharSequence("OK"),ba);
RDebugUtils.currentLine=39649289;
 //BA.debugLineNum = 39649289;BA.debugLine="txtId.Text = \"\"";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=39649290;
 //BA.debugLineNum = 39649290;BA.debugLine="txtNombre.Text = \"\"";
__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=39649291;
 //BA.debugLineNum = 39649291;BA.debugLine="txtUbicacion.Text = \"\"";
__ref._txtubicacion /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=39649293;
 //BA.debugLineNum = 39649293;BA.debugLine="Msgbox(\"No hay datos\", \"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No hay datos"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=39649295;
 //BA.debugLineNum = 39649295;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _cmdleer_click(b4a.example.b4xuniversidades __ref) throws Exception{
RDebugUtils.currentModule="b4xuniversidades";
if (Debug.shouldDelegate(ba, "cmdleer_click", false))
	 {Debug.delegate(ba, "cmdleer_click", null); return;}
ResumableSub_cmdLeer_Click rsub = new ResumableSub_cmdLeer_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_cmdLeer_Click extends BA.ResumableSub {
public ResumableSub_cmdLeer_Click(b4a.example.b4xuniversidades parent,b4a.example.b4xuniversidades __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.b4xuniversidades __ref;
b4a.example.b4xuniversidades parent;
b4a.example.universidad _u = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xuniversidades";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=39452673;
 //BA.debugLineNum = 39452673;BA.debugLine="If txtId.Text.Trim = \"\" Then";
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
RDebugUtils.currentLine=39452674;
 //BA.debugLineNum = 39452674;BA.debugLine="Msgbox(\"Por favor, ingrese un ID\", \"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Por favor, ingrese un ID"),BA.ObjectToCharSequence("Error"),ba);
RDebugUtils.currentLine=39452675;
 //BA.debugLineNum = 39452675;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=39452678;
 //BA.debugLineNum = 39452678;BA.debugLine="Wait For (apiUniversidades.ReadUniversidadById(tx";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xuniversidades", "cmdleer_click"), __ref._apiuniversidades /*b4a.example.universidades*/ ._readuniversidadbyid /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 11;
return;
case 11:
//C
this.state = 5;
_u = (b4a.example.universidad) result[1];
;
RDebugUtils.currentLine=39452679;
 //BA.debugLineNum = 39452679;BA.debugLine="If u.Id > 0 Then";
if (true) break;

case 5:
//if
this.state = 10;
if (_u._id /*int*/ >0) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=39452680;
 //BA.debugLineNum = 39452680;BA.debugLine="txtId.Text = u.Id";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_u._id /*int*/ ));
RDebugUtils.currentLine=39452681;
 //BA.debugLineNum = 39452681;BA.debugLine="txtNombre.Text = u.Nombre";
__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_u._nombre /*String*/ ));
RDebugUtils.currentLine=39452682;
 //BA.debugLineNum = 39452682;BA.debugLine="txtUbicacion.Text = u.Ubicacion";
__ref._txtubicacion /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_u._ubicacion /*String*/ ));
RDebugUtils.currentLine=39452683;
 //BA.debugLineNum = 39452683;BA.debugLine="Msgbox(\"Registro leído con éxito\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Registro leído con éxito"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=39452685;
 //BA.debugLineNum = 39452685;BA.debugLine="Msgbox(\"No hay datos\", \"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No hay datos"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=39452687;
 //BA.debugLineNum = 39452687;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _cmdmenu_click(b4a.example.b4xuniversidades __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xuniversidades";
if (Debug.shouldDelegate(ba, "cmdmenu_click", false))
	 {return ((String) Debug.delegate(ba, "cmdmenu_click", null));}
RDebugUtils.currentLine=39714816;
 //BA.debugLineNum = 39714816;BA.debugLine="Private Sub cmdMenu_Click";
RDebugUtils.currentLine=39714817;
 //BA.debugLineNum = 39714817;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
_b4xpages._showpage /*String*/ (ba,"MainPage");
RDebugUtils.currentLine=39714818;
 //BA.debugLineNum = 39714818;BA.debugLine="End Sub";
return "";
}
}