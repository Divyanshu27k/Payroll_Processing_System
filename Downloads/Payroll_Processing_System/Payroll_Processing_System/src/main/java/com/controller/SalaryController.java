package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Salary;
import com.service.SalaryService;


@RestController
@RequestMapping("/salaries")
@Service

public class SalaryController {

    @Autowired
    private SalaryService salaryService;

    @GetMapping
    public List<Salary> getSalaries() {
        return salaryService.getAllSalaries();
    }

    @PostMapping
    public Salary createSalary(@RequestBody Salary salary) {
        double netSalary = salaryService.calculateNetSalary(salary.getBaseSalary(), salary.getTax());
        salary.setBaseSalary(netSalary);
        return salaryService.saveSalary(salary);
    }

}
