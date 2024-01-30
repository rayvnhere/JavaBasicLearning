package Review14FramerWork;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class E2Maps {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> studentsMap=new LinkedHashMap<>();
        studentsMap.put("John",95);
        studentsMap.put("Adam",88);
        studentsMap.put("Muh",92);
        studentsMap.put("Kat",91);
        studentsMap.put("Kari",90);

        /*System.out.println(studentsMap);//print in one row with {  }
        ArrayList<String>names=new ArrayList<>();
        studentsMap.forEach((k,v)->{
            if(v>90)//can do this as well
            System.out.println(k+" "+v);//prints without {  } and in order of column
        });
*/

//TASK  Pick the name of student from MAP who scored more than 90 and store them in a list
        ArrayList<String> names= new ArrayList<>();  //creating of studentsVar
        studentsMap.forEach((k,v)->{ //loop using lambda
           if(v>90){  //using the condition of 90
               names.add(k); //after condition storing names of students// names > from arrayList // k picks auto student names
           }
        });//print outside of loop
        System.out.println(names);  //will only print names of students, that stored conditioned names











    }
}
