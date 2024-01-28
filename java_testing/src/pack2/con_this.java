package pack2;
public class con_this 
{
       public void con_this(double d)
	{
           System.out.println(d);
	}   
	public void con_this(int a)
	{
		this.con_this(4.5);
		System.out.println(a);
	}
	public void con_this(int a,int b)
	{
		this.con_this(5);
    	 System.out.println(a+b);
	}
     public void con_this(int a,int b,int c)
	{
		this.con_this(2,4);
		System.out.println(a*b*c);
	}
	public void method()
	{
		System.out.println("this is a method");
	}
	public static void main(String[]arg)
	{
		con_this obj= new con_this();
		obj.con_this(3,4,5);
		obj.method();
		
	}
}
