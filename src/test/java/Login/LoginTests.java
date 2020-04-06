package Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
public class LoginTests {
    private WebDriver driver;
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://github.com/login");
        Thread.sleep(5000);
//1. maximize the window
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.findElement(By.id("login_field")).sendKeys("sulaimondamola96@gmail.com");
        driver.findElement(By.id("password")).sendKeys("DxG76gAgtduMwY3");
        driver.findElement(By.className("btn btn-primary btn-block")).click();
    }
    public static void main(String args[]) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setUp();
    }
}