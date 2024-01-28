package string;

public class char_sep {

     String a= "India@1234";
     String alpha= "";
     String digit="";
     String Specialchar= "";
     
     public void char_seperation()
     {
    	 for(int i=0;i<=a.length()-1;i++)
    	 {
    		char c=a.charAt(i) ;
    		{
    			if(Character.isAlphabetic(c))
    			{
    				alpha = alpha+c;
    			}
    			else if(Character.isDigit(c))
    			{
    			  digit=digit+c;
    			}
    			else
    			{
    				Specialchar=Specialchar+c;
    			}
    		}
			System.out.println(alpha);
			  System.out.println(digit);
				System.out.println(Specialchar);

    	 }
     }
     public static void mian(String[]arg)
     {
    	 char_sep obj = new char_sep();
    	 obj.char_seperation();
     }
}


