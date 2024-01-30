import java.util.*;

//﻿How can you remove all duplicates from ArrayList?
public class Task01Remove {
    public static void main(String[] args) {
        List<String> aList= new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        Set<String> removeDuplicates= new LinkedHashSet<>(aList);// SET removed all duplicates & linkedHashSet to keep the original flow
        //above line stored all aList
        aList.clear();
        //above line cleares all fields from the data
        aList.addAll(removeDuplicates);
        //above line adds all updates/modified elements that was stored in 'names' and adds it back to aList
        System.out.println(aList);

    }
}
