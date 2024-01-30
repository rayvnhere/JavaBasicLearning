package org.example;

import java.util.Scanner;

/*Create a class CreditCard
Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes */
public class TaskOverrideCreditCard {
//instance Method of Calculating Interest
    void calculateInterest(double amount){
        double interest=amount*0.05;
        System.out.println("Interest on "+amount+" is "+interest);
    }
}

class Visa extends TaskOverrideCreditCard{

}

class AX extends TaskOverrideCreditCard{
    @Override//optional but helps to be sure to override
    void calculateInterest(double amount) {
        double interest=amount*0.07;
        super.calculateInterest(amount);//with super called parents prints
    }
}
/*what does @override do? it checks rules to override such as
returnType or (void) should be same for Both Parent| child cuz
override only happens when they match in 1) returTye 2)methodName 3)same parametersName&Values
otherwise its MethodLoading if even 1 thing gets changed
 */

class CreditTester{
    public static void main(String[] args) {//it was about visa and ax not general creditccard
        TaskOverrideCreditCard tc=new TaskOverrideCreditCard();
        tc.calculateInterest(1999);

        AX x=new AX();
        x.calculateInterest(1000);
    }
}