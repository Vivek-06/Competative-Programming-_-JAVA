import java.util.*;
import java.text.*;

public class JavaCurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat ind = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String usformat = us.format(payment);
        String indformat = ind.format(payment);
        String chinaformat = china.format(payment);
        String franceformalt = france.format(payment);
        
        System.out.println("US: " + usformat);
        System.out.println("India: " + indformat);
        System.out.println("China: " + chinaformat);
        System.out.println("France: " + franceformalt);
    }
}

