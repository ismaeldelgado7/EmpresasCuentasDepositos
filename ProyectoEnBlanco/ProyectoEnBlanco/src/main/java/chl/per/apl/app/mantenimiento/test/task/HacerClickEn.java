package chl.per.apl.app.mantenimiento.test.task;

import chl.per.apl.app.mantenimiento.test.userinterface.BotonDescargarPDF;
import chl.per.apl.app.mantenimiento.test.userinterface.LabelAhorrar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.actions.ScrollToTarget;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class HacerClickEn implements Task {
    public static HacerClickEn ElIconoDeDescargarPDF()
    {
        return Tasks.instrumented(HacerClickEn.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BotonDescargarPDF.DOWNLOADPDFBUTTON, isClickable()).forNoMoreThan(10).seconds(),
                Scroll.to(LabelAhorrar.SAVINGLABEL),
                Click.on(BotonDescargarPDF.DOWNLOADPDFBUTTON));

    }
}

