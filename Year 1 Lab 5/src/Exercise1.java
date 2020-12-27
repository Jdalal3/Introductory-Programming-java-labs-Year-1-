import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Exercise1 {
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 ****************************************************
		double number = (double) 17/3;
		
		DecimalFormat number_format = new DecimalFormat("#.###");
		String formatted_string = number_format.format(number);
		System.out.println("1) " +formatted_string);
		
		//2
		//for the value of x **********************************
		
		 double x = 123.456;
	     String bob = Double.toString(x);
	     String[] convert = bob.split("\\.");

	     long n =  (long)Integer.parseInt(convert[0]);
	     long o =  (long)Integer.parseInt(convert[1]);
	     
	     long count = n;
	     int length = (int)(Math.log10(count)+1);
	    
	     System.out.println("\n2a) Number of Digits Before Decimal point : " + length);
	     
	     long count1 = o;
		 int length1 = (int)(Math.log10(count1)+1);
	     System.out.println("    Number of Digits After Decimal point : " + length1);
	     
	     // for the value of y **********************************************
	     
	     double y = 17/3f;
	     String bob1 = Double.toString(y);
	     String[] convert1 = bob1.split("\\.");

	     long n1 =  (long)Double.parseDouble(convert1[0]);
	     long o1 =  (long)Double.parseDouble(convert1[1]);
	     
	     long count2 = n1;
		 int length2 = (int)(Math.log10(count2)+1);
	     System.out.println("\n2b) Number of Digits Before Decimal point : " + length2);
	     
	     long count3 = o1;
		 int length3 = (int)(Math.log10(count3)+1);
	     System.out.println("    Number of Digits After Decimal point : " + length3);
	     
	     // for value of z *******************************************************
	     
	     double z = Math.sqrt(2);
	     String bob2 = Double.toString(z);
	     String[] convert2 = bob2.split("\\.");

	     long n2 =  (long)Double.parseDouble(convert2[0]);
	     long o2 =  (long)Double.parseDouble(convert2[1]);
	     
	     long count4 = n2;
		 int length4 = (int)(Math.log10(count4)+1);
	     System.out.println("\n2c) Number of Digits Before Decimal point : " + length4);
	     
	     long count5 = o2;
		 int length5 = (int)(Math.log10(count5)+1);
	     System.out.println("    Number of Digits After Decimal point : " + length5);
	     

	    //3 *********************************************
		String a = "Hello";
		String b = " World";
		String c = a.concat(b);
		String d = "";
		for (int i = c.length()-1; i>=0; --i)
		{
			char e = c.charAt (i);
			d = d+e;
		}
		System.out.println("\n3) Reversed String: " +d);
		
		
		//4 ***************************************************
		String replaced = c.replace("ll","ppp");
		System.out.println("\n4) After Replacing : " +replaced);
		
		
		
/*--------------------------------------------------------------------------------------------------------------------------------------------------*/		
		
		
		
		
		
		/*double x = Math.sqrt(2);
		long a1 = (long)x;
		double f = x - a1;
		
		while(Math.abs((long) f - f) > 0.000001) f *=10;
		long b1 = (long) f;
		
		int count = 0, num = (int) a1;
		while(num !=0)
		{
			num/=10;
			++count;
		}
		System.out.println("Number of Digits Before Decimal point : " + count);
		int count1 = 0, num1 = (int) b1;
		while(num1 !=0)
		{
			num1/=10;
			++count1;
		}
		System.out.println("Number of Digits After Decimal point : " + count1);*/
		
		
		
}
		// created user defined method to get numbers before and after the decimal
	/*public static String noOfDigits(double m)
	{
		int n1 = 0;
		int n2 = 0;
		
		String s = String.valueOf(m);
		StringTokenizer t = new StringTokenizer(s,".");
		String s1 = t.nextToken();
		String s2 = t.nextToken();
		
		n1 = s1.length();
		n2 = s2.length();
		
		if(s1.charAt(0) == '0')
			n1 = s1.length() - 1;
		if(s2.charAt(s2.length()-1) == '0')
			n2 = s2.length() - 1;
		
		
		String s3 = "Number of Digits Before the Decimal Point : "+String.valueOf(n1) +"\n    Number of Digits After the Decimal Point : " + String.valueOf(n2);
		
		return s3;
		
	}*/

}
