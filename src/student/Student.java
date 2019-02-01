
package student;


public class Student {
    
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    
//    STUDENT CONSTRUCTORS START\
    
    public Student(){
    this.firstName = "Petar";
    this.lastName = "Petrovic";
    this.yearOfBirth = 1950;
    
}
    public Student( String firstName, String lastName, int yearOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        
    }
    
    
    //    STUDENT CONSTRUCTOR END
    
    
    public void info(){
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Year of Birth: " + this.yearOfBirth);
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
    
    //    SET AND GET END
    

}
