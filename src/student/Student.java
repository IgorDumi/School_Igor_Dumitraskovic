
package student;

import computer.Computer;
import course.Course;


public class Student {
    
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private Course course;
    private Computer computer;
    
//    STUDENT CONSTRUCTORS START\
    
    public Student(){
    this.firstName = "Petar";
    this.lastName = "Petrovic";
    this.yearOfBirth = 1950;
    this.course = new Course();
    this.computer = new Computer();
    
}
    public Student( String firstName, String lastName, int yearOfBirth, Course course, Computer computer){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.course = course;
        this.computer = computer;
    }
    
    
    
    //    STUDENT CONSTRUCTOR END
    
    
    public void info(){
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Year of Birth: " + this.yearOfBirth);
        System.out.println("Name: " + this.course.getName());
        System.out.println("Code Name: " + this.course.getCodeName());
        System.out.println("Number of Clases: " + this.course.getNumberOfClasses());
//        this.course.info();
        this.computer.info();
        System.out.println("");
    }

//    SET AND GET START
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    
    public Course getCourse() {
        return course;
    }
    
      public Computer getComputer() {
        return computer;
    }
    //    SET AND GET END

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

  


}
