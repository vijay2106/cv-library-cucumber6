package co.library.demo6.steps;

import co.library.demo6.pages.HomePage;
import co.library.demo6.pages.ResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VerifySteps {
    @Given("I am on home page")
    public void iAmOnHomePage() {
    }

    @When("I accept cookies")
    public void iAcceptCookies() {
        new HomePage().acceptCookies();
    }

    @And("I enter job title {string}")
    public void iEnterJobTitle(String jobTitle) {
        new HomePage().enterJobTitle(jobTitle);
    }

    @And("I enter location {string}")
    public void iEnterLocation(String location) {
        new HomePage().enterLocation(location);
    }

    @And("I select distance {string}")
    public void iSelectDistance(String distance) {
        new HomePage().selectDistance(distance);

    }

    @And("I click on more search option")
    public void iClickOnMoreSearchOption() {
        new HomePage().clickOnMoreSearchOption();
    }

    @And("I enter minimum salary {string}")
    public void iEnterMinimumSalary(String salaryMin) {
        new HomePage().enterMaxSalary(salaryMin);
    }

    @And("I enter maximum salary {string}")
    public void iEnterMaximumSalary(String salaryMax) {
        new HomePage().enterMaxSalary(salaryMax);
    }

    @And("I select salary type {string}")
    public void iSelectSalaryType(String salaryType) {
        new HomePage().selectSalaryType(salaryType);

    }

    @And("I select job type {string}")
    public void iSelectJobType(String jobType) {
        new HomePage().selectJobType(jobType);
    }

    @And("I click on find jobs button")
    public void iClickOnFindJobsButton() {
        new HomePage().clickOnFindJobsButton();

    }

    @Then("I should see the job search result {string}")
    public void iShouldSeeTheJobSearchResult(String result) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals("Result not match",new ResultPage().getMessage(),result);
    }
}
