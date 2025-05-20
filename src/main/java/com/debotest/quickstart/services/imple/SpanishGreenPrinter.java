package com.debotest.quickstart.services.imple;

import com.debotest.quickstart.services.GreenPrinter;
import org.springframework.stereotype.Component;

@Component("spanishGreenPrinter")
public class SpanishGreenPrinter implements GreenPrinter {
    @Override
    public String print() {
        return "Verde";
    }
}
