package demoblaze.product;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductForm {
    public static final Target PRODUCT_NAME_LABEL = Target.the("product name label")
            .located(By.cssSelector("h2.name"));
    public static final Target PRODUCT_PRICE_LABEL = Target.the("product price label")
            .located(By.cssSelector("h3.price-container"));
    public static final Target PRODUCT_ADD_TO_CART_BUTTON = Target.the("product add to cart button")
            .locatedBy("//a[text()='Add to cart']");
}
