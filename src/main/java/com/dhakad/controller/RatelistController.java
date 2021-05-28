package com.dhakad.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dhakad.entity.Ratelist;
import com.dhakad.service.RatelistService;

@RestController
public class RatelistController {

	@Autowired
	private RatelistService ratelistService;
	
	@PostMapping("ratelist")
	public Ratelist addRatelist(@RequestBody Ratelist ratelist) {
		System.out.println(ratelist );
		ratelistService.addRatelist(ratelist);
		return ratelist;
	}
	
	@GetMapping("ratelist")
	public List<Ratelist> getAllRatelist(){
		return ratelistService.getAllRatelist();
	}
	
	@GetMapping("ratelist/{id}")
	public Ratelist getRatelistById(@PathVariable int id) {
		return ratelistService.getById(id);
	}
	

	@DeleteMapping("ratelist/{id}")
	public int removeById(@PathVariable("id") int id) {
	// 	Ratelist ratelist=ratelistService.getById(id);
		ratelistService.removeById(id);
		return id;
	}
	
	@PutMapping("ratelist/{id}")
	public Ratelist updateRatelist(@RequestBody Ratelist ratelist,@PathVariable("id") int id) {
		return ratelistService.updateRatelist(ratelist, id);
		
	}
	
	
	
}
