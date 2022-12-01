package Assignments8;



public class circle {

	private double pi;
	private int r;
	public int getR()
	{
		return r;
	}
	public void setR(int r)
	{
		this.r=r;
	}
	public circle(int r)
	{
		super();
		this.r=r;
	}
	public void Area()
	{
		double pi=3.14;
		double area=pi*r*r;
	    System.out.println("Area of circle is :"+area);
	}
}
 class Area 
{
  public static void main(String[] args) 
  {
	  circle c=new circle(4);
	c.Area();
	circle c1=new circle(20);
	c1.Area();
  }
}
