package chl.per.apl.app.mantenimiento.test.task;

import chl.per.apl.app.mantenimiento.test.userinterface.DepositosBoton;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class ClickeaEn implements Task{
    public static ClickeaEn ElBotonDepositos()
    {
        return Tasks.instrumented(ClickeaEn.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(DepositosBoton.DEPOSITBUTTON, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(DepositosBoton.DEPOSITBUTTON));

    }
}
