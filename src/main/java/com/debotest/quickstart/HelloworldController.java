package com.debotest.quickstart;

import com.debotest.quickstart.config.PizzaConfig;
import com.debotest.quickstart.services.ColourPrinter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
    private ColourPrinter obj ;

    public HelloworldController(ColourPrinter obj){
        this.obj = obj;
    }
    @GetMapping(path = "/hello")
    public String helloWorld(){
//        final ColourPrinter obj = new ColourPrinterImp();
        final PizzaConfig pizzaConfig = new PizzaConfig("tomato","mozzarella","thin");
        String pizza = String.format("I want a pizza ,", pizzaConfig.getCrust(),pizzaConfig.getTopping(), pizzaConfig.getSauce());

        return pizza;
    }
}
