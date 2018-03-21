
public class Shell {

public void ShellSort (){
		
		System.out.println();
		
		//int Shell []= new int [Vin.size()]; // creates Shell array, to be sorted by Shell, and sets array length equal to ArrayList size
		//int Shell [] = {6,2,7,3,9,4,5,8,1};
		int Shell [] = {9,8,7,6};
		Car here = new Car (null, null, 0);

		/*for(int i=0; i< Vin.size();i++) {
			here = ((Car) Vin.get(i)); // goes to the object at i
			int v = here.getVin(); // gets out the vin at this object
			Shell[i]= v; // add this vin to Shell
			//System.out.println(v+ "BlEh");
		}// end for, adding to array
		/*/
		//quidquid latine dictum sit, altum videtur = anything said in Latin seems profound
		
		// Sort for Array Shell
		for (int gap = (Shell.length/2); gap >0; gap = gap == 2?1 : (int) (gap/2.2)){ // find the gap to compare on
			//System.out.println(gap +"Hio" + Shell [0]); 
			
			for (int i=gap; i<Shell.length; i++){ // compare on that gap
				int temp = Shell[i];// make vin number
				int j = i;
				for (; j >= gap && temp < Shell [j-gap]; j-=gap){ // yet another one but this one does not get brackets?
					Shell[j] = Shell[j-gap];
				}// end third for loop
				Shell [j] = temp;
			}// end second for
		}// end first really long for
		
		for (int i = 0; i < Shell.length; i++){
			System.out.println (Shell [i]);
		}
		
	}// end for of going through Array
} // end for going through ArrayList		
	//}//end method
//}// end class



/*
//prints out the Make, model, and vin in order by vin number
for (int i=0; i<Shell.length; i++){ // goes through each element in the ordered array
	//System.out.println(Shell[i] + "sorted?"); // sorts all but the first element?
	for (int j=0; j<Vin.size(); j++){ // looks for the corresponding vin number in the Arraylist, by going through every one
		here = ((Car) Vin.get(j)); // goes to the object at j
		int v = here.getVin(); // gets out the vin in this object
		String m = here.getMake(); // gets out the make in this object
		String o = here.getModel(); // gets out the model in this object
		
		if(v == Shell[i]){ // seeing if the vin in the Shell array matches the vin in array list
			//Print.add (Vin.get(j));
			//System.out.println(i);
			System.out.println(m + " " + o + " " + v); // printing it out if it does
			Vin.remove(j); // removing it if it does so that if there are two matching vin numbers it will not give back one of them twice
		}// end if
	*/