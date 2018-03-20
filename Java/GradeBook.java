//package smcm.COSC130.Webster;

import java.util.Scanner;

public class GradeBook {
	public static String fname;
	public static String lname;
	public static int grade [] = new int [10];
	public int sum;

	public double computeAdverage (int n){ //average method with n initially = 0
		if ( grade[n] == grade[9]){  // when n gets to the 10th place in the array, place 9
			sum  = (sum + grade[9])/2; // it finds the final adverage grade
			System.out.println(" " + sum + " "); // and prints it out
			return n; // return whatever it does not need to be used
		}else{
			sum = (sum + grade[n])/2; // finds the adverage grade as it goes 
			return printGrades(n +1); // increases n so it will  make its way from the first grade to the last
		}
	}
	
	public double printGrades (int n){ // printing method
		if ( grade[n] == grade[9]){ // when n gets to the 10th place in the array, place 9
			System.out.print(" Avg: " + grade [0]); // it prints out the grade at this place
			return n;
		}else{
			System.out.print (grade[n]);  // prints out the grade at this place in the array
			return printGrades(n +1); // increases n so it will  make its way from the first grade to the last
		}
	}
	
	
	//setters and getters all that might ever need to be used
	public void setFirst (String f){
		fname = f;
	}
	
	public String getFirst (){
		return fname;
	}
	
	public void setLast (String l){
		fname = l;
	}
	
	public String getLast(){
		return lname;
	}
	
	public void setGrade (int g []){
		grade = g;
	}
	
	public int getGrade(){
		return grade [n];
	}
	
	public static void main (String args []){
		
		GradeBook gb = new GradeBook (); // trying to be able to call the rest of the class
		
		Scanner input = new Scanner (System.in); // add scanner
		
		int size; // size of the class
		int n = 0;
		
		System.out.println ("How many in the class?"); // ask for the size to of the class
		size = input.nextInt(); // set size of class
		
		do { // there is at least one person in your class 
			System.out.println ("First Name"); // ask for person's first name
			fname = input.nextLine(); // set  first name
			System.out.println ("Last Name"); // ask for last name
			lname = input.nextLine(); // set last name
		
			for (int p = 0; p < 10; p++){ // must ask for 10 grades and starts with grade 0
				System.out.println ("Grade"); // ask for grade
				grade[p] = input.nextInt(); // set grade at place p in the array
			}
			
			System.out.print(lname + ", " + fname); // prints out last then first name of the person
			gb.printGrades(n); // calls print grade method
			gb.computeAdverage(n); // calls average method so it can be printed out
			
			size --; // decrease the size of the class after done with one person and goes on to the next person
		}while (size > 0); // goes through all the people in the class
		
		
	}
	

}