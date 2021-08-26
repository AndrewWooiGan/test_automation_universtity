package PopcatClick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popcat {

        private WebDriver driver;

        public void setUp() {

            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://popcat.click/");

            //driver.manage().window().fullscreen();

            WebElement inputLink = driver.findElement(By.className("title"));
            for(int i=0;i<1000000; i++)
            inputLink.click();

}

    public static void main(String[] args){
        Popcat test = new Popcat();
        test.setUp();
    }
}
