package org.example;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {
        //not fixed in size its
        ArrayList<String> names=new ArrayList<>();
        //in array's we used [] but arraylist has methods
        //arraylist add method can extend and shrink automatically
        names.add("Maria");
        System.out.println(names.size());//can shrink
        names.add("Damla");
        names.add("Kamla");

        System.out.println(names.size());//can expand
        System.out.println(names);
    }
}
        
        /*after the className(ArrayList) we use this diamond operators/generics <> inside we write the nameOfClass(dataType),
        who's element/object we want to store inside the arraylist
        "Maria" is values/element/object  of stringClass inside arraylist
           so its like this    ArrayList<String> names=new ArrayList<>()
         */

        /* diamond operators/angled brackets knows as generics <> helps to reuse a piece of code from a class with any dataType */

        /* if you dont write generics <> you will be able to store numbers 12
             you will be store String "Engine"
             you will be store Boolean or anything (but it makes a mess) cuz they might
             not know what 1) dataType is stored


         */
        
        
        

