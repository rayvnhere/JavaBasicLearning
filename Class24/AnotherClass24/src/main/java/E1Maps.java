import java.util.HashMap;
import java.util.Map;

public class E1Maps {
    public static void main(String[] args) {
// Map is name of the interFace is Map
//keys helps to get the data and so they act like index

//inside   < > has to specify two dataTypes
//HashMap  is the nameofClass that is implementing the Map InterFace
//this is all dataType >           Map<String,Integer>
//'maps' is var and its dataType is above and this is object > new HashMap<>()
        Map<String,Integer> maps= new HashMap<>();

// 'put' is like add inside the map
        maps.put("Apple", 20);
        maps. put("kiwi", 5);
        //apple is key and value that is associated with the key is 20

        maps.put("banana", 15);
        maps.put("kiwi", 15);
        System.out.println(maps);

//method's in maps
        System.out.println(maps.size());//total elements //output: 4
        System.out.println(maps.containsKey("Apple")); //if present //output: true
        System.out.println(maps.containsValue(25)); //output: false
        System.out.println(maps.isEmpty()); //output: false cuz it has items
        System.out.println(maps.get("kiwi")); //output: 15 (got kiwi's overriden value)
        /*but if i pass 5 then i wont get "kiwi" cuz values can be duplicated
        so getMethod is only going to work for key's cuz they are always unique
        by unique it means, if we insert another field like below, then kiwi's value gets OVERRIDDEN cuz there can be only 1 key in map
        * maps. put("kiwi", 15)   // duplicate keys are not allowed if we try it will replace previous value  */

//how to check keys but ignore case
        System.out.println(maps.containsKey("Apple".toLowerCase()));  //output: returns false cuz there's no lowerCase apple

//* whatever comes on left is KEY and whatever that comes on right is VALUE


    }
}
