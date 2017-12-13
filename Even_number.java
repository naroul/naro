package cal;

public class Even_number extends Number {
	
	public void calculate2(double x , int n) {
		
		if(n <= 0) {
			System.out.println("n must be a positive integer,but you input is not!");
		}
		else {
			double y = 0;
			for(int i = 1; i <= n ; i++) {
				y = y + x/add(i) ;
			}
		    System.out.println("the result of calculate is : " + y);
		}
		
	}
	
	public static int add(int n) {
		
		int sum = 0;
		for(;n > 0; n--) {
			sum = sum + n;
		}
		return sum;
	}
}
