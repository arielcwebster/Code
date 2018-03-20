//package smcm.COSC130.Webster;

//import java.awt.Container;
import java.awt.FlowLayout;
//import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.ItemEvent;
//import java.awt.event.ItemListener;
//import javax.swing.ButtonGroup;
//import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JPanel;
import javax.swing.JTextField;


public class Hopefully extends JFrame {

	
	//private static final long serialVersionUID = 1L;
	//private JButton buttons []; // creates button array
	//private String string;
    //private GridLayout gridLayout; // says there will be a grid
	//private Container container;
	private JTextField what; // so you can see what is going on
	private String Number1 = "0"; //what user puts in first
	private String Number2 = "0"; // what user puts in second
	private String Answer = "0"; // the answer to the whole shabang
	private double number1 = 0; // what the computer can actually work with
	private double number2 = 0; // the second thing the computer can actually work with
	private char operation; // what the computer does to numbers 1 and 2
	private double answer; // the answer the computer finds to the whole shabang
	private String number = ""; //temporary holding magig that becomes Number 1 and 2 every so often
	//private int violet = 12;
	
	// yay so there are going to be buttons and all of them are individuals thats why they all have names
	//private JPanel buttonPanel;
	private JButton subtract;
	private JButton add;
	private JButton divide;
	private JButton multiply;
	private JButton one;
	private JButton two;
	private JButton three;
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
	//private ButtonGroup calc;

	public Hopefully(){ //constructor

		super ("Calculate!"); // so when the user sees a calculator they know it is to calculate
		setLayout(new FlowLayout()); // gatta go with the flow and I don't want to try to figure out grid and border layout stuff

		what = new JTextField(25); // this is a text field that can hold 25 characters, if you have more than that I'm sorry but that seems a little excessive for a four function calculator

		add(what); // and the text field too, don't just say it is there and be done with it
			
		// now what should I call these buttons?
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
		clear = new JButton ("Clear");
		enter = new JButton ("=");
		
		// YAY buttons. Adding every single one
		add(seven);
		add(eight);
		add(nine);
		add(add);
		add(four);
		add(five);
		add(six);
		add(subtract);
		add(one);
		add(two);
		add(three);
		add(multiply);
		add(point);
		add(zero);
		add(clear);
		add(divide);
		add(enter);
		
		MyHandler m = new MyHandler(); //its ok you can handle this now when a button is pushed learn to pay attention to that
		
		// Listen to those darn buttos I just spent so much time adding!
		subtract.addActionListener(m);
		add.addActionListener(m);
		divide.addActionListener(m);
		multiply.addActionListener(m);
		one.addActionListener(m);
		two.addActionListener(m);
		three.addActionListener(m);
		four.addActionListener(m);
		five.addActionListener(m);
		six.addActionListener(m);
		seven.addActionListener(m);
		eight.addActionListener(m);
		nine.addActionListener(m);
		zero.addActionListener(m);
		point.addActionListener(m);
		clear.addActionListener(m);
		enter.addActionListener(m);

	} // end constructuor

	private class MyHandler implements ActionListener{

