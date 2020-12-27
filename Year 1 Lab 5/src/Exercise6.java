import java.io.*;
import java.text.DecimalFormat;
public class Exercise6 {

	public static void main(String[] args) throws IOException 
	{	
		writefile(5,"c:\\temp\\ex6.txt" );
	}
	
	public static void writefile(int n, String filename)throws IOException{
		
		FileWriter writehandle = new FileWriter(filename);
		writehandle.write("Before 1 : 1.0");
		DecimalFormat df = new DecimalFormat("#,#0.0");
		writehandle.write("\nAfter 1 : " + df.format(1.0));
		
		writehandle.write("\n\nBefore 2 : 1.4142135623730951");
		DecimalFormat df1 = new DecimalFormat("#.##");
		writehandle.write("\nAfter 2 : " + df1.format(1.4142135623730951));
		
		writehandle.write("\n\nBefore 3 : 1.7320508075688772");
		DecimalFormat df2 = new DecimalFormat("#.###");
		writehandle.write("\nAfter 3 : " + df2.format(1.7320508075688772));
		
		writehandle.write("\n\nBefore 4 : 2.0");
		DecimalFormat df3 = new DecimalFormat("#,####0.0000");
		writehandle.write("\nAfter 4 : " + df3.format(2.0));
	  
	   
	   writehandle.close();
	   System.out.println("Sucessfully wrote the file: ");
	   
	   

	}

	

	}


