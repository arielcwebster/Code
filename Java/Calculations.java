//package smcm.COSC130.Webster;

import java.util.*;
import javax.swing.JFrame;

public class Calculations extends JFrame{

	//public double number1;      // declare number1
	//public double number2;     // declare number2
	//public double answer;     // declare answer
//	public double operation; // declare operation
	//public double a = 1;    // character for addition
	//public double s = 2;   // character for subtraction
	//public double m = 3;  // character for multiplication
	//public double d = 4; // character for division
	
	//public void Work() {
		
		
		//if (operation == a){ // if user wants to add
			 //answer = number1 + number2; // does addition
			// System.out.println (answer); // print answer
		 //}else if (operation == s){ //if user wants to subtract
			 //answer = number1 - number2; // does subtraction
			// System.out.println (answer); // print answer
		// }else if (operation == m) { //if user wants to multiply
			 //answer = number1 * number2; // does multiplication
			// System.out.println (answer); // print answer
		 //}else if (operation == d){ //if user wants to divide
			 //answer = number1 / number2; // does division
			// System.out.println (answer); // print answer
		// }// end ifs
		
		//System.out.println (answer);
		
	//} // end Work
	
	//public void CalculatorTest (){ // check to see if Work works
		//Scanner in = new Scanner (System.in);
		//Scanner input = new Scanner (System.in);
		
	//	System.out.println ("what is your first number");
		//number1 = in.nextDouble(); 
		
		//System.out.println ("what is your operation");
		//operation = in.nextDouble(); 
		
		//System.out.println ("what is your second number");
		//number2 = in.nextDouble(); 
	
	//} // end CalculatorTest
	
	public static void main (String args []){
		Calculations calc = new Calculations ();
		//calc.CalculatorTest();
		//calc.GUIbuttons();
		calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calc.setSize(370, 360); // width, height
		calc.setLocationRelativeTo(null); //centers window
		calc.setVisible(true);

	}// end main
	
} // end Calculations
