package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.UtestRegistrationStep2;

public class FillFormStep2 implements Task {
    private String strCity;
    private String strZipCode;

    public FillFormStep2(String strCity, String strZipCode) {
        this.strCity = strCity;
        this.strZipCode = strZipCode;
    }

    public static FillFormStep2 the(String strCity, String strZipCode) {
        return Tasks.instrumented(FillFormStep2.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strCity).into(UtestRegistrationStep2.INPUT_CITY),
                Enter.theValue(strZipCode).into(UtestRegistrationStep2.INPUT_ZIPCODE),
                Click.on(UtestRegistrationStep2.SELECT_COUNTRY),
                Click.on(UtestRegistrationStep2.NETX_LOCATION_BUTTON)

        );
    }
}
