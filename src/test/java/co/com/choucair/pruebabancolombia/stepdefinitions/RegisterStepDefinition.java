package co.com.choucair.pruebabancolombia.stepdefinitions;

import co.com.choucair.pruebabancolombia.model.UtestData;
import co.com.choucair.pruebabancolombia.questions.Answer;
import co.com.choucair.pruebabancolombia.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class RegisterStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than luis wants to create a new register$")
    public void thanLuisWantsToCreateANewRegister() {
        OnStage.theActorCalled("Luis").wasAbleTo(OpenUp.thePage());
    }


    @When("^he entry your information$")
    public void heEntryYourInformation(List<UtestData> utestData) {
        OnStage.theActorInTheSpotlight().attemptsTo(PersonalInformation.the(utestData), Location.the(utestData), Device.the(),
                LastStep.the(utestData));
    }

    @Then("^he will have a new register in the page$")
    public void heWillHaveANewRegisterInThePage(List<UtestData> utestData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestData.get(0).getStrText())));
    }

}
