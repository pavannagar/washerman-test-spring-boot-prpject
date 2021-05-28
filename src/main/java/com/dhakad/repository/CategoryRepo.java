package com.dhakad.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dhakad.entity.Category;
@Repository
public interface CategoryRepo extends CrudRepository<Category, Integer> {

}
