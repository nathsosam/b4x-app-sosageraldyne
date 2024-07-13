package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 18;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="Root = Root1";
Debug.ShouldStop(262144);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 20;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
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
public static RemoteObject  _button1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("button1_click")) { return __ref.runUserSub(false, "b4xmainpage","button1_click", __ref);}
 BA.debugLineNum = 25;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="xui.MsgboxAsync(\"Hello world!\", \"B4X\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence("Hello world!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("B4X"))));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _cmdcarreras_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmdCarreras_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("cmdcarreras_click")) { return __ref.runUserSub(false, "b4xmainpage","cmdcarreras_click", __ref);}
RemoteObject _pagecarreras = RemoteObject.declareNull("b4a.example.b4xcarreras");
 BA.debugLineNum = 29;BA.debugLine="Private Sub cmdCarreras_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="Dim PageCarreras As B4XCarreras";
Debug.ShouldStop(536870912);
_pagecarreras = RemoteObject.createNew ("b4a.example.b4xcarreras");Debug.locals.put("PageCarreras", _pagecarreras);
 BA.debugLineNum = 31;BA.debugLine="PageCarreras.Initialize";
Debug.ShouldStop(1073741824);
_pagecarreras.runClassMethod (b4a.example.b4xcarreras.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 33;BA.debugLine="B4XPages.AddPageAndCreate(\"PageCarreras\", PageCar";
Debug.ShouldStop(1);
b4xmainpage._b4xpages.runVoidMethod ("_addpageandcreate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("PageCarreras")),(Object)((_pagecarreras)));
 BA.debugLineNum = 35;BA.debugLine="B4XPages.ShowPage(\"PageCarreras\")";
Debug.ShouldStop(4);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("PageCarreras")));
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmduniversidades_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmdUniversidades_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("cmduniversidades_click")) { return __ref.runUserSub(false, "b4xmainpage","cmduniversidades_click", __ref);}
RemoteObject _pageun = RemoteObject.createImmutable("");
RemoteObject _pageuniversidades = RemoteObject.declareNull("b4a.example.b4xuniversidades");
 BA.debugLineNum = 38;BA.debugLine="Private Sub cmdUniversidades_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="Dim PageUn";
Debug.ShouldStop(64);
_pageun = RemoteObject.createImmutable("");Debug.locals.put("PageUn", _pageun);
 BA.debugLineNum = 40;BA.debugLine="Dim PageUniversidades As B4XUniversidades";
Debug.ShouldStop(128);
_pageuniversidades = RemoteObject.createNew ("b4a.example.b4xuniversidades");Debug.locals.put("PageUniversidades", _pageuniversidades);
 BA.debugLineNum = 41;BA.debugLine="PageUniversidades.Initialize";
Debug.ShouldStop(256);
_pageuniversidades.runClassMethod (b4a.example.b4xuniversidades.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 43;BA.debugLine="B4XPages.AddPageAndCreate(\"PageUniversidades\", Pa";
Debug.ShouldStop(1024);
b4xmainpage._b4xpages.runVoidMethod ("_addpageandcreate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("PageUniversidades")),(Object)((_pageuniversidades)));
 BA.debugLineNum = 45;BA.debugLine="B4XPages.ShowPage(\"PageUniversidades\")";
Debug.ShouldStop(4096);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("PageUniversidades")));
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(4096);
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}