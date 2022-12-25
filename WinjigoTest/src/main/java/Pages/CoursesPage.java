package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CoursesPage {
    private  WebDriver driver;
    private By addcourse=By.cssSelector("#btnListAddCourse");
    private By search = By.id("txtCourseSearch");
    public CoursesPage(WebDriver driver){
        this.driver=driver;
    }

    public AddCoursePage clickonAddCourse() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(addcourse).click();
        return new AddCoursePage(driver);
    }




    public boolean searchUsingKeyWord(String courseName) throws InterruptedException {
      driver.findElement(search).sendKeys(courseName);
      driver.findElement(By.id("btnCourseSearch")).click();
      Thread.sleep(2000);
      List<WebElement> elements =  driver.findElements(By.id("lnkListCourseSelcted"));
        for (WebElement element : elements) {

            if(element.getText().equals(courseName)){
                return true;
            }
        }
        return false;
    }
}
