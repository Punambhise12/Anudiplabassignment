package assignment4;
import java.util.ArrayList;
import java.util.List;
public class even_odd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Integer> a=new ArrayList<Integer>();
    a.add(2);
    a.add(3);
    a.add(9);
    a.add(4);
    a.add(5);
   a.forEach((x)->
   {
	   if(x%2==0)// use for even number
	   {
		   System.out.print("Even ");
		  System.out.print(x+" ");
		  }

	    if(x%2==1)//use for even number
	   {
	    	System.out.print("Odd  ");
		  System.out.print(x+" ");
	   }
	    System.out.println("");
   });   
	}
}


