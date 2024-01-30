import java.util.Map;
import java.util.TreeMap;

/*Create a map of countries(5) with its capital that will store countries in alphabetical order.
Country names will be keys and capitals will be values
Print all keys and values from a country map using for each loop or Lambda.
Print all values from a country map using for each loop or Lambda.   */
public class T2MapsLambda {
    public static void main(String[] args) {
        Map<String,String> countries = new TreeMap<>(); //TreeMap for alphabetical order
        countries.put("UK","London");
        countries.put("Oman","Muscat");
        countries.put("India","Deli");
        countries.put("Pakistan","Islam");
        countries.put("Bangladesh","Dhaka");
        countries.forEach((k,v)-> System.out.println(k+" "+v)); //Print all keys and values
        countries.forEach((k,v)-> System.out.println(v)); //Print all values
    }
}
