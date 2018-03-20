import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Boxes {

	
	LifeGame1 lg = new LifeGame1();// reference LifeGame
	
	//declarations
	private JButton Start;
	private JButton Reset;
	private ButtonGroup lives;
	private BorderLayout layout;
	private GridLayout layout2;
	private String generations [] = {"1","3", "5", "10"};
	public JComboBox gen;
	private int times = 1;
	public int print = 5;
	//public JTextField txt;
	public JTextArea [][] txt;
	
	//Dimension offDimension = this.size();
	  //Image offImage = createImage(offDimension.width, offDimension.height);
	  //Graphics offGraphics = offImage.getGraphics();
	
	public int DisplayArray [][]= lg.getWorkArray();
	
	public void la (){
		//super.paint(g);
		
		lg.openFile();
		lg.readFile();
		lg.closeFile();
		
		//int DisplayArray [][] = lg.getWorkArray();
		
		//while (print == 5){
		for (int living = 0; living < 25 ; living ++){
			for (int squares = 0; squares < 26 ; squares ++){
				//System.out.println(DisplayArray[0][squares]);
				//System.out.println(DisplayArray[25][squares]);
				//Displayarray [living][squares] = 0;
				//txt.setBackground(Color.red);
			//    txt = new JTextField(1);
			    JPanel panel = new JPanel();
			    GridLayout layout2 = new GridLayout (25,25,1,1);
			    panel.setLayout(layout2);
			    //txt.contains((living*20), (squares - 1)*20);
			    //txt.createImage(18, 18);
			    //txt.getBounds();
			    //txt.setBounds((living*20), (squares - 1)*20, 18, 18);
				
			   // grid = new JTextingArea[25][25];
			    
			    
		        layout = new BorderLayout();
		     //   setLayout(layout);
		        
		        txt = new JTextArea[25][25];
		      
		        JPanel buttonJPanel = new JPanel();
		        JPanel gridJPanel = new JPanel();
		        GridLayout gridLayout1 = new GridLayout(25,25,1,1);
		        gridJPanel.setLayout(gridLayout1);
		      
		       
		      
		      //  add(box, BorderLayout.NORTH);
		       // add(buttonJPanel, BorderLayout.SOUTH);
		        
		        
		      
		        for (int i = 0; i < 25; i++){
		            for (int j = 0; j < 25; j++) {
		                txt[i][j] = new JTextArea();
		                //grid[i][j].setBackground( new Color(120,120,120));
		                gridJPanel.add(txt[i][j]);
		            }
		        }
			    
			    
			    
			    
			    
			    //g.fillRect((living*20), ((squares - 1)*20), 18, 18); // x start value, y start value, width, length
				//g.fillRect((living*20), ((25)*20), 18, 18);
				//g.fillRect((squares*20), (living*20), 18, 18); // x start value, y start value, width, length
				//System.out.println(DisplayArray[living][squares]);
				//if ((DisplayArray[living][squares]) == 0);
				if ((DisplayArray[squares][living]) == 0)
				//	txt.setBackground(Color.black);
					System.out.print("hi");
					//g.setColor (Color.BLACK);
				else
				//	txt.setBackground(Color.yellow);
					//g.setColor(Color.YELLOW);
					System.out.print("hey");
			} // end inner for
		}// end for
		print = 6;
		//}

		//print = 6;
		
		// g.addItemListener(new ItemListener(){
		  //    public void itemStateChanged(ItemEvent ie){
		    //    String str = (String)combo.getSelectedItem();
		      //  txt.setText(str);
		     // }
		    //});
		//lg.closeFile();
	} // end paint

public static void main (String args []){ 
	Boxes b = new Boxes();
	///lg.openFile();
	//lg.readFile();
	//lg.closeFile();
	//lg.life();
		//g.buttons();
		b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b.setSize(550,550); // figure out just the right size for the calculator
		b.setVisible(true); // Yay actually being able to see it all
		b.setLocationRelativeTo(null); // center of the screen
		b.setResizable(false);
	}