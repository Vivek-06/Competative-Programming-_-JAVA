import java.util.Scanner;

public class JavaSubStirngComparison {

    public static String getSmallestAndLargest(String s, int k) {
        String currentString  = s.substring(0,k);
        String smallest = currentString;
        String largest = currentString;
        for(int i=k;i<s.length();i++){
            currentString = currentString.substring(1,k) + s.charAt(i);
            if(largest.compareTo(currentString)<0)
                largest = currentString;
            if(smallest.compareTo(currentString)>0)
                smallest = currentString;
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}