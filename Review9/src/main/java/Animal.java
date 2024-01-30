public abstract class Animal {
    private String name;
    private String color;
    private int age;
    //con do not have REturnType
    //public Con helps to access in another class
    public Animal(String name,String color,int age){
        this.name=name;
        this.color=color;
        this.age=age;
    }
    //other names of Method is funcitons/behaviours  as they are actions that a Class can do
    //they can eat,sleep

    /*void wont be able to assign this to a vairable why becuze it has void returntype
    //it can print thing, or open a browser*/

    abstract void eat();//revmoed this body gets an error{}
    //add adstract infront of void to solve error
    //class also needs to be added abstract


    //returnType Method
    //didn't use this keyword here why? > when local and insta var are same
    //> this is only used when there is a conflict same name localVar same name paremters
    public String getName(){
        return name;//can still use this.name
    }
    public abstract void sleep();

    public void printInfo(){//make them all public to reuse them in other classes
        //this shouldn't be abstract cuz everything animal wil have this field
        //but those method tht are common in all child Class they should be created as asbtract they shsould have full bodiy
        System.out.println(name+" "+color+" "+age);
    }
}

//Childclasses
//got error here cuz of abstract or java asked to make Dog abstract
class Dog extends Animal {
    //wrote matching CON for child like parent
    //can add more parementers
    String breed;
    public Dog(String name,String color, int age, String breed){
        super(name,color,age);
        this.breed=breed;
    }
    //need to employ eat and speak abstract method for ChildClass
    //if there are ten abstract method then childClass must implement ten mehotds
    public void eat(){
        System.out.println("he eats bone and meat");
    }

    public void sleep(){
        System.out.println("wao wao");
    }
    //still has error for ChildClass
    //need to have MatchingCon above


    //need to overridbe to make breed work
    @Override
    public void printInfo(){
        super.printInfo();//calls parent class method
        System.out.println(breed);
    }

    public class Cat extends Animal{
        //same issues like DogChildClass
        //do like Dog
        public Cat(String name,String color, int age){
            super(name,color,age);
        }
        @Override
        public void eat(){
            System.out.println("eats olives");
        }
        @Override
        public void sleep(){
            System.out.println("meow meow");
        }
        //if cat doesnt have new printInfo then we can use parents

    }
}
