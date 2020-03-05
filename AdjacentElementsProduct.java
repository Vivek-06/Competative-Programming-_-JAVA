public class AdjacentElementsProduct{
	public static void main(String[] args) {
		int inputArray[] = {-23, 4, -3, 8, -12};
		int product=0, max=-1000;
    	for(int i=0;i<inputArray.length-1;i++){
	        product = inputArray[i] * inputArray[i+1];
	        System.out.println(product);
	        if(product>max){
	            max = product;
        	}
        	
    	}
    	System.out.println(max);
	}
}