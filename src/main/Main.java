package main;

import computer.Computer;
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
        
        Course qaCourse = new Course();
        qaCourse.setName("QA Course");
        qaCourse.setCodeName("QA2019");
        qaCourse.setNumberOfClasses(22);
        
        Computer pentium4 = new Computer();
        pentium4.setOperatingSystem("Windows XP");
        pentium4.setHardDrive(250);
        pentium4.setMemory(4);
        pentium4.setProcessTact(1.2);
        
        Student nesa = new Student();
        nesa.setFirstName("Nesa");
        nesa.setLastName("Gladijator");
        nesa.setYearOfBirth(1977);
        
        nesa.setCourse(qaCourse);
        nesa.setComputer(pentium4);
        nesa.info();
        
        Student maja = new Student("Maja", "Zmaj", 1980, qaCourse, pentium4);
        maja.info();
    }
        
    }
    
