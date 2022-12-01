package assignment8;

import java.util.Scanner;

public class Electricity_Bill {
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the units");
	int unit=0;
	double TotalCharges;
	unit=sc.nextInt();
	if (unit>0 && unit<=100) 
	{
		TotalCharges=unit*1.20;
		System.out.println("Your electricity bill is :"+TotalCharges+".Rs");
	}
	else if (unit>100 && unit<=300) 
	{
		TotalCharges=unit*2.0;
		System.out.println("Your electricity bill is :"+TotalCharges+".Rs");
	}
	else if (unit>300) 
	{
		TotalCharges=unit*3.0;
		System.out.println("Your electricity bill is :"+TotalCharges+".Rs");
	}
	else
	{
		System.out.println("Invalid input!!!");
	}
}

}
