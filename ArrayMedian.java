public class ArrayMedian{
	static double arrayMedian(int[] nums1, int[] nums2){
		double res;
        int sum = 0;
        int length=0;
        for(int i=0;i<nums1.length;i++){
            sum += nums1[i];
        }
        System.out.println(sum);
        for(int i=0;i<nums2.length;i++){
            sum += nums2[i];
        }
        System.out.println(sum);
        length = nums1.length + nums2.length;
        System.out.println(length);
        res = (float)sum/length;

        return res;
	}

	public static void main(String[] args) {
		int arr1[] = {3};
		int arr2[] = {-2,-1};
		double res = arrayMedian(arr1, arr2);
		System.out.println(res);
	}
}