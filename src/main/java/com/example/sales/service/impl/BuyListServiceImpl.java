package com.example.sales.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sales.model.BuyList;
import com.example.sales.repository.BuyListRepository;
import com.example.sales.service.BuyListService;

@Service
public class BuyListServiceImpl implements BuyListService {
	
	@Autowired
	private BuyListRepository buyListRepository;

	@Override
	public List<BuyList> getAll() {
		return buyListRepository.findAll();
	}

	@Override
	public Optional<BuyList> getById(Integer id) {
		return buyListRepository.findById(id);
	}

	@Override
	public void save(BuyList buyList) {
		buyListRepository.save(buyList);
	}

	@Override
	public void update(BuyList buyList) {
		buyListRepository.save(buyList);
	}

	@Override
	public void deleteById(Integer id) {
		buyListRepository.deleteById(id);
	}

}
