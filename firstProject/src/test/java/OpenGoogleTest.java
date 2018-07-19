import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class OpenGoogleTest {
    WebDriver driver;

@BeforeClass
    public void setUp() {

        driver = new ChromeDriver();
    }


@Test
public void siteOpeningTest(){

    driver.get("https://www.google.com/");
}
@AfterClass
public void tearDown() {
    driver.quit();
}

}

