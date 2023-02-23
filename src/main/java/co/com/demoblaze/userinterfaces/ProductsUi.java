package co.com.demoblaze.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductsUi {

    public static final Target PRODUCT = Target.the("Producto").locatedBy("//a[text()='{0}']");
    public static final Target ADD_TO_CART = Target.the("Add to cart").locatedBy("//a[text()='Add to cart']");
    public static final Target CART = Target.the("Cart").located(By.id("cartur"));
    public static final Target HOME = Target.the("Home").locatedBy("#navbarExample > ul > li.nav-item.active > a");
    public static final Target TOTAL_AMOUNT = Target.the("Amount").located(By.id("totalp"));
}
