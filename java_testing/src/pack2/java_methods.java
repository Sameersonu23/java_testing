package pack2;

public class java_methods {

	
	int a=2,b=4;
    public void addition()
    {
    	System.out.println( "sum of two number" + (a+b));
    }
    public void addition1(int a,double d)
    {
    	System.out.println( "sum of two number" + (a+d));
    }
    public void sub()
    {
    	System.out.println( "sub of two number" + (a-b));
    }
    
    public static void  main(String[] arg)
    {
    	java_methods obj=new java_methods();
    	obj.addition();
    	obj.addition1(3, 6.7);
    	obj.sub();
    			
    }
   
}
