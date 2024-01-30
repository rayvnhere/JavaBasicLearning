package org.example;

import java.util.ArrayList;

/* inside ArrayList if a name has the letter 'o' then replace that
word with 'Java'
*/
public class TaskArrayList03 {
    public static void main(String[] args) {

        ArrayList<String>names=new ArrayList<>();
        names.add("Maria");
        names.add("Poorna");
        names.add("Damla");
        names.add("Kamla");
        //names is the Variable that holds the objects of ArrayList

                                         System.out.println("OneWay");

        for (int i = 0; i < names.size(); i++) {
            String s=names.get(i);
            if(s.contains("o")){
                names.set(i,"Java");
                //setMethod requires two things; (index of the desired replacement i.e. i , "what we want to replace with i.e. new")
                //setMethod is the name of arrayList's it does replacement
            }
        }
        System.out.println(names);

                                       System.out.println("Second Way");

        for (String s:names){
            if(s.contains("o")){
                System.out.println(s.replace("o","Java"));
            }}
//replace method, replaces 'word' within the string (replaceMethod is from String class)
// setMethod is from ArrayList Class (used to replace whole string not just word)

/*you cannot use s.replace to modify an element in an ArrayList directly.
If you want to modify an element in an ArrayList,
you should use the set method, which directly updates
the element at a specific index in the ArrayList. */

                                            System.out.println("Third Way");

        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).contains("o")){
                names.set(i,"Java");
            }
            System.out.println(names);
        }
//                                              MESSS left at 4:14
        // https://drive.google.com/file/d/19lcBSFhKsEojVdK0J00rgaZZxlk5-e16/view


    }
}
