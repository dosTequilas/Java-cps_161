package classDemo;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
	private int hoursWorked;
	private int hourlyRate;
	
	public static void announcement() {
		System.out.println("Hello from HourlyEmployee class");
	}
	
	
	public HourlyEmployee(String name, LocalDate hiredDate, int hoursWorked, int hourlyRate) {
		super(name, hiredDate); // has to be the first line in constructor
//		setName(name);
//		setHiredDate(hiredDate);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
//	public String toString() {
//		return "name: " + getName() 
//		+ " hiredDate: " + getHiredDate() 
//		+ " hoursWorked: " + hoursWorked 
//		+ " hourlyRate: " + hourlyRate; 
//		return super.toString() + " hoursWorked: " + hoursWorked 
//		+ " hourlyRate: " + hourlyRate;  // means going to the base class
//		
//	}
		
	@Override
	public String toString() {
		return "HourlyEmployee [hoursWorked=" + hoursWorked + ", hourlyRate=" + hourlyRate + ", toString()="
				+ super.toString() + "]";
	}

	
	public void displayPay() {
		System.out.println("pay info: " + hourlyRate * hoursWorked);
	}
	
	public int getHoursWorked() {
		return hoursWorked;
	}


	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

}
