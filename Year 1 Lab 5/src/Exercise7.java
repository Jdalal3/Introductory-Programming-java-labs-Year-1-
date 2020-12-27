import java.util.*;
public class Exercise7 {
	
	public static ArrayList<String> longest_Words(ArrayList<String> list2){
		
		ArrayList<String> list = new ArrayList<String>();
		
		int longest_length = 0;
		for(String str : list2 )
		{
			int length = str.length();
			if(length> longest_length)
			{
				longest_length = length;
				list.clear();
			}
			if (length == longest_length)
			{
				list.add(str);
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("Please enter Words to get Longest Word, Type done when You want to finish : ");
		String ans;
		do
		{
			ans = in.nextLine();
			if(!ans.equalsIgnoreCase("done"))
			{
				list.add(ans);
			}
		}	
		while(!ans.equalsIgnoreCase("done"));
		
		
		System.out.println("\nLongest words of the above WordsList : " +longest_Words(list));
	}
	

}

