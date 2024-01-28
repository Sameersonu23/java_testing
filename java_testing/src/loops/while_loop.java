package loops;

public class while_loop {
	public void printNumber()
	{
		int i=1;
		while(i<=100)
		{
			System.out.println(i);
			i++;
	
			
		}
	}
	
	public static void main (String[]args)
	{
		while_loop obj = new while_loop();
		obj.printNumber();
	}

}
