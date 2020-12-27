import java.math.BigInteger;

public class lab6_ex7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initializing a value to number
		long number = 3;
		
		// printing factorial using 1 user defined method
		System.out.println("Factorial is : "+factorial(number));
		
		// printing factorial using 2 user defined method
		System.out.println("Factorial of : "+ number +" : " +factorial(BigInteger.valueOf(number)));

	}
	
	// 1st user defined method
	// Longs are stores as 64 bit so their maximum value is 2^63-1 
	// in this factorial get ridiculously big so fast. Bigger than largest number that can be represented by a long 
	// And in java that means the value "rolls over" and become negative 
	public static long factorial(long n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return n*factorial(n-1); // 
		}
	}
	
	// 2nd user defined method
	// using BigInteger because it has big amounts of bits So, we can represent any size of number and it won't run overflow   
	public static BigInteger factorial(BigInteger number)
	{
		if(number.equals(BigInteger.ONE))
		{
			return BigInteger.valueOf(1);
		}
		else
		{
			return number.multiply(factorial(number.subtract(BigInteger.ONE)));
		}
	}
}


