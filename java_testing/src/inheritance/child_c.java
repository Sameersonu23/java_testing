package inheritance;

public class child_c extends parent_c{

	public void sub()
	{
		a=90;
		b=100;
		System.out.println(b-a);
	}
	public static void main(String[]args)
	{
		child_c obj= new child_c();
		obj.sub();
		obj.addition();
	}
}
