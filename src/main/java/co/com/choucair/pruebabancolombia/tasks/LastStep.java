package co.com.choucair.pruebabancolombia.tasks;

import co.com.choucair.pruebabancolombia.model.UtestData;
import co.com.choucair.pruebabancolombia.userinterface.LastStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class LastStep implements Task {

    private List<UtestData> utestData;

    public LastStep(List<UtestData> utestData) {
        this.utestData = utestData;
    }

    public static Performable the(List<UtestData> utestData){
        return Tasks.instrumented(LastStep.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(utestData.get(0).getStrPassword()).into(LastStepPage.INPUT_PASSWORD),
                Enter.theValue(utestData.get(0).getStrPassword()).into(LastStepPage.INPUT_CONFIRM_PASSWORD),
                Click.on(LastStepPage.CHECK_STAY),
                Click.on(LastStepPage.CHECK_TERMS),
                Click.on(LastStepPage.CHECK_PRIVACY));
    }
}
