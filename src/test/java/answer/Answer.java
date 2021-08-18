package answer;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.apache.xpath.operations.Bool;
import org.seleniumhq.jetty9.http.HttpGenerator;
import tasks.FillFormStep4;

import javax.swing.plaf.nimbus.State;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }


    @Override
    public Boolean answeredBy(Actor actor) {

        boolean result;
        String Registration = HttpGenerator.State.COMPLETING.name();;

        if (question.equals(Registration)) {
            result = true;

        } else {
            result = false;
        }
        return result;

    }

}
