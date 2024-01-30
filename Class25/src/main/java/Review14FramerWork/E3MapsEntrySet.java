package Review14FramerWork;

import com.google.common.collect.Maps;

import java.util.LinkedHashMap;

//TASK remove students who have less or equal to 90 score, and print them
//along with the names that contains "a"
public class E3MapsEntrySet {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> studentsMap= new LinkedHashMap<>();
        studentsMap.put("John",95);
        studentsMap.put("Adam",88);
        studentsMap.put("Muh",92);
        studentsMap.put("Kat",91);
        studentsMap.put("Kari",90);
/*Maps dont have removeIf method, so first I need to convert it to 'entrySet', so that entrySet give me removeIf */

        // first use mapsVar then use .entrySet and write all logic
        studentsMap.entrySet().removeIf(e-> e.getValue()<-90 || e.getKey().contains("a"));
        System.out.println(studentsMap);



    }
}
