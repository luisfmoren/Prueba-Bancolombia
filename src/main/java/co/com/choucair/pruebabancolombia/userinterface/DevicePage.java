package co.com.choucair.pruebabancolombia.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicePage {

    public static final Target INPUT_COMPUTER  = Target.the("input computer")
            .located(By.name("osId"));

    public static final Target SELECT_COMPUTER = Target.the("select computer")
            .located(By.xpath("//div[contains(text(),'Windows')]"));

    public static final Target INPUT_VERSION  = Target.the("input version")
            .located(By.name("osVersionId"));

    public static final Target SELECT_VERSION = Target.the("select version")
            .located(By.xpath("//div[contains(text(),'10 64-bit')]"));

    public static final Target INPUT_LANGUAGE  = Target.the("input language")
            .located(By.name("osLanguageId"));

    public static final Target SELECT_LANGUAGE = Target.the("select language")
            .located(By.xpath("//div[contains(text(),'Spanish')]"));

    public static final Target INPUT_MOBILE  = Target.the("input mobile")
            .located(By.name("handsetMakerId"));

    public static final Target SELECT_MOBILE = Target.the("select mobile")
            .located(By.xpath("//div[contains(text(),'Apple')]"));

    public static final Target INPUT_MODEL  = Target.the("input model")
            .located(By.name("handsetModelId"));

    public static final Target SELECT_MODEL = Target.the("select model")
            .located(By.xpath("//div[contains(text(),'iPhone 3GS')]"));

    public static final Target INPUT_SYSTEM  = Target.the("input system")
            .located(By.name("handsetOSId"));

    public static final Target SELECT_SYSTEM = Target.the("select system")
            .located(By.xpath("//div[contains(text(),'iOS 4.1')]"));

    public static final Target BUTTON_NEXT_PAGE = Target.the("button next page")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/div[2]/div/a/span"));
}
