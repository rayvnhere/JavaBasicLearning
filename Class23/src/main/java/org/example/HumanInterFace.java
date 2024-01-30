package org.example;

public interface HumanInterFace {
//* in classes multiple inheritance wasn't supported BUT
//good thing about interFace is it can be used in multiple inheritance meaning can inherit from two classes
    void walk();
}

interface Person{
    void talk();
}

interface Employee extends HumanInterFace, Person{ //one interface can inherit from two interfaces at the same time
//not using implement keyword, cuz we are inheriting so using extends keyword
//Multi inheritance is done here
    void work();
}

class SyntaxEmployee implements Employee{
/*How many methods will be implemented inside this class, cuz interFace requires implementation of all methods
3 methods would be implemented, cuz Employee got inherited by two other methods and employee had its own method as well*/

    @Override
    public void walk() {
        System.out.println("walking.....");
    }

    @Override
    public void talk() {
        System.out.println("talking...");

    }
//*cannot override in interface,as they don't have a body
// we can only override in classes and this is class not interface
    @Override
    public void work() {
        System.out.println("working...");
    }
}

/*Multiple Inheritance- inheritance from multiple classes at same time causes diamond problem
Diamond Problem cannot occur in interfaces because they don't have body,
even if the methods is written exactly in another class as well.
 */
//                         Creating Object for childClass and storing it in ParentClass
class EmployeeTester{
    public static void main(String[] args) {
//Employee extends HumanInterFace, Person
//can do the following as well;
        Person p=new SyntaxEmployee();
//Person is InterFace cant create its object but here
//im not creating Person's object, its of SyntaxEmployee
//and storing it in Person(DataType) > of p (variable)
// the syntax of creating object is |new SyntaxEmployee();|
        HumanInterFace h=new SyntaxEmployee();
        Employee e= new SyntaxEmployee();

        SyntaxEmployee se=new SyntaxEmployee();

    }
}

