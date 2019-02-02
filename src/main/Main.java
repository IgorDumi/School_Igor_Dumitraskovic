package main;

import computer.Computer;
import course.Course;
import student.Student;

public class Main {

    public static void main(String[] args) {

        Student defaultStudent = new Student();
        defaultStudent.info();

//        Student igor = new Student();
//        igor.setFirstName("Igor");
//        igor.setLastName("Dumitraskovic");
//        igor.setYearOfBirth(1991);
//
//        igor.getCourse().setCodeName("QA-3");
//        igor.getCourse().setName("QA");
//        igor.getCourse().setNumberOfClasses(33);
//
//        igor.getComputer().setHardDrive(500);
//        igor.getComputer().setMemory(32);
//        igor.getComputer().setOperatingSystem("Windows");
//        igor.getComputer().setProcessTact(3.6);
//
//        igor.info();
//
        Student nesa = new Student();
        nesa.setFirstName("Nenad");
        nesa.setLastName("Gladijator");
        nesa.setYearOfBirth(1989);

        nesa.getCourse().setCodeName("PHP123");
        nesa.getCourse().setName("PHP");
        nesa.getCourse().setNumberOfClasses(40);

        nesa.getComputer().setHardDrive(1000);
        nesa.getComputer().setMemory(16);
        nesa.getComputer().setOperatingSystem("Linux");
        nesa.getComputer().setProcessTact(2.6);

//        Course phpCourse = new Course();
//
//        phpCourse.setCodeName("PHP123");
//        phpCourse.setName("PHP");
//        nesa.setCourse(phpCourse);
//        nesa.getCourse().setNumberOfClasses(40);

    }

}
