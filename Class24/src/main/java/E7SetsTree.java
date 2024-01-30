import java.util.TreeSet;

public class E7SetsTree {
    public static void main(String[] args) {

        TreeSet<Integer> numbers= new TreeSet<>();
        numbers.add(20);
        numbers.add(10);
        numbers.add(50);
        numbers.add(5);
        numbers.add(5);
        numbers.contains(20);
        System.out.println(numbers);
        //prints: number in a sorted way
        //doesnt allow duplicates
        for (int n:numbers){
            if(n>10){
                System.out.println(n);
            }
        }
//can even use if else statements
    }
}

//but if specifially want to get 20 num then can do if(n==20) another way is contains like above
