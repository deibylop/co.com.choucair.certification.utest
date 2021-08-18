package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.UtestJoinToday;

public class OpenForm implements Task {

    public static OpenForm onThePage(){
        return  Tasks.instrumented(OpenForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestJoinToday.LOGIN_BUTTON)
        );
    }
}
