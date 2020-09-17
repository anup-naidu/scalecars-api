package com.anup.scalecars.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anup.scalecars.model.Scalemaster;
import com.anup.scalecars.services.ScaleModelService;


@RestController
@RequestMapping(value="/scaleworldapi")
public class ScaleCarController {
	
	@Autowired
	private ScaleModelService scaleService;
	
	
	@RequestMapping(value="/modelcars", method=RequestMethod.GET)
    public List<Scalemaster> getAllScalecars(){
        return scaleService.listAllCars();
    }
	
	@RequestMapping(value="/modelcars", method=RequestMethod.POST)
    public void addNewScalecar(@RequestBody Scalemaster scalemaster){
        scaleService.addNewScalecar(scalemaster);
    }
	
	@RequestMapping(value ="/modelcars/{id}", method=RequestMethod.GET)
	public Scalemaster getScalecar(@PathVariable Long id){
		return scaleService.getScalecar(id);
	}
	
	@RequestMapping(value ="/modelcars/{id}", method=RequestMethod.PUT)
	public void updateScalecar(@RequestBody Scalemaster scalemaster, @PathVariable Long id) { 
		scaleService.updateScalecar(scalemaster, id);
	}
	
	@RequestMapping(value ="/modelcars/{id}", method=RequestMethod.DELETE)
	public void deleteScalecar(@PathVariable Long id) { 
		scaleService.deleteScalecar(id);
	}
}
