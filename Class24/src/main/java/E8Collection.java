import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class E8Collection {
    public static void main(String[] args) {
//any collection's class can be converted to any other collection class

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);
        System.out.println(numbers);

        //to remove duplicate numbers do like below, instread of loop

        HashSet<Integer> UniqueNumber=new HashSet<>(numbers); //passed arrayList Var inside the constructor i.e.
        // (numbers) is a contructor
//       System.out.println(UniqueNumber);//all duplicate got removed

        //use TreeSet to get them all sorted
        TreeSet<Integer> treeSet= new TreeSet<>(UniqueNumber);
        System.out.println(treeSet);


        // but i want the top arrayList sorted way of numbers then use linkedHashSet
//        HashSet<Integer> UniqueNumber = new LinkedHashSet<>(numbers);
//        System.out.println(UniqueNumber); //prints the data in the original set that was given in the above fields



    }
}
