package com.anup.scalecars.services;

import java.util.List;

import com.anup.scalecars.model.Scalemaster;


public interface ScaleModelService {
	
	List<Scalemaster> listAllCars();
	
	public void addNewScalecar(Scalemaster scalemaster);
	
	public Scalemaster getScalecar(Long id);
	
	public void updateScalecar(Scalemaster scalemaster, Long id);
	
	public void deleteScalecar(Long id);

}
