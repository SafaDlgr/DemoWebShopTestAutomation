package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class RegisterPage extends BaseTest {

    @Step("Cinsiyet seçimi yapılır. (Erkek)")
    public RegisterPage clickGenderMale()
    {

        driver.findElement(By.xpath("//*[@id='gender-male']")).click();
        screenshot();
        return this;
    }

    @Step("Cinsiyet seçimi yapılır. (Kadın)")
    public RegisterPage clickGenderFemale()
    {

        driver.findElement(By.xpath("//*[@id='gender-female']")).click();
        screenshot();
        return this;
    }

    @Step("First name alanı doldurulur.")
    public RegisterPage fillFirstName(String text)
    {

        driver.findElement(By.id("FirstName")).sendKeys(text);
        return this;
    }

    @Step("Last name alanı doldurulur.")
    public RegisterPage fillLastName(String text)
    {

        driver.findElement(By.id("LastName")).sendKeys(text);
        return this;
    }

    @Step("Email alanı doldurulur.")
    public RegisterPage fillEmail(String text)
    {

        driver.findElement(By.id("Email")).sendKeys(text);
        screenshot();
        return this;
    }

    @Step("Password alanı doldurulur.")
    public RegisterPage fillPassword(String text)
    {

        driver.findElement(By.id("Password")).sendKeys(text);
        return this;
    }

    @Step("Confirm password alanı doldurulur.")
    public RegisterPage fillConfirmPassword(String text)
    {

        driver.findElement(By.id("ConfirmPassword")).sendKeys(text);
        return this;
    }

    @Step("Register butonuna tıklanır.")
    public RegisterPage clickRegister()
    {

        driver.findElement(By.id("register-button")).click();
        return this;
    }

}
