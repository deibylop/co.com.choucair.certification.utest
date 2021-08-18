package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.UtestRegistrationStep2;
import userinterface.UtestRegistrationStep3;

public class FillFormStep3 implements Task {
    private String strOsComputer;
    private String strOsVersion;
    private String strOsLanguage;
    private String strMobileDevice;
    private String strModelMobile;
    private String strMobileOs;

    public FillFormStep3(String strOsComputer, String strOsVersion, String strOsLanguage, String strMobileDevice, String strModelMobile, String strMobileOs) {
        this.strOsComputer = strOsComputer;
        this.strOsVersion = strOsVersion;
        this.strOsLanguage = strOsLanguage;
        this.strMobileDevice = strMobileDevice;
        this.strModelMobile = strModelMobile;
        this.strMobileOs = strMobileOs;
    }

    public static FillFormStep3 the(String strOsComputer, String strOsVersion, String strOsLanguage, String strMobileDevice, String strModelMobile, String strMobileOs) {
        return Tasks.instrumented(FillFormStep3.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strOsComputer).into(UtestRegistrationStep3.SELECT_OS_COMPUTER),
                Enter.theValue(strOsVersion).into(UtestRegistrationStep3.SELECT_OS_VERSION),
                Enter.theValue(strOsLanguage).into(UtestRegistrationStep3.SELECT_OS_LANGUAGE),
                Enter.theValue(strMobileDevice).into(UtestRegistrationStep3.SELECT_MOBILE_DEVICE),
                Enter.theValue(strModelMobile).into(UtestRegistrationStep3.SELECT_MODEL_DEVICE),
                Enter.theValue(strMobileOs).into(UtestRegistrationStep3.SELECT_MOBILE_OS)
        );

    }
}
