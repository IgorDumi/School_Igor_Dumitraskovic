
package course;

public class Course {
    
    private String name;
    private String codeName;
    private int numberOfClasses;

    
  public Course(){
      this.name = "Java";
      this.codeName = "JV";
      this.numberOfClasses = 35;
  }  
  
  public Course(String name, String codeName, int numberOfClasses){
      this.name = name;
      this.codeName = codeName;
      this.numberOfClasses = numberOfClasses;
      
  }
  
  
  public void info(){
        System.out.println("Name: " + this.name);
        System.out.println("Code Name: " + this.codeName);
        System.out.println("Number of Clases: " + this.numberOfClasses);
    }
    
    
//    GET AND SET START
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }
   
 //    GET AND SET END
    
}
