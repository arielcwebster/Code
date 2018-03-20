
public class MyTimes {

	
	private int hour;
	private int minute;
	private int second;
	
	//no argument constructor
	public MyTimes(){
		hour = 12;
		minute = 0;
		second = 0;
	}

	public MyTimes(int h){
		setTime(h, 0, 0);
	}
	
	public MyTimes(int h, int m){
		setTime(h, m, 0);
	}
	public MyTimes(int h, int m, int s){
		setTime(h, m, s);
	}
	
	public void setTime(int h, int m, int s){
		hour = (( h >= 0 && h < 24) ? h : 0);
		minute = (( m >= 0 && m < 60) ? m : 0);
		second = (( s >= 0 && s < 60) ? s : 0);
	}
	
	public void setTime(int h, int m){
		hour = (( h >= 0 && h < 24) ? h : 0);
		minute = (( m >= 0 && m < 60) ? m : 0);
		second = 0;
	}
	
	public void setHour(int hour){
		this.hour = hour;
	}
	
	public void setMinute(int minute){
		this.minute = minute;
	}
	
	public void setSecond(int second){
		this.second = second;
	}
	
	public int getHour(){
		return hour;
	}
	
	public int getMinute(){
		return minute;
	}
	
	public int getSecond(){
		return second;
	}
	
	public String toUniversalString(){
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	public String toString(){
		return String.format("%d:%02d:%02d %s", 
				(( hour ==0 || hour == 12) ? 12 : hour % 12),
				minute, second, (hour < 12 ? "AM" : " PM"));
	}
}
