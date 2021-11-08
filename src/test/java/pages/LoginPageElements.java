package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import  testBase.PageInitializer;
//import testBase.PageInitializer;

public class LoginPageElements extends PageInitializer {



    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@class='shape-semi-rounded size-md status-primary']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@id='toast-container']")
    public WebElement allertMessage;

    @FindBy(xpath = "//div[@class='tw-text-xs tw-text-danger tw-leading-none tw-mt-2 ng-tns-c270-0 ng-trigger ng-trigger-insertRemoveTrigger ng-star-inserted']")
    public WebElement trueMessage;

public LoginPageElements(){
    PageFactory.initElements(driver , this);
}


}
