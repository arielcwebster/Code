//package smcm.COCS130.Webster;

import java.util.*;//bring in the necessary tools

public class FinalVersion {// it begins, might have said that last time
		
				public static int row; // declare row
				public int space; // declare space
				public static int [][] level; // put somewhere where row and space have not been defined as 0 or don't define level

				public void ask (){ // begin method to as for what row they want and set row = to that number
					Scanner in = new Scanner (System.in); // input scanner so comp can see what the user puts in
					System.out.print ("What row would you like to magically appear?"); // ask for row
					row = in.nextInt(); // set row # = row
					space = row; // set space to row
					level = new int [row][space]; // set array
				} // end ask
				
				public int [][] Recursion(int level[][], int row){ // main calculations method
						if (row == 1) { //base case or row =0
							level [0][0] = 1;// base case/first row = 1
							return level; // here is what it is
						}else{
							level = Recursion (level, row-1); // actual recursive step
							for (int i = 0; i < row; i++){	
							if (i == 0 || i == row-1){// one on the ends or just row
									level [row-1][i] = 1; //  first spot in row - one
								}else{
									level[row-1][i] = ((level[row-2][i-1]) + (level[row-2][i])); // calculations
								}// end else
							}// end for loop
							return level; // here is what it is
				    	}// end original if else
				} // end Recursion
				
				public void print(){ // print it all out
					String bleh = ""; // initialize
					int gob;//initialize
						for (int i = 0; i<row; i++){ // print array
							for (int n = row - i; n>=0; n--){ // print spaces before a line
								System.out.print("    "); // spaces before row
							}// end inner for
							for(int k = 0; k<=i; k++){ // print spaces 
								System.out.print("      ");// spaces in between numbers
								gob = level[i][k]; // array, row by row
								System.out.print(gob); // printing array
							}// end second inner for
							System.out.println();// make it so it prints out rows not just one long line
						}// end initial for loop
				}// end print method
				

			public static void main (String args []){
				FinalVersion fv = new FinalVersion ();// bring it into the main method
				int done = 0; // initialize
				do{// this is what is going to happen till the user says stop
					try {
						fv.ask(); // This method works - Yay, the one that asks for the row and then sets row, space, and level = to their respective value
						fv.Recursion (level, row); // calls Recursion method
						fv.print(); // calls print method
						System.out.println();
					}catch (InputMismatchException me){ // if the user puts in a number with a decimal point or a letter
						System.out.println ("Sorry a round number is what is required, please try again."); // tells the user something is wrong
					} // end try catch
				}while (done == 0); // ends do while and sets conditions for while		
			}// end main
		} // final end