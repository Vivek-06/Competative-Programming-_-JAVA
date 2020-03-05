public class ArrayChange{
	static int arrayChange(int[] inputArray){
		int count = 0;
		for (int i = 0; i < inputArray.length - 1; i++) {
			if (inputArray[i] >= inputArray[i + 1]) {
				int addition = (inputArray[i] - inputArray[i + 1]) + 1;
				System.out.println(addition);
				count += addition;
				inputArray[i + 1] += addition;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = {-1000, 0, -2, 0};
		int res = arrayChange(arr);
		System.out.println(res);
	}
}