package main;

import course.Course;
import student.Student;

        
public class Main {


    public static void main(String[] args) {
        
        Student defaultStudent = new Student();
        defaultStudent.info();
        
        Student igor = new Student();
        igor.setFirstName("Igor");
        igor.setLastName("Dumitraskovic");
        igor.setYearOfBirth(1991);
        
        igor.getCourse().setCodeName("QA-3");
        igor.getCourse().setName("QA");
        igor.getCourse().setNumberOfClasses(33);
        
        igor.getComputer().setHardDrive(500);
        igor.getComputer().setMemory(32);
        igor.getComputer().setOperatingSystem("Windows");
        igor.getComputer().setProcessTact(3.6);
        
        igor.info();
        
        
                
    }
        
    }
    

