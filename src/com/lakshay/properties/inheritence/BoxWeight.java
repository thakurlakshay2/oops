package com.lakshay.properties.inheritence;


//inherited property of class Box, and now Box instance variable are now available to BoxWeight class (BUT,......)
//not all properties and functions are available , "Private" market property and function are not accessable by child
//class
public class BoxWeight extends Box {
    double weight;
    public BoxWeight(){
        this.weight=-1;
//        this.l; error bcz l is from base class and is Private
    }

    BoxWeight(BoxWeight other){
        super(other); //why is this not showing error , as super is of type BOX but we r giving BoxWeight
        // same as Box a=new BoxWeight();  // even thought the object is of type BoxWeight but , reference type matters ,
        //and all values for Box are initialized so it will have access to l,h,w  but not weight
        this.weight=other.weight;

    }
    public BoxWeight(double l,double w, double h, double weight){
        //used to initialise value ion parent class
        super(l,h,w);      //WHAT IS THIS? call the parent class constructor
        //ref ers to constructor of the parent class from which it extends

        //we can use super to access parent class members
        System.out.println(super.w);  //even though "this" can also work , but for ease of understanding and in case of duplicate member names
        //super should be used
        this.weight=weight;
    }

//    @Override
    static void greeting(){
        System.out.println("Box weight greetinh");
    }

}
