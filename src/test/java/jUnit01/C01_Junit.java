package jUnit01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Junit {
    /*
     Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.
    a. Verilen web sayfasına gidin.
    https://the-internet.herokuapp.com/checkboxes
    b. Checkbox1 ve checkbox2 elementlerini locate edin.
    c. Checkbox1 seçili değilse onay kutusunu tıklayın
    d. Checkbox2 seçili değilse onay kutusunu tıklayın
     */

    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

    }
    @After
    public void teardown() throws InterruptedException {
        driver.quit();
        Thread.sleep(3000);

    }
    @Test
    public void test01() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement chckbx1= driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement chckbx2= driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        if (!chckbx1.isSelected())
            chckbx1.click();
        Thread.sleep(3000);
        Assert.assertTrue(chckbx1.isSelected());

        if (!chckbx2.isSelected())
            chckbx2.click();
        Assert.assertTrue(chckbx2.isSelected());







    }

}
