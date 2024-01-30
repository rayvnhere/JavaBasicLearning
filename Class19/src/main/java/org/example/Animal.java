package org.example;
//create multiple animals from Animals
public class Animal {
    //should make them private so that no other class can access ANIMAL class directly
    private String name;
    private String color;
    private int age;
    private double weight;
    //didnt made static's values cuz they stays same forever but i cant change insta color,age etc

 Animal(String name, String color, int age, double weight){
    this.name=name;
    this.color=color;
    this.age=age;
    this.weight=weight;
}
public void sleep(){
      System.out.println("zzzzz");
  }
  public void speak(){
      System.out.println("anything they say....");
  }
  public void printInfo(){
      System.out.println(name+" "+color+" "+age+" "+weight);
  }
}
//needs to make a matching CON for child like parent
class Dog extends Animal{
//java made an defualt con for child but it doesnt match with parent Con
    Dog(String name, String color, int age, double weight){//these paremeters arent coming from Parents Fields
//they can be Dog(String a, String b, int c)

        //also needs to call Parent Con to work for Dog matching con
        //cant inherit CON we can ONLY call them
//1stWayOfCallingSuper        super(name,color,age,weight); //called Parent Con but with super
//2ndWayOfCallingSuper        super(a,b,c)
//I can even hardCore the values, Java only wants to call the Con e.g. below
               //3rdwayOfCallingSuper
        super("jacky","Blacky",2,22.3);//below demo was explained for this line
    }//3ways but datatypes should be same
    public void speak(){// MethodOverridden Here for CHildClass
        System.out.println("bark bark");
    }


//flow or passing of information
//for passport they pass information counter to counter
    void demo(String str){//str has stored "Maria"
        printLen(str); //str has Maria
    }
    void printLen(String word){ //word:Maria
        System.out.println(word.length()); //word:Maira
    }
}
