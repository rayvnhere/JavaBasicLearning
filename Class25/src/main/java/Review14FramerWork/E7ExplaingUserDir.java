package Review14FramerWork;

public class E7ExplaingUserDir {
    public static void main(String[] args) {

        String firstPart=System.getProperty("user.dir");
        System.out.println(firstPart);
    }
}

/*     public static final String CONFIG_FILE_Path=System.getProperty("user.dir")+"\\Users\\ayesh\\IdeaProjects\\Class25\\Files\\Config.properties";
above line is from 'Constants' and this class explains what does   System.getProperty("user.dir")   means, it gets the
 this    C:\Users\ayesh\IdeaProjects\Class25    and each user's laptop has their own so   System.getProperty("user.dir")
 gets each user's.


 */
