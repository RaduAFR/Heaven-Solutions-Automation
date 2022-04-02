import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksBottomPage {

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

        driver.manage().window().maximize();
        driver.get("https://politrip.com/account/sign-up");
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get("https://politrip.com/account/sign-up");
        Thread.sleep(2000);
        WebElement acceptCookies = driver.findElement(By.id("cookiescript_accept"));
        acceptCookies.click();
        scroll.executeScript("window.scrollBy(0,1000)");
        WebElement howItWorks = driver.findElement(By.id("qa_footer-how-it-works"));
        howItWorks.click();
        Thread.sleep(2000);
        driver.navigate().back();
        scroll.executeScript("window.scrollBy(0,1000)");
        WebElement contactUs = driver.findElement(By.id("qa_footer-contact-us"));
        contactUs.click();
        WebElement contactUsClose = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-main-modal/div/div[1]/button/span"));
        contactUsClose.click();
        Thread.sleep(2000);
        WebElement legalAgreements = driver.findElement(By.id("qa_footer-terms-and-conditions"));
        legalAgreements.click();
        Thread.sleep(2000);
        driver.navigate().back();
        scroll.executeScript("window.scrollBy(0,1000)");
        WebElement faq = driver.findElement(By.id("qa_footer-faq"));
        faq.click();
        WebElement faqClose = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-main-modal/div/div[1]/button/span"));
        Thread.sleep(2000);
        faqClose.click();
        driver.quit();

    }
}
