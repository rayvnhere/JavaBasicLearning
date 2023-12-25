package org.example;
/*
Write program to inherit class E that has method printF
which is static and call or reuse that method into class F
 */

//can have only one class as pUBLIC cant have two 'public classes' in the CLASS
public class Task2E {
    public static void printF(){
        System.out.println("for calling I need to print and Task2E is Class E");
    }

    class F extends Task2E{

    }

    public static void main(String [] args){
        F.printF();
    }
}//i was in the last } bracket so I didnt had to create Task2ETester
// for creating object and for calling the method to get it printed



/*
Where can be accessed?
1) Can only exist INSIDE a CLASS
            O R
2) OUTSIDE of a block of code

How to call them?
1) NameOfClass.NameOfStaticVariable    (recommended way)
 */