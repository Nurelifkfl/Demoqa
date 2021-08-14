package com.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(xpath = "//*[@id='userEmail']")
    public WebElement userEmail;

    @FindBy(xpath = "(//*[@class='custom-control-label'])[2]")
    public WebElement genderFemale;

    @FindBy(xpath = "//*[@id='userNumber']")
    public WebElement userNumber;

//    @FindBy(id = "dateOfBirthInput")
//    public WebElement dateOfBirth;


    @FindBy(xpath = "(//*[@class='custom-control-label'])[4]")
    public WebElement sportsHobbie;

    @FindBy(xpath = "(//*[@class='custom-control-label'])[5]")
    public WebElement readingHobbie;

    @FindBy(xpath = "(//*[@class='custom-control-label'])[6]")
    public WebElement musicHobbie;

    @FindBy(className = "form-control-file")
    public WebElement uploadPicture;


    @FindBy(xpath = "//*[@id='currentAddress']")
    public WebElement currentAddress;


    @FindBy(xpath = "//*[text()='Select State']")
    public WebElement selectState;

    @FindBy(xpath = "//*[text()='Select City']")
    public WebElement selectCity;



}
