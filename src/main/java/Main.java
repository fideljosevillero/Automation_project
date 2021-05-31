import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/1739375/Documents/TCS/Automatizacion de pruebas/2.0/Automation-training/chromedriver.exe");
        By search = By.name("search");
        WebDriver driver = new ChromeDriver();
        //driver.get("https://www.tcs.com/tcs-opens-new-office-bogota-drive-digital-transformation-customers");
        driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
        System.out.println(driver.getTitle());
        Thread.sleep(1000);
        driver.findElement(search).sendKeys("los simpson");
        driver.findElement(search).submit();
        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//body/div[@id='content']/div[@id='bodyContent']/div[@id='mw-content-text']/div[1]/p[1]/a[7]")).click();
        driver.manage().window().fullscreen();
        Thread.sleep(10000);
        driver.quit();
    }
}
