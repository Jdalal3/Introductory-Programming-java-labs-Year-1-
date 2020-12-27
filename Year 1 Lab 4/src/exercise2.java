import java.util.ArrayList;
import java.util.Collections;

public class exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating arrayList called heightList
		ArrayList<Double> heightsList = new ArrayList<Double>();
		
		// Adding values to heightList
		heightsList.add(new Double (2.3));
		heightsList.add(new Double (2.5));
		heightsList.add(new Double (2.7));
		heightsList.add(new Double (3.0));
		heightsList.add(new Double (3.5));
		heightsList.add(new Double (3.9));
		heightsList.add(new Double (4.7));
		heightsList.add(new Double (5.2));
		heightsList.add(new Double (5.5));
		heightsList.add(new Double (6.3));
		
		
		// printing values 
		System.out.println("height : "+heightsList);
		
		// removing 3rd element from arrayList
		heightsList.remove(3);
		
		System.out.println("\nheight : "+heightsList);
		
		// Adding 5 more values to heightsList
		heightsList.add(new Double (3.4));
		heightsList.add(new Double (2.9));
		heightsList.add(new Double (6.1));
		heightsList.add(new Double (5.1));
		heightsList.add(new Double (5.6));
		
		// printing values
		System.out.println("\nheight : "+heightsList);
			
		//sorting values in ascending order
		Collections.sort(heightsList);
		
		// printing values after sorting
		System.out.println("\nvalues in ascending order : " +heightsList);
		
		// printing length of the array
		System.out.println("\nLength of the array : "+ heightsList.size());
		
		// printing all values of arrayList
		for (Double num : heightsList) { 		      
	           System.out.println("height : "+num); 		
	      }
		
		//calculating minimum height
		System.out.println("\nMinimum height is : " + Collections.min(heightsList));
		
		// calculating maximum height
		System.out.println("\nMaximum height is : " + Collections.max(heightsList));
		
		
		

	}

}
