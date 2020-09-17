package com.anup.scalecars.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Scalemaster {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long scaleid;
	private String scalecomp;
	private String scalemodel;
	private String scalesize;
	private String scalecost;
	
	//a no-arg constructor so that object is easier to initialize
	public Scalemaster() {
		
	}
	
	//a constructor to take the arguments and initializes them
	public Scalemaster(Long scaleid, String scalecomp, String scalemodel, String scalesize, String scalecost) {
		super();
		this.scaleid = scaleid;
		this.scalecomp = scalecomp;
		this.scalemodel = scalemodel;
		this.scalesize = scalesize;
		this.scalecost = scalecost;
	}
	
	
	

	public Long getScaleid() {
		return scaleid;
	}
	public void setScaleid(Long scaleid) {
		this.scaleid = scaleid;
	}
	public String getScalecomp() {
		return scalecomp;
	}
	public void setScalecomp(String scalecomp) {
		this.scalecomp = scalecomp;
	}
	public String getScalemodel() {
		return scalemodel;
	}
	public void setScalemodel(String scalemodel) {
		this.scalemodel = scalemodel;
	}
	public String getScalesize() {
		return scalesize;
	}
	public void setScalesize(String scalesize) {
		this.scalesize = scalesize;
	}
	public String getScalecost() {
		return scalecost;
	}
	public void setScalecost(String scalecost) {
		this.scalecost = scalecost;
	}
	
	@Override
	public String toString() {
		return "Scalemaster [scaleid=" + scaleid + ", scalecomp=" + scalecomp + ", scalemodel=" + scalemodel
				+ ", scalesize=" + scalesize + ", scalecost=" + scalecost + "]";
	}

}
