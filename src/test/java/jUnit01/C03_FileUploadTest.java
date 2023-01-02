package jUnit01;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

public class C03_FileUploadTest extends TestBase {
 //  1.https://the-internet.herokuapp.com/upload adresine gidelim2.chooseFile butonuna basalim
 //


    // 3.Yuklemek istediginiz dosyayi secelim.
 //      4.Upload butonuna basalim.
 //  5.“File Uploaded!” textinin goruntulendigini test edelim.
    @Test
    public void test01(){
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement chooseFileButton = driver.findElement(By.xpath("//*[@id='file-upload']"));
        String filePath = System.getProperty("user.home")+"/Desktop/serkan.txt";
        chooseFileButton.sendKeys(filePath);
        driver.findElement(By.xpath("//*[@id='file-upload']")).click();
        WebElement fileUploadedElement= driver.findElement(By.tagName("h3"));
        Assert.assertTrue(fileUploadedElement.isDisplayed());

        ReusableMethods.bekle(5);

    }










}
