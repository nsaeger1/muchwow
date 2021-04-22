package com.example.muchwow;

import com.example.muchwow.iface.SalesInput;
import com.example.muchwow.iface.SalesReport;
import com.example.muchwow.iface.ShippingPolicy;
import com.example.muchwow.impl.DetailSalesReport;
import com.example.muchwow.impl.FileInput;
import com.example.muchwow.impl.FreeShipping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.muchwow")
public class AppConfig {
    @Bean
    public SalesInput salesInput(){
        return new FileInput();
    }

    @Bean
    public SalesReport salesReport(){
        return new DetailSalesReport();
        //return new SummarySalesReport();
    }

    @Bean
    public ShippingPolicy shippingPolicy(){
        //return new FlatRateShipping();
        return new FreeShipping();
    }

}
