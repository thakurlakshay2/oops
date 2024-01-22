package com.lakshay.properties.polymorphism;

public class Triangles extends Shapes{
    //this will run when the obj of triangle is created
    @Override  //This is called annotation
    void area(){
        System.out.println("1/2 * base* height");
    }
}
