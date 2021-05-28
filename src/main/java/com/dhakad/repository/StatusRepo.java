package com.dhakad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhakad.entity.Status;

public interface StatusRepo extends JpaRepository<Status, Integer> {

}
