package AutomationDDT.Tests;

import AutomationDDT.AutomationFormPage;
import Utils.ExcelReader;
import Utils.SeleniumDriver;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestFirstName extends SeleniumDriver {

    //Instance Variables
    AutomationFormPage automationFormPage;
    ExcelReader excelReader = new ExcelReader();
    String firstName = excelReader.getCellValue(0, "C2" ); //modify here with the First Name expected to be tested

    public TestFirstName() throws IOException, InvalidFormatException {
    }

    @BeforeMethod
    public void beforeTest() {
        automationFormPage = PageFactory.initElements(driver, AutomationFormPage.class);
    }

    @Test
    public void addFirstNameAndValidate() {
        goToUrl("https://www.toolsqa.com/automation-practice-form/");
        automationFormPage.enterFirstName(this.firstName);
        Assert.assertEquals(automationFormPage.getFirstName(), this.firstName);
    }
}
