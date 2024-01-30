package org.example;

import java.util.ArrayList;

public class E4LoopsArrayList {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("Maria");
        names.add("Damla");
        names.add("Marble");
        System.out.println(names); //gives all values
        
        //Loops in ArrayList
        for (int i = 0; i < names.size(); i++) { //but this simple forLoop gives control on individual values
            System.out.println(names.get(i));
            //if you want full actual names nor the number of each words letter

            //to get each words number in length
           // System.out.println(names.get(i).length());
                               //(i) gets each element one by one
                               //.length gets the length of each element
           //another way of writing
            String s=names.get(i);
            System.out.println(s.length());
            //printing each elements NUMBER of letters of word
        }

        //enchanced forloop

        for (String s:names) { //String cuz I have stored the vales in String TypeOfData i.e DataType
            System.out.println(s);
        //printing the full actual name
        }






    }
}
