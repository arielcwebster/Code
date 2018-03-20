import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.Choice;

public class DisplayGameOfLife extends JFrame implements ActionListener {
  
    private BorderLayout layout;
    JTextArea[][] grid;
    JButton start =    new JButton("START");
    JButton reset = new JButton("RESET");
    Choice box; // http://www.bitstorm.org/gameoflife/code/org/bitstorm/gameoflife/
                //GameOfLifeControls.html
    public static final String ONE = "1";
    public static final String THREE = "3";
    public static final String FIVE = "5";
    public static final String TEN = "10";
    int lemur = 0;
    int array2[][];
    GameOfLife gol = new GameOfLife();
    ReadGameFile rgf = new ReadGameFile();
    
    public DisplayGameOfLife() {
        
        super("Game Of Life");
        layout = new BorderLayout();
        setLayout(layout);
       
        box = new Choice();
        box.addItem(ONE);
        box.addItem(THREE);
        box.addItem(FIVE);
        box.addItem(TEN);
       
        start.addActionListener(this);
        reset.addActionListener(this);
      
        grid = new JTextArea[25][25];
      
        JPanel buttonJPanel = new JPanel();
        JPanel gridJPanel = new JPanel();
        GridLayout gridLayout1 = new GridLayout(25,25,1,1);
        gridJPanel.setLayout(gridLayout1);
      
        buttonJPanel.add(start);
        buttonJPanel.add(reset);
      
        add(box, BorderLayout.NORTH);
        add(buttonJPanel, BorderLayout.SOUTH);
        
        
      
        for (int i = 0; i < 25; i++){
            for (int j = 0; j < 25; j++) {
                grid[i][j] = new JTextArea();
                //grid[i][j].setBackground( new Color(120,120,120));
                gridJPanel.add(grid[i][j]);
            }
        }
        add(gridJPanel, BorderLayout.CENTER);
       
        box.addItemListener (
                new ItemListener() {
               
                    public void itemStateChanged(ItemEvent e) {
                        String arg = (String) e.getItem();
                        if(ONE.equals(arg)) {
                            lemur = 1;
                                                    }
                        else if (THREE.equals(arg)) {
                            lemur = 3;
                        }
                        else if (FIVE.equals(arg)) {
                            lemur = 5;
                        }
                        else if (TEN.equals(arg)) {
                            lemur = 10;
                        }
                    }
                }
        );
    }
  
    public void changeColor() {
        
        array2 = rgf.getArray();
        
        for (int x = 0; x < 25; x++){
            for (int y = 0; y < 25; y++) {
            //    gol.checkLife();
                if (array2[x][y] == 1){
                    grid[x][y].setBackground(Color.MAGENTA);
                }
                if (array2[x][y] == 0){
                    grid[x][y].setBackground(Color.DARK_GRAY);
                }
            System.out.print(rgf.array2[x][y]);
            }
            System.out.println();
        }
        
    }
    

  
    public void actionPerformed (ActionEvent event) {

        ReadGameFile rgf = new ReadGameFile();
        
        if (event.getSource() == start) {
            for (int g = 0; g < lemur; g++) {
                changeColor();
            }
        }
        if (event.getSource() == reset) {
            rgf.openFile();
        }
    }
}