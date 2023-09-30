package StepDefititions.StepDefinitionsNurhayat;

import Pages.DialogContent;
import Pages.PagesNurhayat.DialogContentNurhayat;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _05_Hesapdetaylarinaerisim {

    DialogContentNurhayat dc=new DialogContentNurhayat();
    @Given("Navigate to site")
    public void navigateToSite() {
        GWD.getDriver().get("https://parabank.parasoft.com/");

    }

    @When("User must log in")
    public void userMustLogIn() {
    dc.mySendKeys(dc.username, "nur");
    dc.mySendKeys(dc.pasword,"123456");
    dc.myClick(dc.loginBtn);

    }

    @Then("User Account details on the click")
    public void userAccountDetailsOnTheClick() {
    dc.myClick(dc.account1);

    }

    @And("User selects an account numbers")
    public void userSelectsAnAccountNumbers() {


    }

    @Then("User should see list of activities And click")
    public void userShouldSeeListOfActivitiesAndClick() {


    }

    @And("User should see Transaction Details")
    public void userShouldSeeTransactionDetails() {


    }
}
