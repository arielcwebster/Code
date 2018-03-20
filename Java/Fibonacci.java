
public class Fibonacci {
	
	public long fib (long number){ // the recursive way
		if ((number == 0) ||(number ==1))
			return number;
		else
			return fib (number - 1) + fib (number - 2);
	}
	
	 public long iterativeFib (long number){ 
		 long one_before = 1;
		 long two_before = 1;
		 long answer = 0;
		 for (int i = 1; i <= number; i++){
			 answer = one_before+ two_before;
			 two_before = one_before;
			 one_before = answer;
		 }
		 return answer;
	 }
	
	 public void displayFib(){
		 for (int counter = 0; counter <= 10; counter++)
			 System.out.println("Fibinacci of " + counter + "is:" + fib(counter));
	}
	

}
