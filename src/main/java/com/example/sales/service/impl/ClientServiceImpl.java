package com.example.sales.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sales.model.BuyList;
import com.example.sales.model.BuyListDetail;
import com.example.sales.model.Client;
import com.example.sales.repository.ClientRepository;
import com.example.sales.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {
	
	@Autowired
	private ClientRepository clientRepository;

	@Override
	public List<Client> getAll() {
		return clientRepository.findAll();
	}

	@Override
	public Optional<Client> getById(Integer id) {
		return clientRepository.findById(id);
	}

	@Override
	public void save(Client client) {
		if (null != client.getBuysList() && !client.getBuysList().isEmpty()) {
			for(BuyList buyList : client.getBuysList()) {
				buyList.setClient(client);
				if (null != buyList.getBuyListDetails() && !buyList.getBuyListDetails().isEmpty()) {
					for (BuyListDetail detail : buyList.getBuyListDetails()) {
						detail.setBuyList(buyList);
					}
				}
			}
		}
		clientRepository.save(client);
	}

	@Override
	public void update(Client client) {
		clientRepository.save(client);
	}

	@Override
	public void deleteById(Integer id) {
		clientRepository.deleteById(id);
	}

}
