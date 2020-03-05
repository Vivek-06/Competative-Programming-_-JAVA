import java.util.*;

public class DigitDegree{
	static int digitDegree(int n){
		int degree = 0,sum;
		if(countDigit(n) == 1){
			return 0;
		}
		else{
			sum = sumDigit(n);
			degree++;
			if(countDigit(sum)>1){
				degree += digitDegree(sum);
			}else{
				digitDegree(sum);
			}
		}
		return degree;
	}

	static int sumDigit(int n){
		return n == 0 ? 0:n%10 + sumDigit(n/10); 
	}

	static int countDigit(long n){
		if(n==0)
			return 0;

		return (int)Math.floor(Math.log10(n) + 1);
	}

	public static void main(String[] args) {
		int number = 777773;
		int res = digitDegree(number);
		System.out.println(res);
	}
}