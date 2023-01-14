package com.example.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Model.Groceries;
import com.example.Repository.GroceriesRepository;
import com.example.Service.GroceriesService;
@Repository
public  class GroceriServiceImpl implements GroceriesService {
	@Autowired
	GroceriesRepository groceriesRepository;

	@Override
	public Groceries createGroceries(Groceries groceries) {
		// TODO Auto-generated method stub
		return groceriesRepository.save(groceries);
	}

	@Override
	public List<Groceries> findAllGroceries() {
		// TODO Auto-generated method stub
		return groceriesRepository.findAll();
	}

	@Override
	public void deleteGroceries(int id) {
		// TODO Auto-generated method stub
		groceriesRepository.deleteById(id);
		
	}

	@Override
	public Groceries updateGroceries(Groceries groceries) {
		// TODO Auto-generated method stub
		Groceries _groceries = groceriesRepository.findById(groceries.getId()).get();
		_groceries.setId(groceries.getId());
		_groceries.setName(groceries.getName());
		_groceries.setPrice(groceries.getPrice());
		_groceries.setQuantity(groceries.getQuantity());
		return groceriesRepository.save(_groceries);
	}

	@Override
	public Groceries findGroceriesById(int id) {
		// TODO Auto-generated method stub
		return groceriesRepository.findById(id).get();
	}

	

}
