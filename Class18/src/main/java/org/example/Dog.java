package org.example;
class Animal{
    private   String name;
    private  String color;
    private  int age;
    private  double weight;

    public Animal(){
//having multiple CON's gives more flexibility to other classes just create a CON
        //that doesnt take any PARAMETER
        //at least one MATCHING CON should be there, to match the CHILDCLASS according to the PARENTCLASS
    }
    public Animal(String name,String color,int age,double weight){
        this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;
    }
    public void printInfo(){
        System.out.println(name+" "+color+" "+age+" "+weight);
    }
}//ParentClass has private fields so gave ParentClass public CON's, initizialized those fields then assigned their values, printThing
//but those fields are still private for ChildClass and didnt do a single thing for ChildClass like parentClass
//*when you use Con's from the sameClass then we use 'this' keyword like i did above 'this()'
// but for below ChildClasses when we have to use Parent's Con we use 'super()'
public class Dog extends Animal {
/*Rule
    name of the public class "Dog" must match with the name fo the FILE(classname under Main)
     "Dog" and then you can create multiple classes*/
    Dog(String name,String color,int age,double weight){
        super(name,color,age,weight);
    }
}
//having multiple CON's gives more flexibility to other classes
class Cat extends Animal{
    //imagine i dont write anything like below, then java creates an invisible and empty defualt CON
    Cat(){//empty CON, so when we call this method in object it will print nothing
        super();
    }

    Cat(String a){//this CON need input When we call this method in Object it will print 2
        System.out.println("2");
    }
}





