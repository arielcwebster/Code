//package smcm.COSC130.Webster;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton; 



public class Check extends JFrame{
	
	private JButton buttons;
	private JTextField what; //  where stuff pops up and aperently it is better than TextArea because TextArea would hold paragraph length stuff
	private String Number1;// user input
	private String Number2; // user input
	private String Answer; // program output
	private double number1; // program works with
	private double number2; // program works with
	private char operation; // user input becomes what is done to numbers
	private double answer;// what program finds as anwser

	private JButton subtract; // the operation button to take away, and what you should not do to my grade
	private JButton add; // the operation button to add, and what you should to to my grade =)
	private JButton divide; // the operation button to divide what we do each day in class, Yay pairs
	private JButton multiply;// the operation to multiply and what my brain cells are hopefully doing
	private JButton one;// ah numbers this is the button for number one
	private JButton two; // are you still reading? I'm still typing. This is the button for number 2
	private JButton three; // 
	private JButton four;
	private JButton five;
	private JButton six;
	private JButton seven;
	private JButton eight;
	private JButton nine;
	private JButton zero;
	private JButton point;
	private JButton clear;
	private JButton enter;
	
	public Check(){
		
		setLayout(new FlowLayout());
		
		subtract = new JButton ("-");
		add = new JButton ("+");
		divide = new JButton ("/");
		multiply = new JButton ("*");
		one = new JButton ("1");
		two = new JButton ("2");
		three = new JButton ("3");
		four = new JButton ("4");
		five= new JButton ("5");
		six = new JButton ("6");
		seven = new JButton ("7");
		eight = new JButton ("8");
		nine = new JButton ("9");
		zero = new JButton ("0");
		point = new JButton (".");
		clear = new JButton ("");
		enter = new JButton ();
		
		add(subtract);
		add(add);
		add(divide);
		add(multiply);
		add(one);
		add(two);
		add(three);
		add(four);
		add(five);
		add(six);
		add(seven);
		add(eight);
		add(nine);
		add(zero);
		add(point);
		add(clear);
		add(enter);
		
		MyHandler m = new MyHandler();
		
		subtract.addItemListener(m);
		add.addItemListener(m);
		divide.addItemListener(m);
		multiply.addItemListener(m);
		one.addItemListener(m);
		two.addItemListener(m);
		three.addItemListener(m);
		four.addItemListener(m);
		five.addItemListener(m);
		six.addItemListener(m);
		seven.addItemListener(m);
		eight.addItemListener(m);
		nine.addItemListener(m);
		zero.addItemListener(m);
		point.addItemListener(m);
		clear.addItemListener(m);
		enter.addItemListener(m);
	}
	
	private class MyHandler implements ItemListener{
		public void itemStateChanged(ItemEvent event){	
			
			if((event.getSource() == subtract) && subtract.isSelected()){
				String Number1 = what.getText();
				double number1 = Double.parseDouble(Number1);
				operation = '-';
				what.setText("0");
				JOptionPane.showMessageDialog(null, "-");
			}//if statement
			else if((event.getSource() == add) && add.isSelected()){
				String Number1 = what.getText();
				double number1 = Double.parseDouble(Number1);
				operation = '+';
				what.setText("0");
				JOptionPane.showMessageDialog(null, "+");
			}//if statement
			else if((event.getSource() == multiply) && multiply.isSelected()){
				String Number1 = what.getText();
				double number1 = Double.parseDouble(Number1);
				operation = '*';
				what.setText("0");
				JOptionPane.showMessageDialog(null, "*");
			}//if statement
			else if((event.getSource() == divide) && divide.isSelected()){
				String Number1 = what.getText();
				double number1 = Double.parseDouble(Number1);
				operation = '/';
				what.setText("0");
				JOptionPane.showMessageDialog(null, "/");
			}//if statement
			
			else if((event.getSource() == one) && one.isSelected()){
				JOptionPane.showMessageDialog(null, "1");
			}//if statement
			if((event.getSource() == two) && two.isSelected()){
				JOptionPane.showMessageDialog(null, "2");
			}//if statement
			if((event.getSource() == three) && three.isSelected()){
				JOptionPane.showMessageDialog(null, "3");
			}//if statement
			if((event.getSource() == four) && four.isSelected()){
				JOptionPane.showMessageDialog(null, "4");
			}//if statement
			if((event.getSource() == five) && five.isSelected()){
				JOptionPane.showMessageDialog(null, "5");
			}//if statement
			if((event.getSource() == six) && six.isSelected()){
				JOptionPane.showMessageDialog(null, "6");
			}//if statement
			if((event.getSource() == seven) && seven.isSelected()){
				JOptionPane.showMessageDialog(null, "7");
			}//if statement
			if((event.getSource() == eight) && eight.isSelected()){
				JOptionPane.showMessageDialog(null, "8");
			}//if statement
			if((event.getSource() == nine) && nine.isSelected()){
				JOptionPane.showMessageDialog(null, "9");
			}//if statement
			if((event.getSource() == zero) && zero.isSelected()){
				JOptionPane.showMessageDialog(null, "0");
			}//if statement
			if((event.getSource() == point) && point.isSelected()){
				JOptionPane.showMessageDialog(null, ".");
			}//if statement
			
			if((event.getSource() == clear) && clear.isSelected()){
				what.setText("");
			}//if statement
			if((event.getSource() ==enter) && enter.isSelected()){
				String Number2 = what.getText();
				double number2 = Double.parseDouble(Number2);
				what.setText(Answer);
			}// end if elses
			  
			 
			if (operation == '*' ){
				double answer = number1 * number2;
				String Answer = Double.toString(answer);
			}
			if (operation == '+' ){
				double answer = number1 + number2;
				String Answer = Double.toString(answer);
			}
			if (operation == '-' ){
				double answer = number1 - number2;
				String Answer = Double.toString(answer);
			}
			if (operation == '/' ){
				double answer = number1 / number2;
				String Answer = Double.toString(answer);
			}
			
	
	}
	}

}