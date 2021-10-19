package pageObject;

import base.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class profile_page extends Setup {
    public profile_page (WebDriver driver){
        PageFactory.initElements(driver, this);
        Setup.driver = driver;
    }

    @FindBy (how =How.XPATH, using = "//*[@id='profile_form']/legend")
    public WebElement actWelcomeMsg;

    public void getactWelcomeMsg (){
        Assert.assertEquals(actWelcomeMsg.getText(), "Welcome to TalentTek");

}

}
