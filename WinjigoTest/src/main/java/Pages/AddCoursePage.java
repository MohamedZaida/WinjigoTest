package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class AddCoursePage {
    private WebDriver driver;
    private By coursenametxt=By.name("courseName");
    Select dropsubject;
    Select dropgrade;
    Select dropdownteacher;

    By gradeRadio = By.className("label");
    private By Createbutton=By.cssSelector("#btnSaveAsDraftCourse");

    public AddCoursePage(WebDriver driver){

        this.driver=driver;
    }

    public void dropdown(String subject){
        dropsubject=new Select(driver.findElement(By.id("courseSubject")));
        dropsubject.selectByVisibleText(subject);
    }

    public void writecoursename(String course){
        driver.findElement(coursenametxt).sendKeys(course);

    }
    public void radiogradeclick(){

        driver.findElement(gradeRadio).click();
    }
    public void dropdowngrade(String grade){
        dropgrade=new Select(driver.findElement(By.id("courseGrade")));
        dropgrade.selectByVisibleText(grade);
    }
    public void dropteacher(String teacher){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("courseGrade"))).build().perform();
        driver.findElement(By.id("teacherOnBehalf")).click();
        driver.findElement(By.className("ui-select-choices-row-inner")).click();


    }
    public CourseMapPage ClickOnCreate(){
        driver.findElement(Createbutton).click();
        return new CourseMapPage(driver);
    }



}
