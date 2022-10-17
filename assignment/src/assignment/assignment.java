package assignment;

import java.util.Scanner;

public class assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter roll No:");
		int x=obj.nextInt();
		int z=1%4;
		
		if(x%4==1)
		{
			System.out.println("Sapphire Group");
		}
		else if(x%4==2)
		{
			System.out.println("Perl Group");
		}
		else if(x%4==3)
		{
			System.out.println("Ruby Group");
		}
		else if(x%4==0)
		{
			System.out.println("Emerald Group");
		}
		

	}

}
