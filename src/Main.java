//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //FACTS: JAVA protects it's memory and doesn't allow to be accessed
        //"new: does "dynamic memory allocation"
        //Q: Difference  static and dynamic memory allocation\

        Student lakshay=new Student();

        //Right now obj is initialised but ,"Instance Variables"(rollNo, name and marks) are not;
        System.out.println(lakshay);
        System.out.println(lakshay.name);

        lakshay.marks=92.0f;
        lakshay.name="Lakshay Thakur";

        System.out.println(lakshay.name);

        //Student(); is a constructor;
        //initialization using constructor //
        Student utkarsh= new Student(12,"utkarsh",98.02f);
        utkarsh.greeting();
        utkarsh.changeName("ut2");
        utkarsh.greeting();

        Student random= new Student(utkarsh);
        random.greeting();

        //"reference" does not create new heap memory;
        //only references to old one
        Student reference=random;


    }

   static  class Student{
        int rollNo;
        String name;
        float marks;


     void greeting(){
         System.out.println("Hello my name is "+this.name);
     }

     void changeName(String newName){
         name=newName;
     }
    //constructor overriding default constructor
       //Now we need a way to add values to the declared variable , but How?
       //object by object name will be different we can't do "lakshay.rollNo" bcz this will be for one
       //we can't make new constructor for every new object
       //ANS ---- we use "this" keyword

       Student(){
         //this is how to call a constructor from another constructor
           //internally new Student(12, "random", 100.0f) will happen
           // this (12, "random", 100.0f)
           this.name="";
           this.rollNo=0;
           this.marks=0.0f;
       }
       Student(Student other){

         this.name=other.name;
         this.rollNo= other.rollNo;
         this.marks= other.marks;
       }
       Student (int rollNo,String name,float marks){
           this.rollNo=rollNo;
           this.name=name;
           this.marks=marks;
       }
        //ABOVE is the example of polymorphism

    }
}