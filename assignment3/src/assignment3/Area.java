package assignment3;
import java.util.Scanner;

class shape {
	
}
class circle extends shape
{
	void areaOfCircle(double a) {
		double A= Math.PI*a*a;
		System.out.println("Area Of Circle:" + A);
	}
}
class square extends shape
{
	void areaofsquare(double a)
	{
		double A=a*a;
		System.out.println("Area Of Squuare:" + A);
	}
}
public class Area{
	public static void main(String[] args) {
		Double x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius :: ");
		x=sc.nextDouble();
		circle c1= new circle();
		c1.areaOfCircle(x);
		
		System.out.println("Enter side ::");
		y =sc.nextDouble();
		square s1= new square();
		s1.areaofsquare(y);

	}

}
