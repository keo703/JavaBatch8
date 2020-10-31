package com.syntax.Replit;
import java.util.Scanner;
public class rep036 {

    public static void main(String[] args) {
        String a, b;
        int num1, num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two strings");
        a = scan.next();
        b = scan.next();
        System.out.println("Please enter two numbers");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        if ("a" == "b") {
            if (num1 == num2) {
                System.out.println("AND");
            } else {
                System.out.println("OR");
            }
        } else {
            System.out.println("NONE");
        }

    }

}