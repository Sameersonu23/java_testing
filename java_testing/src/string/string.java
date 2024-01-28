package string;

public class string {

	char c='1';
	public void string()
	{
		boolean b=Character.isDigit(c);
		System.out.println(b);
	}
	public static void main (String[]args)
	{
		string obj =  new string();
		obj.string();
	}
}
