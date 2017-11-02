import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndeedJobSearch
{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shock\\Downloads\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        //Navigate to website
        chromeDriver.get("https://www.indeed.com/");

        //Enter search fields
        chromeDriver.findElement(By.id("what")).sendKeys("Selenium");
        chromeDriver.findElement(By.id("where")).clear();
        chromeDriver.findElement(By.id("where")).sendKeys("United States");
        chromeDriver.findElement(By.id("fj")).click();

        //Print off title and job count
        System.out.println(chromeDriver.findElement(By.id("searchCount")).getText());
        System.out.println(chromeDriver.getTitle());
    }
}
