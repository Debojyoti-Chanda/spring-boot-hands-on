package com.debotest.quickstart.services.imple;

import com.debotest.quickstart.services.GreenPrinter;

public class EnglishGreenPrinter implements GreenPrinter {
    @Override
    public String print() {
        return "Green";
    }
}
