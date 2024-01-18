public class WrapperExample {
    public static void main(String[] args){
        int a=10;
        int b=20;

        swap(a,b);
        System.out.println(a+" -- "+b);
        //As you can see "a" and "b" didn't swap , bcz in java primitive types are swap by  values  not by reference

        Integer num=45;
        Integer sum=100;
    //int is data type , Integer is class , meaning when passed in swap function will send the reference (but still wouldn't swap)
    //REASON: bcz Integer is "final" class.(this("final") prevents content to be modified)(best for primitive types)
        swap(num,sum);
        System.out.println(num+" -- "+sum);

        final int bonus=2;
        //        bonus=3;  //cannot modify
        //but might now work for reference types , bcz reference memory is in heap that can me modified while variable
        //only stores address which we will not change

        //RULE: final variable has to be initialised..
        A obj;
        //such a high number to basically put load
        for(int i=0;i<1000000000;i++){       //expensive to run this
            obj=new A("randowm name");
        }

    }
    static class A{
        final int num=30;
        String name;

         A(String name){
            this.name=name;
        }

        //destructor (Garbage collection is done automatically in JAVA) but we can tell GC what to do when it is collecting
        @Override
        protected  void finalize() throws Throwable{
            System.out.println("Object is desctoyed");
            //will run when any object of class A is desctoyed
        }

    }
    static void swap (Integer a,Integer b){
        int temp=a;
        a=b;
        b=temp;
    }

}
