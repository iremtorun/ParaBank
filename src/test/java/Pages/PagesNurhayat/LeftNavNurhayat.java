package Pages.PagesNurhayat;

import Pages.Parent;
import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LeftNavNurhayat extends Parent {
    public LeftNavNurhayat() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    public WebElement getWebElement(String strElement) {

        switch (strElement) {
        }

        return null;
    }
}
