package com.example.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sales.model.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
