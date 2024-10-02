package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Tax;
import com.service.TaxService;

@RestController
@RequestMapping("/taxes")
public class TaxController {
	@Autowired
    private TaxService taxService;

    @PostMapping
    public Tax calculateAndSaveTax(@RequestBody Tax tax) {
        double taxAmount = taxService.calculateTax(tax.getEmployee().getSalary(), tax.getTaxRate());
        tax.setTaxAmount(taxAmount);
        return taxService.saveTax(tax);
    }

}
