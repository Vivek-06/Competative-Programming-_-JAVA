import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaPrimalityTest {
    
   

    public static void main(String[] args) {
        boolean result = true;
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        BigInteger bigInteger = new BigInteger(n);
        result = bigInteger.isProbablePrime(1);
        if(result){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
        scanner.close();
    }
}
