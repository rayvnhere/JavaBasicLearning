import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*Create a map of Best Buy store.
Place item id and item name into it.
Example (7664847 = Printer, 7879885- TV etc)
Retrieve all keys and values from a Best Buy map using EntrySet.  */
public class HwMapsEntrySetBestBuy {
    public static void main(String[] args) {
        Map<Integer,String> bestBuy = new LinkedHashMap<>();
        bestBuy.put(7664847,"Printer");
        bestBuy.put(7879885,"TV");

//without VAR keyword
        Set<Map.Entry<Integer,String>> entries = bestBuy.entrySet();
        bestBuy.forEach((k,v)-> System.out.println(k+" "+v));

        //cant use var in <> ? idk






    }
}
