package Base;

import PropConfig.ReadFromPropertyFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.util.Properties;
import Pages.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected HomePage coursesicon;
    protected CoursesPage coursesPage;
    protected AddCoursePage addCoursePage;
    protected CourseMapPage courseMapPage;

    public String URL;
    public String Username;
    public String Password;
    public String CourseName;
    public String Subjecttext;
    public String gradetext;
    public String teachertext;


    @BeforeSuite
    public void setUp() throws Exception{
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        loginPage=new LoginPage(driver);
        driver.manage().window().maximize();
        driver.get(ReadFromPropertyFile.get("url"));
    }
}
