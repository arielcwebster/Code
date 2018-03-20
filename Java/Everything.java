
import java.awt.GridLayout; // this is more for the buttons but I decided to just copy and paste all the button imports here, and who knows maybe I will end up using it
import java.awt.BorderLayout; // NORTH, WEST, CENTER, EAST, SOUTH, the world in a box
import java.awt.event.ActionListener; // it makes you listen to what is going on, actually what it does kinda confuses me
import java.awt.event.ActionEvent; // something is happening, if only I knew what and why! this too confuses me
import java.awt.event.KeyListener; // it makes you listen to what is going on, actually what it does kinda confuses me
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter; // it makes you listen to what is going on, actually what it does kinda confuses me
import java.awt.event.MouseListener; // it makes you listen to what is going on, actually what it does kinda confuses me
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.ItemListener; // it makes you listen to what is going on, actually what it does kinda confuses me
import java.awt.event.ItemEvent;
import java.awt.Container;
import javax.swing.JTextField; // where you type in your numbers, hopefully
import javax.swing.JOptionPane; // something that is just there
import javax.swing.JFrame; // the little box that pops up on your screen and hopefully has a calculator in it
import javax.swing.JPanel; // Yay different layout types
import javax.swing.JButton; 
import javax.swing.JTextArea; 
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class Everything extends JFrame implements ActionListener {

	private JButton buttons[];
	private String string;
	private Container container;
	private JTextArea textArea;
	private JPanel panel;
	
	public Everything (){
		
		super ("What the heck");
		
		container = getContentPane ();
		
		buttons = new JButton [2];
		
		
		for (int i = 0; i < 2; i++){
			buttons [i] = new JButton ();
			buttons [i].addActionListener (this);
			panel.add(buttons [i]);
		} // end for
		add (panel, BorderLayout.CENTER);
	}// end constructor
	
public void actionPerformed(ActionEvent event){
	if (event.getSource () == buttons [0]){
		JOptionPane.showMessageDialog (null, "Hi I'm button ONE");
	}
	else if (event.getSource () == buttons [1]){
		JOptionPane.showMessageDialog (null, "Hi I'm button TWO");
	}
	
	container.validate ();
}

public static void main (String args []){
	Everything every = new Everything ();
	every.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	every.setSize(370, 360); // width, height
	every.setLocationRelativeTo(null); //centers window
	every.setVisible(true);
	
}
	
//public class EverythingKey extends JFrame implements KeyListener {
	
	//textArea = new JTextArea (10,15);
	
	//textArea.setText("Press any Key");
	//add (textArea);
	//addKeyListener (this);
//}

}//end Everything

