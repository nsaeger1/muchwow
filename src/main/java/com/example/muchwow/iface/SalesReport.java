package com.example.muchwow.iface;

import com.example.muchwow.Sale;

import java.util.List;

public interface SalesReport {
    void generateReport(List<Sale> salesList);
}
