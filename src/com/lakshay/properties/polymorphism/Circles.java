package com.lakshay.properties.polymorphism;

public class Circles extends Shapes{
    @Override
    void area(){
        System.out.println("Pie * radius* radius");
    }
}
