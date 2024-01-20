package com.lakshay.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
static long population; //will be common(same) for all the instance of the class
    //1.  Static can be accessed before any of the object of the class being created
    //2.  and we dont need reference to the object
    static void message(){
        System.out.println("hello");
//        System.out.println(this.age); //not allowed , ---- no "this" as message is used without object
    }
    public Human(int age,String name,int salary,boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        Human.population+=1;    //static should be accessd by class name not "this", just for clarity , convention rules
    }
}
