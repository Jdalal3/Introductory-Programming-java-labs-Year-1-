import java.io.File;
import java.io.FileFilter;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File dir = new File("d:\\java file");
		
		System.out.println("List of all Files in the Directory : ");
		if (dir.isDirectory())
		{
		File[] files= dir.listFiles();

		for (File f: files)
		//List all files name in the directory	
			System.out.println(f.getName());
		}
		
		// try-catch to handle the exception case 
        try { 
  
        // Create a file object 
        File f = new File("d:\\java file"); 
  
        // Create FileFilter to filter the text files  
        FileFilter filter = new FileFilter() 
        { 
  
        public boolean accept(File f) 
        { 
             if( f.getName().endsWith(".txt") && f.isFile())
             {
                  return false;
             }
             else
             {
                  return true;
             }
             
         } 
   }; 
   			// Listing all file name except text files 
            File[] files = f.listFiles(filter); 
  
            System.out.println("\n\nAll Files Except Text Files : "); 
  
            //using for loop to print all files name except test files 
            for (int i = 0; i < files.length; i++) { 
                System.out.println(files[i].getName()); 
            } 
        } 
        catch (Exception e) { 
            System.err.println(e.getMessage()); 
        } 
		
		
	     
	}
	
}


