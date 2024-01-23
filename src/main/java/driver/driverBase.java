package driver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.constantdatavalues.ConstantsData;
import com.constantdatavalues.TestClass;

import io.github.bonigarcia.wdm.WebDriverManager;
public class driverBase extends TestClass implements ConstantsData   {

	public static WebDriver driver=null;
	public static  Properties prop=null;
	public static FileInputStream input=null;
	public static File file=null;
	public driverBase(){
	try {
		file= new File("C:\\Users\\Admin\\Desktop\\Photon\\Photon workspace\\"
				+ "AutimationGit2\\src\\main\\java\\config\\config.properties");
		input= new FileInputStream(file);
		prop= new Properties();
		try {
			prop.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}catch (FileNotFoundException e) {
        System.out.println(e.getCause());
	}
	}
	public void browserStart() {
	    String browser=prop.getProperty("browser");
	    System.out.println(browser);
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions option= new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			driver= new ChromeDriver(option);
		}else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}else {
			System.out.println("Please configure browser name correctly.");
		}
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ConstantsData.implicit_wait_timeput));
	}
	public void draw() {
		// TODO Auto-generated method stub
		
	}
}
