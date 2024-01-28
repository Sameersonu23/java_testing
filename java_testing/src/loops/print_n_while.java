package loops;

public class print_n_while {
	public void printNumber()
	{
		int i=100;
		while(i>=1)
		{
			System.out.println(i);
			i--;
		}
	}
	public static void main(String[]arg)
	{
		print_n_while obj = new print_n_while();
		obj.printNumber();
	}
	

}
