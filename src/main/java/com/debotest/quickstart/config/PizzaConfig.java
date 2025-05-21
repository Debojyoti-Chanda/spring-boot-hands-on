package com.debotest.quickstart.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PizzaConfig {
    private String sauce;
    private String topping;
    private String crust;

}
//custom configuration with custom code, but loaded in exactly the same way as other configurations, for spring boot and
// spring framework