import java.io.*;

public class Exercise5 {

	public static void main(String[] args) throws IOException 
	{	
		File f1 = new File ("F:\\textFile\\the art of flying.txt");
		String[] words = null;
		int wordCount = 0;
		
		FileReader fr = new FileReader (f1);
		BufferedReader br = new BufferedReader (fr);
		
		String s;
		while((s=br.readLine())!=null)
		{
			words = s.split(" ");
			wordCount = words.length;
		}
		fr.close();
		
		System.out.println("Number of words in File : " + wordCount);
		
		
		

	}

}
