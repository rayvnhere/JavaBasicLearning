import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class E6Sets {
    public static void main(String[] args) {

        Set<String> fruit= new LinkedHashSet<>();
        fruit.add("mango");
        fruit.add("apple");
        fruit.add("banana");
        fruit.add("mango");
        System.out.println(fruit);
        // printed : fruits are in ORDER but doesnt allow duplicates
        //has to maintain order thats why its slow

    }
}
