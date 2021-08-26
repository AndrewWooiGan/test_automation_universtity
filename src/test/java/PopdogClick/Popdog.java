package PopdogClick;

import PopcatClick.Popcat;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popdog {

//    private WebDriver driver;





//        driver.get("https://popdog.click/");
//
//        //driver.manage().window().fullscreen();
//
//        clickClose.click();
//
//        WebElement inputLink = driver.findElement(By.className("clickImage"));
//        WebElement cookieBonus = driver.findElement(By.className("cookie"));
//
//        for (int i = 0; i < 100; i++) {
//            inputLink.click();
//            if (cookieBonus.isDisplayed()) {
//                cookieBonus.click();
//            }
//        }
//    }
        public static void main (String[]args) {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            String BASE_URL = ("https://popdog.click/");

            driver.get(BASE_URL);

            //close welcome pop up
            WebElement clickClose = driver.findElement(By.className("settingsCloseButton"));
            WebElement usernameDialog = driver.findElement(By.className("inputField"));

            usernameDialog.sendKeys("andrew");
            clickClose.click();

            WebElement inputLink = driver.findElement(By.className("clickImage"));
            WebElement cookieBonus = driver.findElement(By.className("cookie"));

            for(int i=0 ; i<100; i++){
                if (cookieBonus.isDisplayed() == false){
                    inputLink.click();
                }
                else{
                    cookieBonus.click();
                }
            }
//            for (int i = 0; i < 100; i++) {
//                inputLink.click();
//                if (cookieBonus.Displayed()) {
//                    cookieBonus.click();
//                }
//        }
            driver.close();
    }
    }





