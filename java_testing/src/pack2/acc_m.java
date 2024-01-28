package pack2;
public class acc_m {
	public void public_method()
	{
		System.out.println("this is a public method");
	}
	private void private_method()
	{
		System.out.println("this is a private method");
	}
	protected void proctected_method()
	{
		System.out.println("this is a procted method");
	}
	void default_method()
	{
		System.out.println("this is a default method");
	}
	 public static void main(String[]arg)
	 {
		  acc_m obj=new acc_m();
		  obj.private_method();
		  obj.proctected_method();
		  obj.public_method();
		  obj.default_method();
	 }
}
