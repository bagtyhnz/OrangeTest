package step_defs;

import Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class searchStepDefs {

    WebDriver driver=Driver.get();
    WebDriverWait wait = new WebDriverWait(driver, 10);


    @Given("I am on the Google homepage")
    public void i_am_on_the_Google_homepage() {

        driver.get("https://www.google.es");

        WebElement rejectButton = driver.findElement(By.id("L2AGLb"));
        wait.until(ExpectedConditions.elementToBeClickable(rejectButton));

        rejectButton.click();
    }



    @When("I search for {string}")
    public void i_search_for(String searchTerm) {

      wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("body")));

      WebElement searchBox = driver.findElement(By.id("APjFqb") );
      searchBox.sendKeys(searchTerm);

      WebElement searchButton = driver.findElement(By.className("gNO89b"));
      wait.until(ExpectedConditions.elementToBeClickable(searchButton));
      searchButton.click();
    }

    @Then("the number of search results should be more than {long}")
    public void the_number_of_search_results_should_be_more_than(long minCount) {

        WebElement resultStats = driver.findElement(By.id("result-stats"));
        wait.until(ExpectedConditions.visibilityOf(resultStats));
        String resultString = resultStats.getText();

        String resultCount = resultString.replaceAll("[^0-9]", "");
        long extractedNumber = Long.parseLong(resultCount);
        Assert.assertTrue("The count of search results is ok", extractedNumber > minCount);
    }

    @Then("the number of search results should not be less than {long}")
    public void the_number_of_search_results_should__not_be_less_than(long minCount) {

        WebElement resultStats = driver.findElement(By.id("result-stats"));
        wait.until(ExpectedConditions.visibilityOf(resultStats));
        String resultString = resultStats.getText();

        String resultCount = resultString.replaceAll("[^0-9]", "");
        long extractedNumber = Long.parseLong(resultCount);
        Assert.assertFalse("The count of search results is ok", extractedNumber < minCount);
    }
}
