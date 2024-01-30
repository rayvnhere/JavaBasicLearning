import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class E6MapsVarMethods {
    public static void main(String[] args) {

        Map<Integer, String> studentMap= new LinkedHashMap<>();
        //'Integar' is key and 'String' is values
        //LinkedHashMap/Insertion Order > data will be arranged in original order

        studentMap.put(1,"sino");
        studentMap.put(2,"nasima");
        studentMap.put(3,"karimi");
        studentMap.put(10,"halil");
        System.out.println(studentMap);

/*maps dont support forLoop, cuz data isnt stored in the form of Index
  *   Entry > is an interface

* Three method's in Maps;
  1) KeySet > only gives key
  2) Values > only gives value
  3) entrySet > gives both keys and values

//below is how it looks without VAR keyword
        Set<Map.Entry<Integer, String>> studentEntries= studentMap.entrySet(); //these are called  nestedDataTypes > one class nested inside another class
in case i dont remember how to write above nestedClass then PRESS on entrySet(); < its a method and PRESS ALT ENTER = to get 'local variable' and it will write all nestedClass before studentMap.entrySet();
//anotherWAy: touch entrySet(); and click on yellow bulb to create 'local variable'

*   MAP (framesContains) > ENTRY (frameContains) > Key & Value (frame)
*Set<Map.Entry<Integer, String>>
    'Map' goes in entry, then 'Entry' goes in 'Integer, String'

*so instead of writing nestedDataTypes of(Set<Map.Entry<Integer, String>>), VAR was created, see below line
        var studentEntries2= studentMap.entrySet();             */

        Set<Map.Entry<Integer,String>> entries = studentMap.entrySet();
        //how to write enchancedLoop for nestedDataTypes
        for(Map.Entry<Integer,String> e: entries){
            if (e.getKey()>2) //printing started from 3rd
            //entrySet has two Methods available that we can use > getKey()   get.Value()
            System.out.println(e.getKey()+" "+e.getValue());}

        //this loop helps to get the KEY and VAlUES individually, this wasn't possible with line 16 cuz it prints everything
        //can do switch and many more logic here in loop



//var and nestedClasses does the same thing
//Following is with VAR keyword's approach instead of nestedDataTypes
        var entries1 = studentMap.entrySet(); // var doesn't need this line, I wrote for my underStanding
        for (var e: entries1){
            var key=e.getKey();
            var value=e.getValue();
            System.out.println(key+" "+value);
        }



/*  Java.8 introduced 'Lambda' it helps
    1) writes loop in just 1 line
    2) Lambda automatically figures the DATATYPE

    3) 'forEach' to iterate through each element (has built-in loop)
    it requires two variables i.e. (K for keys, V for values)

    4) ->  specify the operation that you want to perform

 *///  with LAMBDA expression  // does the samething as loop
        studentMap.forEach((k,v)-> System.out.println(k+" "+v));
//this say; for each entry of (k and v) from studentMap get it and print it

/* to learn more about LAMBDA
https://youtu.be/gpIUfj3KaOc?feature=shared
*/


}}