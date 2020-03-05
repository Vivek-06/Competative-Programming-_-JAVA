import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result  {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING. The function accepts following
     * parameters: 1. INTEGER month 2. INTEGER day 3. INTEGER year
     */
    static List<String> days = Arrays.asList("SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY");
    public static String findDay(int month, int day, int year) {

        Calendar c = Calendar.getInstance();
        c.set(year, month-1, day); 
            
        int p = c.get(Calendar.DAY_OF_WEEK);
        String s = days.get(p-1);
        return s;

    }

}

public class JavaDateTime {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        int day = sc.nextInt();

        int year = sc.nextInt();

        String res = Result.findDay(month, day, year);

        System.out.println(res);
        sc.close();
    }
}
