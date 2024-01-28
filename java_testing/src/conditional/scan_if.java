package conditional;

import java.util.Scanner;

public class scan_if {

	public void voteeligible()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER AGE");
				
	 int age=sc.nextInt();
		if (age>=18)
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
		scan_if obj = new scan_if();
		obj.voteeligible();
}
}
