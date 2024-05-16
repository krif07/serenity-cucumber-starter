package demoblaze.questions.product;

import demoblaze.product.ProductForm;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ProductQuestions {
    public static Question<String> productName() {
        return Text.of(ProductForm.PRODUCT_NAME_LABEL);
    }
    public static Question<String> productPrice() {
        return Text.of(ProductForm.PRODUCT_PRICE_LABEL);
    }
}
