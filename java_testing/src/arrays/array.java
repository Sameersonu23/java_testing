package arrays;

public class array {

	public void array_method()
	{
		
	
	int arr[] = new int[5];
	arr[0]=10;
	arr[1]=20;
	arr[2]=30;
	arr[3]=40;
	
	for(int i=0;i<arr.length-1;i++)
	{
		System.out.println(arr[i]);
	}
	}
	public static void mian(String[]args)
	{
		array obj= new array();
		obj.array_method();
				
		
	}
}
