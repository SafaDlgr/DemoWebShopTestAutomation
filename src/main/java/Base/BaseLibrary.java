package Base;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.util.Random;

public class BaseLibrary extends Data{

    public static WebDriver driver;

    public String createUserMail()
    {
        Random random = new Random();

        String text = "testmaili0" + random.nextInt(100000000) + "@mail.com";
        return text;
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] screenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
