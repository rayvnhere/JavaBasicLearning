  class Animal {
    private String name;
    private String color;
    private int age;
    private double weight;

    public Animal(String name, String color, int age, double weight){
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
    Dog(String name,String color, int age, double weight){
        super(name,color,age,weight);
    }
}


