package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Model.Groceries;

public interface GroceriesRepository extends JpaRepository<Groceries, Integer>{

}
