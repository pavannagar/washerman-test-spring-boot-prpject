package com.dhakad.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhakad.entity.Cloth;
import com.dhakad.repository.ClothRepo;
import com.dhakad.service.ClothService;
@Service
public class ClothServiceImpl implements ClothService {

	@Autowired
	private ClothRepo clothRepo;
	
	@Override
	public Cloth addcloth(Cloth cloth) {
		clothRepo.save(cloth);
		return cloth ;
	}

	@Override
	public List<Cloth> getAllCloth() {
		// TODO Auto-generated method stub
		return (List<Cloth>) clothRepo.findAll();
	}

	@Override
	public Cloth getClothById(int id) {
		
		return clothRepo.findById(id).get();
	}

	@Override
	public Cloth updateCloth(Cloth cloth, int id) {
		if(cloth.getClothId()==clothRepo.findById(id).get().getClothId()) {
			clothRepo.save(cloth);
		}
		return cloth;
	}

	@Override
	public void removeById(int id) {
		clothRepo.deleteById(id);
		
	}

}
