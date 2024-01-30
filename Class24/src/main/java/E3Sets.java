import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class E3Sets {
    public static void main(String[] args) {

        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        System.out.println(numbers);
        //can store duplicate


        //sets dont allow duplicate
        HashSet<Integer> nums= new HashSet<>();
        nums.add(10);
        nums.add(20);
        nums.add(10);
        System.out.println(nums);  //only 10 and 20 is printed, it ignored duplicate 10
        //set is the name of interface
        //hashSet is the name of class

        /*two different;  sets dont store duplicate and there is no order/they are random
        e.g. 20 and then 10 not 10 and 20 (doesnt respect index) gives anything
        so there's no getMethod, only arrayList and LinkedList has it, cuz they respect index

        linkedList is random as well but it keeps tracks
         */



    }
}
