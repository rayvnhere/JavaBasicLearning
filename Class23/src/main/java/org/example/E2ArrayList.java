package org.example;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();

        System.out.println(names.size());//0
        names.add("Bikal");
        System.out.println(names.contains("Bikal"));
        names.add(("me"));

        System.out.println(names.size());//1
        names.remove("Bikal");// removes bikal one element
        System.out.println(names.size());

    }
}


/*
 *Can seacrh content for you   names.contains


 */