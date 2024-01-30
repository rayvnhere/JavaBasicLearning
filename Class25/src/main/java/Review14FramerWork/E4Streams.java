package Review14FramerWork;

import java.util.Arrays;

public class E4Streams {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,5};
        int min= Arrays.stream(arr).min().getAsInt();
        int sum= Arrays.stream(arr).sum();
        System.out.println(sum);
    }
}
/* Benefit of a stream in arrays, as we know there's no built in method in array,
but with the help of stream you can get many.

e.g. to find the minimum in array, traditionally we use loop and if else conditions
but with streams you can use min method BUT first need to convert Array into Stream,
just like we convert map to entrySet :- like below
              int min= Arrays.stream(arr)



*Stream is applicable to Array, ArrayList, LinkedList, Set and Maps as well.
* Some Stream methods:-
'Collect' > will convert the elements one by one into smth else
'allMatch' > will tell whether all the elements match a specific number or not
'anyMatch' > will tel whether one specific number will match with any other number in the Array or not
'average' > will give the average of all the elements in the Array






 */