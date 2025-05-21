package com.debotest.quickstart;

import com.debotest.quickstart.config.PizzaConfig;
import com.debotest.quickstart.services.ColourPrinter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
//    private ColourPrinter obj ;

    private PizzaConfig pizzaConfig;

//    public HelloworldController(ColourPrinter obj){
//        this.obj = obj;
//    }

    public HelloworldController(PizzaConfig pizzaConfig){
        this.pizzaConfig=pizzaConfig;
    }

    @GetMapping(path = "/hello")
    public String helloWorld(){
//        final ColourPrinter obj = new ColourPrinterImp();

        String pizza = String.format("I want a pizza with %s crust, %s topping, and %s sauce.",
                pizzaConfig.getCrust(), pizzaConfig.getTopping(), pizzaConfig.getSauce());

        return pizza;
    }
}
