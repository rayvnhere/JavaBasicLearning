package Utils;
import java.nio.file.Path;
public class Constants {
    public static final String CONFIG_FILE_Path=System.getProperty("user.dir")+"\\Files\\Config.properties";
    public static final String EXCEL_FILE_PATH="C:\\Users\\ayesh\\IdeaProjects\\Class25\\Files\\excelJava.xlsx";
}

//write the file in all UPPERCASE CONFIG_FILE_Path
/*Constants
       stores location of Config.properties file
1) keeps all paths of file that my project needs
2) keeps all related info in one place
*//*
public static final String CONFIG_FILE_Path=System.getProperty("user.dir")
public= accessible to all classes
static= not much changes so used static
final= so that no other class can change it
CONFIG_FILE_Path= variable name to use when we call
System.getProperty("user.dir")= gives path for everyone's computer */

/* 'Constants' can save the location(path) of files and can reuse them by their variable name
*Instance Variable > whenever we are planning to create lots of obejcts of a class and
can store different values for different objects, while static is used when we dont want to make so much changes

*and so UTiLS class > is assisting to read and write data
 */