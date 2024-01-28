package collection;

import java.util.ArrayList;

public class list_c {

	public void display()
	{
		ArrayList<String> it= new ArrayList<String>(3);
		it.add("karim");
		it.add("shaik");
		it.add("sameer");
		it.add(null);
		it.add("india");
		it.add(2 ,"hi");
		
		for(int i=0;i<=it.size()-1;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[]args)
	{
		list_c obj=new list_c();
		obj.display();
	}
}
