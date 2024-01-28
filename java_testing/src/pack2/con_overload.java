package pack2;

public class con_overload {

	
	public  con_overload(int a)
	{
		System.out.println(a);
	}
	public  con_overload(int a, double b)
	{
		double c=a-b;
	   System.out.println( c);
	}
	public  con_overload(double d,double e)
	{
	double c=d*e;
	System.out.println( c);
	}
	
	public static void main(String[]arg)
	{
		con_overload obj = new con_overload(10);
		con_overload obj1 = new con_overload(10, 20.4);
		con_overload obj2 = new con_overload(23, 32.4);
	}
	 
}

