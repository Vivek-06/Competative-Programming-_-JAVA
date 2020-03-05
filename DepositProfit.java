public class DepositProfit{
	static int depositProfit(int deposit, int rate, int threshold){
		int year = 0;
  		while(deposit<threshold){
      		int n = (rate/100)*deposit;
      		System.out.println(n);
      		deposit = n+deposit;
      		System.out.println(deposit);	
      		year++;
      		System.out.println(year);
  		}
  		return year;
  	}

	public static void main(String[] args) {
		int deposit = 100, rate = 20, threshold = 170;
		int res = depositProfit(deposit, rate, threshold);
		System.out.println(res);
	}
}