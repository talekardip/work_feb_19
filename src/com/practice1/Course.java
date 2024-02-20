package com.practice1;

public class Course {
    private String courseName;
    private String courseId;

    public Course(String courseId,String courseName){
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }



}
