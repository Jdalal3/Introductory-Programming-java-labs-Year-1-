
public class lab6_Ex8 {

	public static void main(String[] args) {
		
		// Driver Code
		
		
		System.out.println(palindrome("an na"));
		

	}
	
	// functions that return true if str is palindorme
	public static boolean palindrome(String str)
	{
		//pointing to the beginning and the ending of the string
		int i = 0, j = str.length() -1;
		
		//comparing the characters
		while(i < j)
		{
			//if there is a mismatch
			if(str.charAt(i) != str.charAt(j))
				return false;
			
			// increment first pointer
			//decrement the other
			
			i++;
			j--;
				
		}
		//giving the string is palindrome
		return true;
	}

}
