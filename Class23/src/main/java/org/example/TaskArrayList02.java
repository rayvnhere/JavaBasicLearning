package org.example;

import java.util.ArrayList;
/* inside the ArrayList if the names contain the letter "o"
   then print YES else NO for all names */
public class TaskArrayList02 {
    public static void main(String[] args) {

        ArrayList<String>names=new ArrayList<>();
        names.add("Maria");
        names.add("Poorna");
        names.add("Damla");
        names.add("Kamla");

        //with EnchanceForLoop
        for (String s:names){
            if (s.contains("o")){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        //cons of enchancedF= 1) dont have info about index
//                               2) always goes in the foward direction

        //with simple forLoop
        for (int i = 0; i < names.size(); i++) {
            String s=names.get(i);

            if (s.contains("o")){
                System.out.print("YES"+" ");
            }else{
                System.out.print("NO"+" ");
            }

        }


    }
}
/* Limitation of EnchanceForLoop - 1) cant know the index
                                   2) only goes in the forward direction



 */