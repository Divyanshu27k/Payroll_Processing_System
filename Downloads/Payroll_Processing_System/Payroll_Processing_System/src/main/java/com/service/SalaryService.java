package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.model.Salary;
import com.repository.SalaryRepository;

public class SalaryService {

    @Autowired
    private SalaryRepository salaryRepository;

    public List<Salary> getAllSalaries() {
        return salaryRepository.findAll();
    }

    public Salary saveSalary(Salary salary) {
        return salaryRepository.save(salary);
    }

    public double calculateNetSalary(double grossSalary, double tax) {
        return grossSalary - tax;
    }

}
