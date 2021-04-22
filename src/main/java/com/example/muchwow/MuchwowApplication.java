package com.example.muchwow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MuchwowApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        ((SalesReportProgram)context.getBean("salesReportProgram")).runSalesReport();
        //SpringApplication.run(MuchwowApplication.class, args);

    }

}
