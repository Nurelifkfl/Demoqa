package com.demoqa.stepDefinitions;

import com.demoqa.pages.BasePage;
import com.demoqa.utilities.ConfigurationReader;
import com.demoqa.utilities.Driver;
import com.demoqa.utilities.browserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class submitFormStepDef {

    BasePage basePage = new BasePage();

    @Given("user is on the provided page")
    public void user_is_on_the_provided_page() {
        Driver.get().get(ConfigurationReader.get("url")+"/automation-practice-form");
        System.out.println("user on the given url");
    }

    @When("user enter details")
    public void user_enter_details() {
        browserUtils.waitForPageToLoad(6);
        System.out.println("enter firstname");
        WebElement firstName=Driver.get().findElement(By.id("firstName"));
        firstName.click();
        firstName.sendKeys("Emily");

        WebElement lastName=Driver.get().findElement(By.id("lastName"));
        lastName.click();
        lastName.sendKeys("Ross");

        WebElement userEmail=Driver.get().findElement(By.xpath("//*[@id='userEmail']"));
        userEmail.click();
        userEmail.sendKeys("emilyross@gmail.com");

        WebElement genderFemale=Driver.get().findElement(By.xpath("(//*[@class='custom-control-label'])[2]"));
        genderFemale.click();

        WebElement userNumber=Driver.get().findElement(By.xpath("//*[@id='userNumber']"));
        userNumber.click();
        userNumber.sendKeys("1426543789");

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

        browserUtils.waitFor(3);



        WebElement stateDropDown = Driver.get().findElement(By.xpath("(//*[@class='css-19bqh2r'])[1]"));
        browserUtils.scrollToElement(stateDropDown);
        stateDropDown.click();

        Driver.get().findElement(By.xpath("(//*[@class='css-1g6gooi']//div//input)[2]")).sendKeys("Haryana", Keys.ENTER);
        Driver.get().findElement(By.xpath("(//*[@class='css-1g6gooi']//div//input)[3]")).sendKeys("Karnal",Keys.ENTER);


        WebElement submit = Driver.get().findElement(By.cssSelector(".btn.btn-primary"));
        submit.click();

        browserUtils.waitFor(5);

    }

    @Then("user should be able to submit form")
    public void user_should_be_able_to_submit_form() {


        String expected="Thanks for submitting the form";
        String actual = Driver.get().findElement( By.className("modal-header")).getText();
        Assert.assertEquals(expected,actual);
    }


}
