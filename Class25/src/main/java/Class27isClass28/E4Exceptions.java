package Class27isClass28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E4Exceptions {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Syntax\\IdeaProjects\\SDETJavaB18\\Files\\Batch18.xlsx");
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            //'TC block from java wrote above line //can change it to sout
            System.out.println("Please confirm if the file in in location");
        }
    }
}
/* Example of "Checked Exception" they are important, cuz they aren't controllable, cuz in above case, I dont the file
and its really complex what to do, so a try and catch block helps to SECURE the class and when it throws error , it wont
show the class but the EXCEPTION!
* 'try and Catch' block is only supposed to be written for 'Checked Exception'
 */
/* How to know if the exception is checked or unchecked from the code?
ans: for checked exception it will throw an error even before compiling
 */
/*how would we know what goes inside 'try and catch's parenthesis'?
ans: when Java shows an error, just hover over it, and it will show you the possible exception,
copy and paste it inside the catch (     )
or else just hover over the error and you will find "more actions" option
and it will create complete try and catch block for you.
*/