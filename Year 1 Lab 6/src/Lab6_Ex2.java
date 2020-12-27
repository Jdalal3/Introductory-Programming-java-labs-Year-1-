
public class Lab6_Ex2 {
	
	public static void main(String args[])
	{
		System.out.println(reverse("Bharat"));
	}
	
	public static String reverse(String ipx)
	{
		//Return if String is Empty or Null
		if(ipx == null || ipx.equals(""))
			return "String is Empty, Please Enter a Valid String to Reverse it ";
		
		//Variable to to Stored Reverse String
		String f = "";
		
		//Use String concatenation operator to build Reversed String by
		//Reading Character from the end of the original String
		for (int i = ipx.length()-1 ; i >= 0 ; i--)
		{
			f+= ipx.charAt(i);
		}
			return f;
		}
	}

	



