package com.syntax.class14;

import java.sql.SQLOutput;

public class Length {
public static void main(String[]args){
    String name="Bryan";
    int length = name.length();
    System.out.println(name.length());
    name="";
    System.out.println(name.length());
    name="Bryan Galarza";
    System.out.println(name.length());

    if(name.length()>10){
        System.out.println("you are great");
    }
}
}
