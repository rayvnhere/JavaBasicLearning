import java.util.HashMap;
import java.util.Map;

public class E8MapsWithLambda {
    public static void main(String[] args) {

        Map<String,Integer> maps= new HashMap<>();
        maps.put("Apple",20);
        maps.put("Banana",15);
        maps.put("Kiwi",5);
        maps.put("Orange",20);

        maps.forEach((k,v)->System.out.println(k));// only keys will get printed
        maps.forEach((k,v)->System.out.println(v));// only values prints
        maps.forEach((k,v)->System.out.println(k+" "+v));// both key and value prints
        System.out.println("********************************");

        maps.forEach((k,v)-> {
            if (k.contains("A")|| v>10){
                System.out.println(k+" "+v);
            }
        });
    }

}







//wherever there's a loop it can be replaced with LAMBDA
/* Rule of Lambda
        //arrayList store 1 value at a time so  its DOESN'T need parenthesis        e->
        //map stores 2 (key and value) so it needs its OWN parenthesis     (k,v)
    Another Rule
    if you're going to write more code after this (->) then add these { } after ->



 */