import java.util.*;

public class E3Maps {
    public static void main(String[] args) {

        Map<String,Integer> maps= new HashMap<>();
        //newer version of java doesnt need dataType can just use Var
        maps.put("Apple", 20);
        maps.put("Banana", 15);
        maps. put("orange", 20);
        System.out.println(maps);

//map Methods
        //can seperate keys and values
        System.out.println(maps.keySet()); //returns set of all keys
        //outPut : {Apple, Kiwi, Orange}

        System.out.println(maps.values());  //retuns set of all values

//Maps dont support loop directly, but if we want to write a loop then we must first
// get the keys or values in the form of set like below;
//      maps.keySet();  //data is returned in the form of set meaning can create a var of type 'Set' like below
        Set<String> keys = maps.keySet();// String is for keys and its giving us all keys set
        //returns the keys in the form of set

//can also convert the above keySet into arraylist
        //first create an arraylist and pass the 'keys' in the constructor
        ArrayList<String> arrayList= new ArrayList<>(keys);

// Collections is the grandparent of list and set, so we can also do the below;
        Collection<String> key=maps.keySet();
//but maps AREN'T CHILDCLASS's of 'collection', so we cant write above line in line 6
        //here we can use 'Collection' cuz map has already converted the data to set



//to perform the operations individually/separately on keys then can use enchancedFor
        for(String k:keys){  //OLD
            System.out.println(k); // gives separated keys of each fruit
        }
       /* for(var k:keys){  //NEW
            System.out.println(k); // gives separated keys of each fruit
        } */
    }
}
/*          //newer version of java doesnt need dataType can just use Var

                     Map<String,Integer> maps= new HashMap<>();
                                         var maps= new HashMap<>();

                    Collection<String> key=maps.keySet(); //OLD
                                   var key=maps.keySet(); // NEW

                     ArrayList<String> arrayList= new ArrayList<>(keys); //OLD
                                   var arrayList= new ArrayList<>(keys); //NEW


                                   see   E5MapsVar







 */
