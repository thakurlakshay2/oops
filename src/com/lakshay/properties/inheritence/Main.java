package com.lakshay.properties.inheritence;

//1. Single Inheritance
//2. Multilevel Inheritance
//3. Multiple inheritance -  not allowed in JAVA , due to issue of same member of class issue , the child when asking
    //for that member of both parents java doesn't know what to do , SOLUTION:- interfaces
//4. Hierarchical Inheritance - one class inherited by multiple classes
//5. Hybrid Inheritance - Mix of single and multiple inheritance (NOT in JAVA check interface lecture)

//final keyword can be used to prevent inheritance , when a class is final all it's method becomes implicitly final also
public class Main {
    public static void main(String[] args) {
        Box box=new Box();
//        System.out.println(box.l+" -- "+box.w+" -- "+box.h); //private member error

        //Box weight inherited properties of box class ,
        BoxWeight box3=new BoxWeight(2,4,3,24);

        System.out.println(box3.h+" -- "+box3.w+" -- "+box3.weight);

        Box box5=new BoxWeight(2,3,4,8);
        System.out.println(box5.h); //able to access box height and width , but try to access "weight"
//        System.out.println(box5.weight);//it will show error
        //NOTE: type of the reference variable determines what members of a class  can be accessed , not the type of the object

        //there are many variable in both parent and child classes
        //you are given access to var that are in the ref type  i.e. BoxWeight
        //hence you can access the variables
        //that means that the ones you are trying to access should be initialized
        //but here when the object itself is of type parent class how will you call the constructor of the child class
//        BoxWeight box6=new Box(2,3,4); //Error : your are referencing child to a parent


        BoxPrice boxp=new BoxPrice();

    }
}
