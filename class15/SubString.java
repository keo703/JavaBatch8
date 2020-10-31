package com.syntax.class15;

public class SubString {
    public static void main(String[] args) {
        String name="Can you write the second m too?";
        System.out.println(name.substring(5));
        System.out.println(name.substring(0));
        System.out.println(name.substring(10));
        System.out.println(name.substring(5,10));
        System.out.println(name.substring(5,10)+name.substring(11,17));
    }
}
