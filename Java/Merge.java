
public class Merge {
	public void Timer(){
		int Merge [] = {6,2,7,3,9,4,5,8,1}; // array
		int Temp []= new int [Merge.length];// creat temp array to hold values, that is the same size as the rest of the arrays
			
		MergeSort(Merge, Temp, 0, Merge.length-1);// call MergeSort method to sort the array
		
		//System.out.println (Merge.length + "length");
		
		for (int i = 0; i < Merge.length; i++){
			System.out.println (Merge [i]); // print out sorted array
			//System.out.println (Temp [i]);
		}
	}

		public void MergeSort(int Merge [],int Temp [], int left, int right){
			//System.out.println(right +"right here 1     " + Merge.length);
			if (left < right){
				int center = (left + right)/2;
				//System.out.println(right +"right here 2     ");
				MergeSort(Merge, Temp, left, center);
				//System.out.println(right +"right here  3    ");
				MergeSort(Merge, Temp, center + 1, right);
				//System.out.println(right +"right here  4    ");
				Merge (Merge, Temp, left, center + 1, right);
				
				//MergeSort();
			}
		}

		public void Merge(int Merge[], int Temp[], int left, int center, int right){
			
			int lastl = center - 1;
			int moving = left;
			int num = right - left + 1;
	  
			while ((left <= lastl) && (center <= right)){ // while both sections have elements left to compare
				// compare the next one in the left section with the next from the right section 
				
				if (Merge[left] <= Merge[center]){
					moving = moving + 1; // move up where you will add next time
					left = left +1; // move up the comparison in merge
				}else{
					Temp[moving] = Merge[center];
					moving =  moving + 1;
					center = center + 1;
				}
			}

			while (left <= lastl){ // taking care of the leftovers on the left
				Temp[moving] = Merge[left];
				left = left + 1;
				moving = moving + 1;
			}
			while (center<= right){// taking care of the leftovers on the right
				Temp[moving] = Merge[center];
				center = center + 1;
				moving = moving + 1;
			}
			
			//back to original array
			for (int i=0; i < num; i++){ // putting more sorted array values into the array you will try to sort agian or will print out
				System.out.println("Num" + num + "   i" + i + "      right" + right + "     ");
				Merge[right] = Temp[right];
				right = right - 1;
			}
		}
	
}
