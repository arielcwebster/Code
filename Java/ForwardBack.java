import java.util.*;
public class ForwardBack {

	public int [] array1;
	
	public ForwardBack(){
		array1= new int [5];
	
	array1[0] = 4;
	array1[1] = 6;
	array1[2] = 10;
	array1[3] = 3;
	array1[4] = 5;
	}
	
	public void Forward(int n){
		if (n == 0)
			System.out.print (array1[n] + " ");
		else{
			Forward(n-1);
			System.out.print(" " + (array1[n]));
		}

		
	}
	
	public void Back(int n){
		if (n == 4)
			System.out.print (" " + array1[n]+ " ");
		else{
			Back(n+1);
			System.out.print((array1[n])+ " ");
		}

		
	}
	public static double avg = 34.6;
	
	public static void main (String args []){
		ForwardBack bf = new ForwardBack();
		bf.Forward(4);
		System.out.println();
		bf.Back(0);
		
	}
}
