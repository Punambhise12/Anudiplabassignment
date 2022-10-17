package assignment;

public class que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)//row
		{
			for(int j=1;j<=i;j++)//column
			{
				System.out.print(j+"");
			}
			for(int j=i-1;j>=1;j--)//reverse j
			{
				System.out.print(j+"");//printing pattern
			}
			System.out.println();
		}

	}

}
