package com.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.model.Tax;
import com.repository.TaxRepository;

public class TaxService {

    @Autowired
    private TaxRepository taxRepository;

    public double calculateTax(double baseSalary, double taxRate) {
        return baseSalary * taxRate / 100;
    }

    public Tax saveTax(Tax tax) {
        return taxRepository.save(tax);
    }
}
