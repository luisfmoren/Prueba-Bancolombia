package co.com.choucair.pruebabancolombia.tasks;

import co.com.choucair.pruebabancolombia.model.UtestData;
import co.com.choucair.pruebabancolombia.userinterface.PersonalInformationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

public class PersonalInformation implements Task {
    private List<UtestData> utesdata;

    public PersonalInformation(List<UtestData> utesdata) {
        this.utesdata = utesdata;
    }

    public static Performable the(List<UtestData> utestData){
        return Tasks.instrumented(PersonalInformation.class,utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PersonalInformationPage.BUTTON_REGISTER),
                Enter.theValue(utesdata.get(0).getStrFirstName()).into(PersonalInformationPage.INPUT_FIRST_NAME),
                Enter.theValue(utesdata.get(0).getStrLastName()).into(PersonalInformationPage.INPUT_LAST_NAME),
                Enter.theValue(utesdata.get(0).getStrEmail()).into(PersonalInformationPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(utesdata.get(0).getStrMonth()).from(PersonalInformationPage.SELECT_MONTH),
                SelectFromOptions.byVisibleText(utesdata.get(0).getStrDay()).from(PersonalInformationPage.SELECT_DAY),
                SelectFromOptions.byVisibleText(utesdata.get(0).getStrYear()).from(PersonalInformationPage.SELECT_YEAR),
                Click.on(PersonalInformationPage.BUTTON_NEXT_PAGE));
    }
}
