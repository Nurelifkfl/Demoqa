package com.demoqa.stepDefinitions;

import com.demoqa.utilities.ConfigurationReader;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropStepDef {

    @Given("user is on the droppable page")
    public void user_is_on_the_droppable_page() {
        Driver.get().get(ConfigurationReader.get("url")+"/droppable");
    }

    @When("user drag and drop the element into the specified area")
    public void user_drag_and_drop_the_element_into_the_specified_area() {
        WebElement dragMe=Driver.get().findElement(By.xpath("//*[text()='Drag me']"));
        WebElement dropMe=Driver.get().findElement(By.cssSelector(".drop-box.ui-droppable"));

        Actions actions=new Actions(Driver.get());
        actions.dragAndDrop(dragMe,dropMe).perform();
    }

    @Then("user should be able to drag and drop successfully")
    public void user_should_be_able_to_drag_and_drop_successfully() {

        WebElement dropMe=Driver.get().findElement(By.cssSelector(".drop-box.ui-droppable"));

        String expected="Dropped!";
        String actual=dropMe.getText();
        Assert.assertEquals(expected,actual);

    }


}
