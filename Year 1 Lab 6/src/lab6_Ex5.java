
public class lab6_Ex5 {

	public static void main(String[] args) {
		
		
		//the range of 4 bit integer is from -2,147,483,648 to 2,147,483,647. so whenever the result will be greater.So, whenever the result will we greater 
		// from 2,147,483,647 it will start from -2,147,483,648 For e.g. suppose for 17 = 17! = 35568742809600 so we will get value in negative and in the long 
		// it will take up to 39 
		
		System.out.println(factorial(16));
	}

	public static int factorial(int x){

		int i,fact =1;
		
		for(i=1;i<=x;i++)
		{
			fact = fact*i;
		}
		return fact;
	}

	}


