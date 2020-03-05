import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a1 = sc.nextLine();
        String b1 = sc.nextLine();
        
        BigInteger a = new BigInteger(a1);
        BigInteger b = new BigInteger(b1);
        BigInteger sum = a.add(b); 
        BigInteger mul = a.multiply(b);
        System.out.println(sum);
        System.out.println(mul);
    }
}