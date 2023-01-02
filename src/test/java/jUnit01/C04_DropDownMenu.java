package jUnit01;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class C04_DropDownMenu extends TestBase {

    @Test
    public void test01(){
        driver.get("https://www.dhl.de/de/privatkunden.html");
        driver.findElement(By.id("confirm-choices-handler")).click();
        WebElement dropMenu = driver.findElement(By.xpath("//*[@class='CountrySearch__SearchBarWrapper-sc-1no9gn3-0 kDpDnD']"));
        Select slct = new Select(dropMenu);
        slct.selectByValue("Japan");
    }


}
