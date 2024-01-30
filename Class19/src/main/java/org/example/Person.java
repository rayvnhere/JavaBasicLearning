package org.example;

public class Person {
    private String name;
    private int age;
    private double weight;

    public Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName(){
      return name;
      //difference between return and void (watch method's class)
    }

    void printInfo(){
        System.out.println(name+" "+age+" "+weight);
    }
}
/*class Student extends Person{  } gives red error
cuz java's defualt went off and now I have create matchingCon*/
class Student extends Person{
    //student has its own specific field of marks
    private double marks;
    public Student (String sName,int sAge,double sWeight,double marks){
        super(sName,sAge,sWeight);//super is used to call the fields of ParentClass
        this.marks=marks;
    }
    public void printMarks(){
        System.out.println(marks);
    }

    public void printInfo(){
        super.printInfo();//reused parents printInfoMethod with the help of super, it will print as it had sout in Parent
        //so this printInfo had 2 void prints
        System.out.println(marks);//this gets printed too               //

    }
}//overriding is redefining


 class StudentTester{//can be written as PersonTester too
    public static void main(String[] args) {
        Student s= new Student("hanane",23,34,99);
        s.printInfo();
        System.out.println(s.getName());//to just get the name
    }
}