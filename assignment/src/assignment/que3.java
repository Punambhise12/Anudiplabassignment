package assignment;

import java.util.Scanner;

public class que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter Any three number:");
		Scanner obj=new Scanner(System.in);
		int n1=obj.nextInt();
		int n2=obj.nextInt();
		int n3=obj.nextInt();
		int sum=n1+n2+n3;
		if(sum==180)
		{
			System.out.println("Prize 1");
		}
		else
		{
			System.out.println(" No Prize");
		}

	}

}
