package org.example;
/*﻿
Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
• Define 3 common behavior within parent class
 override some of the methods in child classes.
Define some methods specific to child classes
Write example of achieving run time polymorphism
 */
public class TskStdntRnTmPoly {
    void human(){
        System.out.println("student is always human");
    }
    double time(){
        System.out.println("every student is taught in a time");
        return time();
    }
}
class SyntaxStudent extends TskStdntRnTmPoly{
    void human(){
        System.out.println("Syntax is can be robot");
    }
}

class CollegeStudent extends TskStdntRnTmPoly{
    void collegeFun(){
        System.out.println("college could be fun");
    }

}

class SchoolStudent extends TskStdntRnTmPoly{
    void School(){

        System.out.println("sucks");
    }
}
//                                        RunTimePoly by using Loop

class Tester{
    public static void main(String[] args) {

        TskStdntRnTmPoly[] arr={new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};
        for(int i=0; i<arr.length; i++){

            TskStdntRnTmPoly trp=arr[i]; //calls array's one by one by i
            trp.human();//one way of writing
            arr[i].human(); //another way of writing
          //arr[i].School();  // error cuz school wasnt overridden
        }
    }
}
// *you can only CALL the method's that are overridden