package com.lakshay.staticExample;

//in inner class outside classes cannot be static , it will show error, same rules as for instance variable
//and static member cannot access non-static member of a class

//static are resolved during compile time, as they do not req object(runtime execution)
public class InnerClasses {
    static class Test{
        String name;

        public Test(String name){
            this.name=name;
        }

        @Override
        public String toStrin(String name){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Test a=new InnerClasses.Test("lakshau");
        Test b=new Test("ut");

        System.out.println(a.name);
        System.out.println(b.name);

    }
}
