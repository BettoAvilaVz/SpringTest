package com.example.sales.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sales.model.Client;
import com.example.sales.service.ClientService;

@RestController
@RequestMapping("/rest/api/v1/clients")
public class ClientRestController {
	
	@Autowired
	private ClientService clientService;
	
	@GetMapping
	public List<Client> getAll() {
		return clientService.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Client> getById(@PathVariable("id") Integer id) {
		return clientService.getById(id);
	}
	
	@PostMapping
	public void create(@RequestBody Client client) {
		clientService.save(client);
	}
	
	@PutMapping("/{id}")
	public void update(@PathVariable("id") Integer id, @RequestBody Client client) {
		clientService.update(client);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		clientService.deleteById(id);
	}

}
