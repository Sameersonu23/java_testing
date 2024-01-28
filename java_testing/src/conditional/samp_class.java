package conditional;

public class samp_class {

		String rev ="";
		String a= "India";
	
	public void method()	
	{
		for(int i=0;i<=a.length()-1;i++)
		{
			char c=a.charAt(i);
			rev=c+rev;
		}
		System.out.println(rev);
	}
	
	public static void main(String[]args)
	{
		samp_class obj= new samp_class();
		obj.method();
	}
	
}
	

