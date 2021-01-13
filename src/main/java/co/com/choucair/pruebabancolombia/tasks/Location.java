package co.com.choucair.pruebabancolombia.tasks;

import co.com.choucair.pruebabancolombia.model.UtestData;
import co.com.choucair.pruebabancolombia.userinterface.LocationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Location implements Task {

    private List<UtestData> utesdata;

    public Location(List<UtestData> utesdata) {
        this.utesdata = utesdata;
    }

    public static Performable the(List<UtestData> utestData){
        return Tasks.instrumented(Location.class,utestData);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(utesdata.get(0).getStrCity()).into(LocationPage.INPUT_CITY),
                Enter.theValue(utesdata.get(0).getStrZip()).into(LocationPage.INPUT_ZIP),
                Click.on(LocationPage.INPUT_COUNTRY),
                Click.on(LocationPage.SELECT_COUNTRY),
                Click.on(LocationPage.BUTTON_NEXT_PAGE));

    }
}
