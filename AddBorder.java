public class AddBorder{
	static String[] addBorder(String[] picture){
		String s = "";
		String[] arr = new String[picture.length + 2];
		for(int i=0;i<picture[0].length()+2; i++){
			s += "*";
		}
		
		for(int i=0;i<(picture.length+2);i++){
			if(i==0 || i==(picture.length+1)){
				arr[i] = s;
			}else{
				String s1 = "*" + picture[i-1] + "*";
				arr[i] = s1;
			}
		}
		return arr;
	} 

	public static void main(String[] args) {
		String[] picture = {"abc","ded"};
		String[] res = addBorder(picture);
		for(int i=0;i<res.length;i++){
			System.out.print(res[i]);
		}
	}
}