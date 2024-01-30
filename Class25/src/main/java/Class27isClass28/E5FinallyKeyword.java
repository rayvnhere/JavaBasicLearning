package Class27isClass28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E5FinallyKeyword {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\Syntax\\IdeaProjects\\SDETJavaB18\\Files\\Batch18.xlsx");

        } catch (FileNotFoundException f) {
            System.out.println("Please check the path");
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println("Somewthing went wrong");
            }
        }
    }}
/* There are 5 keywords in exception:-
1) try { here we write the problematic code}
2) catch { here we write the code that will handle the exception/ solution / plan B
3) throws { when we throw the exception manually of method signature to save our error but others will get error
4) throw { save as throws?
5) finally { closes and can be used to close the resources and finally keyword always executes
* companies have resources/database that are expensive and should always be closed
*/
/* why close in finally?
ans: cuz java will always execute the finally block, even if there error in the code BEFORE it or not
 see example in E6FinallyExample*/
