import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;
//import javax.swing.JFrame;
//import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JComboBox;
//import LifeGUI1.MyHandler;


public class LifeGUI4  extends JApplet {
	
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
	public JTextArea [][] cell;
	
	//Dimension offDimension = this.size();
	  //Image offImage = createImage(offDimension.width, offDimension.height);
	  //Graphics offGraphics = offImage.getGraphics();
	
	public int DisplayArray [][]= lg.getWorkArray();// set it initially equal to the WorkArray which read in the file
	
	public void init(){
		
		//LifeGUI4 g = new LifeGUI4(); // call self
		Handle h = new Handle(); // calls handler
		
		setSize(550,550); // set size of window
		
		layout = new BorderLayout (); // declare layout
		GridLayout grid = new GridLayout(25,25,1,1); // size of the grid and then of the hight and width of the squares
		setLayout (layout);// set the declared layout to the layout used for the buttons and combobox
		JPanel panel = new JPanel(); // add panel where we put the buttons
		
		panel.setLayout(grid); // layout of panel is grid layout
		
		//  http://docstore.mik.ua/orelly/java/exp/ch12_03.htm, I used this source to figure out how to add buttons within an Applet
		Panel p = new Panel(); 
		
		p.add(Start = new JButton ("Start"));// add and name button according to http://docstore.mik.ua/orelly/java/exp/ch12_03.htm
		add(p,"South"); // put button in the southern region according to http://docstore.mik.ua/orelly/java/exp/ch12_03.htm
		Start.addItemListener(new ItemListener(){ // listener parts from http://docstore.mik.ua/orelly/java/exp/ch12_03.htm
		      public void itemStateChanged(ItemEvent ie){
		    	  //System.out.println("Polo");
					for(int f = 0; f < times; f++){ // goes though figuring out the generations however many times asted by the combo box
						lg.life(); // calling LifeGame to figure out the generations
					}
					int DisplayArray [][] = lg.getDisplayArray(); // this should set the array to be displayed to the generation requested
		        }
		      });
		Start.addActionListener (h);//goes to handler as well, I don't know why this make it work
		
		p.add(Reset = new JButton ("Reset"));// add and name button according to http://docstore.mik.ua/orelly/java/exp/ch12_03.htm
		add(p,"South");// put button in the southern region according to http://docstore.mik.ua/orelly/java/exp/ch12_03.htm
		Reset.addItemListener(new ItemListener(){// listener parts from http://docstore.mik.ua/orelly/java/exp/ch12_03.htm
		      public void itemStateChanged(ItemEvent ie){
		    	  System.out.println("What");
		    	  
		    	 //trying to get back to the original array
		    	lg.openFile();
		  		lg.readFile();
		  		lg.closeFile();
		  		
		    	  int Displayarray [][] = lg.getWorkArray();
		        }
		      });
		Reset.addActionListener (h);
		
		p.add(gen = new JComboBox(generations), "South"); //http://www.roseindia.net/java/example/java/swing/ComboBox.shtml, I used this website in combinations with the previous website and a lot of trial and error to come up with this line. 
		gen.addItemListener(new ItemListener(){
		      public void itemStateChanged(ItemEvent ie){
		    	  
		    	  // setting selection on combo box to something
		    	  String str = (String)gen.getSelectedItem();
		    	   	if (str == "1"){
			        	 times = 1;
			         }
			         if (str == "3"){
			        	 times = 3;
			         }
			         if (str == "5"){
			        	 times = 5;
			         }
			         if (str == "10"){
			        	 times = 10;
			         }
			         System.out.println("Over Here");
		        }
		      });
		
		
		//opening and closing file, so can get array
		lg.openFile();
		lg.readFile();
		lg.closeFile();
		
		cell = new JTextArea[25][25]; // creating grid of cells
        
		// printing out grid of cells
		for (int living = 0; living < 25 ; living ++){
			for (int squares = 0; squares < 25 ; squares ++){
				cell[living][squares] = new JTextArea();
                panel.add(cell[living][squares]);
             
                if ((DisplayArray[living][squares]) == 0)
                	cell[living][squares].setBackground(Color.BLACK);
				else
					cell[living][squares].setBackground(Color.YELLOW);
            }
        }
        add(panel);
	}

	
	// handling stuff already handled but for some reason needs to be here
	private class Handle implements ActionListener{

		public void actionPerformed(ActionEvent event){	
			LifeGUI4 g = new LifeGUI4();
		if((event.getSource() == Start) ){//&& Start.isSelected()){
				System.out.println("Polo");

				for(int f = 0; f < times; f++){
					lg.life();
				}
				int Displayarray [][] = lg.getDisplayArray();
				
				for (int living = 0; living < 25 ; living ++){
					for (int squares = 0; squares < 25 ; squares ++){
		             
		                if ((DisplayArray[living][squares]) == 0)
		                	cell[living][squares].setBackground(Color.BLACK);
						else
							cell[living][squares].setBackground(Color.YELLOW);
		            }
		        }

			}else if((event.getSource() == Reset) && Reset.isSelected()){
				 System.out.println("What");
		    	  
		    	 //trying to get back to the original array
		    	lg.openFile();
		  		lg.readFile();
		  		lg.closeFile();
		  		
		    	  int Displayarray [][] = lg.getWorkArray();
			}//end ifs
	
		        String str = (String)gen.getSelectedItem();
		         if (str == "1"){
		        	 times = 1;
		         }
		         if (str == "3"){
		        	 times = 3;
		         }
		         if (str == "5"){
		        	 times = 5;
		         }
		         if (str == "10"){
		        	 times = 10;
		         }
		   }
		  //  });
	}

}

