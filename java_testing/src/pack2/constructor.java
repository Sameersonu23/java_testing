package pack2;
public class constructor
{
	public void addition(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void substruction(int a, double d)
	{
		double c=a-d;
	   System.out.println( c);
	}
	public void multiplication(double d,double e)
	{
	double c=d*e;
	System.out.println( c);
	}
	
	public static void main(String[]arg)
	{
		constructor obj = new constructor();
		obj.addition(10, 20);
		obj.substruction(23, 32.4);
		obj.multiplication(3.4, 4.5);
	}
	}
