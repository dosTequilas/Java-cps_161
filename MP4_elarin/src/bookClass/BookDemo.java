package bookClass;

import java.time.LocalDate;

public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date1 = LocalDate.of(1978, 2, 13);
		LocalDate date2 = LocalDate.of(1975, 10, 7);
		
		Book book1 = new Book("SQL Server 2022 for Developers", new Author("Joel", "Murach", date1), "1943873062", 41);
		Book book2 = new Book("Cybersecurity For Dummies", new Author("Joseph", "Steinberg", date2), "1119867185", 23.99);
		
		System.out.println(book1);
		System.out.println(book2);
		
		if (book1.equals(book2)) {
			System.out.println("It's the same book.");
		} else {
			System.out.println("They are not the same book.");
		}
		
		
	}
}
