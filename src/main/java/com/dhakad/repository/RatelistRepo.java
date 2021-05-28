package com.dhakad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dhakad.entity.Ratelist;
@Repository
public interface RatelistRepo extends CrudRepository<Ratelist, Integer> {

}
