package com.example.muchwow.iface;

import com.example.muchwow.Sale;

public interface ShippingPolicy {
    double getShippingCost(Sale sale);
}
