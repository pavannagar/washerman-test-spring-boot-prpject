package com.dhakad.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhakad.entity.Category;
import com.dhakad.repository.CategoryRepo;
import com.dhakad.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryRepo categoryRepo;
	@Override
	public Category addCategory(Category category) {
		categoryRepo.save(category);
		return category;
	}
	@Override
	public List<Category> getAllCategory() {
		
		return (List<Category>) categoryRepo.findAll();
	}
	@Override
	public void removeCategory(int id) {
		categoryRepo.deleteById(id);
	}
	@Override
	public Category findById(int id) {
		Optional<Category> category=categoryRepo.findById(id);
		return category.get();
	}
	@Override
	public Category updateCategory(Category category, int id) {
		Category cat=categoryRepo.findById(id).get();
		if(category.getCategoryId()==cat.getCategoryId()) {
			categoryRepo.save(category);
		}
		return category;
	}

}
