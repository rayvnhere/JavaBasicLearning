package Class27isClass28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E5FileReaderADDMETHOD {
        static void readFile() throws FileNotFoundException {
//  readFile()   is called method signature its nameOfFile and parameters  > > > readFile()
// here I just ADDED the exception but just gave the disclaimer
//So whoever calls this method they will get the error
            FileInputStream fis= new FileInputStream("C:\\Users\\ayesh\\IdeaProjects\\Class25\\Files\\excelJava.xlsx");
        }
/*
here when someone again calls the readFile method, they will get the error
And they HAVE to write a try and catch block and if they also adds exception to method signature
like he did, then JVM (Java) will take care, cuz sometime when JVM reaches the end
it has a default handler and will might terminate the program 😅
So it's better to handle it with 'try and catch block'
 */
    public static void main(String[] args) {
        try{
            readFile();
        }catch(FileNotFoundException f){
            System.out.println("Please check the file Path");
        }
    }
    }

/* ABOVE EXAMPLE of  'ADD EXCEPTION to METHOD SIGNATURE'
its like throwing responsibility to someone else, its like I cant write 'try and catch block' so ask someone else



 */