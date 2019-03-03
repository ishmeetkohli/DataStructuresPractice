package groundtruth;

public class IsSubString {
	
	public boolean isSubString(String str1, String str2) {
		
		for(int i=0; i<str2.length(); i++) {
			for(int j=0; j<str1.length(); j++) {
				if(str2.charAt(i+j) != str1.charAt(j)) {
					break;
				}
			}
			return true;
		}
		return false;
	}
}



