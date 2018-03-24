import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Car {

	/*The Car Class:  The car class will contain three fields: make, model and vin.  Make and model are Strings 
and vin is an integer.  Make sure that you include get and set methods for all three of these as well as a 
useful constructor.  You do not need to code your own comparator.  You will compare two cars by their vin 
number only. 
*/
	
	private String make;
	private String model;
	private int vin;

	
	public Car (String m, String o, int v){
		make = m;
		model = o;
		vin = v;
	}
	
	public void setMake (String m){
		make = m;
	}
	public String getMake (){
		return make;
	}
	public void setModel (String o){
		model = o;
	}
	public String getModel (){
		return model;
	}
	public void setVin(int vin) {
		this.vin = vin;
	}

	public int getVin() {
		return vin;
	}

}
