package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_p {

	public void display()
	{
		TreeSet <String> st=new TreeSet<String>();
		st.add("1");
		st.add("2");
		st.add("3");
		st.add("4");
		st.add("5");
		st.add(null);
		st.add(null);
		st.add("3");
		st.add("shaik");
		st.add("india");
		Iterator<String> it=st.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	public static void main(String[]ars)
	{
		TreeSet_p obj= new TreeSet_p();
		obj.display();
	}
	
	
}
