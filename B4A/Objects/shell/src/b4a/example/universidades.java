
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class universidades {
    public static RemoteObject myClass;
	public universidades() {
	}
    public static PCBA staticBA = new PCBA(null, universidades.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _jsonparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
public static RemoteObject _apijob = RemoteObject.declareNull("b4a.example.httpjob");
public static RemoteObject _apiurl = RemoteObject.createImmutable("");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.httputils2service _httputils2service = null;
public static b4a.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"apiJob",_ref.getField(false, "_apijob"),"apiURL",_ref.getField(false, "_apiurl"),"DateUtils",_ref.getField(false, "_dateutils"),"jsonParser",_ref.getField(false, "_jsonparser")};
}
}