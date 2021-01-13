package co.com.choucair.pruebabancolombia.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/register_test_bancolombia.feature",
        tags = "@scenario1",
        glue = "co.com.choucair.pruebabancolombia.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
