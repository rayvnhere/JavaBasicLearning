package org.example;

public class Animal {
//#1 learning typeCasting for objects

    private String name;
    private int age;
    private double weight;

    public Animal(String name,int age,double weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }

    public void PrintInfo(){
        System.out.println(name+" "+age+" "+weight);
    }
}

class Dog extends Animal{
    public Dog(String name,int age,double weight){
        super(name,age,weight);
    }
    //Dog has its own method, cuz only he barks
    public void bark(){
        System.out.println("Woof woooof");
    }
}

class Cat extends Animal{
    public Cat(String name, int age, double weight) {
        super(name, age, weight);
    }
    public void meow(){
        System.out.println("meow mwo");
    }
}
//                                          Created Object's of Class

class AnimalTester{
    public static void main(String[] args) {
        Animal a=new Dog("Jacky","Black",1,12);

        Dog d=(Dog)a;
        d.bark();


        Dog d1=new Dog("Jacky","Black",1,12);
        Cat c1=new Cat("Lovly","white",1,12);
        Animal a1=new Animal("Lovly","white",1,12);

        Animal [] arr={d1,c1,a1};//d1,c1,a1  got converted to BIG dataType cuz of Animal(Parent)

        Cat a2=arr[0];//error here cuz Dog got BigData, need to downCast ()
        Cat a2=(Dog)arr[0];//good now//downCasted// but still error cuz DataType mismatch
        a2.PrintInfo();

        //cant convert cat to dog...cat should be cat
//good examples are below;
        Animal animal=arr[1];//correct
        animal.printInfo();


        Cat c=(Cat)arr[2];//this can be done





//__________________________________________________________________________________________
//      Animal/Parent is the Bigger DataType             Dog/Child is the Smaller DataType

        //this is how ParentClass can be typeCast to ChildClass
        Animal a=new Dog("jacky",1,33);//no error
//either use 1) DataType(same as the name of the Class
// OR    use 2) use Parent class as the DataType to store any object of the Class


// Q: why did we use Animal (parent as the datatype) for array?
// A: becuz PARENT(animal) can hold multiple objects for array//a childClass cant hold everything but a single class

//__________________________________________________________________________________________
        //Dog d=a     //error cuz big to small
        /* gotta force (specify desired the class) e.g. below */
        Dog d=(Dog)a;
        d.bark();
//_____________________________________________________________________________________
        /*should use array to hold multiple ChildClass's objects but why?
        A:  to store multiple values or Objects we have to use ARRAY
            as a variable cant hold/store  Multiple objects/values

                   e.g. Animal [] animalVar={d1,c1,a1};
        //Can store all childClasses even ParentClass inside Parent*/


        /* Q: what type of Variable we create to store the object of a Class?
           A: the dataType of the Variable is nameOfClass itself

              Dog dataType of d1Var                    Dog        is DataType
              d1 is storing object of DogClass         d1         is VarName
                                                  new Dog();      is the object

                                  Dog d1=new Dog("dog",1,33);    */

        Dog d1=new Dog("dog",1,33);
        Cat c1=new Cat("cat",1,33);
    /*  When we have to store the objects of 'CAT' we created a variable 'C1',
        and C1's dataType is CAT, the dataTYpe CAT is same as the name of Class itself     */


        Animal a1=new Animal("animal",1,33);
        //d1,c1,a1 are objects Variable we created and used in array
        Animal [] animalVar={d1,c1,a1};


    }
}

