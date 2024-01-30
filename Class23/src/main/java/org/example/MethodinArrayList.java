package org.example;

import java.util.ArrayList;

//methods of ARRAYLIST not in array
public class MethodinArrayList {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Maria");
        names.add("Damla");
        names.add("Kamala");

        System.out.println(names.size());
        //gives the total index value of names
        System.out.println(names.contains("Damla"));
        //gives the value true if present

        //System.out.println(names.remove("Kamala"));//removes based on value
        System.out.println(names.remove(2));//removes based on index
        //removes the specified element

        System.out.println(names.get(0));
        //gives the value of index

        names.set(0,"Nasima");
        //updated the old value of index 0 and changes it to Nasima


        System.out.println(names); //gives all values

        System.out.println(names.indexOf("Damla"));
        //indexOf present in StringClass
        //here it tells the index number where Damla is stored


        //but when I name smth in indexOf but in code it's not present
        //it gives me -1
        System.out.println(names.indexOf("Carlos"));



    }
}
