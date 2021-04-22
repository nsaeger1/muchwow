package com.example.muchwow.impl;

import com.example.muchwow.Sale;
import com.example.muchwow.iface.ShippingPolicy;

public class FlatRateShipping implements ShippingPolicy {

    @Override
    public double getShippingCost(Sale sale) {
        return 10;
    }
}
