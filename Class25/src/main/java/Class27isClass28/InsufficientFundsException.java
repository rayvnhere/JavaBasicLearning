package Class27isClass28;

//This is how we can create our own exception
//this exception is ready and can be used for the "Throw" keyword exception in other classes
public class InsufficientFundsException extends RuntimeException{
    /***
     * This Exception will be thrown when the user tries to transfer
     * more funds than they have in their account
     * @param msg
     */
    InsufficientFundsException(String msg){
        super(msg);
    }
}

/*Steps to create our own exception
1) Create a class
2) extend it exception(parent)
3) create a constructor
4) pass the CoN's msg to the parent class with the help of super keyword
5) its better to comment smth for other's to understand

 */
/* if want to create our own CHECKED EXCEPTION then extend from 'Exception'
if want to create our own NON-CHECKED EXCEPTION then extend from 'RunTime Exception'


 */