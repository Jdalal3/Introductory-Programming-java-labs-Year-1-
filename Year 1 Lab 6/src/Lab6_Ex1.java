
public class Lab6_Ex1 {
	
	public static void main(String args[])
	{
		int i;
		boolean result;
		String s = "";
		
		for(i=1;i<=25;i++)
		{
			result = EvenOdd(i);
			s = (result)?"Even True":"Odd False";
			System.out.println(i + " is " + s);
		}
	}
	public static boolean EvenOdd(int x)
	{
		if(x>0)
		{
			if(x %2 == 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
			
	}


}
