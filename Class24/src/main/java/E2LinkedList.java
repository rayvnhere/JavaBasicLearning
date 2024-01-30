import java.util.LinkedList;
import java.util.List;

public class E2LinkedList {
    public static void main(String[] args) {

        //if we want to store the objects of string class,
        //then have to write the nameOfClass i.e. String
        LinkedList<String> names= new LinkedList<>();
/* can also do this    List<String> names= new LinkedList<>();    //here upcasting/widening is happening
                       list<String> names= new ArrayList<>();
cuz both have LIST as an interfaces

 */


        //like arrayList we can use addMethod, removeMethod, contains, get, indexOf, size, set and there are more
        names.add("");
        names.remove(0);
        System.out.println(names);

        /*how did programmers made sure that allMethods, exact parameters and return
how is arrayListClass and linkedListClass same? THEY HAVE USED INTERFACES
'LIST' interface was implemented by Arraylist Class and LinkedList Class

but why arrayList and LinkedList are exact same? why duplicate for linkedList?
Ans;  arrayList stores memeory in a consecutive manner (meaning there's no space between the elements e.g. A is right next to B
they are all together in the same line/row/order
But linkedLIst it can have data that we store inside it, PLACED anywhere/random inside the memory
and uses pointers to connect e.g. A knows the addrsss of B (wherever B is)

Pros of storing memory of array's in straightRow/consecutive way?
1. finding/navigating the elements is easy cuz there's no space, direct access to any element
    visiting the element is fast

Cons of arrayList (is ORGANIZED)
1. for adding new element in the straightRow has to make space between, know as "Data Shifting" then have to more
lots of data in the memory to make space cuz memory is fixed
    adding or removing is very tough and hard


Cons of storing memory in linkedList (is RANDOM)
1. if I want to get an element of 'C', then I have to go in order from A to B to C
have to go through them all
    visiting the element is slow

Pros
1. can easily re-adjust, B can point to "new element" and then it points to another
    adding or removing is very simple and easy


    e.g. unorganized clothes (linkedList) searching is hard
    e.g. organized clothes (arrayList) searching is easy

    e.g. when retriving data its better to use arrayList
    e.g. when adding/removing data its beter to use linkedList




         */
    }
}
