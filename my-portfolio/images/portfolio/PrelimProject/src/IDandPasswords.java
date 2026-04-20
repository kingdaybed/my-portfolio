import java.util.HashMap;

public class IDandPasswords {
	
	HashMap<String,String> logininfo = new HashMap<String,String>();

	IDandPasswords(){
		
		logininfo.put("David","1234");
		logininfo.put("Visitor1","123");
		logininfo.put("Visitor2","abc");
	}	
		
	protected HashMap getLoginInfo() {
			return logininfo;
		}
}