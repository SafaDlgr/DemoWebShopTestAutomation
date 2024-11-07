package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest {

    @Step("Mail alanını doldurma")
    public LoginPage fillUserMail(String text)
    {
        driver.findElement(By.name("Email")).sendKeys(text);
        return this;
    }

    @Step("Password alanını doldurma")
    public LoginPage fillPassword(String text)
    {
        driver.findElement(By.name("Password")).sendKeys(text);
        screenshot();
        return this;
    }

    @Step("Login butonuna tıklama")
    public LoginPage clickLogin()
    {
        driver.findElement(By.cssSelector("[value='Log in']")).click();
        return this;
    }

    @Step("Register butonuna tıklama")
    public LoginPage clickRegister()
    {
        driver.findElement(By.cssSelector("[href='/register']")).click();
        return this;
    }

}
