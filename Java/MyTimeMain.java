
public class MyTimeMain {
	
	public static void main(String[] args) {
		MyTimes mt = new MyTimes();
		
		System.out.print("The initial universal time is: ");
		System.out.println(mt.toUniversalString());
		System.out.print("The initial statndard time is: ");
		System.out.println(mt.toString());
		System.out.println();
		
		mt.setTime(13, 27, 6);
		
		System.out.print("Universal after setTime: ");
		System.out.println(mt.toUniversalString());
		System.out.print("Standard after setTime: ");
		System.out.println(mt.toString());
		System.out.println();
		
		mt.setTime(99,99,99);
		System.out.print("Universal after bad setTime: ");
		System.out.println(mt.toUniversalString());
		System.out.print("Standard after bad setTime: ");
		System.out.println(mt.toString());
		System.out.println();

	}


}
