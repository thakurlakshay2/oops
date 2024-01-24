package com.lakshay.access;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        A obj= new A(10,"Kunal");
        // need to do a few things
        // 1. access the data members
        //2. modify the data members
        ArrayList a=new ArrayList();
//        a.DEFAULT_CAPACITY   //Private data member  , not accessable

        System.out.println(obj.getters());
        obj.setters(12);
        System.out.println(obj.getters());
    }
 }
