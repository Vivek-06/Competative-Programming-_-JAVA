public class chessKnignt{
	static int count=0;
	static int ChessKnight(String str){
		//forwardLeftKnight(str);
		//forwardRightKnight(str);
		//backwardLeftKnight(str);
		//backwardRightKnight(str);
		//leftForwardKnight(str);
		//rightForwardKnight(str);
		//leftBackwardKnight(str);
		//rightBackwardKnight(str);
		diagonalForwardLeftKnight(str);
		diagonalForwardRightKnight(str);
		diagonalBackwardRightKnight(str);
		diagonalBackwardRightKnight(str);
		return count;
	}
	static void forwardLeftKnight(String str){
		int i=str.charAt(0)-1;
		int j=str.charAt(1)+2;
		checkKnight(i,j);
	}
	static void forwardRightKnight(String str){
		int i=str.charAt(0)+1;
		int j=str.charAt(1)+2;
		checkKnight(i,j);
	}
	static void backwardLeftKnight(String str){
		int i=str.charAt(0)-1;
		int j=str.charAt(1)-2;
		checkKnight(i,j);
	}
	static void backwardRightKnight(String str){
		int i=str.charAt(0)+1;
		int j=str.charAt(1)-2;
		checkKnight(i,j);
	}
	static void leftForwardKnight(String str){
		int i=str.charAt(0)-2;
		int j=str.charAt(1)+1;
		checkKnight(i,j);
	}
	static void rightForwardKnight(String str){
		int i=str.charAt(0)+2;
		int j=str.charAt(1)+1;
		checkKnight(i,j);
	}
	static void leftBackwardKnight(String str){
		int i=str.charAt(0)-2;
		int j=str.charAt(1)-1;
		checkKnight(i,j);
	}
	static void rightBackwardKnight(String str){
		int i=str.charAt(0)+2;
		int j=str.charAt(1)-1;
		checkKnight(i,j);
	}
	static void forwardLeftKnight(String str){
		int i=str.charAt(0)-1;
		int j=str.charAt(1)+2;
		checkKnight(i,j);
	}
	static void forwardLeftKnight(String str){
		int i=str.charAt(0)-1;
		int j=str.charAt(1)+2;
		checkKnight(i,j);
	}
	static void forwardLeftKnight(String str){
		int i=str.charAt(0)-1;
		int j=str.charAt(1)+2;
		checkKnight(i,j);
	}
	static void forwardLeftKnight(String str){
		int i=str.charAt(0)-1;
		int j=str.charAt(1)+2;
		checkKnight(i,j);
	}
	static void checkKnight(int i, int j){
		if(i>=97 && i<=104){
			if(j>=1 && j<=8){
				count++;
			}
		}
	}


	public static void main(String[] args) {
		String str = "a1";
		int res = ChessKnight(str);
		System.out.println(res);
	}
}