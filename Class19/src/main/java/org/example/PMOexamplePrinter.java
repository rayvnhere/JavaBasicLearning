package org.example;
//MethodOverlaoding for private Example
public class PMOexamplePrinter {
    private void print(){//this is private Method
        System.out.println("hello");
    }

    private void print(String word){//private method Overloaded
        System.out.println(word);
    }

    public static void main(String[] args) {
        PMOexamplePrinter printer= new PMOexamplePrinter();
        printer.print();
        printer.print("forgot to add word here, remember that. Otherwise it wont print anything");
    }
}
