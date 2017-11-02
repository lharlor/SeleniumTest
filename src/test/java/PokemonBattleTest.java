import junit.framework.TestCase;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PokemonBattleTest extends TestCase {

    private WebDriver chromeDriver;
    @Before
    public void start()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shock\\Downloads\\chromedriver.exe");
        //Start
        chromeDriver = new ChromeDriver();

        chromeDriver.get("http://lharlor.greenrivertech.net/IT_305_Final/Pokemon_Trading/");
    }

    public void testSiteConnection()
    {
        start();
        //Navigate to website

        //compare title
        assertEquals("Pokemon Battle", chromeDriver.findElement(By.id("title")).getText());
    }

    public void testTransaction()
    {
        start();

        //Navigate to pokemon mart
        chromeDriver.findElement(By.id("pokemart")).click();

        //input amount of greatballs
        chromeDriver.findElement(By.id("greatball")).sendKeys("3");
        chromeDriver.findElement(By.id("checkOut")).click();
        assertEquals("$0", chromeDriver.findElement(By.id("currentMoney")).getText());
    }
}
