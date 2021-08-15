package com.demoqa.stepDefinitions;

import com.demoqa.utilities.ConfigurationReader;
import com.demoqa.utilities.Driver;
import com.demoqa.utilities.browserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class acceptAlertStepDef {
    @Given("user is on the alerts page")
    public void user_is_on_the_alerts_page() {
        Driver.get().get(ConfigurationReader.get("url")+"/alerts");

    }

    @When("user click the second button")
    public void user_click_the_second_button() {
        WebElement alertButton = Driver.get().findElement(By.xpath("//*[@id='timerAlertButton']"));
       alertButton.click();


    }

    @Then("user should be able to accept alert")
    public void user_should_be_able_to_accept_alert() {


        try {

            browserUtils.waitFor(5);

        } catch (NoSuchElementException e) {
            Alert alert=Driver.get().switchTo().alert();
            alert.accept();
        }

        browserUtils.waitFor(3);
    }
    }


