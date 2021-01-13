package co.com.choucair.pruebabancolombia.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalInformationPage {
    public static final Target BUTTON_REGISTER = Target.the("button register")
            .located(By.className("unauthenticated-nav-bar__sign-up"));

    public static final Target INPUT_FIRST_NAME = Target.the("input first name")
            .located(By.id("firstName"));

    public static final Target INPUT_LAST_NAME = Target.the("input last name")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("input email")
            .located(By.id("email"));

    public static final Target SELECT_MONTH = Target.the("select month")
            .located(By.id("birthMonth"));

    public static final Target SELECT_DAY = Target.the("select day")
            .located(By.id("birthDay"));

    public static final Target SELECT_YEAR = Target.the("select year")
            .located(By.id("birthYear"));

    public static final Target BUTTON_NEXT_PAGE = Target.the("button next page")
            .located(By.xpath("//span[contains(text(),'Next: Location')]"));

}
