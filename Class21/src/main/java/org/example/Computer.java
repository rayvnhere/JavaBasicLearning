package org.example;

public class Computer {


    String name;
    String color;
    int memory;


    //final; smth is fully completed, smth that doesnt need to be changed
    //with class(final) class wont be inherited/subClassed
    //with method(final) method wont be overridden in subClasses
    //final/static are non access modifier
    static String type;  //static belongs to class

    Computer(String name, String color, int memory){
        this.name=name;
        this.color=color;
        this.memory=memory;

    ///left at 1:30  it was review class
    //review 8 ending might have some abstraction concepts, but ashgar thaught in 5hr class
    }
}
