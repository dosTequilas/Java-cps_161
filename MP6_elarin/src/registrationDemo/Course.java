package registrationDemo;

import java.util.Objects;

class Course {
    private String department;
    private String courseName;
    private int maxClassSize;
    private int currentEnrollmentNumber;
    private Student[] roster;
    private Faculty instructor;

    public Course(String department, String courseName, int maxClassSize) {
        this.department = department;
        this.courseName = courseName;
        this.maxClassSize = maxClassSize;
        this.currentEnrollmentNumber = 0;
        this.roster = new Student[maxClassSize];
        this.instructor = null;
    }

    public void displayRoster() {
        System.out.println("Course Roster for " + courseName);
        for (int i = 0; i < currentEnrollmentNumber; i++) {
            System.out.println("Student: " + roster[i].getName());
        }
    }

    public boolean canEnrollStudent(Student student) {
        return currentEnrollmentNumber < maxClassSize && !isStudentEnrolled(student);
    }

    public void addStudent(Student student) {
        if (canEnrollStudent(student)) {
            roster[currentEnrollmentNumber] = student;
            currentEnrollmentNumber++;
            System.out.println("Student " + student.getName() + " successfully added to " + courseName);
        } else {
            System.out.println("Unable to add student to " + courseName);
        }
    }

    public boolean isStudentEnrolled(Student student) {
        for (int i = 0; i < currentEnrollmentNumber; i++) {
            if (roster[i].equals(student)) {
                return true;
            }
        }
        return false;
    }

    public void assignInstructor(Faculty faculty) {
        if (faculty.getDepartment().equals(department)) {
            instructor = faculty;
            System.out.println("Instructor " + faculty.getName() + " assigned to " + courseName);
        } else {
            System.out.println("Instructor is not from the same department as the course.");
        }
    }

    public String getCourseName() {
        return courseName;
    }
    
    @Override
    public boolean equals(Object objectToCompare) {
        if (this == objectToCompare) {
            return true;
        }
        
        if (objectToCompare == null || getClass() != objectToCompare.getClass()) {
            return false;
        }
        
        Course courseToCompare = (Course) objectToCompare;
        return maxClassSize == courseToCompare.maxClassSize &&
                currentEnrollmentNumber == courseToCompare.currentEnrollmentNumber &&
                department.equals(courseToCompare.department) &&
                courseName.equals(courseToCompare.courseName) &&
                Objects.equals(instructor, courseToCompare.instructor);
    }

    public String toString() {
        String instructorInfo = (instructor != null) ? instructor.getName() : "No instructor assigned";
        return "Course{" +
                "courseName= '" + courseName + '\'' +
                ", department= '" + department + '\'' +
                ", maxClassSize= " + maxClassSize +
                ", currentEnrollmentNumber= " + currentEnrollmentNumber +
                ", instructor= " + instructorInfo +
                '}';
    }
}

