package com.debotest.quickstart.services.imple;

import com.debotest.quickstart.services.BluePrinter;
import org.springframework.stereotype.Component;

@Component("spanishBluePrinter")
public class SpanishBluePrinter implements BluePrinter {
    @Override
    public String print() {
        return "Azul";
    }
}
