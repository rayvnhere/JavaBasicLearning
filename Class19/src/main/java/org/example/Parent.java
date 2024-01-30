package org.example;

public class Parent {

    void marry(){
        System.out.println("marry the girl we like");
//if child doesnt like this method
    }
    void sleep(){
        System.out.println("sleeep 6 hours");
    }
}

class Karimi extends Parent{
    //implementing OWN DECISION i.e. method lol
    //EXACT same methodName, method, void everything
    // child wrote its own same EXACT method and thats ACCEPTED
    void marry(){//child methods doesnt effect parents method
        System.out.println("I want to marry Scarlet Johnson");
    }
}


class Tester{
    public static void main(String [] args){
         Karimi k= new Karimi();
         k.marry();
         k.sleep();//cuz child inherits everything from Parent



    }
}