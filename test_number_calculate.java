package cal;
import java.util.Scanner;

public class test_number_calculate {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a double real-number x: ");
		double x = input.nextDouble();
		System.out.print("Please input a positive integer n: ");
		int n = input.nextInt();
		if(n % 2 == 1) {
			Odd_number odd_number = new Odd_number();
			odd_number.calculate1(x, n);
		}
		else {
			Even_number even_number = new Even_number();
			even_number.calculate2(x, n);
		}

	}

}
