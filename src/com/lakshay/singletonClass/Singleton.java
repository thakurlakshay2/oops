package com.lakshay.singletonClass;

//Class that you can create one object of - Singleton class
public class Singleton {
    //private makes sure this constructor is only used in this file. "Singleton class
    private Singleton(){

    }

    private  static Singleton instance;

    static public Singleton getInstance(){
        //check only one object is created
        if(instance==null){
            instance= new Singleton();
        }
        return instance;
    }
    public static void main(String[] args) {


    }
}
