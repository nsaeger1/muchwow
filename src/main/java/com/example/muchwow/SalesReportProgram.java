package com.example.muchwow;

import com.example.muchwow.iface.SalesInput;
import com.example.muchwow.iface.SalesReport;
import com.example.muchwow.iface.ShippingPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SalesReportProgram {
    @Autowired
    private ShippingPolicy shippingPolicy;


    @Autowired
    private SalesReport salesReport;

    @Autowired
    private SalesInput salesInput;

    public void runSalesReport(){
        List<Sale> salesList = salesInput.getSales();

        for(Sale sale : salesList){
            sale.setShipping(shippingPolicy.getShippingCost(sale));
        }

        salesReport.generateReport(salesList);
    }

}
