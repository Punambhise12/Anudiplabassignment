package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Groceries;
import com.example.Service.GroceriesService;

@RestController
public class GroceriController {
	@Autowired
	GroceriesService groceriesService;
	@PostMapping("/Grocery")
	public Groceries createGroceries(@RequestBody Groceries groceries)
	{
		System.out.println(groceries.getName());
		return groceriesService.createGroceries(groceries);
	}
	@GetMapping("/Grocery")
	public List<Groceries>findAllGroceries()
	{
		return groceriesService.findAllGroceries();
	}
	@GetMapping("/Grocery/{id}")
	public Groceries findGroceriesById(@PathVariable int id)
	{
		return groceriesService.findGroceriesById(id);
	}
	@DeleteMapping("/Grocery/{id}")
	public String deleteGroceries(@PathVariable int id)
	{
		groceriesService.deleteGroceries(id);
		return "Item Deleted Sucessfully!!";
	}
	@PutMapping("Grocery")
	public Groceries updateGroceries(@RequestBody Groceries groceries)
	{
		return groceriesService.updateGroceries(groceries);
	}

}
