/*Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order.
In that map store personId and a Person Object.
Print each object details.
Example of key is 1, 2,3 etc. */

import java.util.Map;
import java.util.TreeMap;

public class T3MapPerson {
    public static void main(String[] args) {
        Map<Integer, Person> PersonMap= new TreeMap<>();
        PersonMap.put(1,new Person("joe","doe",30,300));

        PersonMap.forEach((k,personObj)-> {
            System.out.println("PersonID is "+k);
            personObj.printInfo();
        });



    }
}
