//package smcm.COSC130.Webster;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.util.*;


public class FontSizeColor extends JPanel{
	public String font [] = {"Monospaced", "Serif", "Impact", "Georgia", "Arial"};
	public Color colors [] = {Color.red, Color.yellow, Color.green, Color.black, Color.blue};
	public int size [] = new int [25];
	private Random rng = new Random();
	
	public void paint (Graphics g){
		
		//size = [rng.nextInt(x)]; 
		
		
		for (int x = 0; x < size.length; x++){
			size [x] = x;
		}
		
		super.paint(g);
		
		//for (int x = 0; x < size)
		
		g.setColor (colors[rng.nextInt(colors.length)]);
		g.setFont(new Font (font[rng.nextInt(font.length)], Font.PLAIN, size[rng.nextInt(25)]));
		g.drawString("YAY Blah", 20, 50);
		
		g.setFont(new Font ("Serif", Font.PLAIN, 18));
		g.drawString("This is a test", 20, 70);

		
 		//g.setFont(new Font ("Monospaced", Font.ITALIC, 24));
 		//g.drawString("Monospaced 24 point italic.", 20, 70);
 		
 		//Color colors [] = new Color[];
 		
 		
 		//g.setColor (colors[rng.nextInt(colors.length)]);
 		//g.setFont (new Font ("Serif", Font.BOLD + Font.ITALIC,18));
 		//g.drawString (g.getFont().getName() + " " + g.getFont().getSize() + "point bold intalics", 20 , 110);
 		
	}
	
	public static void main (String args []){
		JFrame frame = new JFrame ("Using fonts");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FontSizeColor font = new FontSizeColor ();
		frame.add(font);
		frame.setSize(420, 170);
		frame.setVisible(true);
	}
	
	//String[]array = new String [2];
	//array = {"Serif", "Arial"};
	
	
	//g.setFont(new.Font (array[random.nextInt(array.length)];font.PLAIN;12)
}