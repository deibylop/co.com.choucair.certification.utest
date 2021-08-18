package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.UtestRegistrationStep1;

public class FillFormStep1 implements Task {
    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strLanguage;
    private String strMonthBirthday;
    private String strDayBirthday;
    private String strYearBirthday;



    public FillFormStep1(String strFirstName, String strLastName, String strEmail,String strMonthBirthday, String strDayBirthday, String strYearBirthday, String strLanguage) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strLanguage = strLanguage;
        this.strMonthBirthday = strMonthBirthday;
        this.strDayBirthday = strDayBirthday;
        this.strYearBirthday = strYearBirthday;
    }

    public static FillFormStep1 the(String strFirstName, String strLastName, String strEmail,String strMonthBirthday, String strDayBirthday, String strYearBirthday, String strLanguage) {
        return Tasks.instrumented(FillFormStep1.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strFirstName).into(UtestRegistrationStep1.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(UtestRegistrationStep1.INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(UtestRegistrationStep1.INPUT_EMAIL),
                Enter.theValue(strMonthBirthday).into(UtestRegistrationStep1.SELECT_MONTH_OF_BIRTH),
                Enter.theValue(strDayBirthday).into(UtestRegistrationStep1.SELECT_DAY_OF_BIRTH),
                Enter.theValue(strYearBirthday).into(UtestRegistrationStep1.SELECT_YEAR_OF_BIRTH),
                Enter.theValue(strLanguage).into(UtestRegistrationStep1.INPUT_LANGUAGES),
                Click.on(UtestRegistrationStep1.NETX_LOCATION_BUTTON)

        );
    }
}