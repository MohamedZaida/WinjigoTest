package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By courseicon=By.id("btnMyCoursesList");
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public CoursesPage clickoncourses(){
        driver.findElement(courseicon).click();
        return new CoursesPage(driver);
    }
}
