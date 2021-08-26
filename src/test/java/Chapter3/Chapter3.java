package Chapter3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Chapter3 {

    private WebDriver driver;
    public void setUp(){

        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        //driver.manage().window().fullscreen();

        WebElement inputLink = driver.findElement(By.linkText("Shifting Content"));
        inputLink.click();

        WebElement menuElement = driver.findElement(By.linkText("Example 1: Menu Element"));
        menuElement.click();

        List<WebElement> content = driver.findElements(By.tagName("li"));
        System.out.println(content.size());
        int i;
        for(i=0; i<content.size();i++){

            System.out.println(content);}

        driver.quit();


    }
    public static void main(String[] args){
        Chapter3 test = new Chapter3();
        test.setUp();
    }
}
