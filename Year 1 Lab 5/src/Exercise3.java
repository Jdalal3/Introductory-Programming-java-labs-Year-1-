import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Random number between -100 to 100
		System.out.println("Random number Between -100 to 100: ");
		for(int i=0;i<10;++i)
		{
			int rand = -100 +new Random().nextInt(100 + 100);
			System.out.println(rand);
		}
		
		// Random number between 0 and 1
		System.out.println("\nRandom number Between 0 and 1: ");
		Random rand1 = new Random();
		for(int j=0; j<10;++j)
		{
			double randomValue = 0 +(1 - 0) * rand1.nextDouble();
			System.out.println(randomValue);
		}
		
		// Random number between pre specified limit
		Scanner input = new Scanner (System.in);
		System.out.println("\nEnter the Range of Integer Random Number : ");
		
		System.out.println("Enter Minimum Range : ");
		int min = input.nextInt();
		System.out.println("Enter Maximum Range :");
		int max = input.nextInt();
		
		if(min>= max)
		{
			// throw new IllegalArgumentException("Maximum value must be greater than Minimum Value "); jjjj
			System.out.println("Maximum value must be greater than Minimum value! ");
		}
		else
		{
			int Random = (int)(Math.random() *(max- min)) + min;
			System.out.println("\nRandom Number is :"+ Random);
			System.out.println();
		}
		
		
		// random number between pre-specified DOUBLE
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the Range of Double Random Number");
		
		System.out.println("Enter the Minimum range : ");
		double rangeMin = sc.nextDouble();
		System.out.println("Enter the Maximum Range : ");
		double rangeMax =sc.nextDouble();
		
		if(rangeMin>= rangeMax)
		{
			//throw new IllegalArgumentException("Maximum value must be greater than Minimum Value ");    jjjjjjjjjj
			System.out.println("Range of Maximum Value Must be Greater than Minimum Value! ");
		}
		else
		{
		Random t = new Random();
		double randomNumber = rangeMin + (rangeMax - rangeMin) * t.nextDouble();
		System.out.println("\nRandom double Number between pre-specified Limit : " + randomNumber);
		System.out.println();
		}		
		


	}
	
	
	

}
