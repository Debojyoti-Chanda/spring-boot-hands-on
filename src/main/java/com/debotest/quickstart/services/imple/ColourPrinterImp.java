package com.debotest.quickstart.services.imple;

import com.debotest.quickstart.services.BluePrinter;
import com.debotest.quickstart.services.ColourPrinter;
import com.debotest.quickstart.services.GreenPrinter;
import com.debotest.quickstart.services.RedPrinter;
import org.springframework.stereotype.Component;


public class ColourPrinterImp implements ColourPrinter {
    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;

//    public ColourPrinterImp() {
//        this.bluePrinter = new EnglishBluePrinter();
//        this.greenPrinter = new EnglishGreenPrinter();
//        this.redPrinter = new EnglishRedPrinter();
//    }

    // To swap out the implementations of the red, blue,and green we have change the implementation
    // of our classes, change this to use Beans

    public ColourPrinterImp(RedPrinter redPrinter,GreenPrinter greenPrinter, BluePrinter bluePrinter){
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
        this.greenPrinter= greenPrinter;
    }

    @Override
    public String print() {
        return String.join(" ", greenPrinter.print(), bluePrinter.print(), redPrinter.print());
    }
}
