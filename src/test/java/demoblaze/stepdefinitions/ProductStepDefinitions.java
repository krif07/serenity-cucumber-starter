package demoblaze.stepdefinitions;

import demoblaze.product.SelectProduct;
import demoblaze.questions.product.ProductQuestions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import demoblaze.home.NavigateTo;

public class ProductStepDefinitions {
    @Given("{actor} is looking for products in demo blaze")
    public void lookingForProducts(Actor actor) {
        actor.wasAbleTo(
                NavigateTo.toTheHomePage()
        );
    }

    @When("{actor} selects the product {string}")
    public void selectTheProduct(Actor actor, String name) {
        actor.attemptsTo(
                SelectProduct.toTheShoppingCart(name)
        );
    }

    @Then("{actor} should see the product name {string}")
    public void shouldSeeProductNameIs(Actor actor, String name) {
        actor.attemptsTo(
                Ensure.that(ProductQuestions.productName()).isEqualTo(name)
        );
    }

    @Then("{actor} should see the product price {string}")
    public void ShouldSeeProductPriceIs(Actor actor, String price) {
        actor.attemptsTo(
                Ensure.that(ProductQuestions.productPrice()).contains(price)
        );
    }
}
