package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static String read(String key) throws IOException {//this method ONLY TAKES KEY
        return read(key,Constants.CONFIG_FILE_Path);
    }
//methodOverLoaded for flexibility
    public static String read(String key,String path) throws IOException {//this method TAKES KEY and PATH
        FileInputStream fis= new FileInputStream(path);
        Properties properties= new Properties();
        properties.load(fis);
        return properties.getProperty(key);
    }
}

/* //void doesn't give back, we need back the returnType so used 'String
//on job everything above remains same except the path i.e.  CONFIG_FILE_Path="C:\\Users\\ayesh


 ConfigReader helps to read by writing the code here to read the data from a file, need the following steps;
  1) Location > ( know the location of the file I want to read is Constants)
  2)Navigate > by using FileInputStream and pass the location of the file (Constants.CONFIG_FILE_Path)
  3) properties > ( need this speacial class that understands how a specfici type of file workds
                     and load it)
  4) (Used String instead so String need smth in return)
        Return gives us the properties by getting properties of key





 */
