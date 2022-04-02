import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Random;

public class signUpOrganizer {
    public static String browser = "chrome";
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        if (browser.equals("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "E:\\BrowserDrivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "E:\\BrowserDrivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        Random randomEmail = new Random();
        int randomInt = randomEmail.nextInt(1000);
        driver.manage().window().maximize();
        driver.get("https://politrip.com/account/sign-up");
        Thread.sleep(2000);
        WebElement acceptCookies = driver.findElement(By.id("cookiescript_accept"));
        acceptCookies.click();
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Radu");
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Afrasinei");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("username"+randomInt+"@mail.com");
        WebElement password = driver.findElement(By.id("sign-up-password-input"));
        password.sendKeys("Password.1234");
        WebElement confirmPassword = driver.findElement(By.id("sign-up-confirm-password-input"));
        confirmPassword.sendKeys("Password.1234");
        scroll.executeScript("arguments[0].scrollIntoView();", email);
        WebElement dropDownList = driver.findElement(By.id("sign-up-heard-input"));
        dropDownList.click();
        WebElement optionOne = driver.findElement(By.xpath("//option[@value='webSearch']"));
        optionOne.click();
        WebElement optionTwo = driver.findElement(By.xpath("//option[@value='socialNetworks']"));
        optionTwo.click();
        WebElement optionThree = driver.findElement(By.xpath("//option[@value='fromAFriend']"));
        optionThree.click();
        WebElement optionFour = driver.findElement(By.xpath("//option[@value='other']"));
        optionFour.click();
        WebElement signUp = driver.findElement(By.xpath("//span[@class='button-label']"));
        signUp.click();
        Thread.sleep(2000);
        scroll.executeScript("window.scrollBy(0,500)");
        WebElement organizer = driver.findElement(By.id("qa_signup-organizer"));
        organizer.click();
        Thread.sleep(2000);
        driver.quit();
    }


}
