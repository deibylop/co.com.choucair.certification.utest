package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.UtestRegistrationStep4;

public class FillFormStep4 implements Task {
    private String strPassword;

    public FillFormStep4(String strPassword) {
        this.strPassword = strPassword;
    }

    public static FillFormStep4 the(String strPassword) {
        return Tasks.instrumented(FillFormStep4.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strPassword).into(UtestRegistrationStep4.INPUT_CREATE_PASSWORD),
                Enter.theValue(strPassword).into(UtestRegistrationStep4.INPUT_COMFIRM_PASSWORD),
                Click.on(UtestRegistrationStep4.CHECKBOX_STAY_INFORMED),
                Click.on(UtestRegistrationStep4.CHECKBOX_PRIVACY_POLICY),
                Click.on(UtestRegistrationStep4.CHECKBOX_TERMS_OF_USE),
                Click.on(UtestRegistrationStep4.BUTTON_COMPLETE_SETUP)
        );
    }
}
