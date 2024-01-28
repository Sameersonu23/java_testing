package pack2;

public class this_key {

	  int a;int b;
//	
//	 int a;
//     int b;

	public void add(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a+b);
		this.sub(300,100);
	}
	
	public void sub(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a-b);
	}
	 public static void main(String[]arg)
	 {
		 this_key obj=new this_key();
				 obj.add(23, 43);
				 
	 }
	
}
