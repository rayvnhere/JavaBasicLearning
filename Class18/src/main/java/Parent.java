public class Parent {
    String name="israel";                                 //<<<< SameName Variable in ParentClass
    //Super keyword FOCUSES on ParentClass Variable
}
class Child extends Parent{
    String name="Maria";                                  //<<<< SameName Instance Variable
    /*InstanceVAr outside of method's curly { }
    but inside of class*/

    void print(){
        String name="Levi";                              //<<<< SameName Local Variable
        //LocalVar inside method's curly { }
        System.out.println(super.name);//israel
        //Super keyword FOCUSES on ParentClass Variable

        System.out.println(this.name); //Maria
        //this keyword FOCUS on InstanceVar

        System.out.println(name);// levi
        //LocalVar gets priority then instanceVar or ParentClassVar

    }
}

class ParentTester{
    public static void main(String [] args){
        //calling ChildClass
        Child c= new Child();
        c.print();
    }
}

/*After localVar >>> the next priority is given to >> InstaVar and at last to > ParentClassVar*/