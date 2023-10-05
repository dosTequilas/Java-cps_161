package classDemo;

import java.time.LocalDate;

public class SalaryEmployee extends Employee{
	private int salary;
	
	public static void announcement() {
		System.out.println("Hello from SalaryEmployee class");
	}
	
	public SalaryEmployee(String name, LocalDate hiredDate, int salary) {
		super(name, hiredDate); // has to be the first line in constructor
		this.salary = salary;
	}
	
	public SalaryEmployee(String name, int salary) {
		this(name, LocalDate.now(), salary); // super
	}

	public String toString() {
		return super.toString() + " salary: " + salary;
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void displayPay() {
		System.out.println("pay info: " + salary / 24);
	}
}
