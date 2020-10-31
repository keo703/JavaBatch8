package com.syntax.class15;

import java.util.Scanner;

public class NewTask {
    public static void main(String[] args) {
//        String x;
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Please type a sentence.");
//        x=scan.nextLine();
//        System.out.println(x.replaceAll(" ", ""));
//        System.out.println("*************************************");

        String str = "!#$GERadfv029348fjasdFAWE";
        String  newString = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str.length());
        System.out.println(newString.length());

        String a="Is it saturday? Is it raining? Do we have a Java Class today?";
        String newA= a.replaceAll("[a-z A-Z]", "");
        System.out.println(newA.length());
    }
}
