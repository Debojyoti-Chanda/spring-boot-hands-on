package com.debotest.quickstart.services.imple;

import com.debotest.quickstart.services.RedPrinter;

public class EnglishRedPrinter implements RedPrinter {
    @Override
    public String print() {
        return "Red";
    }
}
