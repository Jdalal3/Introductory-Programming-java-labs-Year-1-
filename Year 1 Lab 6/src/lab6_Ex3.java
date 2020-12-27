
public class lab6_Ex3 {

	public static boolean CheckYear(int year)
	{
		// If a year is a Multiple of 400 then it's is a leap year
		if(year % 400 == 0)
			return true;
				
		//If year is a multiple of 100 then it is not a leap year
		if(year % 100 == 0)
			return false;
				
		//If year is the multiple of 4 then it is a leap year 
		if(year % 4 == 0)
			return true;
			return false;		
			}
	
	//Driver Method
	public static void main(String[] args)
	{
		int year = 1583;
		if(year > 1581)
			System.out.println(CheckYear(year)? "Leap Year" : "Not a Leap Year");
		else
			System.out.println("Please enter a year greater than 1581 because year does not exist before 1581 ");
	}
	
	}

