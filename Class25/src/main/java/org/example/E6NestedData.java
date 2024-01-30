package org.example;

import java.util.ArrayList;

/*                               Storing Excel Data in Java through nested Data Structure
like nestedClass of EntrySet; entrySet is a nested data structure, it is a set of 'entries' and 'entries'
in return gives key and values in pari. This same is going to happen to ArrayList,
 */
public class E6NestedData {
    public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> nestedArr= new ArrayList<>();
//                      BIG  array that stores arr1 and arr2

    ArrayList<Integer> arr1= new ArrayList<>();
    arr1.add(10);


    ArrayList<Integer> arr2= new ArrayList<>();
    arr2.add(5);

    nestedArr.add(arr1); //BIG array stores arr1
    nestedArr.add(arr2); //BIG array stores arr2
        System.out.println(nestedArr);



    }
}
