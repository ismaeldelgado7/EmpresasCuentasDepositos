package chl.per.apl.app.mantenimiento.test.task;

import chl.per.apl.app.mantenimiento.test.userinterface.ProductosBoton;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class HacerClick implements Task {
    public static HacerClick EnElBotonProductos()
    {
        return Tasks.instrumented(HacerClick.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(ProductosBoton.PRODUCTSBUTTON, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(ProductosBoton.PRODUCTSBUTTON));

    }
}

