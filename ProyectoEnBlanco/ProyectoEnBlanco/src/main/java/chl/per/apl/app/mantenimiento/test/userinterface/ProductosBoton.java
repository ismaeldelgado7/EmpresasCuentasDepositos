package chl.per.apl.app.mantenimiento.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductosBoton {
    public static final Target PRODUCTSBUTTON = Target.the("Botón que abre el menú de productos y servicios").
            located(By.xpath("//a[text()[contains(.,'Productos & Servicios')]]"));

}
