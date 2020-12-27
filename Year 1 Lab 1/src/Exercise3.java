
public class Exercise3 {
	
	public static void main(String[] args) {
//TODO Auto generated method stub
		  int a; a= 100;
		  double b; b = 2.3;
		  double c; c = -52.2;
		  boolean d; d = true;
		  String e; e = "i am";
		  String f; f = " a student";
		  int g; g = 0;
		  char h; h ='!'; 
		  double x = 10;
		  double y = 0;  
		  String z;
		  final double pi = 3.142;	
		  final String name = "bharat";  
		  
		  y=a+b;
		  System.out.println("1. y = " +y); // (1)
		  
		  /*y=a+d;
		  System.out.println(a+d); the operator (+) is undefined for int and boolean (2) */
		  
		  z=(e+f);
		  System.out.println("3. z = "+z); // (3)
		  
		  y=(b*c);
		  System.out.println("4. y = "+y); // (4)
		  
		  /* pi =22/7;    
		  System.out.println(pi); // we had defined pi as constant */ 
		  
		  /*z=(name/g);
		  System.out.println(z); the operator (/) is undefined for int and string (6)*/
		  
		  /*z=(c/g);
		  System.out.println(z); // we cannot divide any integer or double with 0 (7) */ 
		  
		  x=10;
		  x = (Math.pow(x,3));
		  System.out.println("8. x = "+x); // (8)
		  
		  z=name+ " is" +f+ h;
		  System.out.println("9. z = "+z); // (9)
		  
		  /*y=(name+10)/(name+h);
		  System.out.println(y); we cannot perform any mathematical calculation between the two strings*/ 
		  
		  /*y=((a+b)/(d+c));
		  /* System.out.println(y);the (+) operator is undefined for boolean and double(11) */
		  
		  y=100.3;
		  y=((y/(a+b))-c);
		  System.out.println("12. y = "+y); // 12
		  
		  /****x = (Math.sqrt(Math.pow(y, 2)) + (Math.pow(z, 2)); this is undefined because z is a String ***************
		   */
		   System.out.println(x); 
		   
		  /* name = "is" + f-h;
		  System.out.println(m); the operator (-) is undefined for string and char (14)*/

		  y = (pi+1/pi+2)/(pi+3);   //*********************
		  System.out.println("15. y = "+y); // (15) *****************
		  
		  y = -2;
		  y =(Math.cbrt(Math.pow(y, 2))/b);
		  System.out.println("16. y = "+y); //(16)

		  y=(b/g);
		  System.out.println("17a. y = "+y); // valid but we are dividing double with 0 ans. infinity
		  z=(y +" name");
		  System.out.println("17b. z = "+z); // (17)
		  
		   y = -2.3;
		  y =a*Math.pow(y,2)+b*y+c;
		  System.out.println("19. y = "+y); // (19)
		  
		  z=name;
		  z=(b/g +z);
		  System.out.println("18. z = "+z); // (18)
		  
		  /*y= y- Math.pow((a-b), Math.pow((b-c),(c-d)));  
		  System.out.println(y); // we are performing mathematical calculation on boolean which is not possible (20) */
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		   
		  
		  
		  
		  
		  
		  
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		  
	    }
		  
		  
		  
		    
		  
		
		
		
		

		
			
		
		
}
