package com.debotest.quickstart.services.imple;

import com.debotest.quickstart.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component("spanishRedPrinter")
public class SpanishRedPrinter implements RedPrinter {
    @Override
    public String print() {
        return "rojo";
    }
}
