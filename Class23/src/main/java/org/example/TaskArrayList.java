package org.example;

import java.util.ArrayList;
/*Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that*/

public class TaskArrayList {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();

        names.add("Apple");
        names.add("Banana");
        names.add("Leechee");
        names.add("Orange");
        names.add("Mango");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Mango"));
        System.out.println(names.size());

        //OneWay of printing all values
        /*  for (String s:names){
            System.out.print(s+" ");}  */

        //AnotherWay of printing all values
        System.out.print(names);





    }
}
