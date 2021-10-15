package chl.per.apl.app.mantenimiento.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BotonDocumentos {
    public static final Target DOCUMENTSBUTTON = Target.the("Botón para dar click en presupuesto").
            located(By.xpath("//a[text()[contains(.,'Documentos')]]"));
}
