//package smcm.COCS130.Webster;

// Ariel Webster and Charlotte Radomski

import java.util.*;
import java.io.FileNotFoundException;
import java.lang.SecurityException;

public class PlayingWith2 {

			
			public String number;
			public char letter1 = '^';
			public char letter2 = '*';
			public char letter3 = '@';
			public int whynot;
			public int dialed;
			public Formatter output; // formatter is a class that writes to a file
			//public char array [] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','R','S','T','U','V','W','X','Y'};
			public char first;
			public char second;
			
			
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
			//	AccountRecord record = new AccountRecord();
				Scanner input = new Scanner (System.in);
				System.out.print("Phone Number?");
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
				}// closing a for		//System.out.println();
			        		//output.format("%s\n", "");
			        	}
			        		        			
			
			
			public void closeFile (){
				if (output != null)
					output.close();
			}
		
		public static void main (String args []){
			PlayingWith2 pw = new PlayingWith2();
			pw.openFile();
			pw.userin();
			//pw.WhatNumber();
			pw.calculations();
			pw.closeFile();
		}// end main

	
}// end all
