public class PrintItMeansVoid {

    void printHello(){
        //didnt specify to Java that there's any input in the parenthesis
        //so the object shouldnt have it either like p.printHello("hello");
        System.out.println("Hello World");

        //print it means return it
    }
    void printWord(String word){
        //here we put input and its Datatype is String
        System.out.println(word);
    }

    //now the object requires two paramenters
    void printManyTimes(String word, int n){
        for (int i=0; i<n; i++)
        //for loop doesnt work when you put this ; at the end
        System.out.println(word);
    }


    //creating object for the method,

    public static void main(String[] args) {

        PrintItMeansVoid p= new PrintItMeansVoid();
        p.printHello();
        p.printWord("Java");
        p.printManyTimes("Java",3);

//Class 13 left at 1:48
    }
}
