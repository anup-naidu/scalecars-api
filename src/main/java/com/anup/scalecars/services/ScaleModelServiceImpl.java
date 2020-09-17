package com.anup.scalecars.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anup.scalecars.model.Scalemaster;
import com.anup.scalecars.repositories.ScalemasterRepository;

@Service
public class ScaleModelServiceImpl implements ScaleModelService{
	
	@Autowired
	private ScalemasterRepository scalecarsRepository;

	@Override
	public List<Scalemaster> listAllCars() {
		List<Scalemaster> scalecarsList = new ArrayList<>();
		scalecarsRepository.findAll().forEach(scalecarsList::add);
		System.out.println("=======================size:"+scalecarsList.size());
        return scalecarsList;
	}
	
	@Override
	public void addNewScalecar(Scalemaster scalemaster) {
		scalecarsRepository.save(scalemaster);
	}

	@Override
	public Scalemaster getScalecar(Long id) {
		return scalecarsRepository.findById(id).orElse(null);
	}

	@Override
	public void updateScalecar(Scalemaster scalemaster, Long id) {
		scalecarsRepository.save(scalemaster);
	}

	@Override
	public void deleteScalecar(Long id) {
		scalecarsRepository.deleteById(id);
	}

}
