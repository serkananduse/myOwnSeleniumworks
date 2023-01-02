package jUnit01;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.ReusableMethods;
import utilities.TestBase;

public class C02_RadioButton extends TestBase {


   // d. Radio button elementlerini locate edin ve size uygun olani secin

    @Test
    public void test01(){
        // a.Go to the website https://facebook.com
        driver.get("https://facebook.com");
        // b.Accept cookies
        driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _9xo6 _4jy3 _4jy1 selected _51sy']")).click();
        // c.Push the button of "Create an account"
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        //Locate the elements of radio buttons and select one matchs to you.
        driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();



    }


}
