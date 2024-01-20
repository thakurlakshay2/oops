package com.lakshay.staticExample;

public class Main {
    public static void main(String[] args){
        Human lakshay=new Human(22,"lakshay",22000,false);
        Human utkarsh=new Human(22,"utkarsh",26000,true);
        System.out.println(lakshay.population);
        System.out.println(utkarsh.population);  //try using class name to access static variable  to remove warning
        System.out.println(Human.population);

    }
    static void fun(){
//        greeting();    //error :Static method cannot access non static data
        //requires an instance to access,but function "fun()"  here does not

    }

    void greeting(){
//        fun();  //this is fine bcz fun is static
        System.out.println("Am i being accessed");
    }
}
