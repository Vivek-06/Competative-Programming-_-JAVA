public class ArrayReplace{
	static int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem){
		
		int[] arr = new int[inputArray.length];
		for(int i=0;i<inputArray.length;i++){
			if(inputArray[i] == elemToReplace){
				arr[i] = substitutionElem;
			}else{
				arr[i] = inputArray[i];
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] inputArray = {1,2,1};
		int elemToReplace = 1;
		int substitutionElem = 3;
		int[] res = arrayReplace(inputArray, elemToReplace, substitutionElem);
		for(int i=0;i<res.length;i++){
			System.out.println(res[i]);
		}
	}
}