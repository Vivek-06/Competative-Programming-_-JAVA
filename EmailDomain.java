import java.util.*;

public class EmailDomain{
	static String emailDomain(String str){
		char[] arr = new char[str.length()];
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) == '@'){
				for(int j=i+1;j<str.length();j++){
					arr[j] = str.charAt(j);
				}
				break;
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
		StringBuilder string = new StringBuilder();
		for(int i=0;i<arr.length;i++){
			if(arr[i] != '\u0000')
				string.append(arr[i]);
		}
		return string.toString();
	}

	public static void main(String[] args) {
		String str = "\"very.unusual.@.unusual.com\"@usual.com";
		String res = emailDomain(str);
		System.out.println(res);
	}
}