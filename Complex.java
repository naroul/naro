package hello;

public class Complex {

	public double real_part;
	public double imaginary_part;
	
	public Complex(double real_number,double imaginary_number) {
		real_part = real_number;
		imaginary_part = imaginary_number;
	}

	public void plus(Complex complex) {
	    real_part = real_part + complex.real_part;
	    imaginary_part = imaginary_part + complex.imaginary_part;
	}
	
	public void minus(Complex complex) {
	    real_part = real_part - complex.real_part;
	    imaginary_part = imaginary_part - complex.imaginary_part;
	}
	
	public void plus(double real_number) {
	    real_part = real_part + real_number;
	}
	
	public void minus(double real_number) {
        real_part = real_part - real_number;
	}
	
	//打印这个复数
	public void print() {
		System.out.print(real_part + "+" + imaginary_part + "i");
	}
	
	
	
	
}
