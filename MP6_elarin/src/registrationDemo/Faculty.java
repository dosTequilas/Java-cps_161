package registrationDemo;

class Faculty extends Person {
    private String department;
    private String office;

    public Faculty(String name, int age, String email, String department, String office) {
        super(name, age, email);
        this.department = department;
        this.office = office;
    }

    public boolean equals(Object objectToCompare) {
        if (this == objectToCompare) {
        	return true;
        }
        
        if (objectToCompare == null || getClass() != objectToCompare.getClass()) {
        	return false;
        }
        
        if (!super.equals(objectToCompare)) {
        	return false;
        }
        
        Faculty faculty = (Faculty) objectToCompare;
        if (!department.equals(faculty.department)) {
        	return false;
        }
        
        return office.equals(faculty.office);
    }
    
    public String getDepartment() {
        return department;
    }

    public String toString() {
        return "Faculty{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", email='" + getEmail() + '\'' +
                ", department='" + department + '\'' +
                ", office='" + office + '\'' +
                '}';
    }
}

