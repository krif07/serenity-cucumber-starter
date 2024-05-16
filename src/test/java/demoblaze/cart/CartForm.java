package demoblaze.cart;

import net.serenitybdd.screenplay.targets.Target;

public class CartForm {
    public static final Target CART_TITLE_LABEL = Target.the("cart title label")
            .locatedBy("(//div[@id='page-wrapper']//h2)[1]");
}
