package com.example.muchwow.impl;

import com.example.muchwow.Sale;
import com.example.muchwow.iface.ShippingPolicy;


public class FreeShipping implements ShippingPolicy {
    @Override
    public double getShippingCost(Sale sale) {
        return 0;
    }
}
