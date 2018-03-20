import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GUI extends JFrame{
	
	private JTextField textfield;
	private JTextField textfield2;
	private JPanel buttonJPanel;
	private JPanel buttonJPanel2;
	private JButton Browse;
	private JButton Browse2;
	private JButton Compute;
	String FILE1 = "";
	String FILE2 = "";
	
	public GUI(){
		super ("Gene Sort");
		GooDesignHandler handler = new GooDesignHandler();
		
		textfield = new JTextField(20);
		textfield.addActionListener( handler );
		textfield2 = new JTextField(20);
		textfield2.addActionListener( handler );
		JLabel data = new JLabel("Data File");
		data.setPreferredSize(new Dimension(100, 30));
		//data.setBackground(Color.green);
		JLabel save = new JLabel("Save File");
		save.setPreferredSize(new Dimension(100, 30));
		//save.setBackground(Color.green);
		Browse = new JButton("Browse");
		Browse.setPreferredSize(new Dimension(100, 30));
		Browse.addActionListener( handler );
		//Browse.setBackground(Color.green);
		Browse2 = new JButton("Browse");
		Browse2.setPreferredSize(new Dimension(100, 30));
		Browse2.addActionListener( handler );
		//Browse2.setBackground(Color.green);
		Compute = new JButton("Compute");
		Compute.setPreferredSize(new Dimension(100, 30));
		Compute.addActionListener( handler );
		//Compute.setBackground(Color.green);
		
		buttonJPanel = new JPanel();
		buttonJPanel2 = new JPanel();
		buttonJPanel.setLayout(new GridLayout(2,3,5,5));
		buttonJPanel2.setLayout(new BorderLayout(5,5));
		buttonJPanel.add(data);
		buttonJPanel.add(textfield);
		buttonJPanel.add(Browse);
		buttonJPanel.add(save);
		buttonJPanel.add(textfield2);
		buttonJPanel.add(Browse2);
		buttonJPanel2.add(Compute, BorderLayout.SOUTH);
		//buttonJPanel.setBackground(Color.RED);
		//buttonJPanel2.setBackground(Color.RED);
		
		add(buttonJPanel2,BorderLayout.SOUTH);
		add( buttonJPanel,BorderLayout.NORTH);
		
		
		
	}
private class GooDesignHandler implements ActionListener
	
	{
		public void actionPerformed( ActionEvent event)
		{
			event.getActionCommand();
		
		if ( event.getSource() == Browse ) {
			JFileChooser fc = new JFileChooser();
			
			int returnVal = fc.showOpenDialog(GUI.this);

	        if (returnVal == JFileChooser.APPROVE_OPTION) {
	            File file = fc.getSelectedFile();
	            FILE1 = file.getPath();;
	           
		textfield.setText( textfield.getText() + FILE1 ) ;
			}
		}
	    if ( event.getSource() == Browse2 ) {

			JFileChooser fc = new JFileChooser();
			
			int returnVal = fc.showOpenDialog(GUI.this);
	        if (returnVal == JFileChooser.APPROVE_OPTION) {
	            File file = fc.getSelectedFile();
	            FILE2 = file.getPath();
	           
		textfield2.setText( textfield2.getText() + FILE2 ) ;
			}
		}
	    if ( event.getSource() == Compute ) {
	    	GUI GD = new GUI();
	    	
	    	///GD.Compute(FILE1, FILE2);
			
	    }
	}
	}
/*
public void Compute(String inputFile, String outputFile){
	inputFile=inputFile.replaceAll("\\\\", "\\\\\\\\");
	outputFile=outputFile.replaceAll("\\\\", "\\\\\\\\");
	ArrayList org=null;
	ParseFile p = new ParseFile();
	try {
		org=p.ParseOrg(inputFile);
	} catch (IOException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	
	
	
	ArrayList<Gene> genes = null;
	try {
		genes = p.Parse(inputFile);
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	SortedList s = new SortedList();
	ArrayList<Gene> sortedGenes = s.sortGenes(genes);
	FormattedList f = new FormattedList();
	String FormattedText=f.Format(sortedGenes, org);
	
	//Save File
	try{
	    FileWriter fstream = new FileWriter(outputFile);
	    BufferedWriter out = new BufferedWriter(fstream);
	    out.write(FormattedText);
	    out.close();
	    }
	catch (Exception e){//Catch exception if any
	      System.err.println("Error: " + e.getMessage());
	    }
	
	

	//System.out.println("File has been saved.");
	System.exit(EXIT_ON_CLOSE);
	
}

*/
}
