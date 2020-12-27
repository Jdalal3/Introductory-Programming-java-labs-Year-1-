import java.util.Scanner;

public class exercise8 {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		int c;
		System.out.println("input an integer: ");
		Scanner in = new Scanner (System.in);
		c = in.nextInt();
		
		if((c%2)*2 == 0)
			System.out.println("even");
		else 
			System.out.println("odd");
	}
}
