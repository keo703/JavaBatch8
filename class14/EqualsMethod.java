package com.syntax.class14;

public class EqualsMethod {
    public static void main(String[] args) {
        String name="Bryan";
        String name2="Bryan";
        String name3="Bob";
        System.out.println(name.equals(name2));
        System.out.println(name2.equals(name3));
        System.out.println(name.equals(name3));

        System.out.println(name==name2);
        System.out.println(name2==name3);
        System.out.println(name==name3);
    }
}
