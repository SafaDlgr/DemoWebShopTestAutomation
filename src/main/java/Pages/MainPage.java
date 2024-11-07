package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class MainPage extends BaseTest {

    @Step("Hata mesajını kontrol etme")
    public MainPage errorControlMessage(String message)
    {
        String text = driver.findElement(By.cssSelector("[class='validation-summary-errors']")).getText();

        Assert.assertEquals(message,text);
        return this;
    }

    @Step("Mail hata mesajını kontrol etme")
    public MainPage errorControlMessageMail(String message)
    {
        String text = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/span/span")).getText();

        Assert.assertEquals(message, text);

        return this;
    }
}
