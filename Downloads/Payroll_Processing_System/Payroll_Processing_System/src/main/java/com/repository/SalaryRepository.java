package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Salary;

public interface SalaryRepository extends JpaRepository<Salary, Integer>{

}
