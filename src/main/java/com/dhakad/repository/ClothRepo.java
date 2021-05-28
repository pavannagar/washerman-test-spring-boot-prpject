package com.dhakad.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dhakad.entity.Cloth;
@Repository
public interface ClothRepo extends CrudRepository<Cloth, Integer> {

}
