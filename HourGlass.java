import java.util.*;
public class HourGlass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int [6][6];
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int k=0;k<4;k++){
            for(int i=k;i<k+3;i++){
                for(int j=k;j<k+3;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }

        }

    }
}
