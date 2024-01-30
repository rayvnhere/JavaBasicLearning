package Class27isClass28;
import java.io.FileInputStream;
import java.io.IOException;
//Try-with-resources Example
// only works in Java 8 not for Java 7 || 6
public class E8TryWithResources {
    public static void main(String[] args) {
/* create two parenthesis next to try i.e () and store inside it the code that is helping
to open the resource i.e (navigate to the file for this example using FileInputStream */
        try(FileInputStream fis = new FileInputStream("C:\\Users\\Syntax\\IdeaProjects\\SDETJavaB18\\Files\\Batch18.xlsx")) {

        }catch (IOException e){
            System.out.println("Please check the file path");
        }
    }
}
