package starter.stepdefinitions;

import co.com.demoblaze.questions.TotalValue;
import co.com.demoblaze.tasks.AddProducts;
import co.com.demoblaze.tasks.NavigateTo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static co.com.demoblaze.tasks.AddProducts.goToTheShoppingCart;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class SearchStepDefinitions {

    @Given("the user enter to the demoblaze page")
    public void the_user_enter_to_the_demoblaze_page() {
        theActorCalled("User").wasAbleTo(NavigateTo.theDemoBlazePage());
    }

    @When("add the product")
    public void add_the_product(List<String> products) {
       theActorInTheSpotlight().attemptsTo(
        AddProducts.toTheShoppingCart(products));
        theActorInTheSpotlight().attemptsTo(AddProducts.goToTheShoppingCart());

    }

    @Then("user can see the total amount")
    public void user_can_see_the_total_amount(String total) {
        theActorInTheSpotlight().should(seeThat("The total value:", TotalValue.shouldBe(), equalTo(total)));

    }

}
