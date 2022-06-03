package com.example.sales.service;

import java.util.List;
import java.util.Optional;

import com.example.sales.model.Client;

public interface ClientService {
	
	List<Client> getAll();

	Optional<Client> getById(Integer id);

	void save(Client client);

	void update(Client client);

	void deleteById(Integer id);

}
