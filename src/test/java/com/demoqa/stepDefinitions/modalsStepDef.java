package com.demoqa.stepDefinitions;

import com.demoqa.utilities.ConfigurationReader;
import com.demoqa.utilities.Driver;
import com.demoqa.utilities.browserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class modalsStepDef {

    @Given("user is on the modal-dialogs page")
    public void user_is_on_the_modal_dialogs_page() {
        Driver.get().get(ConfigurationReader.get("url")+"/modal-dialogs");
    }

    @When("user select small modal button")
    public void user_select_small_modal_button() {
        WebElement smallModal=Driver.get().findElement(By.id("showSmallModal"));
        smallModal.click();
    }

    @Then("user should be able to close modal")
    public void user_should_be_able_to_close_modal() {

        WebElement closeModal=Driver.get().findElement(By.id("closeSmallModal"));

        WebElement modalMessage=Driver.get().findElement(By.className("modal-body"));
        System.out.println("modalMessage.getText() = " + modalMessage.getText());




        try {

            closeModal.click();

        } catch (NoSuchElementException e) {
           Assert.assertFalse(closeModal.isDisplayed());
        }
    }
}
