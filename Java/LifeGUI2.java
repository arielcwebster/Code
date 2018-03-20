import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Color;
import javax.swing.JColorChooser;
import java.awt.Graphics;
import javax.swing.ButtonGroup;
import javax.swing.JApplet;
import javax.swing.JButton; 
import javax.swing.JFrame;
import javax.swing.JTextField;
//import javax.swing.JFrame;
//import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JComboBox;
//import LifeGUI1.MyHandler;

public class LifeGUI2  extends JApplet {
	
	LifeGame1 lg = new LifeGame1();
	//private JPanel buttonPanel; //a panel of buttons
	private JButton Start;
	private JButton Reset;
	private ButtonGroup lives;
	//public Color colors [] = {Color.yellow, Color.black};
	//private int Displayarray [][] = lg.getDisplayArray();
	//private int Displayarray [][] = new int [25][25];
	//Displayarray[][] = lg.getDisplayArray()
	//private Container container;
	//private GridLayout gridlayout;
	private JComboBox imagesJComboBox;
	private BorderLayout layout;
	//private JLabel label; // label to display selected icon
	//private color
	private String generations [] = {"1","3", "5", "10"};
	public JComboBox gen;
	public JTextField txt;
	
	//LifeGame1 lg = new LifeGame1;
	//array[][] = lg.getDisplayArray();
	
	
	
	public void init(){
		setSize(550,550);
		
		layout = new BorderLayout ();
		setLayout (layout);

		//gen = new JComboBox(generations);
		
		//  http://docstore.mik.ua/orelly/java/exp/ch12_03.htm
		Panel p = new Panel();
		
		p.add(new Button ("Start"));
		add(p,"South");
		
		p.add(new Button ("Reset"));
		add(p,"South");
		
		p.add(new JComboBox(generations), "South"); //http://www.roseindia.net/java/example/java/swing/ComboBox.shtml
		//p.add(gen, "South");
		//combo= new JComboBox(generations);
		//p.add(combo, "SOUTH");
		
		//imagesJComboBox= new JComboBox (generations);
		//imagesJComboBox.setMaximumRowCount(3);
		//pg557
		
		
		
		
		
		//add(Start, 500,500);
		//add(Reset, 500,550);
	}
	
	public void paint (Graphics g){
		super.paint(g);
		
		//LifeGame1 lg = new LifeGame1();
		
		lg.openFile();
		lg.readFile();
		
		int DisplayArray [][] = lg.getDisplayArray();
		
		
		//LifeGame1 lg = new LifeGame1();
		//Displayarray[][] = lg.getDisplayArray()
		//array.XXX()
		//array.getDisplayArray;
		//g.drawString("Welcome to Java Programming!", 25, 25);
		
		//layout = new BorderLayout ();
		//setLayout (layout);
		
		//Start = new JButton ("Start");
		//Reset = new JButton ("Reset");
	
		//add(Start, BorderLayout.NORTH);
		//add(Reset, BorderLayout.NORTH);
		//add(Start);
		//add(Reset);
		
		
		//MyHandler m = new MyHandler();
	
	//	Start.addItemListener(m);
		//Reset.addItemListener(m);
	
		//lives = new ButtonGroup();
		//lives.add(Start);
		//lives.add(Reset);
		
		for (int living = 0; living < 25 ; living ++){
			for (int squares = 0; squares < 25 ; squares ++){
				//Displayarray [living][squares] = 0;
				g.fillRect((living*20), (squares*20), 18, 18); // x start value, y start value, width, length
				//g.fillRect((living*20), (squares*20), 18, 18);
				//if (living%2 == 0)
				System.out.println(DisplayArray[living][squares]);
				if ((DisplayArray[living][squares]) == 0)
					g.setColor (Color.BLACK);
				else
					g.setColor(Color.YELLOW);
			} // end inner for
		}// end for
		lg.closeFile();
	} // end paint
	
	//public void LifeGUI1(){
		
	//	setLayout(layout);
		
		//Start = new JButton ("Start");
		//Reset = new JButton ("Reset");
	
//		add(Start, BorderLayout.SOUTH);
	//	add(Reset, BorderLayout.SOUTH);
	
	//	MyHandler m = new MyHandler();
	
		//Start.addItemListener(m);
		//Reset.addItemListener(m);
	
		//lives = new ButtonGroup();
		//lives.add(Start);
		//lives.add(Reset);
	//}

	 // public LifeGUI2(){
		//    String course[] = {"BCA","MCA","PPC","CIC"};
		    //JFrame frame = new JFrame("Creating a JComboBox Component");
		    //JPanel panel = new JPanel();
		//    gen = new JComboBox(generations);
		    //combo.setBackground(Color.gray);
		    //combo.setForeground(Color.red);
		    //txt = new JTextField(10);
		    //panel.add(combo);
		    //panel.add(txt);
		    //frame.add(panel);
	//	    combo.setBounds( 20, 35, 260, 20 );
	//	    combo.addItemListener(new ItemListener(){
	//	      public void itemStateChanged(ItemEvent ie){
	//	        String str = (String)combo.getSelectedItem();
		       // txt.setText(str);
	//	      }
	//	    });
		   // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   // frame.setSize(200,200);
		    //frame.setVisible(true);
	//	  }
	
	
	private class MyHandler implements ItemListener{
		public void itemStateChanged(ItemEvent event){	
			if((event.getSource() == Start) && Start.isSelected()){
				lg.openFile();
				lg.closeFile();
				int Displayarray [][] = lg.getDisplayArray();
				//paint(Graphics g);
				int times = 1;
				for(int f = 0; f < times; f++){
					lg.life();
				}
			}else if((event.getSource() == Reset) && Reset.isSelected()){
				lg.openFile();
				lg.closeFile();
			}
		}
	}
}

//Issues:
//Talking to each other, I think I need another get something but  - - Why isn't it?
//drop box and setting it equal to something
//Talking the other way
//making buttons mean stuff
