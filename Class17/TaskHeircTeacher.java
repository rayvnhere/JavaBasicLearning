package org.example;
/*
Write a Java program called Teacher.
Identify features and 4 behaviour of that Class.
Create 3 subclasses Math Teacher, ChemistryTeacher and Piano Teacher.
Test all 4 classes
 */

/*If something is going to be same for all classes then we add it in the ParentClass i.e InstaVar and methods,
and can add specific features of childClass
 */
public class TaskHeircTeacher {
    String gender;
    String schoolAddress;
    String schoolName;
    int age;

    void teach(){
        System.out.println("teaching......");
    }

    void prepareLesson(){
        System.out.println("preparing lesson's....");
    }
}
class MathTeacher extends TaskHeircTeacher{
    //methods are actions and they should be in verb/actions
    void math(){
        System.out.println("teaching math...");
    }
}
class ChemistryTeacher extends TaskHeircTeacher{
    void teachChem(){
        System.out.println("lets go to lab");
    }
}
class PianoTeacher extends TaskHeircTeacher{
    String play;
    void playPiano(){
        System.out.println("tin tan ton....");
    }
}


//                                 Cant Creat Object here to Test
// can have only one class as pUBLIC cant have two 'public classes' in the CLASS


/*public class TaskHeircTeacherTester{
    public static void main(String [] args){
        TaskHeircTeacher tht=new TaskHeircTeacher();*/