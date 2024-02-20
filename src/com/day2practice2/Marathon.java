package com.day2practice2;

public class Marathon {
    private String userName;
    private int userAge;
    private char userGender;
    private String userContactNo;

    public Marathon(String userName,int userAge,char userGender,String userContactNo){
        this.userAge = userAge;
        this.userContactNo = userContactNo;
        this.userGender = userGender;
        this.userName = userName;
        System.out.println("object created successfully...");
    }

}
