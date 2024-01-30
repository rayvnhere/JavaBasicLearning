import java.util.Arrays;

public class anaGram {
    public static void main(String[] args) {
        String s1="silent";
        String s2="listen";
        char[] s1Arr=s1.toCharArray();
        char[] s2Arr=s2.toCharArray();
        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);
        System.out.println(Arrays.toString(s1Arr));
        System.out.println(Arrays.toString(s2Arr));
        //to check if arrays are equals
        System.out.println(Arrays.equals(s1Arr,s2Arr));

//this is what he said; first I converted string to array, then sorted to arrange every letter
//and after arranging and then wrote a loop to check if the elements are same or not
    }
    }







/*Check if Two Strings are Anagrams: Given two strings, determine if they are
anagrams, meaning they contain the same characters in a different order.
For example, "listen" and "silent" are anagrams.

i think it was 2nd project's question that other wanted asghar to solve, tho i dont understand this, I have skipped
both projects, hw's and repls task
 */