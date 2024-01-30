package org.example;

public interface CalculatorInterFace { //add interFace after public
/*  they only have;
  1) returnType
  2) nameOfmethod
  3) parameters

 */
    int add(int num1, int num2);
    int subtract(int num1, int num2);
}// *can have multiple methods in interFace

class Math implements CalculatorInterFace{
/*how others will use the interFace Contract above?
  1) use implements keyword
  2) provide body of ALL METHODS */

    public int add(int num1, int num2){
        return num1+num2;}

    @Override
    public int subtract(int num1, int num2) {
        return num1+num2;
    }
}
//                                 Can Start Calling
class CalculateTester{

    public static void main(String[] args) {

      //CalculatorInterFace m= new Math();  //can also do this
                                             //can use interFace(as parentClass) as dataType to store the objects of ChildClass(Math)

      //CalculateIntercae c=new CalculatorInterFace(); // ERRor why? see below line
        //we cant create object of interfaces, but can store objects inside Interfaces
        //can create objects of childClasses only

        Math m= new Math();  //creating object of  Child Class (Math)

        //m.add(10,10); //can also assign add method in a Variable
        int r=m.add(10,10);  //stored method in variable r
        System.out.println(r);




    }


}