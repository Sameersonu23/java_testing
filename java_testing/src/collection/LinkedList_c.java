package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_c {

	
	public void display()
	{
		LinkedList<String> it= new LinkedList<String>();
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
		LinkedList_c obj=new LinkedList_c();
		obj.display();
	}
}
 
