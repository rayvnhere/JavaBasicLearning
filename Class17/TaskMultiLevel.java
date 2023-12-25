package org.example;
/*
Write program for multilevel inheritance
where class Z inherits from class Y
and Class Y inherits from Class X.
 */

public class TaskMultiLevel {
    public static void main(String [] args){
        Z z=new Z();
        z.alphabet="last word";
    }
    }

class X{
    String alphabet;
}
class Y extends X{

}

class Z extends Y{

}
