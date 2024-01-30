import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*Create a Set in which you need to add names of the countries(4).
In this set we want all objects to be sorted in alphabetical order.
Using 2 different ways retrieve all elements from set.
*/
public class Task02Countries {
    public static void main(String[] args) {
        Set<String> countrySet= new TreeSet<>();
        countrySet.add("Canada");
        countrySet.add("Australia");
        countrySet.add("Brazil");
        countrySet.add("India");

        System.out.println(countrySet);  //one Way

        for (String country: countrySet){ //another Way
            System.out.println(country);
        }
    }
}
