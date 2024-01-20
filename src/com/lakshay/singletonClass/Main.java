package com.lakshay.singletonClass;

public class Main {
    public static void main(String[] args) {
//        Singleton obj = new Singleton(); // error cannot access private member of the class

        Singleton obj= Singleton.getInstance(); // one instannce

        Singleton obj2= Singleton.getInstance(); // same instannce
        Singleton obj3= Singleton.getInstance(); // same instannce

        //3 copies of the same instance (1 obj , 3 variable accessing it )
    }
}
