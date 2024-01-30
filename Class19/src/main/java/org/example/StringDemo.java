package org.example;

public class StringDemo {
    public static void main(String[] args) {
        String str="My phone number is 911";
        //in case I only want number back
        //regular expression
        str=str.replaceAll("[^0-9]","");
        System.out.println(str);
    }
    //regex helps to avoid garbage data
    //last 20 mins of class19 talked about regex
}
