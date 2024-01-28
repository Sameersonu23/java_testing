package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hasset_c {

	public void display()
	{
		HashSet<String> st= new HashSet<String>();
		st.add("Shaik");
		st.add("demo");
		st.add("india");
		st.add("shaik");
		st.add(null);
		st.add("fang");
		st.remove(1);
	
	
	Iterator<String> it= st.iterator();
	
	while(it.hasNext())
	{
		System.out.println();
	}
}
public static void main(String[]args)
{
	Set_c obj=new Set_c();
	obj.display();
}


}
