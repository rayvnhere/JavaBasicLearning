package Review14FramerWork;
import java.util.ArrayList;
import java.util.LinkedList;

//note the time to know the difference between them
public class E1ArrayListVsLinkedList {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        LinkedList<Integer> numbers= new LinkedList<>(); // VS // just change class to ArrayList to LinkedList, to see comparison code is same
        for (int i = 0; i < 1000000; i++) {//one million elements
            numbers.add(0,i);
//numbers.add(0,i);  'add' always keeps the new element at index 0, shifting away the other elements in the right
//'add' helps to move the data of number(which is Arraylist)
        }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);
        // prints the time in milliSeconds, it prints how much my laptop takes time to run this all operation

// With ArrayList took so much time 95962 secs to move and add one million elements inside the ArrayList :0
// With LinkedList took 149 secs IT WAS FAST! :0
//* see one wrong DataStructure can make the program to run 1hr or 55hr, so know the difference




        /*System.out.println(startTime); //prints the measured time since 1971
.currentTimeMillis(); gives > since 1971 how many milli second
have passed, this is how computers measure the time.
         */
//* numbers.add here it is 'add' not 'set' cuz set helps to replace

    }
}
