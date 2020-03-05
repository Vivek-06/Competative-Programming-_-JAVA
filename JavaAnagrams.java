import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        String str1 = a.toLowerCase();
        String str2 = b.toLowerCase();

        char ch1[] = new char[str1.length()];
        char ch2[] = new char[str2.length()];

        for(int i=0;i<str1.length();i++){
            ch1[i] = str1.charAt(i);
        }
        for(int j=0;j<str2.length();j++){
            ch2[j] = str2.charAt(j);
        }

        if(ch1.length != ch2.length){
            return false;
        }
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for(int k=0;k<ch1.length;k++){
            if(ch1[k] != ch2[k])
                return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}