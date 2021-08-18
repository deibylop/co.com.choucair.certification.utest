package userinterface;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UtestRegistrationStep2 {
    public  static  final Target INPUT_CITY = Target.the("Field where we enter city address")
            .located(By.id("city"));
    public  static  final Target INPUT_ZIPCODE = Target.the("Field where we enter zip code")
            .located(By.id("zip"));
    public  static  final Target SELECT_COUNTRY = Target.the("Click to select country")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));

    public  static  final Target NETX_LOCATION_BUTTON = Target.the("Button to continue with the next step")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));




}

