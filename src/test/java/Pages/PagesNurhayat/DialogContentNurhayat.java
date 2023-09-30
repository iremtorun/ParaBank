package Pages.PagesNurhayat;

import Pages.Parent;
import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContentNurhayat extends Parent {
    public DialogContentNurhayat() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
        }
        return null;
    }

    @FindBy(css = "[name='username']")
    public WebElement username;
    @FindBy(css = "[name='password']")
    public WebElement pasword;
    @FindBy(css = "[value='Log In']")
    public WebElement loginBtn;
    @FindBy(css = "[ng-repeat='account in accounts']")
    public WebElement account1;
    @FindBy(id = "month")
    public WebElement monthBtn;
    @FindBy(id = "transactionType")
    public WebElement transactionTypeBtn;
    @FindBy(css = "[type='submit']")
    public WebElement submitBtn;



}


