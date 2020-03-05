import java.util.*;
public class AbsoluteValueSum{
	static int absoluteValueSum(int[] arr){
		ArrayList<Integer> list = new ArrayList<>();
		int n=0, y=0;
		for(int i=0;i<arr.length;i++){
			n=0;
			for(int j=0;j<arr.length;j++){
				n += Math.abs(arr[j] - arr[i]);
			}
			list.add(n);
		}
		return arr[list.indexOf(Collections.min(list))];

	}
	public static void main(String[] args) {
		int[] arr = {2,4,7};
		int res = absoluteValueSum(arr);
		System.out.println(res);
	}
}