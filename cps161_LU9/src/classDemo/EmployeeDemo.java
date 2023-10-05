package classDemo;

import java.time.LocalDate;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee employee = new Employee("Evgeniy", LocalDate.now()); // cannot extentiate any object in an abstract class
//		System.out.println(employee);
		
		Employee hourlyE = new HourlyEmployee("Sam", LocalDate.of(2022, 1, 1), 80, 30);
		System.out.println(hourlyE.toString());
		Employee.announcement(); // static method = late binding (hourlyE. = employee; Employee. = employee
//		hourlyE.displayPay();
		
		Employee salaryE = new SalaryEmployee("Genn", LocalDate.of(2020, 1, 1), 100_000);
		System.out.println(salaryE);
//		salaryE.displayPay();
	}

}
