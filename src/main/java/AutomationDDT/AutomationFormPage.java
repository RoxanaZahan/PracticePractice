package AutomationDDT;

import Utils.WaitMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomationFormPage {
    WaitMethods waitMethods = new WaitMethods();

    //must replace xpath with id
    @FindBy(xpath = "//input[@name = 'firstname']")
    private WebElement firstName;
    @FindBy(xpath = "//input[@id='lastname']")
    private WebElement lastName;
    @FindBy(xpath = "//button[@id='buttonwithclass']")
    private WebElement simpleButton;

    public void enterFirstName(String firstName) {
        final WebElement firstNameTab = this.waitMethods.waitForElementToBeVisible(this.firstName);
        firstNameTab.sendKeys(firstName);
    }
    public String getFirstName() {
        final WebElement enteredFirstName = this.waitMethods.waitForElementToBeVisible(this.firstName);
        return enteredFirstName.getAttribute("value");
    }

    public void enterLastName(String lastName) {
        final WebElement firstNameTab = this.waitMethods.waitForElementToBeVisible(this.lastName);
        firstNameTab.sendKeys(lastName);
    }
    public String getLastName() {
        final WebElement enteredFirstName = this.waitMethods.waitForElementToBeVisible(this.lastName);
        return enteredFirstName.getAttribute("value");
    }

    public void clickSimpleButton() {
        waitMethods.sleep(4); //I have to replace it with a waiter or something for loop with 0.5 sec waiters - ignore exception
        //final WebElement simpleButton = this.waitMethods.waitForElementToBeClickableByPath();
        simpleButton.click();

    }
}
