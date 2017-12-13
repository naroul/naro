package hello;
import java.util.Scanner;

public class Echelon implements Rectengle{
	
	private double height;
	private double upside;
	private double downside;
	private double hypotenuse;
	
	Scanner input = new Scanner(System.in);
	
	public Echelon() {
		System.out.print("Please input the height of Echelon : ");
		height = input.nextDouble();
		System.out.print("Please input the upside of Echelon : ");
		upside = input.nextDouble();
		System.out.print("Please input the downside of Echelon : ");
		downside = input.nextDouble();
		System.out.print("Please input the hypotenuse of Echelon : ");
		hypotenuse = input.nextDouble();
	}
	
    //检查梯形的斜边是否是最大边
	public boolean checkEchelon() {
		if(Math.max(Math.max(height, upside),downside) < hypotenuse) {
			System.out.println("The Echelon is true!");
			return true;
		}
		System.out.println("The Echelon is false!");
		return false;
	}
	
	public void getarea() {
		
		double area = (upside + downside) * height / 2;
		System.out.println("The area of the Echelon is : " + area);
		
	}


	public void getperimeter() {
		
		double perimeter = upside + downside + height + hypotenuse;
		System.out.println("The perimeter of the Echelon is : " + perimeter);
		
	}

}
