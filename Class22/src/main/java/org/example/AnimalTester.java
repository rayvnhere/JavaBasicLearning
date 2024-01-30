package org.example;

public class AnimalTester {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.eat();
        c.speak();

        withoutAbsAnimal c1= new Cat(); //this is possible and thats how we achieve polyMo
        withoutAbsAnimal d=new Dog();

        //to achieve polyMo
        //following is upcasting
        withoutAbsAnimal [] arr={new Cat(), new Dog()}; //ERROR here
        /*because when you have abstractMethod then we need to make the class
        abstract as well and doing this means we cant create its object anymore */

        for (withoutAbsAnimal a: arr){
            a.eat();
            a.speak();
        }

        /*what is abstraction?
                1) it is to enforece mthods on childClasses
                2) if parents method is going to be overriden in childclasses
                then its better to leave the method body empty in parentClass
                and 3) using the abstract keyword with the method*/





    }
}
