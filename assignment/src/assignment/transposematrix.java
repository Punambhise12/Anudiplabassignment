package assignment;
//import java.util.Scanner;
public class transposematrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[][]= {{1,2},{4,5},{8,9}};
       int multi=1;
       int transpose [][]=new int[2][3];//declaring array 
       for(int i=0;i<3;i++)
       {
    	   for(int j=0;j<2;j++)
    	   {
    		   System.out.print(a[i][j]+" ");//print original; matrix
    	   }
       
       System.out.println();
       }
       //code for transpose Matrix
       System.out.println("Transpose matrix");
       for(int i=0;i<2;i++)
       {
    	   for(int j=0;j<3;j++)
    	   {
    	   transpose[i][j]=a[j][i];
    	   System.out.print(transpose[i][j]+" ");//print transpose Matrix
       }
    	   System.out.println();
	}
       //code for Multiplication of all matrix element
       for(int i=0;i<2;i++)
       {
    	   for(int j=0;j<3;j++)
    	   {
    		   multi*=transpose[i][j];
    	   }
    	   
       }
       System.out.println("Multiplication is:-"+multi);
	}
}
