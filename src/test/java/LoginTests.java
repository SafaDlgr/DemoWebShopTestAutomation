
import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.MainPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    MainPage mainPage = new MainPage();

    @Test(description = "Başarılı kullancı giriş kontrolü.")
    public void loginSuccesfullControl(){

        loginPage.fillUserMail(usermail)
                .fillPassword(password)
                .clickLogin();

        homePage.accountControl("Welcome to our store");
    }

    @Test(description = "Required kontrolü.")
    public void loginRequiredControl(){

        loginPage.fillUserMail("")
                .fillPassword("")
                .clickLogin();

        mainPage.errorControlMessage("Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found");
    }

    @Test(description = "Başarısız kullancı giriş kontrolü.")
    public void loginUnsuccesfullControl() {

        loginPage.fillUserMail("asfasfasf@mail.com")
                .fillPassword("sfasgsdbsgsg")
                .clickLogin();

        mainPage.errorControlMessage("Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found");

    }

    @Test(description = "Hatalı email giriş kontrolü.")
    public void loginWrongMailControl(){

        loginPage.fillUserMail("sdfsdfsdf")
                .fillPassword(password)
                .clickLogin();

        mainPage.errorControlMessageMail("Please enter a valid email address.");

    }
}
