package Test1;

import javax.swing.JButton;

public class ai {

	public static int compWinOrBlockMove(
			
		/* For the artificial intelligence to work, although I've populated the buttons within the boardAndGame class 
		 * via a for loop; to ensure each artificial intelligence pattern is achieved by the computer each button within 
		 * the system will be needed to referred individually through a JButton so all winning patterns can be exhausted.*/	
			
			JButton button1,  JButton button2,  JButton button3,  JButton button4,
			JButton button5,  JButton button6,  JButton button7,  JButton button8, 
			JButton button9,  JButton button10, JButton button11, JButton button12,
			JButton button13, JButton button14, JButton button15, JButton button16)	
	
	{
		
		/* Priority for the artificial intelligence is as follows:
		 * 
			 * 	Computer will:
			 * 	1st Priority: Look for the win first
			 *  2nd Priority: Look to block the user winning
		 *   
		 */
		
// ============================================================================
	
// LOOKING FOR THE WIN!
		
	// HORIZONTAL ARTIFICIAL INTELLIGENCE 
		
		// horizontal top [1][2][3][4]
			if	   (button1.getText().equals("O") && 
					button2.getText().equals("O") && 
					button3.getText().equals("O") &&
					button4.getText().equals(""))
			
					return 4;
			
			else if(button2.getText().equals("O") && 
					button3.getText().equals("O") && 
					button4.getText().equals("O") &&
					button1.getText().equals(""))
			
					return 1;
			
			else if(button1.getText().equals("O") && 
					button3.getText().equals("O") &&
					button4.getText().equals("O") &&
					button2.getText().equals(""))
			
					return 2;
			
			else if(button1.getText().equals("O") &&
					button2.getText().equals("O") &&
					button4.getText().equals("O") &&
					button3.getText().equals(""))
				
					return 3;
			
		// 	horizontal middle1 [5][6][7][8]
			else if(button5.getText().equals("O") && 
					button6.getText().equals("O") &&
					button7.getText().equals("O") &&
					button8.getText().equals(""))
			
					return 8;
		
			else if(button6.getText().equals("O") && 
					button7.getText().equals("O") && 
					button8.getText().equals("O") &&
					button5.getText().equals(""))
				
					return 5;
			
			else if(button5.getText().equals("O") && 
					button7.getText().equals("O") && 
					button8.getText().equals("O") &&
					button6.getText().equals(""))
					
					return 6;
			
			else if(button5.getText().equals("O") && 
					button6.getText().equals("O") && 
					button8.getText().equals("O") &&
					button7.getText().equals(""))
					
					return 7;
			
		//  horizontal middle2 [9][10][11][12]	
			else if(button9.getText().equals("O") && 
					button10.getText().equals("O") && 
					button11.getText().equals("O") &&
					button12.getText().equals(""))
			
					return 12;			
		
			else if(button10.getText().equals("O") && 
					button11.getText().equals("O") && 
					button12.getText().equals("O") &&
					button9.getText().equals(""))
			
					return 9;		
		
			else if(button9.getText().equals("O") && 
					button11.getText().equals("O") && 
					button12.getText().equals("O") &&
					button10.getText().equals(""))
			
					return 10;
			
			else if(button9.getText().equals("O") && 
					button10.getText().equals("O") && 
					button12.getText().equals("O") &&
					button11.getText().equals(""))
			
					return 11;
			
		//  horizontal bottom [13][14][15][16]	
			else if(button13.getText().equals("O") && 
					button14.getText().equals("O") && 
					button15.getText().equals("O") &&
					button16.getText().equals(""))
					
					return 16;			
				
			else if(button14.getText().equals("O") && 
					button15.getText().equals("O") && 
					button16.getText().equals("O") &&
					button13.getText().equals(""))
					
					return 13;		
				
			else if(button13.getText().equals("O") && 
					button15.getText().equals("O") && 
					button16.getText().equals("O") &&
					button14.getText().equals(""))
					
					return 14;
					
			else if(button13.getText().equals("O") && 
					button14.getText().equals("O") && 
					button16.getText().equals("O") &&
					button15.getText().equals(""))
					
					return 15;
			
// ============================================================================
	
	// VERTICAL ARTIFICIAL INTELLIGENCE 
			
		// vertical left [1][5][9][13]
			else if(button1.getText().equals("O") && 
					button5.getText().equals("O") && 
					button9.getText().equals("O") &&
					button13.getText().equals(""))
			
					return 13;
		
			else if(button5.getText().equals("O") && 
					button9.getText().equals("O") && 
					button13.getText().equals("O") &&
					button1.getText().equals(""))
			
					return 1;
			
			else if(button1.getText().equals("O") && 
					button9.getText().equals("O") && 
					button13.getText().equals("O") &&
					button5.getText().equals(""))
			
					return 5;
			
			else if(button1.getText().equals("O") && 
					button5.getText().equals("O") && 
					button13.getText().equals("O") &&
					button9.getText().equals(""))
			
					return 9;
			
		// vertical middle1 [2][6][10][14]
			else if(button2.getText().equals("O") && 
					button6.getText().equals("O") && 
					button10.getText().equals("O") &&
					button14.getText().equals(""))
			
					return 14;
		
			else if(button6.getText().equals("O") && 
					button10.getText().equals("O") && 
					button14.getText().equals("O") &&
					button2.getText().equals(""))
			
					return 2;
			
			else if(button2.getText().equals("O") && 
					button10.getText().equals("O") && 
					button14.getText().equals("O") &&
					button6.getText().equals(""))
			
					return 6;
			
			else if(button2.getText().equals("O") && 
					button6.getText().equals("O") && 
					button14.getText().equals("O") &&
					button10.getText().equals(""))
			
					return 10;
			
		
		// vertical middle2 [3][7][11][15]	
			else if(button3.getText().equals("O") && 
					button7.getText().equals("O") && 
					button11.getText().equals("O") &&
					button15.getText().equals(""))
			
					return 15;
				
			else if(button7.getText().equals("O") && 
					button11.getText().equals("O") && 
					button15.getText().equals("O") &&
					button3.getText().equals(""))
			
					return 3;
					
			else if(button3.getText().equals("O") && 
					button11.getText().equals("O") && 
					button15.getText().equals("O") &&
					button7.getText().equals(""))
			
					return 7;
			
			else if(button3.getText().equals("O") && 
					button7.getText().equals("O") && 
					button15.getText().equals("O") &&
					button11.getText().equals(""))
			
					return 11;
			
			// vertical right [4][8][12][16]
			else if(button4.getText().equals("O") && 
					button8.getText().equals("O") && 
					button12.getText().equals("O") &&
					button16.getText().equals(""))
			
					return 16;
			
			else if(button8.getText().equals("O") && 
					button12.getText().equals("O") && 
					button16.getText().equals("O") &&
					button4.getText().equals(""))
			
					return 4;
			
			else if(button4.getText().equals("O") && 
					button12.getText().equals("O") && 
					button16.getText().equals("O") &&
					button8.getText().equals(""))
			
					return 8;
			
			else if(button4.getText().equals("O") && 
					button8.getText().equals("O") && 
					button16.getText().equals("O") &&
					button12.getText().equals(""))
			
					return 12;

// ============================================================================
			
	// DIAGONAL ARTIFICIAL INTELLIGENCE - ensure you exhaust all SIX ways as there are two pattern diagonally 			
			
		// diagonal left top to bottom right [1][6][11][16]		
			else if(button1.getText().equals("O") && 
					button6.getText().equals("O") && 
					button11.getText().equals("O") &&
					button16.getText().equals(""))
			
					return 16;
		
			else if(button6.getText().equals("O") && 
					button11.getText().equals("O") && 
					button16.getText().equals("O") &&
					button1.getText().equals(""))
			
					return 1;
		
			else if(button1.getText().equals("O") && 
					button11.getText().equals("O") && 
					button16.getText().equals("O") &&
					button6.getText().equals(""))
			
					return 6;
			
			else if(button1.getText().equals("O") && 
					button6.getText().equals("O") && 
					button16.getText().equals("O") &&
					button11.getText().equals(""))
			
					return 11;
		
		// diagonal bottom right to left top or vice versa hahaha [4][7][10][13]
			else if(button4.getText().equals("O") && 
					button7.getText().equals("O") && 
					button10.getText().equals("O") &&
					button13.getText().equals(""))
			
					return 13;
		
			else if(button7.getText().equals("O") && 
					button10.getText().equals("O") && 
					button13.getText().equals("O") &&
					button4.getText().equals(""))
			
					return 4;
		
			else if(button4.getText().equals("O") && 
					button10.getText().equals("O") && 
					button13.getText().equals("O") &&
					button7.getText().equals(""))
			
					return 7;
			
			else if(button4.getText().equals("O") && 
					button7.getText().equals("O") && 
					button13.getText().equals("O") &&
					button10.getText().equals(""))
			
					return 10;
		
// ============================================================================
			
// LOOKING FOR THE BLOCK!
					
	// HORIZONTAL ARTIFICIAL INTELLIGENCE 
			
			// horizontal top [1][2][3][4]
			else if(button1.getText().equals("X") && 
					button2.getText().equals("X") && 
					button3.getText().equals("X") &&
					button4.getText().equals(""))
			
					return 4;
			
			else if(button2.getText().equals("X") && 
					button3.getText().equals("X") && 
					button4.getText().equals("X") &&
					button1.getText().equals(""))
			
					return 1;
			
			else if(button1.getText().equals("X") && 
					button3.getText().equals("X") &&
					button4.getText().equals("X") &&
					button2.getText().equals(""))
			
					return 2;
			
			else if(button1.getText().equals("X") &&
					button2.getText().equals("X") &&
					button4.getText().equals("X") &&
					button3.getText().equals(""))
				
					return 3;
			
			// horizontal middle1 [5][6][7][8]
			else if(button5.getText().equals("X") && 
					button6.getText().equals("X") &&
					button7.getText().equals("X") &&
					button8.getText().equals(""))
			
					return 8;
		
			else if(button6.getText().equals("X") && 
					button7.getText().equals("X") && 
					button8.getText().equals("X") &&
					button5.getText().equals(""))
				
					return 5;
			
			else if(button5.getText().equals("X") && 
					button7.getText().equals("X") && 
					button8.getText().equals("X") &&
					button6.getText().equals(""))
					
					return 6;
			
			else if(button5.getText().equals("X") && 
					button6.getText().equals("X") && 
					button8.getText().equals("X") &&
					button7.getText().equals(""))
					
					return 7;
			
			// horizontal middle2 [9][10][11][12]
			else if(button9.getText().equals("X")  && 
					button10.getText().equals("X") && 
					button11.getText().equals("X") &&
					button12.getText().equals(""))
			
					return 12;			
		
			else if(button10.getText().equals("X") && 
					button11.getText().equals("X") && 
					button12.getText().equals("X") &&
					button9.getText().equals(""))
			
					return 9;		
		
			else if(button9.getText().equals("X")  && 
					button11.getText().equals("X") && 
					button12.getText().equals("X") &&
					button10.getText().equals(""))
			
					return 10;
			
			else if(button9.getText().equals("X")  && 
					button10.getText().equals("X") && 
					button12.getText().equals("X") &&
					button11.getText().equals(""))
			
					return 11;
			
		//  horizontal bottom [13][14][15][16]	
			else if(button13.getText().equals("X") && 
					button14.getText().equals("X") && 
					button15.getText().equals("X") &&
					button16.getText().equals(""))
							
					return 16;			
						
			else if(button14.getText().equals("X") && 
					button15.getText().equals("X") && 
					button16.getText().equals("X") &&
					button13.getText().equals(""))
							
					return 13;		
						
			else if(button13.getText().equals("X") && 
					button15.getText().equals("X") && 
					button16.getText().equals("X") &&
					button14.getText().equals(""))
							
					return 14;
							
			else if(button13.getText().equals("X") && 
					button14.getText().equals("X") && 
					button16.getText().equals("X") &&
					button15.getText().equals(""))
							
					return 15;
	
	// VERTICAL ARTIFICIAL INTELLIGENCE 			
			
			// vertical left [1][5][9][13]
			else if(button1.getText().equals("X") && 
					button5.getText().equals("X") && 
					button9.getText().equals("X") &&
					button13.getText().equals(""))
			
					return 13;
		
			else if(button5.getText().equals("X")  && 
					button9.getText().equals("X")  && 
					button13.getText().equals("X") &&
					button1.getText().equals(""))
			
					return 1;
			
			else if(button1.getText().equals("X")  && 
					button9.getText().equals("X")  && 
					button13.getText().equals("X") &&
					button5.getText().equals(""))
			
					return 5;
			
			else if(button1.getText().equals("X")  && 
					button5.getText().equals("X")  && 
					button13.getText().equals("X") &&
					button9.getText().equals(""))
			
					return 9;
			
			
			// vertical middle1 [2][6][10][14]
			else if(button2.getText().equals("X")  && 
					button6.getText().equals("X")  && 
					button10.getText().equals("X") &&
					button14.getText().equals(""))
			
					return 14;
		
			else if(button6.getText().equals("X")  && 
					button10.getText().equals("X") && 
					button14.getText().equals("X") &&
					button2.getText().equals(""))
			
					return 2;
			
			else if(button2.getText().equals("X")  && 
					button10.getText().equals("X") && 
					button14.getText().equals("X") &&
					button6.getText().equals(""))
			
					return 6;
			
			else if(button2.getText().equals("X")  && 
					button6.getText().equals("X")  && 
					button14.getText().equals("X") &&
					button10.getText().equals(""))
			
					return 10;
			
			// vertical middle2 [3][7][11][15]
			else if(button3.getText().equals("X") && 
					button7.getText().equals("X") && 
					button11.getText().equals("X") &&
					button15.getText().equals(""))
			
					return 15;
				
			else if(button7.getText().equals("X") && 
					button11.getText().equals("X") && 
					button15.getText().equals("X") &&
					button3.getText().equals(""))
			
					return 3;
					
			else if(button3.getText().equals("X") && 
					button11.getText().equals("X") && 
					button15.getText().equals("X") &&
					button7.getText().equals(""))
			
					return 7;
			
			else if(button3.getText().equals("X") && 
					button7.getText().equals("X") && 
					button15.getText().equals("X") &&
					button11.getText().equals(""))
			
					return 11;
			
			// vertical right [4][8][12][16]
			else if(button4.getText().equals("X") && 
					button8.getText().equals("X") && 
					button12.getText().equals("X") &&
					button16.getText().equals(""))
			
					return 16;
			
			else if(button8.getText().equals("X") && 
					button12.getText().equals("X") && 
					button16.getText().equals("X") &&
					button4.getText().equals(""))
			
					return 4;
			
			else if(button4.getText().equals("X") && 
					button12.getText().equals("X") && 
					button16.getText().equals("X") &&
					button8.getText().equals(""))
			
					return 8;
			
			else if(button4.getText().equals("X") && 
					button8.getText().equals("X") && 
					button16.getText().equals("X") &&
					button12.getText().equals(""))
			
					return 12;
			
	// DIAGONAL ARTIFICIAL INTELLIGENCE	
		
			// diagonal left top to bottom right [1][6][11][16]		
			else if(button1.getText().equals("X") && 
					button6.getText().equals("X") && 
					button11.getText().equals("X") &&
					button16.getText().equals(""))
						
					return 16;
					
			else if(button6.getText().equals("X") && 
					button11.getText().equals("X") && 
					button16.getText().equals("X") &&
					button1.getText().equals(""))
						
					return 1;
					
			else if(button1.getText().equals("X") && 
					button11.getText().equals("X") && 
					button16.getText().equals("X") &&
					button6.getText().equals(""))
						
					return 6;
						
			else if(button1.getText().equals("X") && 
					button6.getText().equals("X") && 
					button16.getText().equals("X") &&
					button11.getText().equals(""))
						
					return 11;
					
			// diagonal bottom right to left top or vice versa hahaha [4][7][10][13]
			else if(button4.getText().equals("X") && 
					button7.getText().equals("X") && 
					button10.getText().equals("X") &&
					button13.getText().equals(""))
						
					return 13;
					
			else if(button7.getText().equals("X") && 
					button10.getText().equals("X") && 
					button13.getText().equals("X") &&
					button4.getText().equals(""))
						
					return 4;
					
			else if(button4.getText().equals("X") && 
					button10.getText().equals("X") && 
					button13.getText().equals("X") &&
					button7.getText().equals(""))
						
					return 7;
						
			else if(button4.getText().equals("X") && 
					button7.getText().equals("X") && 
					button13.getText().equals("X") &&
					button10.getText().equals(""))
						
					return 10;
		

		
			else if(button1.getText().equals(""))
			
					return 1;
		
			else if(button2.getText().equals(""))
			
					return 2;
			
			else if(button3.getText().equals(""))
				
				    return 3;
			
			else if(button4.getText().equals(""))
				
					return 4;
			
			else if(button5.getText().equals(""))
				
					return 5;
			
			else if(button6.getText().equals(""))
				
					return 6;
			
			else if(button7.getText().equals(""))
				
					return 7;
			
			else if(button8.getText().equals(""))
				
					return 8;
			
			else if(button9.getText().equals(""))
				
					return 9;
			
			else if(button10.getText().equals(""))
				
					return 10;
			
			else if(button11.getText().equals(""))
				
					return 11;
			
			else if(button12.getText().equals(""))
				
					return 12;
			
			else if(button13.getText().equals(""))
				
					return 13;
			
			else if(button14.getText().equals(""))
				
					return 14;
			
			else if(button15.getText().equals(""))
				
					return 15;
			
			else if(button16.getText().equals(""))
				
					return 16;
			
			else
			
				return 0;
		}
	
	public static boolean compMoveRand(JButton button)	{
		
			if(button.getText().equals("O") || button.getText().equals("X"))
			
				return false;
		
			else{
			
				return true;
			
			}
			
		}
	
}
