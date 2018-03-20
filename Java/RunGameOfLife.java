import javax.swing.JFrame;

public class RunGameOfLife {

    public static void main(String[] args) {

        DisplayGameOfLife dgol = new DisplayGameOfLife();
        dgol.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dgol.setSize(500,500);
        dgol.setVisible(true);
    }
}