package com.syntax.class14;

import java.util.Scanner;

public class TaskInClass {
    public static void main(String[] args) {
//        Accept username, password and confirm password from a user and check following requirements:
//        Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
//        Password should be minimum 8 characters, if less → message=”Password is too short”.
//        Password cannot contain username if so, → message=”Password cannot contain username”.
//        Password should match confirmed password, if not  → message=“Passwords do not match”.
//        Only after all requirements met → message “Your username and password has been created”

        String userName;
        String passWord;
        String confirmedPassword;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter username");
        userName=scan.nextLine();
        System.out.println("Please enter password");
        passWord= scan.nextLine();
        System.out.println("Please confirmed password");
        confirmedPassword= scan.next();


        if(userName.isEmpty() || passWord.isEmpty()) {
            System.out.println("Username and Password cannot be empty.");
        }else if(passWord.length()<8){
            System.out.println("Password is too short");
        }else if(passWord.contains(userName)){
            System.out.println("Password cannot contain username");
        }else if(!passWord.contains(confirmedPassword)){
            System.out.println("Password do not match");
        }else{
            System.out.println("Your username and password has been created");
        }
    }
}
