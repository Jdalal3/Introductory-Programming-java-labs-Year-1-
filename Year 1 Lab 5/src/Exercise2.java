
public class Exercise2 {

	public static void main(String[] args) {
		
		RoundingTest(10.2);
	
	}
	
	private static void RoundingTest(double x) 
	{
		// Floor
		x = 10.200000;
		String s = String.format("%,.6f",Math.floor(x));
	    
		//Round
	    String o = String.format("%.2g%n",x);
	    
	    //Ceil
	    String t = String.format("%0$ ,.6f",Math.ceil(x/100)*10);
		
	    System.out.println("1) Ceil : " + t +" Floor = " + s + " Round : " + o );
						
	}

}


