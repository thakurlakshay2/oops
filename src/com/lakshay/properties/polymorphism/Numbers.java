package com.lakshay.properties.polymorphism;

public class Numbers {
    int sum(int a,int b){
        return a+b;
    }
    int sum(double a,int b){
//        return a+b;
        return 0;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers obj=new Numbers();
        obj.sum(1,2);
        obj.sum(1,2,3);
//        obj.sum(1,2,3,4); //error

    }
}
