/*Create a map of a building.
Store floor number and its associated company name.
(Example: 1= Google, 2=Syntax etc..).
Insert 7 entries with duplicate keys and values.
Check how many entries you have?
* Update company on a 4th floor
* Remove company on the 7th floor
* Print your map  */
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class T1Map {
    public static void main(String[] args) {

        Map<Integer,String> building = new LinkedHashMap<>();
        building.put(1,"Google");
        building.put(2,"Google");
        building.put(2,"Syntax");
        building.put(3,"Amazon");
        building.put(4,"Amazon");

        building.replace(3,"Ebay");
        building.remove(1,"Google");
        System.out.println(building);

    }
}

/* PUT and Replace both replace BUT

PUT:     put can replace but if there's nothing to replace it will add/put entry anyway
Replace: if i use this and there's nothing to replace it will not add/put new entry
         replace only replace if there's already present pair of (key and value)

* so it's better to use 'replace' to replace cuz it won't create new entry
* when a 'key' is removed then 'value' automatically gets removed, cuz they are in pairs



 */
