 package classDemo;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	// default constructor (no params)
	public Time() {
		hour = 1;
		minute = 1;
		second = 1;
	}
	
	//specific values constructor (with params)
	public Time(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	//copy constructor (copy params from another object)
	public Time(Time otherTime) {
		 setHour(otherTime.getHour());
		 setMinute(otherTime.getMinute());
		 setSecond(otherTime.getSecond());
		 //hour = otherTime.hour;
	}
	
	public String toString() {
		return "HH: " + hour + " MM: " + minute + " SS: " + second;
	}
	
	public boolean equals(Time otherTime) {
		return hour == otherTime.hour && minute == otherTime.minute && second == otherTime.second;
	}
	
	
	
	public void displayTime() {
		System.out.println("HH: " + hour + "MM: " + minute + "SS: " + second);
	}
//	public int getHour() {
//		return hour;
//	}
//	public void setHour(int hour) {
//		this.hour = hour;
//	}
//	public int getMinute() {
//		return minute;
//	}
//	public void setMinute(int minute) {
//		this.minute = minute;
//	}
//	public int getSecond() {
//		return second;
//	}
//	public void setSecond(int second) {
//		this.second = second;
//	}
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if (hour >= 0  && hour <= 23) {
			this.hour = hour;
		} else {
			System.out.println("invalid input");
		}
	}
	
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if (minute >= 0  && minute < 60) {
			this.minute = minute;
		} else {
			System.out.println("invalid input");
		}
	}
	 
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if (second >= 0  && second < 60) {
			this.second = second;
		} else {
			System.out.println("invalid input");
		}
	}

}
// compareHeight(jingHioght, samHeight)

//jing.compareHeight(sam)
// sam.compareHeight(jing)