package hello;
import java.util.Scanner;

public class Triangle implements Rectengle{
	
	private double side1;
	private double side2;
	private double side3;
	
	Scanner input = new Scanner(System.in);
	
	public Triangle() {
		System.out.print("Please input the side1 of Triangle : ");
		this.side1 = input.nextDouble();
		System.out.print("Please input the side2 of Triangle : ");
		this.side2 = input.nextDouble();
		System.out.print("Please input the side3 of Triangle : ");
		this.side3 = input.nextDouble();
	}
    
	//根据边长判断三角形是否正确
	public boolean checktriangle() {
		
		if((Math.abs(side1 - side2) < side3) && (side3 < (side1 +side2))) {
			System.out.println("The triangle is true!");
			return true;
		}
		System.out.println("The triangle is false!");
		return false;
		
	}
	
	
	public void getarea() {
		
		double area = Math.sqrt((side1+side2+side3)*(side1+side2-side3)*(side1+side3-side2)*(side2+side3-side1))/4;
		System.out.println("The area of the triangle is " + area);
		
	}

	public void getperimeter() {
		double perimeter = side1 + side2 + side3;
		System.out.println("The perimeter of the triangle is " + perimeter);
	}

}
