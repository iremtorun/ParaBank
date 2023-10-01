package StepDefinitionsSS;

import PagesSS.DialogContentSS;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class _07_Contact_Regression {
    DialogContentSS dc = new DialogContentSS();
    String cname;

    @When("Should be click update button")
    public void shouldBeClikUpdateButton() {
        dc.myClick(dc.uptadecontact);
    }


    @Then("Should be see uptade message")
    public void shouldBeSeeUptadeMessage() {

        dc.verifyContainsText(dc.updatemessage, "Updated");

    }

    @Then("Checking the entered information")
    public void checkingTheEnteredInformation()   {
        dc.wait.until(ExpectedConditions.attributeToBe(dc.customername,"value","hamza"));
        cname = dc.customername.getAttribute("value");
        Assert.assertEquals(cname, "hamza");


    }

    @Then("Clear firstname,lastName,city")
    public void clearFirstnameLastNameCity() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.customername));
        dc.mySendKeys(dc.customername, "     ");

        dc.wait.until(ExpectedConditions.visibilityOf(dc.customerlastname));
        dc.mySendKeys(dc.customerlastname, "     ");

        dc.wait.until(ExpectedConditions.visibilityOf(dc.customercity));
        dc.mySendKeys(dc.customercity, "     ");

        dc.mySendKeys(dc.customeraddress, "hjhsjs");
        dc.mySendKeys(dc.customerstate, "hısısj");
        dc.mySendKeys(dc.customerphone, "321254154");
        dc.mySendKeys(dc.customerzipcode, "5874587");
    }

    @Then("Should be see errormessage")
    public void shouldBeSeeErrormessage() {
        Assert.assertTrue(dc.errormessage.getText().contains("required"));

    }

}