		public void actionPerformed(ActionEvent event){
			
			Calculations c = new Calculations();
			
		//	if (violet == 16){
			//	number = "";
			//	number = Answer;
			//}
			
			if((event.getSource() == subtract)){ // if subtract button pushed this happens
				//if (number == ""){
					//Number1 = Answer;
					//Answer = "";
					//operation = '-';
				//} else{
				//String Number1 = what.getText();
				//double number1 = Double.parseDouble(Number1);
				operation = '-'; // you are going to subtract eventually
				//System.out.print(number);
				Number1 = number; // move the temporary number to storage and save it as it truely it so you can work with it later
				if (number == ""){
					Number1 = Answer;
				}
				number1 = Double.parseDouble(Number1);// sorry this is the so you can work with it later bit the computer gets confused otherwise 
				//System.out.print(number);
				//System.out.print(number1);
				//System.out.print(Number1);
				number = ""; // set temp variable to nada so it can think about what the user will put in next
				what.setText("-"); // show user what they just did
				//}
			}//if statement
			else if((event.getSource() == add)){
				//violet = 14;
				
				//if (number == ""){
					//violet = 14;
					//Number1 = Answer;
					//Answer = "";
					//operation = '+';
				//} else{
				//String Number1 = what.getText();
				//double number1 = Double.parseDouble(Number1);
				operation = '+'; //you are going to add this time
				Number1 = number; // this is the same as up there don't ask again
				if (number == ""){
					Number1 = Answer;
				}
				
				number1 = Double.parseDouble(Number1); // and if you were wondering this is also the same as up there
				//System.out.print(number1);
				//System.out.print(Number1);
				number = ""; // why are you still wondering what is going on i told you it is the SAME as before 
				what.setText("+"); // ok so this is a little different but really it is basically the same 
			//	}
			}//if statement
			else if((event.getSource() == multiply)){
				//if (number == ""){
					//Number1 = Answer;
					//Answer = "";
					//operation = '*';
				//} else{
				//String Number1 = what.getText();
				//double number1 = Double.parseDouble(Number1);
				operation = '*'; // you know the drill
				Number1 = number; // great green gobs of greasy grimy goffer guts
				if (number == ""){
					Number1 = Answer;
				}
				number1 = Double.parseDouble(Number1); // mutilated monkey meat
				//System.out.print(number1);
				//System.out.print(Number1);
				number = ""; // i don't know the rest of the song
				what.setText("*"); // and me without my spoon
				//}
			}//if statement
			else if((event.getSource() == divide)){
				//if (number == ""){
					//Number1 = Answer;
					//Answer = "";
					//operation = '/';
				//} else{
				//String Number1 = what.getText();
				//double number1 = Double.parseDouble(Number1);
				operation = '/';
				Number1 = number;
				if (number == ""){
					Number1 = Answer;
				}
				number1 = Double.parseDouble(Number1);
				//System.out.print(number1);
				//System.out.print(Number1);
				number = "";
				what.setText("/");
				//}
			}//if statement
			
			else if((event.getSource() == one)){
				addnum ("1"); // if user pushes this or any other number button that number is sent to the temp variable number and printed out. That is the way it works =)
				//violet = 14; 
			}//if statement
			if((event.getSource() == two)){
				addnum ("2");
				//violet = 14; 
			}//if statement
			if((event.getSource() == three)){
				addnum ("3");
				//violet = 14; 
			}//if statement
			if((event.getSource() == four)){
				addnum ("4");
				//violet = 14; 
			}//if statement
			if((event.getSource() == five)){
				addnum ("5");
				//violet = 14; 
			}//if statement
			if((event.getSource() == six)){
				addnum ("6");
				//violet = 14; 
			}//if statement
			if((event.getSource() == seven)){
				addnum ("7");
				//violet = 14; 
			}//if statement
			if((event.getSource() == eight)){
				addnum ("8");
				//violet = 14; 
			}//if statement
			if((event.getSource() == nine)){
				addnum ("9");
				//violet = 14; 
			}//if statement
			if((event.getSource() == zero)){
				addnum ("0");
				//violet = 14; 
			}//if statement
			if((event.getSource() == point)){
				addnum(".");
				//violet = 14; 
			}//if statement
			
			if((event.getSource() == clear)){ // clear EVERYTHING
				what.setText(""); // clear the text field
				number = ""; // clear whatever little bits you have collected so far
				Number1 = ""; // clear Number1
				Number2 = ""; // clear Number2
				// Everything
			}//if statement
			
			if((event.getSource() == enter)){
				Number2 = number; // put what you collected the second time into the Number2 variable
				//System.out.print(number);
				number = ""; // clear out your temp variable, just incase the user wants to do this again and really why wouldn't they
				
				//c.Work();
				//double input = Double.parseDouble(number1);
				
				//Number1 = what.getText();
				//number1 = Double.parseDouble(Number1);
				
				//Number2 = what.getText();
				number2 = Double.parseDouble(Number2); // make it so the computer can work with your number2
				//System.out.print(number2);
				//System.out.print(Number2);				
				
				c.Work(); // calls calculations class
				
				
				//number = "";
				what.setText(Answer);// set text so that it shows the answer, I know picky picky they actually want to see the finished results
				//number = (Answer);
				//System.out.print(number);
				//System.out.print(Answer);
				//JOptionPane.showMessageDialog(null, answer);
				// number1 = answer; 
				//number = Answer;
				
				//violet = 14;
				}//if statement
				
			}// end if elses
			
			//what.setText(number);  
		}
		
		public class Calculations {
			public void Work() {
			
			// actual calculations? What are they doing here?
			if (operation == '*' ){
				answer = (number1 * number2);
				//System.out.print (answer);
				Answer = Double.toString(answer);
				//System.out.print(Answer);
			}
			if (operation == '+' ){
				answer = (number1 + number2);
				//System.out.print (answer);
				Answer = Double.toString(answer);
				//System.out.print(Answer);
			}
			if (operation == '-' ){
				answer = (number1 - number2);
				//System.out.print (answer);
				Answer = Double.toString(answer);
				//System.out.print(Answer);
			}
			if (operation == '/' ){
				answer = (number1 / number2)
				;
				//System.out.print (answer);
				Answer = Double.toString(answer);
				//System.out.print(Answer);
			}
		}
		}
		
		
		
	
		void addnum(String s){
			number += s; //that temporary holding variable that is super important
			what.setText(number); // printing out all the numbers again so the silly user can see them
		}

	public static void main(String[] args) {
		Hopefully works = new Hopefully();
		works.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		works.setSize(325,225); // figure out just the right size for the calculator
		works.setVisible(true); // Yay actually being able to see it all
		works.setLocationRelativeTo(null); // center of the screen
		works.setResizable(false);
	}
}