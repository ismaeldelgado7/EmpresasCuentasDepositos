package chl.per.apl.app.mantenimiento.test.task;

import chl.per.apl.app.mantenimiento.test.userinterface.ThePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class OpenUp implements Task {
    private ThePage ThePage;

    public static OpenUp ThePage(){
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(Open.browserOn(ThePage));
    }

}
