package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class E1FileHandlingReadingConfigFile {
    public static void main(String[] args) throws IOException {
        //variable to hold the location of file
        String path="C:\\Users\\ayesh\\IdeaProjects\\Class25\\Files\\Config.properties";
        //navigate to this location
        FileInputStream fis = new FileInputStream(path);
        //fileInputStream is a class

        //This is the special class that knows how to read/write data from .properties file
        Properties properties= new Properties();
        properties.load(fis); //it will load config file into this properties


        //After LocationFinding > navigating to Fis > creating properties class to read and load, Now I can print

        System.out.println(properties.getProperty("userName"));
        //passed the name of the key who's value I want to read




        }
}
