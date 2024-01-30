package org.example;

public class BankAccountEncap {
    private double balance;
    private String userName;
    private  String password;

    public BankAccountEncap(double balance, String userName, String password) {
        this.balance = balance;
        this.userName = userName;
        this.password = password;
    }

    void login(){
        System.out.println("Login to bank Account");
    }
    void transferFunds(){
        System.out.println("Transferring funds");
    }
    void resetPassword(){
        System.out.println("Resetting the password");
    }
/*   how getter is written/use?
       -use get keyword      and Same DataType as of Field
  -getter return data   and  nameofField   */

    public double getBalance(){
        return balance;
    }



    /*   how setter is written/use?
           -use set keyword
           -void nameofField
           -this(cuz same name of field and same name in setter's parameter        */

    void setBalance(double balance){ //add field in parameter
        this.balance=balance;
    }
}
//                               ObJect
class BankTester{
    public static void main(String[] args) {

        BankAccountEncap b=new BankAccountEncap(2000,"rayn","1234");

        System.out.println(b.getBalance()); // 2000 was printed by GET (NON modified read)

        b.setBalance(3000); //new value 3000
        System.out.println(b.getBalance()); // new value was printed by GET (MODIFIED read)

    }
}

