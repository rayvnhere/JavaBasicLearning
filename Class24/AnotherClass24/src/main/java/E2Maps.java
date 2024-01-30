import java.util.HashMap;
import java.util.Map;

public class E2Maps {
    public static void main(String[] args) {
        Map<String,Integer> maps= new HashMap<>();

        maps.put("Apple", 20);
        maps.put("Banana", 15);
        maps. put("kiwi", 5);
        maps. put("orange", 20);
        System.out.println(maps);

//map Methods
        maps.remove("Kiwi"); //outPut: removes both key and value (pair)

        maps.replace("Apple",30); // value of 20  replaced to 30
        System.out.println(maps); //printed modified apple's value

        maps.clear(); // output: {}  // cuz removes everything other then {}
        System.out.println(maps);
       //* maps we use 'replace' and in arraylist we use 'set'









    }
}
