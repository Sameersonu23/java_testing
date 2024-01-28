package string;

public class char_int {

	char c='a';
	public void stringMethod()
	{
		boolean b=Character.isDigit(c);
		System.out.println(b);
	}
	public static void main (String[]args)
	{
		char_int obj = new char_int();
		obj.stringMethod();
	}
}
