package co.com.demoblaze.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.navigation.DemoBlazeHome;

public class NavigateTo {
    public static Performable theDemoBlazePage(){
        return Task.where(
                Open.browserOn().the(DemoBlazeHome.class)
        );
    }
}
