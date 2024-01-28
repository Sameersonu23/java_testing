package FileReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public void readData()throws IOException 
	{
		Properties prop = new Properties();
		// FileInputStream fi= new FileInputStream("C:\Users\samee\git\java_testing\java_testing\src\config.properties");
		// prop.load(fi);
		
		String name = prop.getProperty("Name");
		System.out.println(name);
		
		String age = prop.getProperty("age");
		System.out.println(age);
		
		String address = prop.getProperty("address");
		System.out.println(address);
		
		String gender = prop.getProperty("gender");
		System.out.println(gender);
		
	}
	public static void main(String[]args) throws IOException
	{
		ReadProperties obj = new ReadProperties();
		obj.readData();
	}
}
