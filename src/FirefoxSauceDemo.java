import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxSauceDemo {
    public static void main(String[] args) {

        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        // 2) Open Url
        driver.get(baseUrl);

        //3) Print the title of the page
        System.out.println("Title of the page is " + driver.getTitle());

        //4) Print the current url
        System.out.println("Current Url is " + driver.getCurrentUrl());

        //5) Print the page source
        System.out.println("Page Source is " + driver.getPageSource());

        //6) Enter the email to email field

        WebElement emailField = driver.findElement(By.id("user-name"));   //Found Email field
        emailField.sendKeys("NirajPatel123.com");          // writing email id to that field

        //7) Enter the password to password field

        WebElement passwordfield = driver.findElement(By.id("password"));   //Found Password field
        passwordfield.sendKeys("a1b2c3d4");          // writing email id to that field

        //8) Close the browser

        //driver.quit();

    }
}
