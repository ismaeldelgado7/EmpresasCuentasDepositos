package chl.per.apl.app.mantenimiento.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DepositosBoton {
    public static final Target DEPOSITBUTTON = Target.the("Botón que dirige a información sobre cuentas de depósito").
            located(By.xpath("//a[text()[contains(.,'Depósitos')]]"));

}
