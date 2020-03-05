import java.util.*;
public class ArrayConsecutive{
	static boolean search(int[] arr, int element){
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == element){
				return true;
			}
		}
		return false;
	}

	static int makeArrayConsecutive(int[] arr){
		int count = 0;
		Arrays.sort(arr);
		int n = arr.length-1;
		for(int i=arr[0]; i<arr[n];i++)
		{	
			if(search(arr, i) == false){
				count++;
			}
		}
		return count;
	}	

	public static void main(String[] args) {
		int arr[] = {6, 2, 3, 8};
		int res = makeArrayConsecutive(arr);
		System.out.println(res);
	}
}