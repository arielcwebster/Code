import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Color;
import javax.swing.JColorChooser;
import java.awt.Graphics;
import javax.swing.ButtonGroup;
import javax.swing.JButton; 
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JComboBox;

//import smcm.COSC130.Webster.GUIbuttons.MyHandler;


public class LifeGUI1 extends JFrame{// implements ActionListener

	private JPanel buttonPanel; //a panel of buttons
	private JButton Start;
	private JButton Reset;
	private ButtonGroup lives;
	//public Color colors [] = {Color.yellow, Color.black};
	private int Displayarray [][] = new int [25][25];
	private Container container;
	private GridLayout gridlayout;
	private JComboBox imagesJComboBox;
	//private JLabel label; // label to display selected icon
	//private color

	
	//public void paint(Graphics g){
		//super.paint(g);
	//}
	
	public void Colors (Graphics g){
		
		super.paint(g);
		
		for (int living = 0; living <= 25 ; living ++){
			for (int squares = 0; squares <= 25 ; squares ++){
				g.drawRect(living, squares, 1, 1); // x start value, y start value, width, length
				if (Displayarray[living][squares] == 0)
					g.setColor (Color.BLACK);
				else
					g.setColor(Color.YELLOW);
			} // end inner for
		}// end for
	} // end Colors


	public void LifeGUI1(){
		
		setLayout(new FlowLayout());
		
		Start = new JButton ("");
		Reset = new JButton ();
	
		add(Start);
		add(Reset);
	
		MyHandler m = new MyHandler();
	
		Start.addItemListener(m);
		Reset.addItemListener(m);
	
		lives = new ButtonGroup();
		lives.add(Start);
		lives.add(Reset);
	}

	public void Drop (){
	
	}

	private class MyHandler implements ItemListener{
		public void itemStateChanged(ItemEvent event){	
		
			if((event.getSource() == Start) && Start.isSelected()){
				//String Number1 = what.getText();
				//double number1 = Double.parseDouble(Number1);
				//operation = '-';
				//what.setText("0");
				//JOptionPane.showMessageDialog(null, "-");
			}//if statement
			else if((event.getSource() == Reset) && Reset.isSelected()){
				//String Number1 = what.getText();
				//double number1 = Double.parseDouble(Number1);
				//operation = '+';
				//what.setText("0");
				//JOptionPane.showMessageDialog(null, "+");
			}//if statement
			//gridlayout = new GridLayout (25,25); // sets up 25 by 25 grid
		}
	}
	
	
	//public static void main (String args []){
		//LifeGUI1 lg = new LifeGUI1 ();
		//lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//lg.setSize(420, 170);
		//lg.setVisible(true);
		//lg.Colors(g);
		
//	}
	//container = getContentPane();
	// setLayout (gridLayout1);

} // end all