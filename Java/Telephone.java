//package smcm.COCS130.Webster;

import java.util.*;
import java.io.FileNotFoundException;
import java.lang.SecurityException;
//import com.deitel.jgtp7.ch14.AccountRecord;

public class Telephone {
	
	public String number;
	public char letter1;
	public char letter2;
	public char letter3;
	//public int whynot;
	public int dialed;
	private Formatter output; // formatter is a class that writes to a file
	
	public void openFile(){
		try{
			output = new Formatter ("clients.txt"); // creates file "clients.txt" or will rewrite existing file
		}catch (SecurityException securityException){
			System.err.println ("You do not have the write access to this file.");
			System.exit(1);
		} catch (FileNotFoundException filesNotFoundException){
			System.err.println ("Error creating file.");
			System.exit(1);
		}
	}
	
	public void userin (){
		//FileRecord record = new FileRecord();
		Scanner input = new Scanner (System.in);
		//System.out.println("Phone Number?");
		output.format("%c", letter3, "\n");
		number = input.nextLine();
	}


	public void WhatNumber (){
        switch (dialed){ 
        	case '2': 
        		letter1 = 'A';
        		letter2 = 'B';
        		letter3 = 'C';
        		break;
        	case '3':
        		letter1 = 'D';
        		letter2 = 'E';
        		letter3 = 'F';
        		break;
        	case '4': 
        		letter1 = 'G';
        		letter2 = 'H';
        		letter3 = 'I';
        		break;
        	case '5':
        		letter1 = 'J';
        		letter2 = 'K';
        		letter3 = 'L';
        		break;
        	case '6': 
        		letter1 = 'M';
        		letter2 = 'N';
        		letter3 = 'O';
        		break;
        	case '7':
        		letter1 = 'P';
        		letter2 = 'R';
        		letter3 = 'S';
        		break;
        	case '8': 
        		letter1 = 'T';
        		letter2 = 'U';
        		letter3 = 'V';
        		break;
        	case '9':
        		letter1 = 'W';
        		letter2 = 'X';
        		letter3 = 'Y';
        		break;
        		}
	}
			
		public void calculations (){
			//System.out.print (number.charAt(0));
			FileRecord record = new FileRecord();
			
			for (int a = 0; a <3; a++){
				//System.out.print("Work, now!");
		        	for (int d = 0; d <3; d++){
		        		//System.out.print("now!");
		        		for (int g = 0; g <3; g++){
		        			for (int j = 0; j <3; j++){
		        				//System.out.print("Work, now!");
		        		        	for (int m = 0; m <3; m++){
		        		        		//System.out.print("now!");
		        		        		for (int p = 0; p <3; p++){
		        		        			for (int t = 0; t <3; t++){
		        		        				//System.out.print("Work, now!");
		        			
		        		switch (a){ 
			        	case 0: 
			        		//System.out.print("Work, now!");
			        		dialed = number.charAt(0);
			        		WhatNumber();
			        		//System.out.print(letter1);
			        		//record.setFirst (letter1);
			        		output.format("%c", letter1);
			        		break;
			        	case 1:
			        		dialed = number.charAt(0);
			        		WhatNumber();
			        		//System.out.print(letter2);
			        		output.format("%c", letter2);
			        		break;
			        	case 2: 
			        		dialed = number.charAt(0);
			        		WhatNumber();
			        		//System.out.print(letter3);
			        		output.format("%c", letter3);
			        		break;
		        		}
		        		switch (d){ 
			        	case 0: 
			        		dialed = number.charAt(1);
			        		WhatNumber();
			        		//System.out.print(letter1);
			        		output.format("%c", letter1);
			        		break;
			        	case 1:
			        		dialed = number.charAt(1);
			        		WhatNumber();
			        		//System.out.print(letter2);
			        		output.format("%c", letter2);
			        		break;
			        	case 2: 
			        		dialed = number.charAt(1);
			        		WhatNumber();
			        		//System.out.print(letter3);
			        		output.format("%c", letter3);
			        		break;
		        		}//close switch
		        		switch (g){ 
			        	case 0: 
			        		dialed = number.charAt(2);
			        		WhatNumber();
			        		//System.out.print(letter1);
			        		output.format("%c", letter1);
			        		break;
			        	case 1:
			        		dialed = number.charAt(2);
			        		WhatNumber();
			        		//System.out.print(letter2);
			        		output.format("%c", letter2);
			        		break;
			        	case 2: 
			        		dialed = number.charAt(2);
			        		WhatNumber();
			        		//System.out.print(letter3);
			        		output.format("%c", letter3);
			        		break;
		        		}
		        		switch (j){ 
			        	case 0: 
			        		dialed = number.charAt(3);
			        		WhatNumber();
			        		//System.out.print(letter1);
			        		output.format("%c", letter1);
			        		break;
			        	case 1:
			        		dialed = number.charAt(3);
			        		WhatNumber();
			        		//System.out.print(letter2);
			        		output.format("%c", letter2);
			        		break;
			        	case 2: 
			        		dialed = number.charAt(3);
			        		WhatNumber();
			        		//System.out.print(letter3);
			        		output.format("%c", letter3);
			        		break;
		        		}
		        		switch (m){ 
			        	case 0: 
			        		dialed = number.charAt(4);
			        		WhatNumber();
			        		//System.out.print(letter1);
			        		output.format("%c", letter1);
			        		break;
			        	case 1:
			        		dialed = number.charAt(4);
			        		WhatNumber();
			        		//System.out.print(letter2);
			        		output.format("%c", letter2);
			        		break;
			        	case 2: 
			        		dialed = number.charAt(4);
			        		WhatNumber();
			        		//System.out.print(letter3);
			        		output.format("%c", letter3);
			        		break;
		        		}
		        		switch (p){ 
			        	case 0: 
			        		dialed = number.charAt(5);
			        		WhatNumber();
			        		//System.out.print(letter1);
			        		output.format("%c", letter1);
			        		break;
			        	case 1:
			        		dialed = number.charAt(5);
			        		WhatNumber();
			        		//System.out.print(letter2);
			        		output.format("%c", letter2);
			        		break;
			        	case 2: 
			        		dialed = number.charAt(5);
			        		WhatNumber();
			        		//System.out.print(letter3);
			        		output.format("%c", letter3);
			        		break;
		        		}
		        		switch (t){ 
			        	case 0: 
			        		dialed = number.charAt(6);
			        		WhatNumber();
			        		//System.out.print(letter1);
			        		output.format("%c", letter1);
			        		break;
			        	case 1:
			        		dialed = number.charAt(6);
			        		WhatNumber();
			        		//System.out.print(letter2);
			        		output.format("%c", letter2);
			        		break;
			        	case 2: 
			        		dialed = number.charAt(6);
			        		WhatNumber();
			        		//System.out.print(letter3);
			        		output.format("%c", letter3);
			        		break;
		        		}
		        		output.format("\n");
		        		System.out.println();
	        						} //closing t for 
	        					} // closing p for
	        				}// closing m for
	        			}// closing j for
	        		}// closing g for
				} // closing d for
			}// closing a for	
			
	//		output.format(record.getFirst());
	}// closing method
	        		
	public void closeFile (){
		if (output != null)
			output.close();
	}
	
	public static void main (String args []){
		PlayingWith pw = new PlayingWith();
		pw.openFile();
		pw.userin();
		//pw.WhatNumber();
		pw.calculations();
		pw.closeFile();
	}
}