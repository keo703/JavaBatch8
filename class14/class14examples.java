package com.syntax.class14;

public class class14examples {
public static void main(String[]args){
    Laptop laptop= new Laptop();
    laptop.make="Mac";
    laptop.model="pro 16";
    laptop.storage=1;
    laptop.RamCapacity=16;
    laptop.color="pink";
    laptop.processor="Core i7";
    laptop.GPU="Nvidi RTX 3090 12GB DDR6X";
    laptop.playMovies();
    laptop.browseInternet();
    laptop.makeVideoCall("Bob");
    String model = laptop.getModel();
    System.out.println(model);
}
}
