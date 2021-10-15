package chl.per.apl.app.mantenimiento.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LabelAhorrar {
    public static final Target SAVINGLABEL = Target.the("Label al que haremos scroll para evitar el click interceptado en el botón descargar PDF").
            located(By.xpath("//h2[text()[contains(.,'Ahorrar siempre es rentable')]]"));
}
