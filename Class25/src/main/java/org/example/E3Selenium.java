package org.example;

import Utils.ConfigReader;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class E3Selenium {
    public static void main(String[] args) throws IOException {
        /*should never store URL and credentials inside code, like below UNSAFE
        this is how it looks without files
        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String userName="Admin";
        String passWord="Hum@nhrm123";
        add these in Config.properties to keep it safe to my laptop only   */
//******************************************************************************************************
//                                      DO THIS ONLY
        //how to provide credential file to read and use it here?
        //ans= use ConfigReader file


        String url= ConfigReader.read("url");
        String userName= ConfigReader.read("username");
        String passWord= ConfigReader.read("password");
        //now if I push these code to online, no user can read my credentials, it's SAFE

        //opening and accessing the website
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        WebElement userNameWE=driver.findElement(By.xpath("//input[@name='txtUsername']"));
        WebElement passWordWE=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        WebElement enterBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        //he found xpath by "LetxPath and could see 'SelectorHub'

        userNameWE.sendKeys("userName");
        passWordWE.sendKeys("passWord");
        enterBtn.click();

        driver.close();




    }
}
