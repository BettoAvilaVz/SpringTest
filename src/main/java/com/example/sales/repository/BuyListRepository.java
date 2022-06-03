package com.example.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sales.model.BuyList;

public interface BuyListRepository extends JpaRepository<BuyList, Integer> {

}
