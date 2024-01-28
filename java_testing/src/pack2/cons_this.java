package pack2;

public class cons_this {
	public cons_this()
	{
System.out.println("this is a constructor");
	}
	
	public cons_this(int a)
	{
		this();
System.out.println(a);
	}
	
	public cons_this(double a)
	{
		this(10);
System.out.println(a);
	}
	
	public cons_this(int a,int b)
	{
		this(10.2);
System.out.println(a+b);
	}
	
	
	

	public cons_this(int a,int b,int c)
	{
		this(10,20);
System.out.println(a+b+c);
	}
	
	 public void method()
	 {
		 System.out.println("this is a method");
	 }
	 
	public static void main(String[]args)

	{
		cons_this obj=new cons_this(10,20,30);
		    obj.method();
	
	}}