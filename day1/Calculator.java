package week2.day1;

public class Calculator {
	public void additionTwoNumber(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	
	public void subractionTwoNumber(int e,int f) {
		int g=e-f;
		System.out.println(g);
	}
	
	public void multipleTwoNumber(double i,double j) {
		double k=i*j;
		System.out.println(k);
	}
	
	public void divideTwoNumber(float x,float y) {
		float z=x/y;
		System.out.println(z);
	}
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.additionTwoNumber(23, 42);
		cal.subractionTwoNumber(425, 99);
		cal.multipleTwoNumber(25, 4);
		cal.divideTwoNumber(33f, 3f);
	}

}
