package com.syntax.class15;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TasksClass {
    public static void main(String[] args) {
        String mom,dad,gender,baby;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the Moms name");
        mom = scan.nextLine();

        System.out.println("Please enter the dads name");
        dad = scan.nextLine();

        System.out.println("Is it a boy or girl?");
        gender = scan.nextLine();

        if (gender.equalsIgnoreCase("boy")) {
            baby = dad.substring(0,dad.length()/2) + mom.substring(mom.length()/2);
            System.out.println(baby.toUpperCase());
        } else if(gender.equalsIgnoreCase("girl")){
            baby = mom.substring(0, mom.length()/2) + dad.substring(dad.length()/2);
            System.out.println(baby.toUpperCase());
        }else{
            baby="No suggestion";
            System.out.println(baby);
        }

        System.out.println("++++++++++++++***********++++++++++");

        String stringx="Strings";
        int length= stringx.length();
        if (!stringx.isEmpty()) {
            if(length>=3 && length%2!=0){
                System.out.println(stringx.charAt(length/2));
            }
        }

        String x = "Sunday";
        System.out.println(x.substring(5) + x.substring(4, 5) + x.substring(3, 4) + x.substring(2, 3) + x.substring(1, 2) + x.substring(0, 1));
        for (int i = x.length() - 1; i >= 0; i--) {
            System.out.print(x.charAt(i));
        }
    }

        //String x="Sunday";
      //  System.out.println();
    }

