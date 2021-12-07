package com.company;

public class GradeBook {

    private String courseName;
    private String instructor;

    public GradeBook(String name,String instructorName){
        courseName = name;
        instructor = instructorName;
    }
    public GradeBook(String name){
        courseName = name;

    }

    public void setCourseName(String name){
        courseName = name;
    }

    public String getInstructor() {
        return instructor;
    }

    public String getCourseName(){
        return courseName;
    }
    public void setInstructor(String instructorName){
        instructor = instructorName;
    }

    public void displayMessage(){
        System.out.printf("Welcome to the grade book for\n%s!\n", getCourseName());
        System.out.println("This course is presented by -->  " + instructor);
    }
}
