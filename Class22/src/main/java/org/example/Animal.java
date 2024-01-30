package org.example;
/*  Syntax GitHub
    https://github.com/SyntaxTechnologies/SDETJavaBatch18/blob/master/src/main/java/org/class21/Animal.java

    Class 22

public  abstract class Animal {

    private String name;
    private String color;
    static int noOfLegs=4;
    abstract void eat();

    public Animal(String name,String color){
        this.name=name;
        this.color=color;
    }
    public  void sleep(){
        System.out.println("Animals Sleep");
    }

    public abstract void speak();

    // public abstract String print(String str);
    public void printInfo(){
        System.out.println(name+" "+" "+color);
    }
}

class Dog extends Animal{

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("Dogs like to eat meat");
    }
    @Override
    public void speak() {
        System.out.println("Wuff Wuff");
    }
}

class Cat extends Animal{

    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("Cats like to eat Fish");
    }

    @Override
    public void speak() {
        System.out.println("Meow Meow");
    }
}

class tester{
    public class AnimalTester {
        public static void main(String[] args) {

            // Animal animal=new Animal();
            Cat c=new Cat("Mano","Black");
            c.eat();
            c.speak();
            c.sleep();
            Animal c2=new Cat("Mano","Black");
            Animal c3=new Dog("Mano","Black");
            c2.printInfo();


            // Break till 11:55
            Animal [] arr={new Cat("Mano","Black"),new Dog("Mano","Black")};
            for (Animal a:arr){
                a.eat();
                a.speak();
                a.sleep();
            }

        }
    }
}

*/