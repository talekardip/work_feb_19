package com.practice1;



class CourseTest {

    public static void searchCourse(Course courses[],String key){
        for(Course c:courses){
            if(c.getCourseName().equalsIgnoreCase(key)){
                System.out.println("Course found");
                return;
            }
        }
        System.out.println("Course not found");
    }

    public static void main(String[] args) {
        Course[] courses = new Course[]{
                new Course("CIN123","Finance"),
                new Course("CIN124","Management"),
                new Course("CIN122","Computer")

        };

        searchCourse(courses,"Geography");


    }
}