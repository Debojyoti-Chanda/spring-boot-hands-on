package com.debotest.quickstart.services.imple;

import com.debotest.quickstart.services.BluePrinter;
import com.debotest.quickstart.services.ColourPrinter;
import com.debotest.quickstart.services.GreenPrinter;
import com.debotest.quickstart.services.RedPrinter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
// Other stereotype annotations (which are technically specializations of @Component):
//@Service – for service layer classes
//@Repository – for DAO/repository classes (also adds persistence exception translation)
//@Controller – for web controllers
//@RestController – shorthand for @Controller + @ResponseBody

public class ColourPrinterImp implements ColourPrinter {
    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;

    public ColourPrinterImp(@Qualifier("spanishRedPrinter") RedPrinter redPrinter,@Qualifier("spanishGreenPrinter") GreenPrinter greenPrinter,@Qualifier("spanishBluePrinter") BluePrinter bluePrinter){
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
        this.greenPrinter= greenPrinter;
    }

    @Override
    public String print() {
        return String.join(" ", greenPrinter.print(), bluePrinter.print(), redPrinter.print());
    }
}