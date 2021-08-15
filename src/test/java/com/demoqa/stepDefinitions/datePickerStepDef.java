package com.demoqa.stepDefinitions;

import com.demoqa.utilities.ConfigurationReader;
import com.demoqa.utilities.Driver;
import com.demoqa.utilities.browserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class datePickerStepDef {
    @Given("user is on the date-picker page")
    public void user_is_on_the_date_picker_page() {
        Driver.get().get(ConfigurationReader.get("url")+"/date-picker");
    }

    @When("user select a date from date picker field")
    public void user_select_a_date_from_date_picker_field() {
        WebElement datePicker=Driver.get().findElement(By.id("datePickerMonthYearInput"));
        datePicker.click();
        System.out.println("browserUtils.getCurrentDay() = " + browserUtils.getCurrentDay());


        WebElement dateBox = Driver.get().findElement(By.id("datePickerMonthYearInput"));



    }

    @Then("user should be able to see one month from todays date")
    public void user_should_be_able_to_see_one_month_from_todays_date() {

    }
}
