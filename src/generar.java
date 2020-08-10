import java.awt.AWTException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class generar {
	private static String BaseURL = "https://www.argentina.gob.ar/circular/tramite";
	private static int WaitTime = 1000;
	private static String nombre = "Axel";
	private static String apellido = "Wdoviak";
	private static int dni = 34255385;
	private static String ref = "00570526618";
	private static String sexo = "(M) Masculino";
	private static String cuil = "20342553851";
	private static int areacode = 11;
	private static int phone = 32346592;
	private static String email = "kooltheoutsider@gmail.com";
	private static String address = "Aguapey 2938";
	private static String floorapt = "";
	private static int zipcode = 1826;
	private static String province = "Gran Buenos Aires";
	private static String state = "Lanus";
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/axelwdoviak/selenium/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(WaitTime, TimeUnit.SECONDS);
		driver.get(BaseURL);
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.findElementById("edit-submitted-dni-tenes-1").click();
        Thread.sleep(WaitTime);
        driver.findElementByXPath("//*[@id=\"webform-client-form-195611\"]/div/div[3]/p/a").click();
        Thread.sleep(WaitTime);
        Select zone = new Select(driver.findElement(By.id("edit-submitted-provincia")));
        zone.selectByVisibleText("Buenos Aires (municipios del AMBA)");
        Thread.sleep(WaitTime);
        driver.findElementByXPath("//*[@id=\"webform-client-form-194833\"]/div/div[4]/p/a").click();
        Thread.sleep(WaitTime);
        driver.findElementByXPath("//*[@id=\"edit-submitted-trabajo-fuerzamayor\"]/div[2]/label").click();
        Thread.sleep(WaitTime);
        driver.findElementByXPath("//*[@id=\"edit-submitted-elegi-el-motivo-del-permiso-especial\"]/div[2]/label").click();
        Thread.sleep(WaitTime);
        driver.findElementByXPath("//*[@id=\"webform-client-form-203173\"]/div/div[12]/p/a").click();
        Thread.sleep(WaitTime);
        driver.findElementByCssSelector("body").sendKeys(Keys.CONTROL+"t");
        js.executeScript("window.scrollBy(0,1000)");
        //Assert.assertEquals(driver.getCurrentUrl(), "https://formulario-ddjj.argentina.gob.ar/certificado/gba/categoria/8");
        System.out.println(driver.getCurrentUrl());
		//return "fail";

 //       driver.findElementById("nombre").sendKeys(nombre);
        
	} 
}
