package chl.per.apl.app.mantenimiento.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BotonCuentasDeAhorroComerciales {
    public static final Target COMMERCIAL_ACCOUNTS_INFO_BUTTON = Target.the("Botón que dirige a información sobre cuentas de depósito").
            located(By.xpath("//a[text()[contains(.,'Cuenta de Ahorro Comercial')]]"));

}
