package conditional;

public class if_else {
	int a=20;
	public void voteeligible()
	{
		if (a>=18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			System.out.println(" Not Eligible to vote");
		}
	}
	
	public static void main(String[]arg)
	{
		if_else obj = new if_else();
		obj.voteeligible();
	}
	

}
