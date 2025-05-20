package com.debotest.quickstart.config;

import com.debotest.quickstart.services.BluePrinter;
import com.debotest.quickstart.services.ColourPrinter;
import com.debotest.quickstart.services.GreenPrinter;
import com.debotest.quickstart.services.RedPrinter;
import com.debotest.quickstart.services.imple.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//  Using @Bean in a @Configuration Class
@Configuration
public class PrinterConfig {
    @Bean
    public BluePrinter bluePrinter(){
        return new SpanishBluePrinter();
    }
    @Bean
    public GreenPrinter greenPrinter(){
        return new SpanishGreenPrinter();
    }
    @Bean
    public RedPrinter redPrinter(){
        return new SpanishRedPrinter();
    }

    @Bean
    public ColourPrinter colourPrinter(RedPrinter redPrinter,GreenPrinter greenPrinter, BluePrinter bluePrinter){
        return new ColourPrinterImp(redPrinter,greenPrinter,bluePrinter);
    }
}
