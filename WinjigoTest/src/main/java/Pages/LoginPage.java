package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By username=By.id("Email");
    private By password=By.id("inputPassword");
    private By loginbtn=By.cssSelector("#btnLogin");


    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void writeusername(String user){
        driver.findElement(username).sendKeys(user);
    }
    public void writepassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }

    public HomePage ClickOnLogin(){
        driver.findElement(loginbtn).click();
        return new HomePage(driver);

    }


}
