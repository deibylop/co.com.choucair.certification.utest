package userinterface;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UtestRegistrationStep1 {

    public  static  final Target INPUT_FIRST_NAME = Target.the("Field where we enter first name")
            .located(By.id("firstName"));
    public  static  final Target INPUT_LAST_NAME = Target.the("Field where we enter last name")
            .located(By.id("lastName"));
    public  static  final Target INPUT_EMAIL = Target.the("Field where we enter email address")
            .located(By.id("email"));

    public  static  final Target SELECT_MONTH_OF_BIRTH = Target.the("Click to select birthday month")
            .located(By.xpath("//*[@id=\"birthMonth\"]"));
    public  static  final Target SELECT_DAY_OF_BIRTH = Target.the("Click to select birthday day")
            .located(By.xpath("//*[@id=\"birthDay\"]"));
    public  static  final Target SELECT_YEAR_OF_BIRTH = Target.the("Click to select birthday year")
            .located(By.xpath("//*[@id=\"birthYear\"]"));

    public static final Target INPUT_LANGUAGES = Target.the("Field wher we enter languages")
            .located(By.id("languages"));

    public  static  final Target NETX_LOCATION_BUTTON = Target.the("Button to continue with the next step ")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));



}
