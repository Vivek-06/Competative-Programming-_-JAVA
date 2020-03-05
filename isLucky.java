public class isLucky{
	static boolean checkLuck(int n){
		String str = Integer.toString(n);
		int first = 0, second = 0;
		for(int i=0;i<str.length()/2;i++){
			first += str.charAt(i);
		}
		for(int i=str.length()/2; i<str.length();i++){
			second += str.charAt(i);
		}
		if(first == second){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int n = 239017;
		boolean res = checkLuck(n);
		System.out.println(res);
	}
}