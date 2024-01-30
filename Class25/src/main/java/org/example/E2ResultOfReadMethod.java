package org.example;

import Utils.ConfigReader;

import java.io.IOException;

public class E2ResultOfReadMethod {
    public static void main(String[] args) throws IOException {

        String toReadValue =ConfigReader.read("username");
        System.out.println(toReadValue);
    }
}

/*How to use the method we created from ConfigReader to read files, so that I dont have
to write the steps to read the file again and again?

Ans=                 ConfigReader.read("username")
'ConfigReader' > (nameOfClass) '.' > dot cuz its a static method 'read' > nameOfMethod
() > pass the "key" who value I want to read

whats the returnType of read method?
ans= so store it with that dataType (in ConfigReader the returnType of read was 'String' so
                 String toReadValue =ConfigReader.read("username");

* created ConfigReader to read Config.properties
we wrote all code in ConfigReader so that we dont have to write it again and again for each class
and could just reuse it by creating a method i.e.  ConfigReader.read("");
 */
/* Why are we learning how to read data from a file?
   1) more secure
   2) less error prone

* what we call when we want to read and write data from a file?
Ans= fileHandling


*Whats the steps to handle/read/write file?
ans= 1) know the location of file
     2) navigate to that location where the file is stored (FileInputStream)
     by using FileInputStream and pass the location of the file (Constants.CONFIG_FILE_Path)
     3) special class that understands how the file works i.e. properties
 */

