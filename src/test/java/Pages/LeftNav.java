package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    public WebElement getWebElement(String strElement) {

        switch (strElement) {
        }

        return null;
    }
}
