	/**
	 * GUI
	 * Create a menu for selecting crust type and topping selections for a pizza order.
	 * Ariel Webster, 2/17/2009
	 */

	//make sure to do one thing at a time, and then test to see if it works rather than trying to code entire program at once.

	import javax.swing.JFrame;
	import java.awt.event.ItemListener;
	import java.awt.event.ItemEvent;
	import javax.swing.JTextField;
	import java.awt.FlowLayout;
	import javax.swing.JCheckBox;
	import javax.swing.JRadioButton;
	import javax.swing.ButtonGroup;
	import javax.swing.JOptionPane;

	public class PizzaOrder extends JFrame {

		

		//define variables

		private JTextField myPizza;
		private ButtonGroup crust;
		private JRadioButton thin;
		private JRadioButton stuffed;
		private JRadioButton hand;
		private JRadioButton pan;
		private JCheckBox toppings[];
		private String choices[] = {"mushrooms", "sausage", "pineapple", "extra cheese", "pepperoni", "green peppers", "ham", "onion"};		

		public PizzaOrder(){

			super("Pizza Ordering System");
			setLayout(new FlowLayout());
	
			myPizza = new JTextField(25);
			add(myPizza);

			MyHandler m = new MyHandler(); //create new reference to action listener
			//add new CheckBoxes to the GUI/screen
			toppings = new JCheckBox[choices.length];

			for(int i = 0; i < choices.length; i++){
				toppings[i] = new JCheckBox(choices[i]);
				toppings[i].addItemListener(m); //call action listener
				add(toppings[i]);
			}//end for loop
			//create RadioButtons and add them to GUI
			thin = new JRadioButton("thin", false);
			hand = new JRadioButton("hand", true); //true will set hand to default selection for pizza choice in case user doesn't make own selection.
			pan = new JRadioButton("pan", false);
			stuffed = new JRadioButton("stuffed", false);
			//call action listener
			thin.addItemListener(m);
			hand.addItemListener(m);
			pan.addItemListener(m);
			stuffed.addItemListener(m);
			add(thin);
			add(hand);
			add(pan);
			add(stuffed);
			//adding created Radio Buttons to a ButtonGroup(group them together)
			crust = new ButtonGroup();
			crust.add(thin);
			crust.add(hand);
			crust.add(pan);
			crust.add(stuffed);
			
		}//end constructor

		private class MyHandler implements ItemListener{			
			//method called for ItemListener/when and Item sends or records an event
			public void itemStateChanged(ItemEvent event){				
				if((event.getSource() == thin) && thin.isSelected()){
					JOptionPane.showMessageDialog(null, "Mmmmm... Thin crust!", "Crust Choices", JOptionPane.PLAIN_MESSAGE);
				}//if statement

				else if((event.getSource() == hand) && hand.isSelected()){
					JOptionPane.showMessageDialog(null, "Mmmmm... Hand-tossed crust!", "Crust Choices", JOptionPane.PLAIN_MESSAGE);

				}//if statement
				
				else if((event.getSource() == pan) && pan.isSelected()){
					JOptionPane.showMessageDialog(null, "Mmmmm... Pan crust!", "Crust Choices", JOptionPane.PLAIN_MESSAGE);

				}//if statement

				else if((event.getSource() == stuffed) && stuffed.isSelected()){

					JOptionPane.showMessageDialog(null, "Mmmmm... Cheese stuffed crust!", "Crust Choices", JOptionPane.PLAIN_MESSAGE);

				}//if statement
				//handle events for when someone chooses a pizza toppings. For handling events for items in an array!

				else{
					for(int i =0; i< choices.length; i++){
						if(event.getSource() == toppings[i]){ 
							
							//get current text in the text field and set the text you want to be in the text field.
							myPizza.setText(choices[i] + " " + myPizza.getText());
							
						}//end inner if statement
					}//end for loop
				}//end outer if statement	
			}//end method itemStateChanged
		}//end item MyHandler
	}//end public class PizzaOrder
