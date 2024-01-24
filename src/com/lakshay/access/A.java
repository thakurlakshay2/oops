package com.lakshay.access;

//You can access private property using getters and setters
//Private - only in this file
//Public accessible everywhere
//What i we don't write anything - Default - Not able to access outside package
public class A {
   private int num;
    String name;
    int[] arr;

    public int getters(){
        return num;
    }
    public void setters(int num){
        this.num=num;
    }
    public A(int num,String name){
        this.num=num;
        this.name=name;
        this.arr=new int[num] ;
    }
}
