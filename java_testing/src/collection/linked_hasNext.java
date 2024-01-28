package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class linked_hasNext {

	public void display()
	{
		LinkedList<String> it= new LinkedList<String>();
		it.add("karim");
		it.add("shaik");
		it.add("sameer");
		it.add(null);
		it.add("india");
		it.add(2 ,"hi");
		
		Iterator<String> lt= it.iterator();
	//ListIterator<String> lI = it.listIterator()();

		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}
	}
	public static void main(String[]args)
	{
		LinkedList_c obj=new LinkedList_c();
		obj.display();
	}
}
