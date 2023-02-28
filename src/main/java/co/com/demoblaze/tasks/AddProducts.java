package co.com.demoblaze.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.time.Duration;
import java.util.List;

import static co.com.demoblaze.userinterfaces.ProductsUi.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddProducts {

public static Performable toTheShoppingCart(List<String> productName) {
    return Task.where(
            actor -> {
            productName.forEach(
                    products -> theActorInTheSpotlight().attemptsTo(
                            Click.on(PRODUCT.of(products).waitingForNoMoreThan(Duration.ofSeconds(8))),
                            Click.on(ADD_TO_CART),
                            Click.on(HOME)
                    ));
            }
    );
}

 public static Task goToTheShoppingCart(){
    return Task.where(Click.on(CART));
}
}
