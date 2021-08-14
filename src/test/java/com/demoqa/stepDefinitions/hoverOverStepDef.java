package com.demoqa.stepDefinitions;

import com.demoqa.utilities.ConfigurationReader;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class hoverOverStepDef {
    @Given("user is on the tool-tips page")
    public void user_is_on_the_tool_tips_page() {
        Driver.get().get(ConfigurationReader.get("url")+"/tool-tips");
    }

    @When("user hover over the button")
    public void user_hover_over_the_button() {

    }

    @When("user hover over the field")
    public void user_hover_over_the_field() {

    }

    @Then("user should be able to hover over successfully")
    public void user_should_be_able_to_hover_over_successfully() {

    }


}
