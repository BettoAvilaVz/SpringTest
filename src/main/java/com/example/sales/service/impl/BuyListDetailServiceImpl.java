package com.example.sales.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sales.model.BuyListDetail;
import com.example.sales.repository.BuyListDetailRepository;
import com.example.sales.service.BuyListDetailService;

@Service
public class BuyListDetailServiceImpl implements BuyListDetailService {
	
	@Autowired
	private BuyListDetailRepository buyListDetailRepository;

	@Override
	public List<BuyListDetail> getAll() {
		return buyListDetailRepository.findAll();
	}

	@Override
	public Optional<BuyListDetail> getById(Integer id) {
		return buyListDetailRepository.findById(id);
	}

	@Override
	public void save(BuyListDetail buyListDetail) {
		buyListDetailRepository.save(buyListDetail);
	}

	@Override
	public void update(BuyListDetail buyListDetail) {
		buyListDetailRepository.save(buyListDetail);
	}

	@Override
	public void deleteById(Integer id) {
		buyListDetailRepository.deleteById(id);
	}

}
