package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Tax;

public interface TaxRepository extends JpaRepository <Tax, Integer> {

}
