package org.example;
//GrandParent,Parent and child is printed on console
class GrandParent{
    GrandParent(){
        System.out.println("GrandParent is printed in Console");
    }
}
public class ParentLearningMatchingCon extends GrandParent {
    ParentLearningMatchingCon(){//Parent CON Name NotMatched with Child CON
        System.out.println("CON Name of ParentLMC is born and printed on console");
    }
    String name="isreal";
}

class Child extends ParentLearningMatchingCon {
    Child(){//Child CON Name NotMatched with Parent CON
        System.out.println("CON Name of Child is born which has everything of PLMC cuz of extends inheritance and chidl printed");
    }
    void print(){
        System.out.println(name);
    }
}
//                             OBJECT to CAll

class Tester{
    public static void main(String[] args){
        Child c=new Child();
        c.print();
    }
}