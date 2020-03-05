import java.util.*;
public class HardCash{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int noOfBags = sc.nextInt();
			int k = sc.nextInt();
			long arr[] = new long[noOfBags];
			for(int i=0;i<noOfBags;i++){
				arr[i] = sc.nextInt();
			}
			long sum = 0;
			for(int i=0;i<arr.length;i++){
				sum += arr[i];
			}
			System.out.println(sum%k);
		}

	}
}