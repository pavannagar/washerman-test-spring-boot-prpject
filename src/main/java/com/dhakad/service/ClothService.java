package com.dhakad.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dhakad.entity.Cloth;

@Service
public interface ClothService {

	public Cloth addcloth(Cloth cloth);
	public List<Cloth> getAllCloth();
	public Cloth getClothById(int id);
	public Cloth updateCloth(Cloth cloth,int id);
	public void removeById(int id);
	
	
}
