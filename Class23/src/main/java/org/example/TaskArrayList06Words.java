package org.example;
/*
Create an arrayList of words. Remove every word that ends with 'e'

hint; whatever code we write thers' an error
*use enhancedFor

solution at T2
 */
public class TaskArrayList06Words {
}



/*
*arrayList is dynamic in size; when you use the operations of 'remove' or 'add' it changes the index of elements
and arrage itself again e.g if remove 0 then (index rearraged 0 to 0 ) BUT it will start from 2 thnking it was 1 and will skip
the 0 element like below;
Before
car 0
una 1
nazir2
(after rearranging)
car 0    (we removed)
una 0    (this entry gets skipped, cuz took index place)
nazir 1  (loop doesnt know rearragnement, it goes to 1)
* its better to i-- (to decrease the index to go back to previous element)

                     DONT have to do all this in arrayList(using of loop to remove)
                     * in arrayList there is a method called  (.removeIf(x->x.endsWith("a")) > it takes a conditon as input and when it matches
                      then it removes it automatically
                     * (x->) is called lambda expression
                     * x is a variable name, meaning it will automatically
                     pick all names and places in x (behind the scence internally)
                     * x can be anything it can be y, c or even names instead of x but in lambda expression we use/call them x
                     * removeIf internally has loop, lambda helped to save code writing
                     * can remove or print things using lambda like below
                     words.forEach(x-> system.out.println(x));
                     this will pick all names and print them
                     * arrayList supports lambda expression


 */