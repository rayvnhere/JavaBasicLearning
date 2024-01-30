package Review14FramerWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E5FilesWithoutConstantsFile {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\ayesh\\IdeaProjects\\Class25\\Files\\Config.properties";
        FileInputStream fis= new FileInputStream(path);

//* properties is specially designed for (key,value) pairs
        Properties properties= new Properties();
        properties.load(fis);
        System.out.println(properties.getProperty("url"));


        //* Instead of doing all this above/code, we could have created a method
        //to reuse the code anytime, by just calling the method and store them under 'Utils' package



    }
}
