import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Singleton  {


    private static  Singleton singleton= new Singleton ();
    private static WebDriver driver;

  String browser;
    private Singleton() {



    if(driver==null){

      browser = browser == null ? "chrome" : browser;

     switch(browser) {
         case "chrome":
             ChromeOptions options1 = new ChromeOptions();
             options1.addArguments("--start-maximized", "--disable-notifications");
             driver = WebDriverManager.chromedriver().avoidShutdownHook().capabilities(options1).create();
             break;
         case "firefox":
          driver=new FirefoxDriver();
          driver.manage().window().maximize();
          break;
         case "edge":
             driver=new EdgeDriver();
             driver.manage().window().maximize();
             break;
         case "opera":
             driver=new OperaDriverManager().create();
             break;


     }

     }

    }

        public static WebDriver getDriver(String browser){
                                 return driver;
        }

        public static void closeDriver(){
           if(!(driver ==null)){
               driver.quit();
               driver=null;
           }
        }

    }









