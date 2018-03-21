
public class Quick {
	public void Quick(){
		//System.out.print("HERE");
		//int Quick [] = {6,2,7,3,9,4,5,8,1}; // array
		int Quick [] = {9,8,7,6};
		//int Temp []= new int [Quick.length];// creat temp array to hold values, that is the same size as the rest of the arrays
		
		QuickSort(Quick, 0, Quick.length-1);// call MergeSort method to sort the array
		//insertionSort (Quick, 0, Quick.length);
		
		//System.out.println (Merge.length + "length");
		
		for (int i = 0; i < Quick.length; i++){
			System.out.println (Quick [i]); // print out sorted array
			//System.out.println (Temp [i]);
		}
	}
	
	public void insertionSort (int Insert [], int low, int high){
	
		for (int i = 1; i < Insert.length; i++){
			int temp = Insert [i];
			int j = i;
			for (; j >= i && Insert [j-1] > temp; j--){
				Insert [j] = Insert [j-1];
			}
				Insert [j] = temp;
		}
	}

	
	public void QuickSort (int Quick [], int low, int high){
		if (low + 6 > high){ // cutoff = 6
		/*	
			 for (int i = 1; i < Quick.length; i++){
			      int j = i;
			      int temp = Quick[i];
			      while ((j > 0) && (Quick[j-1] > temp)){
			        Quick[j] = Quick[j-1];
			        j--;
			      }
			      Quick[j] = temp;
			    }
		/*/	
			for (int i = 1; i < Quick.length; i++){ // go through the length
				int temp = Quick [i]; // set aside
				int j = i; 
				for (; j > 0 && Quick [j-1] > temp; j--){
					Quick [j] = Quick [j-1]; // move over
				}
					Quick [j] = temp;
			}//*/
		}else{
			// sort high, middle, and low
			int middle = (low + high)/2;
			if (Quick [middle] < Quick [low]){
				int hold = Quick [low];
				Quick [low] = Quick [middle];
				Quick [middle] = hold;
			}
			if (Quick [high] < Quick [low]){
				int hold = Quick [low];
				Quick [low] = Quick [high];
				Quick [high] = hold;
			}
			if (Quick [high] < Quick [middle]){
				int hold =Quick [middle];
				Quick [middle] = Quick [high];
				Quick [high]= hold;
			}
			
			// move pivot (middle) to second to last place
			int hold = Quick [high -1];
			Quick [high - 1] = Quick [middle];
			Quick [middle]= hold;
			 
			// set pivot
			int pivot = Quick [high - 1];
			
			int i, j;
			for (i = low, j = high-1;;){
				while(Quick [i] < pivot)
					i++;
				while(Quick [j] > pivot)
					j--;
				if (i >= j)
					break;
				hold = Quick [i];
				Quick [i] = Quick [j];
				Quick [j]= hold;	
			}
			
			hold = Quick [i];
			Quick [i] = Quick [high-1];
			Quick [high-1]= hold;	
			
			QuickSort (Quick , low, i-1); // sort small elements
			QuickSort (Quick , i+1, high); // sort larger elements
		}
	}
}
