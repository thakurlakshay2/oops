package packages.a;

import static packages.ab.Message.message;
public class Greeting {
    public static void main(String[] args){
        message(); //using the code writen in package ab in package a

        //on runtime java will find all the public packages in import message file.
    }
}
