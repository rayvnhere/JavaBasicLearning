package org.example;

import com.sun.jdi.Value;

public class StringBuilderDemo {
    //cant have StringBuilder as className and then use this method
    public static void main(String[] args) {

        String str="Hello";
        //Strring str got attached to str.concat
        System.out.println(str.concat("and welcome"));

        StringBuilder sb=new StringBuilder("hello");
        sb.append(" and welcome"); //thers no concat method of sringBuilder its called .append
        System.out.println(sb);


        /*when changing the value of String Value again and again, it will give error
                so its better to use StringBuilder

                StringBuffer is like StrignBuilder
                StringBuffer has treadsafety, makes the code more secure*/

        /*String has .concat method
        //concat is called .append for StringBuilder
        StringClass is designed to save space, it reuses, slow but memrory affeciant
        StringBuilder is desgnied for speed, nver searches memoery i.e.

    */
    }

}
