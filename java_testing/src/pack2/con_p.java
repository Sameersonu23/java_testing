package pack2;
    public class con_p {
   public void con_p(int a)
	{
		System.out.println(a);
	}
	public con_p(double a)
	{
		System.out.println(a);
	}
	public con_p(int a,int b)
	{
		System.out.println(a+b);
	}
	public con_p(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public void method()
	{
		System.out.println("this is a method");
	}
	public static void main(String[]args)
	{
		con_p obj= new con_p(10.20);
				obj.method();
	}
}
