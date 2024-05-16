package demoblaze.home;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    /**
     * An action that opens the browser on the blaze demo home page
     */
    public static Performable toTheHomePage() {
        return Task.where("{0} opens the demo blaze home page",
                Open.browserOn().the(DemoBlazeHomePage.class));
    }
}
