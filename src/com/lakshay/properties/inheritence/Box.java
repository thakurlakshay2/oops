package com.lakshay.properties.inheritence;

public class Box {
    private double l;
    double h;
    double w;


    Box(){
        //WHAT IF i use the super in base class
//        super(); //every class is inherits the object class
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }
    Box(Double side){
        this.h=side;
        this.l=side;
        this.w=side;


    }
    static void greeting(){
        System.out.println("I am in box class");
    }
    Box(Double l,Double h,Double w){
        this.h=h;
        this.l=l;
        this.w=w;
    }

    Box(Box old ){
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }

    public void information(){
        System.out.println(("Runing the box"));
    }


}
