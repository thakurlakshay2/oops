package com.lakshay.properties.polymorphism;

//1. Compile-time polymorphism (Static polymorphism) - Achieved via method overloading - same method name
        //but argument , type, return type or ordering can be different ,,SEE constructor example in inheritance file
//2. Runtime polymorphism (Dynamic polymorphism) - achieved by method overriding

//We can use he "final" keyword to prevent overriding , cannot override a final method
public class Main {
    public static void main(String[] args) {
        Shapes shape= new Shapes();
        Circles circle= new Circles();
        Square square=new Square();
        shape.area();
        circle.area();
        square.area();


        //above example is of overridiing

        Shapes circle2 =new Circles();

        circle2.area(); //QQ ; how is it still accessing the circle 2 area , as we have learned , type is used from
        // the reference type  not object type
        //BCZ the type is of Shape , but the value or similar method "area" will contain object value from Circles

    }

}
