package com.example.sales.service;

import java.util.List;
import java.util.Optional;

import com.example.sales.model.BuyList;

public interface BuyListService {

	List<BuyList> getAll();

	Optional<BuyList> getById(Integer id);

	void save(BuyList buyList);

	void update(BuyList buyList);

	void deleteById(Integer id);

}
