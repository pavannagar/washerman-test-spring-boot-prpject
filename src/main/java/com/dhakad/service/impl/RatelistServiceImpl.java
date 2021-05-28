package com.dhakad.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhakad.entity.Ratelist;
import com.dhakad.repository.RatelistRepo;
import com.dhakad.service.RatelistService;

@Service
public class RatelistServiceImpl implements RatelistService {

	@Autowired
	private RatelistRepo ratelistRepo;
	
	@Override
	public Ratelist addRatelist(Ratelist ratelist) {
		ratelistRepo.save(ratelist);
		return ratelist;
	}

	@Override
	public List<Ratelist> getAllRatelist() {
		// TODO Auto-generated method stub
		return (List<Ratelist>) ratelistRepo.findAll();
	}

	@Override
	public Ratelist getById(int id) {
		Optional<Ratelist> ratelist=ratelistRepo.findById(id);
		return ratelist.get();
	}

	@Override
	public void removeById(int id) {
		//Ratelist ratelist=ratelistRepo.findById(id).get();
		ratelistRepo.deleteById(id);
		//ratelistRepo.delete(ratelist);
		System.out.println("removed"+id);
	}

	@Override
	public Ratelist updateRatelist(Ratelist ratelist, int id) {
		Ratelist rl=ratelistRepo.findById(id).get();
		if(ratelist.getId()==rl.getId()) {
		ratelistRepo.save(ratelist);
		}
		return ratelist;
	}
	
	

}
