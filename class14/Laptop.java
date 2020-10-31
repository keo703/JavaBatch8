package com.syntax.class14;

public class Laptop {
    String make;
    String model;
    int storage;
    int RamCapacity;
    String color;
    String processor;
    String GPU;

    void playMovies() {

    }

    {
        System.out.println("Playing movies");
    }

    void browseInternet() {

    }

    {
        System.out.println("browsing the Internet");
    }
    void makeVideoCall(String contact){
        System.out.println("Video Calling to "+contact);
    }
    public String getModel() {
        return model;
    }
}