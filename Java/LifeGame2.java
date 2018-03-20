import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class LifeGame2 {

	// initialize everything
	public int [][] DisplayArray;// = new int [25][25]; // initialize array but do not set it equal to anything because then when it is called it will be all zeros not what it is set to later
	public int [][] WorkArray= new int [26][26]; // initialize array, this will not be sent therefore you can and should say how many spaces it has 
	public int possible = 0; 
	public Scanner input;
	public int n;
	public char k;
	public String s = "";
	
	public void openFile(){
		
		// open file and scan in info
		try{
			//input = new Scanner (new File("input.txt")); // creates file "input.txt" or will rewrite existing file
			File inFile = new File("input.txt");
			input = new Scanner(inFile);
			//for (int i = 0; i < 25; i ++){
				//s = input.nextLine();
				//System.out.println(s);
			//}
		}catch (SecurityException securityException){ // catch errors
			System.err.println ("You do not have the write access to this file.");
			System.exit(1);
		}catch (FileNotFoundException fnf){// catch errors
			System.err.println ("Trouble opening file");
			System.exit(1);
		}
	}
	
	// read file
	public void readFile(){
		//System.out.println ("I am here!");
		
		while(input.hasNext()){ // while going through line by line do this:
			//System.out.println ("I am here0");
			for (int terabithian = 0; terabithian < 25; terabithian ++){ // go through every line
				s = input.nextLine(); // set every line equal to input
				//s=input.next();
				//System.out.println(s);
				//System.out.println(input.next());
				//System.out.println ("I am here1");
				for (int bridge = 0; bridge < 25; bridge ++){ // go through every column
					//System.out.println ("I am here2");
					if(s.charAt(bridge) == '1'){ // figure out what char is in each spot and use that to set it to 0 or 1
						//System.out.println ("I am here3");
						WorkArray[terabithian][bridge] = 1 ;
					}else{
						WorkArray[terabithian][bridge] = 0 ;
					//System.out.println ("I am here4");
					}
					System.out.print(WorkArray[terabithian][bridge]);
					if ((bridge%25) == 0 ){
						System.out.println();
					}
				}// end inner for
			}// end for
			//DisplayArray = WorkArray; // set 
			//System.out.println ("I am here5");
		//System.out.print(DisplayArray);
		}// end while
	}
	
	// close file
	public void closeFile (){
		if (input != null)
			input.close();
	}
	
//	public void origins (){
	//	while(input.hasNext()){
		//for (int terabithian = 0; terabithian < 25; terabithian ++){
		//	for (int bridge = 0; bridge < 25; bridge ++){
				//input.CharAt[terabithian][bridge] = Double.toString(knows);
			//	WorkArray[terabithian][bridge] = knows ;
	//			DisplayArray = WorkArray;
	//		}// end inner for
	//	}// end for
		//DisplayArray [2][2] = 1;
//	}// end origins
	
	// figure out the generations
	public void life (){
		System.out.println("Marco");
		DisplayArray = WorkArray; // so DisplayArray means something
		// for each spot
		
		// these two for loops should go through every spot in the array
		for (int one = 0; one <= 24; one ++){ 
			for(int each = 0; each <= 24; each++){ 
				
				// these take care of the corners so it won't be out of bounds
				if (each == 0 && one == 0){ // for the upper left most cell
					System.out.println("upper left most");
					if (DisplayArray[each][one + 1] == 1){// right is alive
						possible++;// add one to the total number alive around that cell
					} 
					if (DisplayArray[each + 1][one] == 1){// lower center is alive
						possible++;// add one to the total number alive around that cell
					} 
					if (DisplayArray[each + 1][one + 1] == 1){// lower right is alive
						possible++;// add one to the total number alive around that cell
					} 
				}else 
				if (each == 0 && one == 24){ // for the upper right most cell
					System.out.print("upper right most");
					if (DisplayArray[each][one - 1] == 1){// left is alive
						possible++;// add one to the total number alive around that cell
					} 
					if (DisplayArray[each + 1][one - 1] == 1){// lower left is alive
						possible++;// add one to the total number alive around that cell
					} 
					if (DisplayArray[each + 1][one] == 1){// lower center is alive
						possible++;// add one to the total number alive around that cell
					} 
				} else
				if (each == 24 && one == 0){ // for the lower left most cell
					System.out.print("lower left most");
					 
					if (DisplayArray[each-1][one] == 1){// upper center is alive
						possible++;// add one to the total number alive around that cell
					} 
					if (DisplayArray[each -1][one + 1] == 1){// upper right is alive
						possible++;// add one to the total number alive around that cell
					} 
					if (DisplayArray[each][one + 1] == 1){// right is alive
						possible++;// add one to the total number alive around that cell
					} 
				} else
				if (each == 24 && one == 24){ // for the lower right most cell
					System.out.print("lower right most");
					if (DisplayArray[each - 1][one - 1] == 1){// upper left is alive
						possible++; // add one to the total number alive around that cell
					} 
					if (DisplayArray[each-1][one] == 1){// upper center is alive
						possible++;// add one to the total number alive around that cell
					} 
					if (DisplayArray[each][one - 1] == 1){// left is alive
						possible++;// add one to the total number alive around that cell
					} 
				}else
					
				// these take care of the sides so they won't be out of bounds	
				if (each == 0){ //x=0, left most column
					System.out.println("left column");
					if (DisplayArray[each-1][one] == 1){// upper center is alive
						possible++;// add one to the total number alive around that cell
					} 
					if (DisplayArray[each -1][one + 1] == 1){// upper right is alive
						possible++;// add one to the total number alive around that cell
					} 
					if (DisplayArray[each][one + 1] == 1){// right is alive
						possible++;// add one to the total number alive around that cell
					} 
					if (DisplayArray[each + 1][one] == 1){// lower center is alive
						possible++;// add one to the total number alive around that cell
					} 
					if (DisplayArray[each + 1][one + 1] == 1){// lower right is alive
						possible++;// add one to the total number alive around that cell
					} 
					
				}else
				if (each == 24){//x=25, right most column
					System.out.println("right column");
					if (DisplayArray[each - 1][one - 1] == 1){// upper left is alive
						possible++; // add one to the total number alive around that cell
					} 
					if (DisplayArray[each-1][one] == 1){// upper center is alive
						possible++;// add one to the total number alive around that cell
					} 
					if (DisplayArray[each][one - 1] == 1){// left is alive
						possible++;// add one to the total number alive around that cell
					}
					if (DisplayArray[each + 1][one - 1] == 1){// lower left is alive
						possible++;// add one to the total number alive around that cell
					} 
					if (DisplayArray[each + 1][one] == 1){// lower center is alive
						possible++;// add one to the total number alive around that cell
					} 
				}else
				if (one == 0){ // y=0, top row - fixed
					System.out.println("top row");
					if (DisplayArray[each][one - 1] == 1){// left is alive
						possible++;// add one to the total number alive around that cell
					} 
					if (DisplayArray[each][one + 1] == 1){// right is alive
						possible++;// add one to the total number alive around that cell
					} 
					if (DisplayArray[each + 1][one - 1] == 1){// lower left is alive
						possible++;// add one to the total number alive around that cell
					} 
					if (DisplayArray[each + 1][one] == 1){// lower center is alive
						possible++;// add one to the total number alive around that cell
					} 
					if (DisplayArray[each + 1][one + 1] == 1){// lower right is alive
						possible++;// add one to the total number alive around that cell
					} 
				}else
				if (one == 24){ // y=25, bottom row - fixed
					System.out.println("bottom");
					if (DisplayArray[each - 1][one - 1] == 1){// upper left is alive
						possible++; // add one to the total number alive around that cell
					} 
					if (DisplayArray[each-1][one] == 1){// upper center is alive
						possible++;// add one to the total number alive around that cell
					} 
					if (DisplayArray[each -1][one + 1] == 1){// upper right is alive
						possible++;// add one to the total number alive around that cell
					} 
					if (DisplayArray[each][one - 1] == 1){// left is alive
						possible++;// add one to the total number alive around that cell
					} 
					if (DisplayArray[each][one + 1] == 1){// right is alive
						possible++;// add one to the total number alive around that cell
					} 
				}else if(one > 0){
					
					System.out.print(WorkArray[each][one]);
					if ((one%25) == 0 ){
						System.out.println();
					}
					
					// this is for the middle section, not sides or corners
				if (DisplayArray[each - 1][one - 1] == 1){// upper left is alive
					possible++; // add one to the total number alive around that cell
				} 
				if (DisplayArray[each-1][one] == 1){// upper center is alive
					possible++;// add one to the total number alive around that cell
				} 
				if (DisplayArray[each -1][one + 1] == 1){// upper right is alive
					possible++;// add one to the total number alive around that cell
				} 
				if (DisplayArray[each][one - 1] == 1){// left is alive
					possible++;// add one to the total number alive around that cell
				} 
				if (DisplayArray[each][one + 1] == 1){// right is alive
					possible++;// add one to the total number alive around that cell
				} 
				if (DisplayArray[each + 1][one - 1] == 1){// lower left is alive
					possible++;// add one to the total number alive around that cell
				} 
				if (DisplayArray[each + 1][one] == 1){// lower center is alive
					possible++;// add one to the total number alive around that cell
				} 
				if (DisplayArray[each + 1][one + 1] == 1){// lower right is alive
					possible++;// add one to the total number alive around that cell
				} 
				
				// figure out if indivigual cell is alive based on how many around it are alive
				if (possible >= 4){ // if it is over crowded
					WorkArray[each][one] = 0; // it is dead
				}
				if (possible == 3){ // if there are three
					WorkArray[each][one] = 1; // it is alive
				}
				if (possible == 2 && DisplayArray[each][one] == 1){ // if there are three
					WorkArray[each][one] = 1; // it can stay alive
				}
				if (possible == 2 && DisplayArray[each][one] == 0){ // if there are three
					WorkArray[each][one] = 0; // it is still dead
				}
				if (possible <= 1){ // if nobody is around
					WorkArray[each][one] = 0; // it is dead
				}
				}
			}// end inner for
		}// end for
		DisplayArray = WorkArray; // set DisplayArray equal to WorkArray
	}// end life

	public int[][] getWorkArray() { // send to GUI
		return WorkArray;
	}

	public int[][] getDisplayArray() { //send to GUI
		return DisplayArray;
	}
	
}// end all
