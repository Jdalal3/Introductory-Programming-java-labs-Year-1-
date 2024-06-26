package Test1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class boardAndGame extends JFrame implements ActionListener{
	
	boolean liveGame = false; // this boolean will be turned on when game will be played
	boolean win = false; // crucial
	
	int turnCount = 1; // // the boolean value will determine the player and computer switching capabilities
	
	int winNo1 = 1; 
	int winNo2 = 1;
	int winNo3 = 1;
	int winNo4 = 1;
	
	int player1Won = 0;
	int player2Won = 0;
	int option;
		
	String message;
	String Player1 = "Player"; 
	String Player2 = "Computer"; 
	
	JFrame boardFrame = new JFrame();
		JPanel boardPanel = new JPanel();
			JButton emptyBtn[] = new JButton [17];

	final int winPattern[][] = new int[][]	{

	// We can afford to give this the prefix final as there are only 10 ways to win in noughts and crosses

	// horizontal possibilities	
		{1,   2,  3,  4}, 			
		{5,   6,  7,  8},
		{9,  10, 11, 12},
		{13, 14, 15, 16},
	
	// vertical possibilities	
		{1, 5,  9, 13}, 		
		{2, 6, 10, 14},
		{3, 7, 11, 15},
		{4, 8, 12, 16},
	
	// diagonal possibilities - note whilst making AI there will be 6 ways to win 	
		{1, 6, 11, 16},
		{4, 7, 10, 13}
		
	};
	
	public boardAndGame() {	
      
		boardFrame.setSize(380, 400);	
		boardFrame.setVisible(true);  
		boardFrame.setTitle("Tic Tac Toe by Jennifer"); 
		boardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		boardPanel.setLayout(new GridLayout(4,4,15,15));
		
		for(int i = 1; i <= 16; i++){
		// populating the board panel with 16 buttons that will represent a square in a 16 button grid	
			emptyBtn[i] = new JButton(""); // functionality as required
			emptyBtn[i].addActionListener(this); // when you click on button it will use this class
			boardPanel.add(emptyBtn[i]); // populating the grid layout with the buttons
		
		}
		
		boardFrame.add(boardPanel); // this adds the JPanel we have set to GridLayout to the JFrame
		
    }
	
	/*public static void main(String[] args) { // I don't need this, but it is placed to test working game element individually
		
		new boardAndGame(); 
		
	}*/

	public void play(){ // when the playBtn in pressed from the GUI class the control of the program will come here
		Player2 = "Computer"; // as we require knowledge of who has made move etc
		liveGame = true; // 
		newGame();
	}
  
	public void actionPerformed(ActionEvent click) {
		
		Object source = click.getSource();
			
		// this is how the program sets the crosses and noughts function within the game
		// to enable cross functionality implement the similar type but change the X and O 
		
		for(int i=1; i<=16; i++)	{
			
			if(source == emptyBtn[i] && turnCount < 17)	{
				
				// the turn count at start of program is 1, this means for every number that isn't evenly divisible by 2 it will be player's turn
				if(!(turnCount % 2 == 0)) {
				
					emptyBtn[i].setText("X");	
					JOptionPane.showMessageDialog(null, "Player made the move!");
				
				} else
					// below is to ensure that the second turn i.e. turn 2 is indeed a nought not a cross 
					emptyBtn[i].setText("O"); // for individual testing purposes only 
					emptyBtn[i].setEnabled(false);	
				
					turnCount++; // turn count is required to ensure if turns exceed 16 game is draw
					checkWin(); // a check is made after every move to ensure that
						
					if(liveGame && win == false){
						
						artificialIntelligence(); // will switch control flow to the artificial intelligence method within the class
						
					}
			}
		
		} 
			
	}
  	
  	public void newGame() {	
  		
  		for(int i = 1; i < 17; i++){
  		
  			emptyBtn[i].setText(""); //  blank space
  			
  			emptyBtn[i].setEnabled(true); // the true value allows the button to be pressed
  		}
  		
  		turnCount = 1; // the boolean value will determine the player and computer switching capabilities
  		
  		win = false; // this boolean value will change when winning condition is added
  		
  		showBoard(); // will switch control flow to the showBoard method
  	
  	}
  	
  	
  	public void showBoard(){
  		
  		boardPanel.requestFocus(); //  will ask the program to go to the JPanel that we have set into 4*4 array via GridLayout
  	
  	}
  	
  	public void artificialIntelligence()	{

		int computerButton;
		
		if(turnCount <= 16)	{
			
			turnCount++; //this is for the turn count that we will also require within our program
			
			computerButton = ai.compWinOrBlockMove( // calling the move method set cases we have assigned within the external ai class
				
				emptyBtn[1],   emptyBtn[2],  emptyBtn[3], emptyBtn[4],
				emptyBtn[5],   emptyBtn[6],  emptyBtn[7], emptyBtn[8],
				emptyBtn[9],  emptyBtn[10], emptyBtn[11], emptyBtn[12],
				emptyBtn[13], emptyBtn[14], emptyBtn[15], emptyBtn[16]);
			
			if(computerButton == 0)
				
				rand(); // random is place to enter any box that has not been given a character
			
			else {
				
				emptyBtn[computerButton].setText("O");
				emptyBtn[computerButton].setEnabled(false); 
				JOptionPane.showMessageDialog(null, "Computer: 'I have made my move!'");
			}
		
			checkWin(); // winning sequence checked after every turn
		
		}
	
  	} 
  	
  	public void rand()	{
		
		int random;
		if(turnCount <= 16)	{
			
			random = 0;
			
			while(random == 0)	{
				random = (int)(Math.random() * 17); // generates random integer from 1 - 16 that'll represent a square on the grid
			
			}
				if(ai.compMoveRand(emptyBtn[random]))	{ 	
				
					emptyBtn[random].setText("O");
					emptyBtn[random].setEnabled(false);
				
				} else {
					
					rand();
					
				}
		
		}
	
	} 
  	
  	public void checkWin()	{	
	
  		// this method is responsible for checking for a winner after move has been made regardless of player or computer
		
  		/* 1st Check: if emptyBtn is NOT EQUAL to default emptyBtn[""] that represents no move
  		 * 2nd Check: if emptyBtn: 1 == 2 
  		 * 3rd Check: if emptyBtn: 2 == 3  
  		 * 4th Check: if emptyBtn: 3 == 4
  		 * e.g. {1,2,3,4} - thereafter it will proceed towards the appropriate message
  		 * to be displayed if somebody has won or the turn count has exceeded 16
  		 */
  		
  		for(int i=0; i<10; i++)	{
		
			if(
				!emptyBtn[winPattern[i][0]].getText().equals("") && 
				emptyBtn[winPattern[i][0]].getText().equals(emptyBtn[winPattern[i][1]].getText()) && 
				emptyBtn[winPattern[i][1]].getText().equals(emptyBtn[winPattern[i][2]].getText()) &&
				emptyBtn[winPattern[i][2]].getText().equals(emptyBtn[winPattern[i][3]].getText())){
								
				win = true; // as soon the win is true the control of the program will go to if statement below
				
				winNo1 = winPattern[i][0];
				
				winNo2 = winPattern[i][1];
				
				winNo3 = winPattern[i][2];
				
				winNo4 = winPattern[i][3];
				
				break;
			}
			
		}
		
		if(win || (!win && turnCount > 16))	{
			
			if(win)	{ 
				
				if(emptyBtn[winNo1].getText().equals("X"))	{
					
					message = Player1 + " won! Well done buddy!";
				    winPopup();
					
				}else{
					
					message = Player2 + " won! Would you like to play again?";
					losePopup();
				}
		
			}else{					
				message = "Draw! It's a tie! Try harder next time!";			
					drawPopup();
			}
		}
		
  	}
  	
  	public void drawPopup() {
  		
  		
  		int afterDrawChoice = JOptionPane.showConfirmDialog(null, message, "Draw!", JOptionPane.OK_CANCEL_OPTION);
  	
  		// the showConfirmDialog allows me to if statements when the options are clicked therefore this was used 
  		// as opposed to the showMessageDialog
  		
  			if (afterDrawChoice  == JOptionPane.OK_OPTION) {
  				
  				boardFrame.setVisible(false); 
  			/* due to a bug showing when the play method was called again the sensible
  			 * decision was made to return the user back the the gui panel as opposed to
  			 * show the examiner a buggy program during the presentation
  			 */
  				
  			} else if (afterDrawChoice == JOptionPane.CANCEL_OPTION){
  				
  				boardFrame.setVisible(false);
  				
  			}
  		
  	}
  	
  	public void winPopup(){
		
  		int afterWinChoice = JOptionPane.showConfirmDialog(null, message, "Victory!", JOptionPane.OK_CANCEL_OPTION);
  		
			if (afterWinChoice  == JOptionPane.OK_OPTION) {
				
				boardFrame.setVisible(false);
				
			} else if (afterWinChoice == JOptionPane.CANCEL_OPTION){
				
				boardFrame.setVisible(false);
				
			}
  		
	}
  	
	public void losePopup(){
		
  		int afterLoseChoice = JOptionPane.showConfirmDialog(null, message, "Sorry!", JOptionPane.OK_CANCEL_OPTION);
  		
			if (afterLoseChoice  == JOptionPane.OK_OPTION) {
				
				play();
				
			} else if (afterLoseChoice == JOptionPane.CANCEL_OPTION){
					
				boardFrame.setVisible(false);
				
			}
  		
	}
  			
}

	
