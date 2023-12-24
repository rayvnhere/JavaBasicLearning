package Class16;
/*
Write Book class that will have 5 instance variables and 2 Constructors.
While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
Create print info method and call it.
 */
public class thisTask2 {

    private String title;
    private String author;
    private int noOfPages;
    private String publisher;
    private double price;

    public thisTask2(String title, String author, int noOfPages, String publisher) {
        this.title = title;
        this.author = author;
        this.noOfPages = noOfPages;
        this.publisher = publisher;
    }
    //When there's two Con's, then I can write assign all values in one line for Con2 + new one
    public thisTask2(String title, String author, int noOfPages, String publisher, double price) {
        this(title,author,noOfPages,publisher);
        this.price = price;
    }

    void printInfo(){
        System.out.println(title+" "+author+" "+noOfPages+" "+publisher);
    }

    void printAllInfo(){
        System.out.println(title+" "+author+" "+noOfPages+" "+publisher+" "+price);
    }

    public static void main(String [] args){
        new thisTask2("Harry Jutt","Mola Jutt",1000,"Urdu").printAllInfo();
        new thisTask2 ("Harry Jutt","Mola Jutt",1000,"Urdu",120).printAllInfo();


    }



}
