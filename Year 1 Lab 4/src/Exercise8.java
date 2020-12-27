import javax.swing.JOptionPane;

public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myarray [] [] = new int [3] [10];

		int i,j;
		// creating row 1
		myarray[0][0] = 25;
		myarray[0][1] = 50;
		myarray[0][2] = 75;
		myarray[0][3] = 100;
		myarray[0][4] = 125;
		myarray[0][5] = 150;
		myarray[0][6] = 175;
		myarray[0][7] = 200;
		myarray[0][8] = 225;
		myarray[0][9] = 250;

		// creating row 2
		myarray[1][0] = 25;
		myarray[1][1] = 50;
		myarray[1][2] = 75;
		myarray[1][3] = 100;
		myarray[1][4] = 125;
		myarray[1][5] = 150;
		myarray[1][6] = 175;
		myarray[1][7] = 200;
		myarray[1][8] = 225;
		myarray[1][9] = 250;

		// creating row 3
		myarray[2][0] = 5000;
		myarray[2][1] = 5000;
		myarray[2][2] = 5000;
		myarray[2][3] = 5000;
		myarray[2][4] = 5000;
		myarray[2][5] = 5000;
		myarray[2][6] = 5000;
		myarray[2][7] = 5000;
		myarray[2][8] = 5000;
		myarray[2][9] = 5000;

		JOptionPane.showMessageDialog(null,"Click OK to continue...");


		for (int i1 = 0; i1<myarray.length; ++i1)
		{
		for(int j1 =0; i1<myarray[i1].length; ++j1)
		{
		System.out.println(myarray[2][9] + " ");
		}
		}


		PrintArray(myarray);

		}  

		private static void PrintArray(int[][] myarray)
		{
		for(int i=0;i<myarray.length;++i)
		{
		for(int j=0;j<myarray[i].length;++j)
		{
		System.out.print(myarray[i][j] + " ");
		}
		System.out.println();

	}

}
}
