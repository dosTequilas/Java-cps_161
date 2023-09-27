package bookClass;

import java.time.LocalDate;

public class Author {
	private String name;
	private String lastName;
	private LocalDate birthday;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		LocalDate date = LocalDate.parse(birthday);
		this.birthday = date;
	}

	public Author(String name, String lastName, LocalDate birthday) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return name + " " + lastName + " (birthday: " + birthday + ")";
	}

}
