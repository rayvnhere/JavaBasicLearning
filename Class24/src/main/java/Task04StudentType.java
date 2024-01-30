import java.util.HashSet;
import java.util.Set;

/*Create a Set that will hold Objects of Student Type.
In this set we do not care about the insertion order.
Each student object should have name and studentID.
Display name of each student. */
public class Task04StudentType {
    public static void main(String[] args) {
        Set<classCreationForStudentObjectT04> student= new HashSet<>(); //hashSet cuz doesnt care for insertion

        // one Way
        classCreationForStudentObjectT04 s=new classCreationForStudentObjectT04("dylan","234");
        //made var here above i.e. s
        student.add(s);// student if SET's Var

        // another Way // didnt created var here //much easier
        //created object and stored values
        student.add(new classCreationForStudentObjectT04("mike","123"));

        student.add((new classCreationForStudentObjectT04("jesse","000")));

        for(classCreationForStudentObjectT04 s1: student){
            s1.printInfo();
        }


    }
}
