package com.example.sales.service;

import java.util.List;
import java.util.Optional;

import com.example.sales.model.BuyListDetail;

public interface BuyListDetailService {
	
	List<BuyListDetail> getAll();
	
	Optional<BuyListDetail> getById(Integer id);
	
	void save(BuyListDetail buyListDetail);
	
	void update(BuyListDetail buyListDetail);
	
	void deleteById(Integer id);

}
