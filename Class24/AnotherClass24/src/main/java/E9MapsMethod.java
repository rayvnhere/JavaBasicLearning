import java.util.HashMap;
import java.util.Map;

public class E9MapsMethod {
    public static void main(String[] args) {
/*This class is for Teaching how to remove elements from maps using LAMBDA
*LAMBDA has removeIf method
*Maps dont have removeIf method in Java.11
* to remove elements in map, first we convert map to entrySet,then use removeIf method from LAMBDA
why? cuz entrySet is a collection then we get access to removeif and other methods from collection FrameWork
* Map isnt from collection, its a different data structure
* removeIf Method looks for a condition and if the conditon returns true then that element is removed and if not then its not removed
         */
        Map<String,Integer> maps= new HashMap<>();
        maps.put("Apple",20);
        maps.put("Banana",15);
        maps.put("Kiwi",5);
        maps.put("Orange",20);

        maps.entrySet().removeIf(e-> e.getKey().contains("i")); // for removing key
/*Above line says; 'MAPS' is converted to 'ENTRYSET'(has all entries), then entrySet gives access to 'REMOVEIF', removeIf says
gives me a condition and then ' (e->) ' is lambda is applied on that entrySet
'  e. ' is variable of entry is used to get access to keys (GETKEY) and then gave the condition of 'CONTAINS' that
IF the key contains the letter 'i' then remove it.
// (e->) e is representing entry    */

        maps.entrySet().removeIf(e-> e.getValue()==5); //for removing Value
        maps.entrySet().removeIf(e-> e.getValue()==5 || e.getKey().contains("O")); // for removing key & value
        maps.entrySet().removeIf(e-> e.getKey().contains("a") || e.getKey().length()>5); //can add many conditions
        System.out.println(maps);

        //below code does the same thing as line 28 and line 28 is preferred
        /*    maps.entrySet().removeIf(e->{
            if(e.getValue()==5||e.getKey().toLowerCase().contains("O")){
                return  true;
            }else{
                return false;
            }
        });*/

    }
}
