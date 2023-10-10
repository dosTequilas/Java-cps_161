package registrationDemo;

class Student extends Person {
    private String major;
    private double gpa;

    public Student(String name, int age, String email, String major, double gpa) {
        super(name, age, email);
        this.major = major;
        this.gpa = gpa;
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
        
        Student student = (Student) objectToCompare;
        if (Double.compare(student.gpa, gpa) != 0) {
        	return false;
        }
        
        return major.equals(student.major);
    }

    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", email='" + getEmail() + '\'' +
                ", major='" + major + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    public void registerCourse(Course course) {
        if (course.canEnrollStudent(this)) {
            course.addStudent(this);
        } else {
            System.out.println("Unable to register for the course: " + course.getCourseName());
        }
    }
}

