import java.util.ArrayList;
// teaching easiest way of iterating/changing/deleting data
public class LambdaWithArrayList {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Fah");
        names.add("Maria");
        names.add("Ray");
        names.add("Hay");
        names.add("Jay");

        names.forEach(e-> System.out.println(e));
//this says; from this arrayList i.e. names   forEach entry  perform the operation of printing

/*)    writes loop in just 1 line
    2) Lambda automatically figures the DATATYPE  (don't have to specify string dataType i.e. (String e ->)
    3) 'forEach' to iterate through each element (has built-in loop)
    it requires two variables i.e. (K for keys, V for values)

    4) ->  specify the operation that I want to perform on each above entries     */

        //but if you're going to write more code after this (->) then add these { } after ->
        names.forEach(e-> {
            if(e.contains("a")){System.out.println(e);}
        });


//there's Lambda expression for deleting elements from the data structure,-> it just needs a condition
        names.removeIf(d-> d.length()>3);  //this is functionalProgramming //has if-else and loop
//this says; if this d is going to be more then 3 letters then remove it from the arrayList(names)
// first d iterates through each entry
        System.out.println(names);

    }
}

//functional programming replaces everything with methods even if else and loops