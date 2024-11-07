import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegisterPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class RegisterTests extends BaseTest {

    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    HomePage homePage = new HomePage();

    @Test(description = "Erkek kullanıcı oluşturma kontrolü.")

    public void registerControlMale() {

        String usermail = createUserMail();
        loginPage.clickRegister();

        registerPage.clickGenderMale()
                .fillFirstName("testadı")
                .fillLastName("testsoyadı")
                .fillEmail(usermail)
                .fillPassword("test123")
                .fillConfirmPassword("test123")
                .clickRegister();


        homePage.registerControl1("Register")
                .registerControl2("Your registration completed");

    }

    @Test(description = "Kadın kullancı oluşturma kontrolü.")
    public void registerControlFemale() {

        String usermail = createUserMail();
        loginPage.clickRegister();

        registerPage.clickGenderFemale()
                .fillFirstName("testadı")
                .fillLastName("testsoyadı")
                .fillEmail(usermail)
                .fillPassword("test123")
                .fillConfirmPassword("test123")
                .clickRegister();

        homePage.registerControl1("Register")
                .registerControl2("Your registration completed");
    }

}
