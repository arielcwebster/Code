//Ariel Webster
// COSC 201

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class In {

	String make1;
	String model1;
	int vin1;
	int number = 0;

	ArrayList <Car> Shell = new ArrayList <Car>();
	ArrayList <Car> Merge = new ArrayList <Car> ();
	ArrayList <Car> TempMerge = new ArrayList <Car> ();
	ArrayList  <Car> Quick = new ArrayList <Car> ();
	ArrayList  <Car> TempQuick = new ArrayList <Car> ();
	
	public void in (){
	
		//try {
			
		int a = 3;
		int b = 2;
		
		while (a > b){ // loop so that it continues to ask for makes, models, and vins till user enters done
			
			Scanner input = new Scanner (System.in);
			
			System.out.print ("Please enter a car make (quit to quit):");
			make1 = input.nextLine();
			
			for (int i = 0; i<make1.length(); i++){ // see if any of the letters in make are actually numbers or symbole in disguise 
				switch (make1.charAt (i)){
				  case '0':
					  number = 1;
				    case '1':
				      number = 1;
				    case '2':
				    number = 1;
				    case '3':
				    	number = 1;
				    case '4':
				    	number = 1;
				    case '5':
				    	number = 1;
				    case '6':
				    	number = 1;
				    case '7':
				    	number = 1;
				    case '8':
				    	number = 1;
				    case '9':
				    	number = 1;
				    case ')':
					  number = 1;
					case '(':
				      number = 1;
					case '*':
				    	number = 1;
					case '&':
				    	number = 1;
					case '^':
				    	number = 1;
					case '%':
				    	number = 1;
					case '$':
					   	number = 1;
					case '#':
					  	number = 1;
					case '@':
					  	number = 1;
					case '!':
					   	number = 1;
				}//end switch
			} // end for loop
			
			if(make1.equals("quit")){ // if make is quit get out, get out NOW
				a = 1;	
			}else if (number == 1){ // putting the switch statement into practice and making sure those pesky numbers don't get in
				System.out.println ("A real word without numbers or strange characters Please");
				number = 2;
			}else{
				
				System.out.print ("Please enter a car model:");
				model1 = input.nextLine();
			
				try{
				System.out.print ("Please enter a vin:");
				vin1 = input.nextInt();
				}catch (InputMismatchException me){ // if the user puts in a number with a decimal point or a letter
					System.out.println ("Sorry a round, whole, number is what is required."); // tells the user something is wrong
				} // end try catch
				
				Car c = new Car (make1, model1, vin1);
				
				// adding to ArrayLists
				Shell.add(c);
				Merge.add(c);
				TempMerge.add(c);
				Quick.add(c);
				TempQuick.add(c);
				
			}// end if 
		}// end while
		
	//	}catch (ArrayIndexOutofBoundsExeception e) {
		
		if (Shell.size()== 0) // if there is nothing to sort there is simply nothing to sort. What a shame.
			System.out.println ("There were no cars to Sort. So we got out of all the work. Yay.");
	}// end in

	public void ShellSort (){ // not like shells on a beach really
		
		if (Shell.size() != 0){ // makes sure there is stuff to do
		
		long starttime = System.currentTimeMillis();// Start Timer
		
		System.out.println();
		
		Car here = new Car (null, null, 0);
		
		// Sort for Array Shell
		for (int gap = (Shell.size()/2); gap >0; gap = gap == 2?1 : (int) (gap/2.2)){ // find the gap to compare on
				for (int i = gap; i < Shell.size(); i++){ // compare on that gap
				
				here = ((Car) Shell.get(i)); // set temp to shel at i
				int j = i;
				
				for (; j >= gap && ((here.getVin()) < (Shell.get(j - gap).getVin())); j-=gap){ // yet another one but this one does not get brackets?
				//for (; j >= i && (here.getVin()) < there.getVin(); j--){ // yet another one but this one does not get brackets? // 627394581 236457189 
					Shell.set(j, Shell.get(j - gap)); // set Shell at j to Shell at j-gap
				}// end third for loop (j)
				Shell.set(j, here); // set Shell at j to tempshell at i-gap
				}// end second for (i)
		}// end first really long for (gap)
	
		// printing
		System.out.println("Sorted by Shell Sort:");
		
		for (int i = 0; i < Shell.size(); i++){ // go through print out
			
			here = ((Car) Shell.get(i)); // goes to the object at place
			System.out.println (here.getMake() + "   " + here.getModel  () + "   " + here.getVin());
		}
		
		long elapsed = System.currentTimeMillis() - starttime; // Stop Timer
		System.out.println ("This sort took " + elapsed + " nano second(s)");
		
		System.out.println();
		System.out.println("**************");
		System.out.println();
		
		} // end if that made sure there were elements in the array
	}// end ShellSort
	

	public void MergeArray (){
		
		if (Merge.size() != 0){
		
		long starttime = System.currentTimeMillis();// Start Timer
		
		Car here = new Car (null, null, 0);
		
		
		MergeSort(Merge, TempMerge, 0, Merge.size()-1);// call MergeSort method to sort the array
		
		// put back into ArrayList
		System.out.println("Sorted by Merge Sort:");
		
		//prints out the Make, model, and vin in order by vin number
			for (int j=0; j<Merge.size(); j++){ // looks for the corresponding vin number in the Arraylist, by going through every one
				here = ((Car) Merge.get(j)); // goes to the object at j
				int v = here.getVin(); // gets out the vin in this object
				String m = here.getMake(); // gets out the make in this object
				String o = here.getModel(); // gets out the model in this object
					System.out.println(m + "   " + o + "   " + v); // printing it out if it does
		
			}// end for of going through Array
			
			long elapsed = System.currentTimeMillis() - starttime; // Stop Timer
			System.out.println ("This sort took " + elapsed + " nano second(s)");
		
		System.out.println();
		System.out.println("**************");
		System.out.println();
		
		} // end if that made sure there were elements in teh array
	}// end MergeArray

	
	public void MergeSort (ArrayList <Car> Merge, ArrayList <Car> TempMerge, int left, int right){
		 
		if (left < right){
			int center = (left + right)/2;
			MergeSort(Merge, TempMerge, left, center);
			MergeSort(Merge, TempMerge, center + 1, right);
			Merge (Merge, TempMerge, left, center + 1, right);
		}
	}


	public void Merge (ArrayList <Car> Merge, ArrayList <Car> TempMerge, int left, int center, int right){
		
		Car now = new Car (null, null, 0);
		
		int lastl = center - 1;
		int moving = left;
		int num = right - left + 1;
		
		while ((left <= lastl) && (center <= right)){ // while both sections have elements left to compare
			
			now = ((Car) Merge.get(left));
			int l = now.getVin(); 
			
			now = ((Car) Merge.get(center));
			int c = now.getVin(); 
			
			if (l <= c){ // compare the next one in the left section with the next from the right section 
				TempMerge.set(moving, Merge.get(left)); // set TempMerge value at moving to Merge value at left
				moving = moving + 1; // move up where you will add next time
				left = left +1; // move up the comparison in merge
			}else{
				TempMerge.set(moving, Merge.get(center)); // set TempMerge value at moving to Merge value at left
				moving =  moving + 1;
				center = center + 1;
			}
		}

		while (left <= lastl){ // taking care of the leftovers on the left
			TempMerge.set(moving, Merge.get(left));
			left = left + 1;
			moving = moving + 1;
		}
		while (center<= right){// taking care of the leftovers on the right
			TempMerge.set(moving, Merge.get(center));
			center = center + 1;
			moving = moving + 1;
		}
		
		//back to original array
		for (int i=0; i < num; i++){ // putting more sorted array values into the array you will try to sort agian or will print out
			Merge.set(right, TempMerge.get(right));
			right = right - 1;
		}
	}
	
	
	public void QuickSort (){
		
		if (Quick.size() != 0){
			
		long starttime = System.currentTimeMillis();// Start Timer
		
		Car forever = new Car (null, null, 0);		
		
		Quick(Quick, 0, Quick.size()-1);// call MergeSort method to sort the array
		
		System.out.println("Sorted by Quick Sort:");
		
		for (int i = 0; i < Quick.size(); i++){
			forever =  ((Car) Quick.get(i));
				
			System.out.println(forever.getMake() + "   " + forever.getModel() + "   " + forever.getVin()); // printing it out if it does
		}
		
		long elapsed = System.currentTimeMillis() - starttime; // Stop Timer
		System.out.println ("This sort took " + elapsed + " nano second(s)");
		
		}// end if that made sure there were elements to be sorted
	}// end QuickSort

				
	public void Quick (ArrayList <Car> Quick, int low, int high){
		
		Car forever = new Car (null, null, 0);
		
		if (low + 6 >= high){ // cutoff = 6
			
			// insertion sort, said in a strained British accent, I don't know why
				for (int i = 1; i < Quick.size(); i++){
				
					forever =  ((Car) Quick.get(i));
					int j = i;	
			
					for (; j > 0 && Quick.get(j-1).getVin() > forever.getVin(); j--){	
						Quick.set(j, Quick.get(j - 1)); //j = j-1
					}// end third for loop
					Quick.set(j, forever);
				}// end for loop
			
		}else{
		
			
		// sort high, middle, and low
			int middle = (low + high)/2;
			
			forever =  ((Car) Quick.get(high));
			int h = forever.getVin();
			
			forever =  ((Car) Quick.get(middle));
			int m = forever.getVin();
			
			forever =  ((Car) Quick.get(low));
			int l = forever.getVin();
			
			if (m < l){
				TempQuick.set(0, Quick.get(low));//temp = l
				Quick.set(low, Quick.get(middle)); // l = m
				Quick.set(middle, TempQuick.get(0)); // m = temp
			}
			if (h < l){
				TempQuick.set(0, Quick.get(low)); // temp = l
				Quick.set(low, Quick.get(high)); // l = h
				Quick.set(high, TempQuick.get(0)); //  h = temp
			}
			if (h < m){
				TempQuick.set(0, Quick.get(middle)); // temp = m
				Quick.set(middle, Quick.get(high)); // m = h
				Quick.set(high, TempQuick.get(0)); // h = temp
			}			
			// move pivot (middle) to second to last place
			TempQuick.set(0, Quick.get(high-1));// temp = h-1
			Quick.set(high-1, Quick.get(middle)); // h-1 = m
			Quick.set(middle, TempQuick.get(0));// m = temp
						 
			// set pivot
			forever =  ((Car) Quick.get(high-1));
			int pivot = forever.getVin();
			
			int i, j;
			
			for (i = low, j = high-1;;){
			
				forever =  ((Car) Quick.get(j));
				int right = forever.getVin();
				
				forever =  ((Car) Quick.get(i));
				int left = forever.getVin();
				
				while(left < pivot && i < Quick.size()) // while vins on the left of the array are less than the pivot keep searching for those that are not
					i++; // move onto the next object to compare with pivot, going right
				while(right > pivot && j >= Quick.size()) // same as the previous while exept right and greater than
					j--; // going left
				if (i >= j){
					break;
			}
				TempQuick.set(0, Quick.get(i)); // temp = i
				Quick.set(i, Quick.get(j)); // i = j
				Quick.set(j, TempQuick.get(0)); // j = temp
			}// end comparing for loop
			
			TempQuick.set(0, Quick.get(i-1)); // temp = i
			Quick.set(i-1, Quick.get(high-1)); // i = h-i
			Quick.set(high-1, TempQuick.get(0)); // h-i = temp
			Quick (Quick, low, j-1); // sort small elements
			Quick (Quick, i+1, high); // sort larger elements
		}// end if else
	}// end Quick
} // end In Class
