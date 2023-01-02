package jUnit01;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

public class IframeQuestion extends TestBase {


    @Test
    public void test01(){
        //1. “http://webdriveruniversity.com/IFrame/index.html” sayfasina gidin
        driver.get("http://webdriveruniversity.com/IFrame/index.html");
        //2. “Our Products” butonuna basin
        WebElement iframeElement = driver.findElement(By.id("frame"));
        driver.switchTo().frame(iframeElement);
        driver.findElement(By.xpath("//a[text()='Our Products']")).click();
        //3. “Cameras product”i tiklayin
        driver.findElement(By.id("camera-img")).click();
        ReusableMethods.bekle(2);

        //System.out.println(driver.findElement(By.xpath("//div[@class='modal-body']")).getText());
        driver.findElement(By.xpath("//button[text()='Close']")).click();
        //driver.switchTo().defaultContent();
        driver.switchTo().parentFrame();
        driver.findElement(By.xpath("(//a[@id='nav-title'])[1]")).click();

        //4. Popup mesajini yazdirin
        //5. “close” butonuna basin
        //6. "WebdriverUniversity.com (IFrame)" linkini tiklayin
        //7. "http://webdriveruniversity.com/index.html" adresine gittigini test edin
        String expectedUrl="http://webdriveruniversity.com/index.html";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

    }





}
