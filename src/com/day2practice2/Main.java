package com.day2practice2;

import java.util.Scanner;
public class Main {
    public static void main(String... args){
        System.out.println("Enter username");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();

        //for age
        int userAge=0;
        boolean isAgeCorrect = false;
        while(!isAgeCorrect){
            try {
                System.out.println("Enter userage");
                userAge = Integer.parseInt(sc.nextLine());
                isAgeCorrect = true;
            }
            catch (NumberFormatException e){
                System.out.println("invalid input for age. Please enter again");
            }
        }

        char userGender='\0';
        boolean isGenderCorrect = false;
        while(!isGenderCorrect){
            try{
                System.out.println("Enter gender (M/F): ");
                userGender = sc.nextLine().charAt(0);
                if(userGender=='M'||userGender=='F'){
                    isGenderCorrect = true;
                }
                else{
                    throw new IllegalArgumentException("character is not m or f");
                }
            }
            catch (IllegalArgumentException e){
                System.out.println("invalid character "+e);
            }
        }

        String userContactNo = "";
        //long userContactNo=0;
        boolean isContactNoCorrect = false;
        while (!isContactNoCorrect){
            try {
                System.out.println("Enter user phone no");
                /*userContactNo = Integer.parseInt(sc.next());*/
                userContactNo = sc.next();
                String regex = "\\d+";
                if(userContactNo.matches(regex)) {
                    isContactNoCorrect = true;
                }
                else{
                    throw new IllegalArgumentException("Enter only digits");
                }

            }
            catch (Exception e){
                System.out.println("Please enter phone no in valid form"+e);
            }
        }

        Marathon user1 = new Marathon(userName,userAge,userGender,userContactNo);



    }
}
