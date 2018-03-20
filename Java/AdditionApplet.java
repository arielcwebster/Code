import javax.swing.JApplet;
import java.awt.Graphics;
import javax.swing.JOptionPane;


public class AdditionApplet extends JApplet {
	private double sum;
	private double product;
	private double difference;
	private double quotient;
	private int first = 0;
	private double num1;
	private double num2;

	public void init (){
		String firstNum;
		String secondNum;
		//double num1;
		//double num2;
		
		firstNum = JOptionPane.showInputDialog("Enter first floating-point number");
		secondNum = JOptionPane.showInputDialog("Enter second floating-point number");
		
		num1 = Double.parseDouble(firstNum);
		num2 = Double.parseDouble(secondNum);
		
		sum = num1 + num2;
		product = num1*num2;
		difference = num1 - num2;
			if (difference < 0)
				difference = num2 - num1;
		try{
			quotient = num1/num2;
		}catch (ArithmeticException ae){
			System.err.println ("You cannot divide by 0");
		}
		
		if (num1 < num2){
			first = 1;
		} else if (num1 > num2){
			first = 2;
		}else if (num1 == num2){
			first = 3;
		}
	}
		public void paint(Graphics g){
			super.paint(g);
			
			g.drawRect(15, 10,270,20);
			g.drawString("The sum is " + sum, 25, 25);
			g.drawString("The product is " + product, 25, 40);
			g.drawString("The difference is " + difference, 25, 55);
			g.drawString("The quotient is " + quotient, 25, 70);
			g.drawString("The first number is " + num1, 25, 85);
			g.drawString("The second number is " + num2, 25, 100);
			if (first == 1){
				g.drawString( num2 + " is larger.", 25, 115);
			} else if (first == 2){
				g.drawString( num1 + " is larger.", 25, 115);
			} else if (first == 3){
				g.drawString( "These numbers are equal", 25, 115);
	 		}
		}

}// pg 961
