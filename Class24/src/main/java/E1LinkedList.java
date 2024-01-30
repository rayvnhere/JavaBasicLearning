import java.util.LinkedList;

public class E1LinkedList {
    public static void main(String[] args) {


        LinkedList<Dog> dogs= new LinkedList <Dog>();
/*inside these <>  we store the nameOfClass, who's object we are going to store inside this collections framework
 *whatever we store inside <> we have to write its name*/

        //created object
        Dog d1=new Dog("Jacky", "German", 12);
        dogs.add(d1);
    //dogs is a var of linkedList now
    }
}
