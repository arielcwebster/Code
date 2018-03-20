
import java.lang.SecurityException;
import java.util.Scanner;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadGameFile {

	private Scanner input;
    String line;
    int[][] array2;
    int[] array=new int[4];
    
    public void openFile() {
        
        File inFile = new File("input.txt");
        array2  = new int[25][25];
        
        try {
            input = new Scanner(inFile);
        } catch (FileNotFoundException f){
            System.err.println("File not found");
            System.exit(1);
        } catch (SecurityException s){
            System.err.println("You do not have access to this file");
            System.exit(1);
        }

        while(input.hasNext()){
            
            for(int row = 0; row < 25; row++){
                line = input.nextLine();
                for(int col = 0; col < 25; col++){
                    char a = line.charAt(col);
                    if(a == '1'){
                        array2[row][col] = 1;}
                    else if(a == '0'){
                        array2[row][col] = 0;}
                 System.out.println(array2[row][col]);   
                }
            }
        }
        DisplayGameOfLife dgof=new DisplayGameOfLife();
            dgof.changeColor();
    }

    public int[][] getArray() {                    //this returns an empty array, want to return what was set above.
        return array2;
    }
 
    public void closeFile() {
        if (input != null)
            input.close();
    }
}



