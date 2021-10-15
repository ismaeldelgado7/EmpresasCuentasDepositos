package chl.per.apl.app.mantenimiento.test.stepdefinitions;


import chl.per.apl.app.mantenimiento.test.task.*;
import chl.per.apl.app.mantenimiento.test.questions.AnswerPDF;
import chl.per.apl.app.mantenimiento.test.userinterface.PDFCorrectLink;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EmpresasDepositosSteps {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Analista");
    }

    @Dado("^Ingreso A La Pagina De Banistmo Portal Empresas$")
    public void ingresoALaPaginaDeBanistmoPortalEmpresas() {
        theActorInTheSpotlight().attemptsTo(OpenUp.ThePage());

    }

    @Cuando("^Hago Click Productos y Servicios$")
    public void hagoClickProductosyServicios() {
        theActorInTheSpotlight().attemptsTo(HacerClick.EnElBotonProductos());
    }

    @Y("^Hago CLick En Depositos$")
    public void hagoCLickEnDepositos() {
        theActorInTheSpotlight().attemptsTo(ClickeaEn.ElBotonDepositos());
    }

    @Y("^Hago Click En Cuenta de Ahorro Comercial$")
    public void hagoClickEnCuentadeAhorroComercial() {
        theActorInTheSpotlight().attemptsTo(DirigirseA.VerInformacionDeCuentasDeAhorrosComerciales());
    }

    @Y("^Hago Click En Documentos$")
    public void hagoClickEnDocumentos() {
        theActorInTheSpotlight().attemptsTo(ClickearEn.BotonDocumentos());
    }

    @Y("^Hago Click En Contrato Unico$")
    public void hagoClickEnContratoUnico() {
        theActorInTheSpotlight().attemptsTo(HacerClickEn.ElIconoDeDescargarPDF());
    }

    @Entonces("^Debería Mostrarme El PDF Con Informacion De Contratos$")
    public void deberíaMostrarmeElPDFConInformacionDeContratos(String PDFCorrectLink) {
        theActorInTheSpotlight().should(seeThat(AnswerPDF.is(PDFCorrectLink)));
    }

}
