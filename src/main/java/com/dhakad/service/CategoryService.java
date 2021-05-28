package com.dhakad.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dhakad.entity.Category;

@Service
public interface CategoryService {

	public Category addCategory(Category category);
	public List<Category> getAllCategory();
	public void removeCategory(int id);
	public Category findById(int id);
	public Category updateCategory(Category category,int id);
}
