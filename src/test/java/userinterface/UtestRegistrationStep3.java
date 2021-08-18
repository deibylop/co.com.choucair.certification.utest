package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UtestRegistrationStep3 {

    public  static  final Target SELECT_OS_COMPUTER = Target.the("Click to select your computer operating system")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span"));
    public  static  final Target SELECT_OS_VERSION = Target.the("Click to select your operating system version")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span"));
    public  static  final Target SELECT_OS_LANGUAGE = Target.the("Click to select your operating system language")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span"));

    public  static  final Target SELECT_MOBILE_DEVICE = Target.the("Click to select your mobile device brand")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));
    public  static  final Target SELECT_MODEL_DEVICE = Target.the("Click to select your mobile device model")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span"));
    public  static  final Target SELECT_MOBILE_OS = Target.the("Click to select your mobile operating system")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span"));


    public  static  final Target NETX_LOCATION_BUTTON = Target.the("Button to continue with the next step ")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));

}
