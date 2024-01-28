package collection;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.*;

public class list {

	public void display()
	{
		List it= new  ArrayList(3);
		it.add("karim");
		it.add("shaik");
		it.add(20);
		it.add('c');
		it.add(true);
		
		for(int i=0;i<=it.size()-1;i++)
		{
			System.out.println(it.get(i));
		}
		}
	public static void main(String[]args)
	{
		list obj=new list();
		obj.display();
	}
}
