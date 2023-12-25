package org.example;

public class Dog {
    String name;
    String color;
    int age;
    double weight;

    void sleep(){
        System.out.println("ZzzzzZzzz");
    }
    public void printInfo(){
        System.out.println(name+" "+color+" "+age+" "+weight);
    }
/*THe above code of Class  would be repeated again and again becuase animals have same features like Cat,Lion,Dog
but repetition can be resolved by Inheritance.

How?
   1) Inheritance says create a Super class i.e. Parent (AnimalKingdom) and write the code that would be repeated
   code of features of Cat/Lion (childClasses/subClasses).
   2) then add the keyword of EXTENDS e.g. Cat(childClass) extends(keyword) AnimalKingdom(parentClass)
   3) childClass of Cat can have its own feature in its own Class like void voice (){sout meow}

 */

    public static void main(String []args){
        Dog d=new Dog();
        d.name="Kotta";
        d.age=1;
        d.color="Black";
        d.printInfo();

    }
}
