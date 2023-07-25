package demoblaze;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ProductStore {
    public static void main(String[] args) {
        //setting WebDriver as ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pallavi.Arora\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //maximizing the window
        driver.manage().window().maximize();

        //opening the url
        driver.get("https://www.saucedemo.com/");

        //waiting for 10 seconds for the page to load
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            //entering username
            WebElement username= driver.findElement(By.xpath("//input[@id='user-name']"));
            username.sendKeys("standard_user");

            //entering password
            WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
            password.sendKeys("secret_sauce");

            //clicking on login button
            WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
            login.click();

            //adding first product to cart
            WebElement product1 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
            product1.click();

            //finding second product
            WebElement product2 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']"));
            //scrolling down to second product
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", product2);
            //adding second product to cart
            product2.click();

            //scrolling up to the cart button and clicking on it
            WebElement cart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cart);
            cart.click();

            //clicking on checkout
            WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
            checkout.click();

            //entering first name
            WebElement first_name = driver.findElement(By.xpath("//input[@id='first-name']"));
            first_name.sendKeys("User");

            //entering last name
            WebElement last_name = driver.findElement(By.xpath("//input[@id='last-name']"));
            last_name.sendKeys("Test");

            //entering zip/postal code
            WebElement zipcode = driver.findElement(By.xpath("//input[@id='postal-code']"));
            zipcode.sendKeys("123456");

            //clicking on continue
            WebElement continue_btn = driver.findElement(By.xpath("//input[@id='continue']"));
            continue_btn.click();

            //clicking on finish
            WebElement finish = driver.findElement(By.xpath("//button[@id='finish']"));
            finish.click();

            //opening menu
            WebElement menu = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
            menu.click();

            //logging out
            WebElement logout = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
            logout.click();

            //quitting the instance
            driver.quit();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
