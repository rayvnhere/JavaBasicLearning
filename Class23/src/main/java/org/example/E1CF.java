package org.example;

import java.util.Arrays;

public class E1CF {
/*creating lots of variablesOfSimilarType can use ARRAY
Problems of array = array's fixed in size
cuz idk how much data I would be needed so it should be fixed */

    public static void main(String[] args) {
        String name="Maria";
        String [] names={"canan","halil","swati"};
        //before [] we specify the dataType -String- which is the nameofClass who's
        //element/objects are its values i.e. "cannan"
        names[3]="Bikal";

        String[] students=new String[3]; //see needs fixed num3 without it gets error
        System.out.println(Arrays.toString(students));//.toString here is like a loop for array

/* another issue of array is I have to write my own code (loops and if-else) to search a name in array
there's no built-in method to help, why no method? cuz they arnt classes thats why they dont have methods BUT
to solve this issue this problem; developers created new set of classes,known as Collections Framework;
1st Class is ArrayList (store and manipluate data easily, and here dont have to specify size) */

    /*Two big Problems of simple arrays;
    once you create a size it will occupy that much space in the system (null) even if there is the size is correct or false
    have to write on your own code/methods*/
    }

}
