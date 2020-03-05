public class BoxBlur{
	static int[][] boxBlur(int[][] image){
		int row = image.length; 
		int col = image[0].length;
		int nRow = row-2;
		int nCol = col-2;
		int[][] res = new int[nRow][nCol];
		for(int i=0;i<nRow;i++){
			for(int j=0;j<nCol;j++){
				int sum = 0;
				for(int k=i;k<i+3;k++){
					for(int l=j;l<j+3;l++){
						sum += image[k][l];
					}
				}
				res[i][j] = sum/9;
			}
			
		}
		return res;
	}

	public static void main(String[] args) {
		int[][] image = {{7, 4, 0, 1}, 
        				 {5, 6, 2, 2}, 
         				{6, 10, 7, 8}, 
         				{1, 4, 2, 0}};
        int[][] res = boxBlur(image);
        for (int i=0;i<res.length;i++ ) {
        	for(int j=0;j<res[0].length;j++){
        		System.out.println(res[i][j]);
        	}
        }
	}
}

/*
int[][] result = new int[image.length - 2][image[0].length - 2];
    
    for(int i = 0; i < image.length - 2; i++) {
        for(int j = 0; j < image[i].length - 2; j++) {
            int sum = 0;
            
            for(int k = i; k < i + 3; k++) {
                for(int l = j; l < j + 3; l++) {
                    sum += image[k][l];
                }                
            }            
            result[i][j] = sum / 9;
        }
    }
    return result;
*/