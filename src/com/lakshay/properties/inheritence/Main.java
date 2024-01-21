package com.lakshay.properties.inheritence;

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


    }
}
