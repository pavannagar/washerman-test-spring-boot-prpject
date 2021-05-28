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

import com.dhakad.entity.Category;
import com.dhakad.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	@PostMapping("category")
	public Category addcategory(@RequestBody Category category) {
		categoryService.addCategory(category);
		System.out.println(category);
		return category;
	}
	@GetMapping("category")
	public List<Category> getAllCategory(){
		return categoryService.getAllCategory();
	}
	@GetMapping("category/{id}")
	public Category getCategoryById(@PathVariable("id") int id) {
		Category category=categoryService.findById(id);
		System.out.println(category.getRatelist());
		return category;
	}
	@DeleteMapping("category/{id}")
	public Category removeById(@PathVariable("id") int id) {
		Category category=categoryService.findById(id);
		categoryService.removeCategory(id);
		return category;
	}
	@PutMapping("category/{id}")
	public Category updateCategory(@RequestBody Category category,@PathVariable("id") int id) {
		return categoryService.updateCategory(category, id);
	}
}
