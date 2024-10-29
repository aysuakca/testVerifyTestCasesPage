package testCase2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class testVerifyTestCasesPage {
    @Test

    public void verifyTestCasesPageIsDisplayed(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://automationexercise.com/");

        WebElement logo = driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));
        Assert.assertTrue(logo.isDisplayed());

        WebElement testCases = driver.findElement(By.xpath("//a[text()=' Test Cases']"));
        testCases.click();

        WebElement testCasesLogo = driver.findElement(By.xpath("(//span[@class='google-anno-t'])[1]"));
        Assert.assertTrue(testCasesLogo.isDisplayed());

        driver.quit();
        }
    }


