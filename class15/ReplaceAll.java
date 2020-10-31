package com.syntax.class15;

public class ReplaceAll {
    public static void main(String[] args) {
        String mix = "31 23 42 41 2 Hello 53 3 World ^***";
        System.out.println(mix.replaceAll("[0-9]", ""));
        System.out.println(mix.replaceAll("[a-z,A-Z]", ""));
        System.out.println(mix.replaceAll("[^ A-Z a-z 0-60]", ""));
        System.out.println(mix.replaceAll("[0-60]", ""));
        System.out.println(mix.replaceAll("[*]", ""));

    }
}