package org.example;

public class FinalDemo {
    //MANDATORY
    //if i use final keyword and dont assign value to the field, I'll get error
    //e.g. for the below greetings, i'll get error if I dont assign value of "hello"
    final String greetings="Hello Everyone";//final keyword with a field
    //now no one can change its value

    void test(){
        /*greetings="Hello Guys";*/
        //error because cannt change the VALUE of Final (no more changes accepted)

        //final with variable
        final int hananeAge=16;
        //hananeAge=30; //error here
    }

}
