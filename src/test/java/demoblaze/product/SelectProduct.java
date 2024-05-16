package demoblaze.product;

import demoblaze.home.DemoBlazeHomeForm;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SelectProduct {
    public static Performable toTheShoppingCart(String name) {
        Target target = DemoBlazeHomeForm.PRODUCT_LINK_BY_NAME.of(name);
        return Task.where("{0} selects the product with the name ".concat(name),
                WaitUntil.the(target, WebElementStateMatchers.isClickable())
                        .forNoMoreThan(10).seconds(),
                Click.on(target)
        );
    }
}
