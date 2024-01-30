package Class27isClass28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// this is just an example of HOW dev used to USE finally keyword
// before JAVA 7 & 8 introduced "try-with-resources"

public class E7FinallyExample {
    public static void main(String[] args) {

        FileInputStream fis=null;
        try {
            fis = new FileInputStream("C:\\Users\\Syntax\\IdeaProjects\\SDETJavaB18\\Files\\Batch18.xlsx");
        }catch (FileNotFoundException e){
            System.out.println("Please check the file path");
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println("Error closing the file");
            }
        }
    }
}
