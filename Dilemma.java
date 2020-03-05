import java.util.*;
public class Dilemma{
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while(t-- > 0){
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				int d = sc.nextInt();
				if(a==b){
					System.out.println("YES");
				}else if(a!=b && c==d){
					System.out.println("NO");
				}else if(Math.abs(a-b) % Math.abs(c-d) == 0){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
				
			}
		}catch(Exception e){}
	}
}