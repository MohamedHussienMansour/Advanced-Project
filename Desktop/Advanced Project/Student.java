/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Course;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KHALID
 */

public class Student extends Person {
    private String id;
    private String studentStatus;
    private final List<Course> courses;

    // Constructor
    public Student(String name, String num, String address, String gender, String nationality, String id, String studentStatus) {
        super(name, num, address, gender, nationality);
        setId(id);
        setStudentStatus(studentStatus);
        this.courses = new ArrayList<>();
    }

    // Getters and Setters
    
    public void setId(String id) throws IllegalArgumentException {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid ID: ID cannot be empty.");
        }
        this.id = id;
    }
        
    public void setStudentStatus(String studentStatus) throws IllegalArgumentException{
        if (studentStatus == null || (!studentStatus.equalsIgnoreCase("rich") && 
                                      !studentStatus.equalsIgnoreCase("middle") && 
                                      !studentStatus.equalsIgnoreCase("poor"))) {
            throw new IllegalArgumentException("Invalid student status: Status must be 'rich', 'middle', or 'poor'.");
        }
        this.studentStatus = studentStatus;
    }

    public String getStudentStatus() {
        return studentStatus;
    }

    // Methods for course management
    public void addCourse(Course course) {
        if (course == null || course.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid course: Course name cannot be empty.");
        }
        courses.add(course);
    }

    public void removeCourse(Course course) {
        if (course == null || course.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid course: Course name cannot be empty.");
        }

        if (!courses.contains(course)) {
            throw new IllegalArgumentException("Course not found: The specified course does not exist in the list.");
        }
        courses.remove(course);
    }

    public List<Course> getCourses() {
        return new ArrayList<>(courses);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Student ID: " + id + "\n" +
               "Student Status: " + studentStatus + "\n" ;
    }
}