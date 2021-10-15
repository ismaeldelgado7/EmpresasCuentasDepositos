package chl.per.apl.app.mantenimiento.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AnswerPDF implements Question<String> {
    private final String URL;

    public AnswerPDF(String PDFCorrectLink) {
        this.URL = PDFCorrectLink;
    }

    public static AnswerPDF is(String Title) {
        return new AnswerPDF(Title);
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.angularRequestsHaveFinished());
        return BrowseTheWeb.as(actor).getDriver().getCurrentUrl();
    }
}
