//package smcm.COCS130.Webster;

public class FileRecord {
	
	public char first;
	public char second;
	public char third;
	public char fourth;
	public char fifth;
	public char sixth;
	public char seventh;
	
	public FileRecord (char one, char two, char three, char four, char five, char six, char seven){
	setFirst(one);
	setSecond(two);
	setThird(three);
	setFourth(four);
	setFifth(five);
	setSixth(six);
	setSeventh(seven);
	}
	
	public FileRecord(){
		
	}

	public void setFirst (char one){
		first = one;
	}
	
	public void setSecond (char two){
		second = two;
	}
	
	public void setThird (char three){
		third = three;
	}
	
	public void setFourth (char four){
		fourth = four;
	}
	public void setFifth (char five){
		fifth = five;
	}
	
	public void setSixth (char six){
		sixth = six;
	}
	
	public void setSeventh (char seven){
		seventh = seven;
	}
	
	public int getFirst(){
		return first;
	}
	
	public int getSecond (){
		return second;
	}
	
	public int getThird (){
		return third;
	}
	
	public int getFourth (){
		return fourth;
	}
	
	public int getFifth (){
		return fifth;
	}
	
	public int getSixth (){
		return sixth;
	}
	
	public int getSeventh (){
		return seventh;
	}
}