package co.com.demoblaze.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.demoblaze.userinterfaces.ProductsUi.TOTAL_AMOUNT;

public class TotalValue {

    public static Question<String> shouldBe() {
        return actor -> BrowseTheWeb.as(actor).find(TOTAL_AMOUNT).waitUntilVisible().getText();
    }
}
