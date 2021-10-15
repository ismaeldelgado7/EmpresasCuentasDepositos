package chl.per.apl.app.mantenimiento.test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions (features = "src/test/resources/features/EmpresasDepositos.feature",
        glue = "chl.per.apl.app.mantenimiento.test.stepdefinitions",
        tags = "@tag1",
        snippets = SnippetType.CAMELCASE)

public class RunnerEmpresasDepositos {

}
