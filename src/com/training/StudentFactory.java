package com.training;

public class StudentFactory {
    /**
     *
     * this method returns student object based on student type passed
     */
    public static Student getStudent(String studentType){
        if(studentType.equalsIgnoreCase("hosteller"))   return new Hosteller();
        else return new DayScholar();
    }
}
