package org.example;
/*                     SingleInheritanceExample
                        OneParent OneChild*/
public class Person {
//Other names of ParentClass is BaseClass/SuperClass
    String name;
    int age;
    double weight;

    void printInfo(){
        System.out.println(name+" "+age+" "+weight);
    }
}
//Other names of ChildClass is SubClass/DerivedClass
class Student extends Person{
char grade;//can add new field and Method
void study(){
}
}
//
class StudentTester{
    public static void main(String[] args){
    Student s=new Student();
    s.age=12;
    }
}
