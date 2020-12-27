
public class height {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating array height
		double[] height = new double [10];
		
		// assigning values to array height
		height[0]=2.3;
		height[1]=2.5;
		height[2]=2.7;
		height[3]=3.0;
		height[4]=3.5;
		height[5]=3.9;
		height[6]=4.7;
		height[7]=5.2;
		height[8]=5.5;
		height[9]=6.3;
		
		// printing the length of the array
		System.out.println("Length of the Array : " + height.length );
		
		// print all values in array using loop
		for(int i = 0; i < height.length; ++i)
		{
			System.out.println("Height = " + height [i]);
		}
		
		// printing the minimum value in array
		double min = height [0];
		for(int i = 0; i < height.length; ++i)
		{
			double x = height [i];
			if(x<min)
				min=x;
		}
		System.out.println("The minimum height is :" + min);
		
		// printing the maximum value in array
		double max = height [0];
		for(int i = 0; i < height.length; ++i)
		{
			double x = height [i];
			if(x>max)
				max=x;
		}
		System.out.println("The maximum height is :" + max);

	}

}
