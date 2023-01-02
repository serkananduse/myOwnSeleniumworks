package day01Nevzat;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Notations extends TestBase {


    @Test @Ignore
    public void test01(){
        String filePath =System.getProperty("user.home")+"/Desktop/serkan.txt";
        Assert.assertTrue(Files.exists(Paths.get(filePath)));

    }
    @Test
    public void test02(){
        driver.get("https://www.kaufland.de/");
        driver.findElement(By.xpath("//*[text()='Zustimmen ']")).click();
        driver.findElement(By.xpath("//span[@class='rh-menu-toggle__burger']")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/header/div[2]/div[2]/div[4]/ul/li[7]/a/text()")).click();



    }




}
