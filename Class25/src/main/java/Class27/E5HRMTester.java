package Class27;
import Utils.ConfigReader;
import Utils.ExcelReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
import java.util.List;
import java.util.Map;
//this is how testing would be // 3:05
public class E5HRMTester {
    public static void main(String[] args) throws IOException {
        //access to HRM excel
        String path="C:\\Users\\ayesh\\IdeaProjects\\Class25\\Files\\HRMSTestData.xlsx";
        String sheetName="Sheet1";
        // make the program read it
        List<Map<String,String>> testData= ExcelReader.read(path,sheetName);
        System.out.println(testData);

        //access to the HRM website and credentials with the help of ConfigReader and its method
        String url= ConfigReader.read("url");
        String userName=ConfigReader.read("userName");
        String password=ConfigReader.read("password");

        //access to chrome
        WebDriver webDriver=new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get(url);
        WebElement userNameWE=webDriver.findElement(By.xpath("//input[@id='txtUsername']"));
        WebElement passwordWE=webDriver.findElement(By.xpath("//input[@id='txtPassword']"));
        WebElement enterBtn=webDriver.findElement(By.xpath("//input[@id='btnLogin']"));
        userNameWE.sendKeys(userName);
        passwordWE.sendKeys(password);
        enterBtn.click();

        //loop for entering excel data on its own
        testData.forEach(x->{
            webDriver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
            webDriver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
            webDriver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(x.get("FirstName"));
            webDriver.findElement(By.xpath("//input[@id='middleName']")).sendKeys(x.get("MiddleName"));
            webDriver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(x.get("LastName"));
            webDriver.findElement(By.xpath("//input[@id='btnSave']")).click();
        });





    }
}
