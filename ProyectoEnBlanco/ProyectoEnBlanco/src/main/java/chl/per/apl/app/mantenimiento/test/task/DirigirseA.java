package chl.per.apl.app.mantenimiento.test.task;

import chl.per.apl.app.mantenimiento.test.userinterface.BotonCuentasDeAhorroComerciales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class DirigirseA implements Task{
    public static DirigirseA VerInformacionDeCuentasDeAhorrosComerciales(){
        return Tasks.instrumented(DirigirseA.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BotonCuentasDeAhorroComerciales.COMMERCIAL_ACCOUNTS_INFO_BUTTON, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(BotonCuentasDeAhorroComerciales.COMMERCIAL_ACCOUNTS_INFO_BUTTON));
    }
}
