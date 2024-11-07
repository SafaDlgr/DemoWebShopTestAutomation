package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class HomePage extends BaseTest {

    @Step("Kullanıcı kontrolü.")
    public HomePage accountControl(String value)
    {
        String text = driver.findElement(By.cssSelector("[class='topic-html-content-header']")).getText();
        Assert.assertEquals(value,text);

        return this;
    }

    @Step("Erkek kullanıcı oluşturma kontrolü.")
    public HomePage registerControl1(String value)
    {
        String text = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[1]/h1")).getText();
        Assert.assertEquals(value, text);
        return this;

    }

    @Step("Kadın kullanıcı oluşturma kontrolü.")
    public HomePage registerControl2(String value)
    {
        String text = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")).getText();
        Assert.assertEquals(value, text);
        return this;

    }

}
