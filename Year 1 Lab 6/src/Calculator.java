import java.awt.*;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Calculator extends JFrame implements ActionListener 
{
	JButton addButton,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,BACKSPACE,CE,C,MC,div,sqrt,MR,mul,per,MS,sub,prop,M,pm,dot,eq;
	JTextField mainTextFeild, memorytTextFeild;
	double result = 0, memory = 0, n1 = 0;
	
	//marking the first number of calculator
	int first = 1;
	
	// first number for percentage calculation
	double num;
	
	//taking a new number as input
	int opt = 2;
	
	//mark binary operation for "=" button
	int oper1 = 0, oper2 = 0;
	
	Calculator()
	{
		setTitle ("CALCULATOR");
		setSize(300,300);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
	}
	
	// function creating graphical user interface
	 void initComponents() 
	 {
		mainTextFeild = new JTextField(32);
		mainTextFeild.setText("0");
		add(mainTextFeild,BorderLayout.NORTH);
		mainTextFeild.setHorizontalAlignment(JTextField.RIGHT);
		JPanel panel7 = new JPanel();
		
		//Panel 1
		JPanel panel1 = new JPanel();
		memorytTextFeild = new JTextField(5);
		memorytTextFeild.setText(" ");
		panel1.add(memorytTextFeild);
		MC = new JButton("MC");
		 MC.setForeground(Color.BLACK);
	        panel1.add(MC);
	        MR = new JButton("MR");
	        MR.setForeground(Color.BLACK);
	        panel1.add(MR);
	        M = new JButton("M+");
	        M.setForeground(Color.BLACK);
	        panel1.add(M);
	        MS = new JButton("MS");
	        MS.setForeground(Color.BLACK);
	        panel1.add(MS);

	        panel7.add(panel1);

	        //Panel 2
	        JPanel panel2 = new JPanel();

	        CE= new JButton("CE");
	        CE.setForeground(Color.BLACK);
	        panel2.add(CE);
	        C = new JButton("C");
	        panel2.add(C);
	        C.setForeground(Color.BLACK);
	        BACKSPACE = new JButton("BACKSPACE");
	        BACKSPACE.setForeground(Color.BLACK);
	        panel2.add(BACKSPACE);
	        sqrt = new JButton("sqrt");
	        sqrt.setForeground(Color.BLUE);
	        panel2.add(sqrt);

	        panel7.add(panel2);

	        //Panel 3
	        JPanel panel3 = new JPanel();

	        b7 = new JButton("7");
	        b7.setForeground(Color.BLUE);
	        panel3.add(b7);
	        b8= new JButton("8");
	        b8.setForeground(Color.BLUE);
	        panel3.add(b8);
	        b9 = new JButton("9");
	        b9.setForeground(Color.BLUE);
	        panel3.add(b9);
	        div = new JButton("/");
	        div.setForeground(Color.BLACK);
	        panel3.add(div);
	        per = new JButton("%");
	        per.setForeground(Color.BLUE);
	        panel3.add(per);

	        panel7.add(panel3);

	        //Panel 4
	        JPanel panel4 = new JPanel();

	        b4= new JButton("4");
	        b4.setForeground(Color.BLUE);
	        panel4.add(b4);
	        b5 = new JButton("5");
	        b5.setForeground(Color.BLUE);
	        panel4.add(b5);
	        b6= new JButton("6");
	        b6.setForeground(Color.BLUE);
	        panel4.add(b6);
	        mul = new JButton("*");
	        mul.setForeground(Color.BLACK);
	        panel4.add(mul);
	        prop = new JButton("1/x");
	        prop.setForeground(Color.BLUE);
	        panel4.add(prop);

	        panel7.add(panel4);

	        //Panel 5
	        JPanel panel5 = new JPanel();

	        b1 = new JButton("1");
	        b1.setForeground(Color.BLUE);
	        panel5.add(b1);
	        b2= new JButton("2");
	        b2.setForeground(Color.BLUE);
	        panel5.add(b2);
	        b3 = new JButton("3");
	        b3.setForeground(Color.BLUE);
	        panel5.add(b3);
	        sub = new JButton("-");
	        sub.setForeground(Color.BLACK);
	        panel5.add(sub);
	        pm= new JButton("+/-");
	        pm.setForeground(Color.BLUE);
	        panel5.add(pm);

	        panel7.add(panel5);

	        //Panel 6
	        JPanel panel6 = new JPanel();

	        b0= new JButton("0");
	        b0.setForeground(Color.BLUE);
	        panel6.add(b0);
	        dot= new JButton(".");
	        dot.setForeground(Color.BLUE);
	        panel6.add(dot);
	        addButton = new JButton("+");
	        addButton.setForeground(Color.BLACK);
	        panel6.add(addButton);
	        eq = new JButton("=");
	        eq.setForeground(Color.BLACK);
	        panel6.add(eq);

	        panel7.add(panel6);

	        panel1.setBackground(Color.blue);
	        panel7.setBackground(Color.LIGHT_GRAY);

	        //Adding all individual panels to main panel7
	        add(panel7,BorderLayout.CENTER);

	        //Add events
	        addButton.addActionListener(this);
	        b0.addActionListener(this);
	        b1.addActionListener(this);
	        b2.addActionListener(this);
	        b3.addActionListener(this);
	        b4.addActionListener(this);
	        b5.addActionListener(this);
	        b6.addActionListener(this);
	        b7.addActionListener(this);
	        b8.addActionListener(this);
	        b9.addActionListener(this);
	        BACKSPACE.addActionListener(this);
	        CE.addActionListener(this);
	        C.addActionListener(this);
	        MC.addActionListener(this);
	        div.addActionListener(this);
	        sqrt.addActionListener(this);
	        MR.addActionListener(this);
	        mul.addActionListener(this);
	        per.addActionListener(this);
	        MS.addActionListener(this);
	        sub.addActionListener(this);
	        prop.addActionListener(this);
	        M.addActionListener(this);
	        pm.addActionListener(this);
	        dot.addActionListener(this);
	        eq.addActionListener(this);
	        per.addActionListener(this);
	    }

	    //Method when ActionListener calls its corresponding routine
	    public void actionPerformed(ActionEvent evt)
	    {
	        String str;

	        //Action Corresponding to + button
	        if(evt.getSource()== addButton)
	        {
	            if(first==1)
	            {
	                result=num=Double.parseDouble(mainTextFeild.getText());
	                oper1=1;
	            }
	            else
	            {
	                n1=Double.parseDouble(mainTextFeild.getText());
	                oper2=1;
	            }

	            //Action corresponding to previous operator
	            switch(oper1)
	            {
	                case 1:add1();
	                    break;
	                case 2:sub();
	                    break;
	                case 3:div();
	                    break;
	                case 4:mul();
	                    break;
	            }
	        }

	        //Action Corresponding to * button
	        if(evt.getSource()==mul)
	        {
	            if(first==1)
	            {
	                result=num=Double.parseDouble(mainTextFeild.getText());
	                oper1=4;
	            }
	            else
	            {
	                n1=Double.parseDouble(mainTextFeild.getText());
	                oper2=4;
	            }

	            //Action corresponding to previous operator
	            switch(oper1)
	            {
	                case 1:add1();
	                    break;
	                case 2:sub();
	                    break;
	                case 3:div();
	                    break;
	                case 4:mul();
	                    break;
	            }
	        }

	        //Action Corresponding to / button
	        if(evt.getSource()==div)
	        {
	            if(first==1)
	            {
	                result=num=Double.parseDouble(mainTextFeild.getText());
	                oper1=3;
	            }
	            else
	            {
	                n1=Double.parseDouble(mainTextFeild.getText());
	                oper2=3;
	            }

	            //Action corresponding to previous operator
	            switch(oper1)
	            {
	                case 1:add1();
	                    break;
	                case 2:sub();
	                    break;
	                case 3:div();
	                    break;
	                case 4:mul();
	                    break;
	            }
	        }

	        //Action Corresponding to - button
	        else if(evt.getSource()==sub)
	        {
	            if(first==1)
	            {
	                result=num=Double.parseDouble(mainTextFeild.getText());
	                oper1=2;
	            }
	            else
	            {
	                n1=Double.parseDouble(mainTextFeild.getText());
	                oper2=2;
	            }

	            //Action corresponding to previous operator
	            switch(oper1)
	            {
	                case 1:add1();
	                    break;
	                case 2:sub();
	                    break;
	                case 3:div();
	                    break;
	                case 4:mul();
	                    break;
	            }

	        }

	        //Action Corresponding to = button
	        else if(evt.getSource()==eq)
	        {
	            double n1=Double.parseDouble(mainTextFeild.getText());
	            if(oper1==1)
	                result=result+n1;
	            else if(oper1==2)
	                result=result-n1;
	            else if(oper1==3)
	                result=result/n1;
	            else if(oper1==4)
	                result=result*n1;
	            else
	                result=Double.parseDouble(mainTextFeild.getText());
	            num=result;
	            str=String.valueOf(result);
	            mainTextFeild.setText(str);
	        }

	        //Action Corresponding to MS button
	        else if(evt.getSource()==MS)
	        {
	        	
					FileWriter writehandle;
					try {
						writehandle = new FileWriter("D:\\memory.txt");
						BufferedWriter bw  = new BufferedWriter(writehandle);
						String save = mainTextFeild.getText();
						bw.write(save);
						bw.close();
						writehandle.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					
					
			}
	        	
	       
	           
	        

	        

	        //Action Corresponding to M button
	        else if(evt.getSource()==M)
	        {
	            memory=memory+Double.parseDouble(mainTextFeild.getText());
	        }

	        //Action Corresponding to MC button
	        else if(evt.getSource()==MC)
	        {
	            memory=0;
	            mainTextFeild.setText("0");
	            memorytTextFeild.setText(" ");
	        }

	        //Action Corresponding to MR button
	        else if(evt.getSource()==MR)
	        {
	        	try{
	        		FileReader set = new FileReader("D:\\memory.txt");
	        		BufferedReader s = new BufferedReader(set);
	        		mainTextFeild.read(s, null);
	        		s.close();
	        		mainTextFeild.requestFocus();
	        	}
	        	catch(Exception e){
	        		JOptionPane.showMessageDialog(null, e);
	        	}
	        }

	        //Action Corresponding to +/- button
	        else if(evt.getSource()==pm)
	        {
	            double n1=Double.parseDouble(mainTextFeild.getText());
	            n1=-n1;
	            str=String.valueOf(n1);
	            mainTextFeild.setText(str);
	        }

	        //Action Corresponding to 0 button
	        else if(evt.getSource()==b0)
	        {
	            if(opt==1)
	                str=String.valueOf(mainTextFeild.getText())+0;
	            else
	                str=String.valueOf(" ")+0;
	            opt=1;
	            mainTextFeild.setText(str);

	        }

	        //Action Corresponding to 1 button
	        else if(evt.getSource()==b1)
	        {
	            if(opt==1)
	                str=String.valueOf(mainTextFeild.getText())+1;
	            else
	                str=String.valueOf(" ")+1;
	            opt=1;
	            mainTextFeild.setText(str);

	        }

	        //Action Corresponding to 2 button
	        else if(evt.getSource()==b2)
	        {
	            if(opt==1)
	                str=String.valueOf(mainTextFeild.getText())+2;
	            else
	                str=String.valueOf(" ")+2;
	            opt=1;
	            mainTextFeild.setText(str);
	        }

	        //Action Corresponding to 3 button
	        else if(evt.getSource()==b3)
	        {
	            if(opt==1)
	                str=String.valueOf(mainTextFeild.getText())+3;
	            else
	                str=String.valueOf(" ")+3;
	            opt=1;
	            mainTextFeild.setText(str);
	        }

	        //Action Corresponding to 4 button
	        else if(evt.getSource()==b4)
	        {
	            if(opt==1)
	                str=String.valueOf(mainTextFeild.getText())+4;
	            else
	                str=String.valueOf(" ")+4;
	            opt=1;
	            mainTextFeild.setText(str);
	        }

	        //Action Corresponding to 5 button
	        else if(evt.getSource()==b5)
	        {
	            if(opt==1)
	                str=String.valueOf(mainTextFeild.getText())+5;
	            else
	                str=String.valueOf(" ")+5;
	            opt=1;
	            mainTextFeild.setText(str);
	        }

	        //Action Corresponding to 6 button
	        else if(evt.getSource()==b6)
	        {
	            if(opt==1)
	                str=String.valueOf(mainTextFeild.getText())+6;
	            else
	                str=String.valueOf(" ")+6;
	            opt=1;
	            mainTextFeild.setText(str);
	        }

	        //Action Corresponding to 7 button
	        else if(evt.getSource()==b7)
	        {
	            if(opt==1)
	                str=String.valueOf(mainTextFeild.getText())+7;
	            else
	                str=String.valueOf(" ")+7;
	            opt=1;
	            mainTextFeild.setText(str);
	        }

	        //Action Corresponding to 8 button
	        else if(evt.getSource()==b8)
	        {
	            if(opt==1)
	                str=String.valueOf(mainTextFeild.getText())+8;
	            else
	                str=String.valueOf(" ")+8;
	            opt=1;
	            mainTextFeild.setText(str);
	        }

	        //Action Corresponding to 9 button
	        else if(evt.getSource()==b9)
	        {
	            if(opt==1)
	                str=String.valueOf(mainTextFeild.getText())+9;
	            else
	                str=String.valueOf(" ")+9;
	            opt=1;
	            mainTextFeild.setText(str);
	        }

	        //Action Corresponding to BACKSPACE button
	        else if(evt.getSource()==BACKSPACE)
	        {
	            int len;
	            str= mainTextFeild.getText();
	            len=str.length();
	            if(len>=1)
	                str=str.substring(0,len-1);
	            mainTextFeild.setText(str);
	        }

	        //Action Corresponding to CE button
	        else if(evt.getSource()==CE)
	        {
	            result=0;
	            first=1;
	            opt=2;
	            str=String.valueOf('0');
	            mainTextFeild.setText(str);

	        }

	        //Action Corresponding to C button
	        else if(evt.getSource()==C)
	        {
	            result=0;
	            memory=0;
	            first=1;
	            opt=2;
	            mainTextFeild.setText("0");
	            memorytTextFeild.setText(" ");

	        }

	        //Action Corresponding to . button
	        else if(evt.getSource()==dot)
	        {
	            str=String.valueOf(mainTextFeild.getText())+".";
	            mainTextFeild.setText(str);
	        }

	        //Action Corresponding to 1/x button
	        else if(evt.getSource()==prop)
	        {
	            double n1=Double.parseDouble(mainTextFeild.getText());
	            n1=1/n1;
	            str=String.valueOf(n1);
	            mainTextFeild.setText(str);
	        }

	        //Action Corresponding to sqrt button
	        else if(evt.getSource()==sqrt)
	        {
	            double n1=Double.parseDouble(mainTextFeild.getText());
	            n1=Math.sqrt(n1);
	            str=String.valueOf(n1);
	            mainTextFeild.setText(str);
	        }

	        //Action Corresponding to % button
	        else if(evt.getSource()==per)
	        {
	            double n1=Double.parseDouble(mainTextFeild.getText());
	            n1=(n1*num)/100;
	            str=String.valueOf(n1);
	            mainTextFeild.setText(str);
	        }

	    }

	    //Add called according to previous operator
	    void add1()
	    {
	        if(first==0)
	            result=num=result+n1;
	        String str=String.valueOf(result);
	        mainTextFeild.setText(str);
	        opt=2;
	        if(oper2!=0)
	        {
	            oper1=oper2;
	            oper2=0;
	        }
	        first=0;
	    }

	    //Sub called according to previous operator
	    void sub()
	    {
	        if(first==0)
	            result=num=result-n1;
	        String str=String.valueOf(result);
	        mainTextFeild.setText(str);
	        opt=2;
	        if(oper2!=0)
	            oper1=oper2;
	        first=0;
	    }

	    //Div called according to previous operator
	    void div()
	    {
	        if(first==0)
	        {
	            if(n1==0)
	                mainTextFeild.setText("Cannot divide by zero");
	            else
	                result=num=result/n1;
	        }
	        String str=String.valueOf(result);
	        mainTextFeild.setText(str);
	        opt=2;
	        if(oper2!=0)
	            oper1=oper2;
	        first=0;
	    }

	    //Mul called according to previous operator
	    void mul()
	    {
	        if(first==0)
	            result=num=result*n1;
	        String str=String.valueOf(result);
	        mainTextFeild.setText(str);
	        opt=2;
	        if(oper2!=0)
	            oper1=oper2;
	        first=0;
	    }
	    public static void main(String args[])
	    {
	        Calculator obj = new Calculator();
	        obj.setVisible(true);
	    }
		
		
		
		
	}
	
	
