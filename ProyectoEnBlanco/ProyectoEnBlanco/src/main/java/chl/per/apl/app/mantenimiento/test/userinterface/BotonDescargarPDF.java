package chl.per.apl.app.mantenimiento.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BotonDescargarPDF {
    public static final Target DOWNLOADPDFBUTTON = Target.the("Botón que abre el menú de productos y servicios").
            located(By.xpath("//img[@src='/wps/wcm/connect/www.banistmo.com11237/b5812574-aa98-42f4-8ee1-f2a4bd15e467/pdf-icon.png?MOD=AJPERES&CACHEID=ROOTWORKSPACE.Z21_7O9GHBG0O0M4A0Q3JGMS8408B6-b5812573-aa98-42f4-8ee1-f2a4bd15e467-m1cIl8g']"));
}
