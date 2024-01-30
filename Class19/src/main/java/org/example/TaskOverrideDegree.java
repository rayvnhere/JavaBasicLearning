package org.example;
/*Create a class 'Degree' having a method 'getPrerequisite'
that prints ""To get a degree you need high school diploma"".
Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters.
In Masters class override method 'getPrerequisite.
Call the method by creating an object of each of the three classes.*/

//im calling Degree as TaskOverrideDegree
public class TaskOverrideDegree {

   public void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }

}

class Masters extends TaskOverrideDegree{
    public void getPrerequisite(){
        System.out.println("To get a Masters you need Bachelors Degree");
    }

}

class Bachelors extends TaskOverrideDegree{
    public void getPrerequisite(){// java knows we want to override,when "public void getPrereq(numOfParemeters) are exactly same
        //didnt wrote sout cuz bachelors inherited it from TaskOverD cuz of 'extends'
    }

}
//Call the method by creating an object of each of the three classes
class DegreeTester{
    public static void main(String[] args) {
        Masters m=new Masters();
        m.getPrerequisite();

        Bachelors b=new Bachelors();
        b.getPrerequisite();

        TaskOverrideDegree td=new TaskOverrideDegree();
        td.getPrerequisite();


    }

}
