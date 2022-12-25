package Tests;

import Base.BaseTest;
import Pages.*;
import PropConfig.ReadFromPropertyFile;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestSenario extends BaseTest {


    @Test
    public void SuccessfullyLogin() throws IOException, InterruptedException {

        loginPage.writeusername(ReadFromPropertyFile.get("username"));
        loginPage.writepassword(ReadFromPropertyFile.get("password"));
        coursesicon=loginPage.ClickOnLogin();

        coursesPage=coursesicon.clickoncourses();

        addCoursePage=coursesPage.clickonAddCourse();
        Thread.sleep(5000);

        addCoursePage.writecoursename(ReadFromPropertyFile.get("courseName"));
        addCoursePage.dropdown(ReadFromPropertyFile.get("subject"));
        addCoursePage.radiogradeclick();
        addCoursePage.dropdowngrade(ReadFromPropertyFile.get("grade"));
        addCoursePage.dropteacher(ReadFromPropertyFile.get("teachername"));
        courseMapPage=addCoursePage.ClickOnCreate();


        Thread.sleep(5000);
        coursesicon.clickoncourses();

        Assert.assertTrue(coursesPage.searchUsingKeyWord(ReadFromPropertyFile.get("courseName")));





    }
}
