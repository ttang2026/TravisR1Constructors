/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.coursedetails;

/**
 *
 * @author TTang2026
 */

public class CourseDetails {
    public static void main(String[] args) {
            
        // Creating courses utilizing the constructor
        Course course1 = new Course("AP Computer Science A", "AP CS A", "Mr. Nelson", 5);
        Course course2 = new Course("AP Calculus BC", "AP Calc BC", "Mr. Dahms", 5);
            
        // Creating a course using the name only constructor
        Course course3 = new Course("AP Chemistry");
            
        course3.setCourseCode("AP Chem");
        course3.setInstructorName("Mrs. Herndon");
        course3.setPointsTotal(5);
            
        // Printing out the course details
        System.out.println(course1);
        System.out.println(course2);
        System.out.println(course3);
            
    }
}

    class Course {
    
        private String title;
        private String courseCode;
        private String instructorName;
        private int pointsTotal;
    
    // Full Constructor
    public Course(String title, String courseCode, String instructorName, int pointsTotal) {
        
        this.title = title;
        this.courseCode = courseCode;
        this.instructorName = instructorName;
        this.pointsTotal = pointsTotal;
    }
    
    // Constructor with title only
    public Course(String title) {
        
        this.title = title;
        this.courseCode = "";
        this.instructorName = "";
        this.pointsTotal = 0;
    }
    

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public int getPointsTotal() {
        return pointsTotal;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public void setPointsTotal(int pointsTotal) {
        this.pointsTotal = pointsTotal;
    }
    
     // toString method
    @Override
    public String toString() {
        return "Course Title: " + title + "\n" +
               "Course Code: " + courseCode + "\n" +
               "Total Points: " + pointsTotal + "\n" +
               "Instructor: " + instructorName + "\n";
    }
}


