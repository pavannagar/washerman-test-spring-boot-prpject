package com.dhakad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dhakad.entity.Cloth;
import com.dhakad.service.ClothService;

@RestController
public class ClothController {

	@Autowired
	private ClothService clothService;
	@PostMapping("cloth")
	public Cloth  addCloth(@RequestBody Cloth cloth) {
		clothService.addcloth(cloth);
		return cloth;
	}
	@PutMapping("cloth/{id}")
	public Cloth updateCloth(@RequestBody Cloth cloth , @PathVariable("id") int id) {
		return clothService.updateCloth(cloth, id);
	}
	
	
	@GetMapping("cloth")
	public List<Cloth> getAllCloth(){
		return clothService.getAllCloth();
	}
	
	@GetMapping("cloth/{id}")
	public Cloth getById(@PathVariable("id") int id) {
		return clothService.getClothById(id);
	}
	@DeleteMapping("cloth/{id}")
	public Cloth removeCloth(@PathVariable("id") int id) {
		Cloth cloth=clothService.getClothById(id);
		clothService.removeById(id);
		return cloth;
	}
	
	
	
}
