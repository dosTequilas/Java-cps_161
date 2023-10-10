package registrationDemo;

class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean equals(Object objectToCompare) {
        if (this == objectToCompare) {
        	return true;
        }
        
        if (objectToCompare == null || getClass() != objectToCompare.getClass()) {
        	return false;
        }
        
        Person person = (Person) objectToCompare;
        if (age != person.age)  {
        	return false;
        }
        
        if (!name.equals(person.name)) {
        	return false;
        }
        
        return email.equals(person.email);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}


