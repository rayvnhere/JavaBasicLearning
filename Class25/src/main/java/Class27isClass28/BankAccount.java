package Class27isClass28;

public class BankAccount {
    private double funds;
    BankAccount(double funds){
        this.funds=funds;
    }
    void transferFunds(double amountToTransfer){
        if (amountToTransfer>funds){
            throw new InsufficientFundsException("Not enough funds in your account");
//"Throw" keyword and then create the NEW OBJECT of the CLASS WHOSE exception you want to throw
        } else {
            funds=funds-amountToTransfer;
        }
    }
}
/* why use throw exception?
Ans: so that others can understand at which line error occurs and what is the exact reason it is happening
just like the in build exception to Java does.
And that's why 'printing the error message' or using 'if-else statements' don't work
cuz other's won't understand the error line or reason of error

 */
