import java.util.LinkedHashSet;
import java.util.Set;

/*Create a Set of cities in which you want to make sure that insertion order is maintained.
Then remove any city that starts with the letter a   */
public class Task03InsertionStartsWith {
    public static void main(String[] args) {
        Set<String> citySet= new LinkedHashSet<>();//linkedHashSet for insertion to stay maintained
        citySet.add("Annapolis");
        citySet.add("Ankara");
        citySet.add("Denver");

        citySet.removeIf(x->x.startsWith("a")); //didnt removed cuz small a and field has Capitol A
        System.out.println(citySet);


/*enchancedFor can never be used to remove element (from collectionFrameWork) cuz are dynamic their size/index gets rearranged

        for (String c:citySet){ // never going to work //throws error in console
            if(c.startsWith("a")){
                citySet.remove(c);
            }
        }*/
    }
}
/* cannot remove the element from list/set by using a LOOP, its not allowed
must use remove.if method */
