package Class27isClass28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E2Exception {
    public static void main(String[] args) {

        int number1= 10;
        int number2= 0;
        System.out.println(number1/number2);

        try {
            FileInputStream fis= new FileInputStream("sdfdfd");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }// hover over FileInputStream red error and it has the option of
        //"more options" > this creates 'try catch' block for the error (checked exception/important)

/*  Two categories of exception
1)  Checked exception(important one's) > java will automatically give a solution
2)  Non-check exception (unimportant one's)

* try and catch block was created for issues that aren't in our control, needs advanced java knowledge

 */





    }
}
