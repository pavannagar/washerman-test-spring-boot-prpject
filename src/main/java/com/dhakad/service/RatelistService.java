package com.dhakad.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dhakad.entity.Ratelist;

@Service
public interface RatelistService {

	public Ratelist addRatelist(Ratelist ratelist);
	public List<Ratelist> getAllRatelist();
	public Ratelist getById(int id);
	public void removeById(int id);
	public Ratelist updateRatelist(Ratelist ratelist,int id);
}
