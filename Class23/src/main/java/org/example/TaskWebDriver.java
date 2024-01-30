package org.example;
/*Create a WebDriver Interface that will have the following unimplemented
behaviour: openBrowser(), closeBrowser(), maximizeWindow(), findElement().
Create 2 classes that implements WebDriver interface:
Chrome Driver and FirefoxDriver.
 */
public interface TaskWebDriver {

    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements TaskWebDriver{

    @Override
    public void openBrowser() {
        System.out.println("ChromeDriver");
    }
    @Override
    public void closeBrowser() {
        System.out.println("ChromeDriver");
    }
    @Override
    public void maximizeWindow() {
        System.out.println("ChromeDriver");
    }
    @Override
    public void findElement() {
        System.out.println("ChromeDriver");
    }
}

class fireFoxDriver implements TaskWebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Firefox");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Firefox");
    }
    public void findElement(){
        System.out.println("Firefox");
    }
}

//                                        Creating Object of ChildClass of Interface(not of Interface)

class webDriverTester{
    public static void main(String[] args) {
        //creating objects of two classes one by one    N O T      R E C C O M M E D E D

        /*ChromeDriver c=new ChromeDriver();
        c.openBrowser();
        c.maximizeWindow();

        fireFoxDriver f=new fireFoxDriver();
        f.indElement();
        f.closeBrowser();*/

        //dont have to write code for two classes,         LET   LOOPofARRAY    DO   THIS
/* Below is used PolyMo
created an array of type interface(TaskWebDriver)cuz interface can also be used to store OBJECTS OF CLASSES WHICH
IMPLEMENTS THAT INTERFACE*/
        TaskWebDriver [] arr={new ChromeDriver(),new fireFoxDriver()};
        for (TaskWebDriver task:arr){
            task.openBrowser();
            task.maximizeWindow();
            task.findElement();
            task.closeBrowser();
            System.out.println();
        }
    }
}



