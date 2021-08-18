package stepdefinitons;

import answer.Answer;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.UtestData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.*;

import java.util.List;

public class UtestStepDefinition {


    @Before
    public void setStage() { OnStage.setTheStage(new OnlineCast());  }

    @Given("^: Than John wants to register as a new user on utest$")
    public void than_John_wants_to_register_as_a_new_user_on_utest(List<UtestData> utestDataList) {
        OnStage.theActorCalled("John").wasAbleTo(OpenUp.thePage(), OpenForm.onThePage());
    }

    @When("^: he fills out the registration forms$")
    public void he_fills_out_the_registration_forms(List<UtestData> utestDataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                FillFormStep1.the(utestDataList.get(0).getStrFirstName(),utestDataList.get(0).getStrLastName()
                        ,utestDataList.get(0).getStrEmail(),utestDataList.get(0).getStrMonthBirthday(),utestDataList.get(0).getStrDayBirthday()
                        ,utestDataList.get(0).getStrYearBirthday(),utestDataList.get(0).getStrLanguage()),

                FillFormStep2.the(utestDataList.get(0).getStrCity(),utestDataList.get(0).getStrZipCode()),

                FillFormStep3.the(utestDataList.get(0).getStrOsComputer(),utestDataList.get(0).getStrOsVersion(),utestDataList.get(0).getStrOsLanguage()
                        ,utestDataList.get(0).getStrMobileDevice(),utestDataList.get(0).getStrModelMobile(),utestDataList.get(0).getStrMobileOs()),

                FillFormStep4.the(utestDataList.get(0).getStrPassword())


        );

    }

    @Then("^: he will have registered as a new user in utest$")
    public void he_will_have_registered_as_a_new_user_in_utest(List<UtestData> utestDataList) {
        OnStage.theActorInTheSpotlight().notify();

        throw new PendingException();
    }
}
