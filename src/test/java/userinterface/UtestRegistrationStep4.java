package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UtestRegistrationStep4 {

    public  static  final Target INPUT_CREATE_PASSWORD = Target.the("Were do we write the password").
            located(By.id("password"));
    public  static  final Target INPUT_COMFIRM_PASSWORD = Target.the("Were do we repeat the password")
            .located(By.id("confirmPassword"));

    public  static  final Target CHECKBOX_STAY_INFORMED = Target.the("Email campaign information checkbox")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));

    public  static  final Target CHECKBOX_TERMS_OF_USE = Target.the("Terms of use checkbox")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label"));
    public  static  final Target CHECKBOX_PRIVACY_POLICY = Target.the("Privacy policies checkbox")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));


    public  static  final Target BUTTON_COMPLETE_SETUP = Target.the("Button to end registration ")
            .located(By.xpath("//*[@id=\"laddaBtn\"]"));


}
