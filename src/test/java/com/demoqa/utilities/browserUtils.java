package com.demoqa.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.TimeZone;

public class browserUtils {
    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public static WebElement waitForClickablility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), timeout);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), timeToWaitInSec);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }


    public static void waitForPageToLoad(long timeOutInSeconds) {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        try {
            WebDriverWait wait = new WebDriverWait(Driver.get(), timeOutInSeconds);
            wait.until(expectation);
        } catch (Throwable error) {
            error.printStackTrace();
        }
    }


    public static void scrollToElement(WebElement element) {
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

//    public static String getCurrentDay() {
//        //Create a Calendar Object
//        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
//        //Get Current Day as a number
//        int todayInt = calendar.get(Calendar.DAY_OF_MONTH);
//        //Integer to String Conversion
//        String todayStr = Integer.toString(todayInt);
//
//        int nextMonth=calendar.get(Calendar.MONTH)+1;
//        int year=calendar.get(Calendar.YEAR);
//
//
//
//
//        return nextMonth+"/"+todayStr+"/"+year;
//}
//
//public static String setDatePicker(){
//        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
//        int month= calendar.get(Calendar.MONTH);
//        int day=calendar.get(Calendar.DAY_OF_MONTH);
//        int year=calendar.get(Calendar.YEAR);
//
//        return (month+1)+"/"+day+
//
//}

    public static String chooseNextMonth(String date){
        String newDate;
        String month = date.substring(0,2);
        String day = date.substring(3,5);
        String year = date.substring(6,10);
        if(month.equals("12")){
            int nextYear = (Integer.parseInt(year)+1);
            year = String.valueOf(nextYear);
            month="1";
        }else{
            int nextMonth=(Integer.parseInt(month)+1);
            month = String.valueOf(nextMonth);

        }
        newDate= month+"/"+day+"/"+year;
        return newDate;

    }
}
