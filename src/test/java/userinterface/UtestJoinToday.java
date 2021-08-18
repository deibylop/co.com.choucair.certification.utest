package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UtestJoinToday {

    public  static  final Target LOGIN_BUTTON = Target.the("Button that redirects to the utest form").
            located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));

}
