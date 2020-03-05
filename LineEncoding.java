public class LineEncoding{
	static final int MAX_CHAR = 256; 
  
    static String getOccuringChar(String str) 
    { 
        /*
        int count[] = new int[MAX_CHAR]; 
  		StringBuilder strb = new StringBuilder();
        int len = str.length(); 
        for (int i = 0; i < len; i++) 
            count[str.charAt(i)]++; 
        char ch[] = new char[str.length()]; 
        for (int i = 0; i < len; i++) { 
            ch[i] = str.charAt(i); 
            int find = 0; 
            for (int j = 0; j <= i; j++) { 
                if (str.charAt(i) == ch[j])  
                    find++;                 
            } 
			if(strb.length() == 0){
				String str3 = Integer.toString(count[str.charAt(i)])+str.charAt(i); 
				strb.append(str3);
			}
			if(count[str.charAt(i)] == 1){
            	char str1 = str.charAt(i); 
	            strb.append(str1);
            } 
			if(str.charAt(i) != strb.charAt(strb.length()-1)){
            	String str2 = Integer.toString(count[str.charAt(i)])+str.charAt(i); 
				strb.append(str2);
            }
            
               
        }
        */

        StringBuilder strb = new StringBuilder();
        char[] arr = new char[str.length()];
        for(int i=0;i<arr.length;i++){
        	arr[i] = str.charAt(i);
        }
        for(char w:arr){
        	System.out.println(w);
        }
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
        	int count=0;
        	/*if(arr[i] == arr[i-1]){
        		String str2 = arr[i] +Integer.toString(count++);
        		strb.append(str2); 
        	}else{
        		String str1 = arr[i] + Integer.toString(count);
        		strb.append(str);
        	}*/
        	if(strb.charAt(i) == '/u0000'){
        		strb.append(arr[0]);
        	}else if(arr[i] == )

        }
       return strb.toString();
    } 

	public static void main(String[] args) {
		String str = "abbcabb";
		String res = getOccuringChar(str);
		System.out.println(res);
	}
}