package com.demoqa.stepDefinitions;

import com.demoqa.pages.BasePage;
import com.demoqa.utilities.ConfigurationReader;
import com.demoqa.utilities.Driver;
import com.demoqa.utilities.browserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class submitFormStepDef {


    @Given("user is on the provided page")
    public void user_is_on_the_provided_page() {
        Driver.get().get(ConfigurationReader.get("url")+"/automation-practice-form");

    }


    @When("user enters {string} {string} {string} {string} {string} and other details")
    public void user_enters_valid(String firstName, String lastName,String email, String gender, String mobileNumber) {
         WebElement firstNameInput=Driver.get().findElement(By.id("firstName"));
        firstNameInput.click();
        firstNameInput.sendKeys(firstName);

        WebElement lastNameInput=Driver.get().findElement(By.id("lastName"));
        lastNameInput.click();
        lastNameInput.sendKeys(lastName);

        WebElement userEmail=Driver.get().findElement(By.xpath("//*[@id='userEmail']"));
        userEmail.click();
        userEmail.sendKeys(email);

        switch (gender){
            case "Female":
                WebElement genderFemale=Driver.get().findElement(By.xpath("(//*[@class='custom-control-label'])[2]"));
                genderFemale.click();
                break;
            case "Male":
                WebElement male=Driver.get().findElement(By.xpath("(//*[@class='custom-control-label'])[1]"));
                male.click();
                break;
            case "Other":
                WebElement other=Driver.get().findElement(By.xpath("(//*[@class='custom-control-label'])[3]"));
                other.click();
                break;

        }

        WebElement userNumber=Driver.get().findElement(By.xpath("//*[@id='userNumber']"));
        userNumber.click();
        userNumber.sendKeys(mobileNumber);

        WebElement hobbies = Driver.get().findElement(By.xpath("(//*[@class='custom-control-label'])[4]"));
        hobbies.click();

        WebElement chooseFile=Driver.get().findElement(By.xpath("//input[@class='form-control-file']"));
        chooseFile.sendKeys(System.getProperty("user.dir")+"/src/test/resources/d.jpg");

        browserUtils.waitFor(3);

        WebElement currentAddress=Driver.get().findElement(By.xpath("//*[@id='currentAddress']"));

        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("arguments[0].scrollIntoView();",currentAddress);
        currentAddress.click();
        currentAddress.sendKeys("12 Drawn Way");

        WebElement stateDropDown = Driver.get().findElement(By.xpath("(//*[@class='css-19bqh2r'])[1]"));
        browserUtils.scrollToElement(stateDropDown);
        stateDropDown.click();

        Driver.get().findElement(By.xpath("(//*[@class='css-1g6gooi']//div//input)[2]")).sendKeys("Haryana", Keys.ENTER);
        Driver.get().findElement(By.xpath("(//*[@class='css-1g6gooi']//div//input)[3]")).sendKeys("Karnal",Keys.ENTER);


        WebElement submit = Driver.get().findElement(By.cssSelector(".btn.btn-primary"));
        submit.click();

        browserUtils.waitFor(3);


    }

    @Then("user should be able to see submitted form")
    public void user_should_be_able_to_see_submitted_form() {

        String expected="Thanks for submitting the form";
        String actual = Driver.get().findElement( By.className("modal-header")).getText();
        Assert.assertEquals(expected,actual);

    }



    @Then("user should not be able to see submit the form")
    public void user_should_not_be_able_to_see_submit_the_form() {

        WebElement submit = Driver.get().findElement(By.cssSelector(".btn.btn-primary"));
        submit.click();
        try {

            submit.click();

        } catch (NoSuchElementException e) {
            Assert.assertTrue(submit.isDisplayed());
        }
    }

}
