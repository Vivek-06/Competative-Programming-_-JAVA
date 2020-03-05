import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList list = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int queries = sc.nextInt();
        while(queries-- !=0)
        {
            System.out.println("Insert");
            int index = sc.nextInt();
            int element = sc.nextInt();
            list.add(index, element);

            System.out.println("Delete");
            int indexDelete = sc.nextInt();
            list.remove(indexDelete);
        }
        System.out.println(list);
        sc.close();
    }
}