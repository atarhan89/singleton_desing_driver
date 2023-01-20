import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;

public class Main {

    public static void main(String[] args) throws InterruptedException {


    Singleton.getDriver("chrome").get(constant.URL);

      Thread.sleep(3000);

      Singleton.closeDriver();
    }
}
