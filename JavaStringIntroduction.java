import java.io.*;
import java.util.*;

public class JavaStringIntroduction{
    
    static String capitailizeWord(String str) { 
        StringBuffer s = new StringBuffer(); 
        char ch = ' '; 
        for (int i = 0; i < str.length(); i++) { 
            if (ch == ' ' && str.charAt(i) != ' ') 
                s.append(Character.toUpperCase(str.charAt(i))); 
            else
                s.append(str.charAt(i)); 
            ch = str.charAt(i); 
        } 
        return s.toString().trim(); 
    } 
  
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        String sum = A + B;
        System.out.println(sum.length());

        int n = A.compareTo(B);
        if(n>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        String add = A + " " + B;
        System.out.println(capitailizeWord(add));
        sc.close();
    }
}
