package demoblaze.home;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoBlazeHomeForm {
    public static final Target MENU_HOME_LINK = Target.the("menu home link")
            .locatedBy("(//a[@class='nav-link'])[1]");
    public static final Target MENU_CART_LINK = Target.the("menu cart link")
            .locatedBy("//a[text()='Cart']");
    public static final Target LAT_MENU_CATEGORIES_LINK = Target.the("lateral manu categories")
            .located(By.cssSelector("a#cat"));
    public static final Target PRODUCT_LINK_BY_NAME = Target.the("product link by name")
            .locatedBy("//h4/a[text()='{0}']");
}
