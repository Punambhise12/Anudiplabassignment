package assignment5;
import java.util.Scanner;

public class ArrayZero{
	  public static void main(String[] args) 
		{
			Scanner s = new Scanner(System.in);
			int a[] = new int[5];
			System.out.println("Enter 5 members of Array : ");
			for(int i = 0; i < a.length ; i++){
		              a[i] = s.nextInt();
		            }
				
			for(int i = 0; i < a.length ; i++){
				if(a[i] != 0){
		              System.out.print(a[i]+" ");
				}
				else{
					System.out.println();
					throw new NullPointerException("ZeroMemberEroor!!!");
				}
				
		            }
			
		    }
		}