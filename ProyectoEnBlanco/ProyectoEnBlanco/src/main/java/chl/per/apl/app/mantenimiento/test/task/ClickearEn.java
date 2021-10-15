package chl.per.apl.app.mantenimiento.test.task;

import chl.per.apl.app.mantenimiento.test.userinterface.BotonDocumentos;
import chl.per.apl.app.mantenimiento.test.userinterface.DepositosBoton;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class ClickearEn implements Task {
    public static ClickearEn BotonDocumentos()
    {
        return Tasks.instrumented(ClickearEn.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BotonDocumentos.DOCUMENTSBUTTON, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(BotonDocumentos.DOCUMENTSBUTTON));

    }
}
