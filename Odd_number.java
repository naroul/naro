package cal;

public class Odd_number extends Number {

	public void calculate1(double x , int n) {
		
		if(n <= 0) {
			System.out.println("n must be a positive integer,but you input is not!");
		}
		else {
			double y = 0;
			for(int i = 1; i <= n ; i++) {
				y = y + x/i ;
			}
		    System.out.println("the result of calculate is : " + y);
		}
		
	}
	
}
