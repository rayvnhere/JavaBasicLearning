package org.example;

import java.util.WeakHashMap;
//just explain some concepts refer to AnimalClass to see abstract use
public class withoutAbsAnimal {

    private String name; //private instaField

    //withoutAbsAnimal(String name){this.name=name;} //con
    public void eat(){//having this method makes it mandatory to have it in childClas/
 //2) PolyMo could also be achieved, which child uses this method to override
        System.out.println("Animal eats");
    }

    //public abstract void sleep();  //error here for abstract
/*if we have one abstract method
then we have to write abstract next to class  */

/*if we dont put abstract keyword with the class
others will be able to create an object from it and
can call abstract and non abstract method from it*/

/*if you have abstract keyword with class
then others cant create object from it, abstractClass restricts it*/


    public void speak(){
        System.out.println("Animal speaks");
    }
}

class Dog extends withoutAbsAnimal{
   //should override eatMethod for Dog
    @Override
    public void eat(){
        System.out.println("Dogs eat meat");
    }

    @Override
    public void speak() {
        super.speak();
    }
}


class Cat extends withoutAbsAnimal{
    @Override
    public void eat(){
        System.out.println("eats fish");
    }
}
/* does it make sense to have a body of Methods, when most of them
will be overridden? cuz every animal is different, this is where we
use ABSTRACTION 1)if the childClass will have their own methods/or
2) when don't know what are their methods.

how to have Abstraction?
remove sout of eatMEthod and only have
public abstract void eat();

public (access modifier)
abstract(keyword)
void   (returnType)
eat    (nameOfMethod)
();    (parameters)
 */