import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;


public class LifeHandler {
	
	LifeGame1 lg = new LifeGame1();// reference LifeGame
	
	private JButton Start;
	private JButton Reset;
	private ButtonGroup lives;
	private BorderLayout layout;
	private String generations [] = {"1","3", "5", "10"};
	public JComboBox gen;
	private int times = 1;

	private class MyHandler implements ItemListener{
		public void itemStateChanged(ItemEvent event){	
			if((event.getSource() == Start) && Start.isSelected()){
				//int Displayarray [][] = lg.getDisplayArray();
				//paint(Graphics g);
				for(int f = 0; f < times; f++){
					lg.life();
				}
				int Displayarray [][] = lg.getDisplayArray();
				LifeGUI4 g = new LifeGUI4();
				//g.paint();
				
			}else if((event.getSource() == Reset) && Reset.isSelected()){
				lg.openFile();
				lg.readFile();
				lg.closeFile();
			}//end ifs
		//}
		 //gen.addItemListener(new ItemListener(){
		   //   public void itemStateChanged(ItemEvent ie){
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
