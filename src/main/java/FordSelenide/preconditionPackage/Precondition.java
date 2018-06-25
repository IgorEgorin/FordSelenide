package FordSelenide.preconditionPackage;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

/**
 * Created by 1 on 13.06.2018.
 */
public class Precondition extends InstanceOfAllPages {

    @Parameters({"browser"})
    @BeforeMethod()
    protected void setUpMethod(String browser) {
        switch (browser) {
            case  "IE":
                InternetExplorerDriverManager.getInstance().setup();
                Configuration.browser ="IE";
                break;
            case "chrome":
                ChromeDriverManager.getInstance().setup();
                Configuration.browser ="Chrome";
                break;
        }
        Configuration.timeout = 10000;
        Selenide.open("http://www.ford.ru");

    }

    @AfterMethod()
    public void quit() {
        Selenide.close();
    }
}
