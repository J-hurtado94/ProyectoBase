package co.com.demoblaze.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.time.Duration;

import static co.com.demoblaze.userinterfaces.ProductsUi.*;

public class AddProducts {

public static Task toTheShoppingCart(String productName) {
    return Task.where(
            Click.on(PRODUCT.of(productName).waitingForNoMoreThan(Duration.ofSeconds(8))),
            Click.on(ADD_TO_CART),
            Click.on(HOME)

            );
}

 public static Task goToTheShoppingCart(){
    return Task.where(Click.on(CART));
}
}
