package classDemo;

import java.time.LocalDate;

public abstract class Employee { //not a concrete class anymore
	private String name;
	private LocalDate hiredDate;
	
	//protected
	//package
	 	
	public static void announcement() {
		System.out.println("Hello from employee class");
	}
	
	public abstract void displayPay();
	
	public Employee(String name, LocalDate hiredDate) {
		this.name = name;
		this.hiredDate = hiredDate;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getHiredDate() {
		return hiredDate;
	}

	public void setHiredDate(LocalDate hiredDate) {
		this.hiredDate = hiredDate;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", hiredDate=" + hiredDate + "]";
	}
	
//	public boolean equals(Employee employee) {    //not overriding, but overload
//		return name.equals(employee.name) && hiredDate.equals(employee.hiredDate);
//	}
	
	public boolean equals(Object object) {
		if (object == null) {
			return false;
		} else if (getClass() != object.getClass()) {
			return false;
		} else {
			Employee employee = (Employee)object; // casting
			return name.equals(employee.name) && hiredDate.equals(employee.hiredDate);
		}
	}
}
