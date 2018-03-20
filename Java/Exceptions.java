import java.util.*;

public class Exceptions {
	public static int dividesXY (int x, int y) throws Exception{
		int answer = 0;
		try{
			answer = x/y;
		}catch (ArithmeticException e){
			System.out.println("Divided by 0, NO");
		}
	 	return answer;
	}
	
	public static void main (String args []){
		Scanner in = new Scanner (System.in);
		int number;
		int number2;
		try{
			System.out.print("Enter a number");
			number = in.nextInt();
			System.out.print ("enter another number");
			number2 = in.nextInt();
			System.out.println (number + " divided by " + number2 + " is " + dividesXY(number,number2));
		}catch (InputMismatchException e){
			System.out.println ("Error, enter int");
		}catch (Exception e){
			e.printStackTrace();
		}
		finally {
			System.out.println ("Goodbye!");
		}
	}

}
