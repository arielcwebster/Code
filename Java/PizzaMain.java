import javax.swing.JFrame;

//package smcm.COSC130.Webster;

public class PizzaMain {
	public static void main(String[] args) {
		PizzaOrder po = new PizzaOrder();
		po.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		po.setSize(350, 200); // width, height
		po.setLocationRelativeTo(null); //centers window
		po.setVisible(true);
	}

}
