package Assignments8;

import java.util.Arrays;
import java.util.Scanner;

public class Airplane {

	public static void main(String[] args) {
		
          Scanner sc=new Scanner(System.in);
          
          System.out.println("Enter The Row = ");
          int n=sc.nextInt();
           int sum=0;
          int a[]=new int[n];
          System.out.println("Enter The Row Value = ");
          for(int i=0;i<n;i++)
          {
            a[i]=sc.nextInt();
          
        	sum+=a[i];
          }
          System.out.println("The numbers is : " + Arrays.toString(a));
          System.out.println(sum);
         
          for(int i=0;i<n;i++)
          {
          if(a[i]<0)
     	 {
            	System.out.println("Invalid Input");
           }
}
}
}
