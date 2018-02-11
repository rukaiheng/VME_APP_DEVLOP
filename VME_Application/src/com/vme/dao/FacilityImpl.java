package com.vme.dao;

import java.util.ArrayList;

import com.vme.model.CostModel;
import com.vme.model.Facility;
import com.vme.model.Machine;
import com.vme.model.Material;
import com.vme.model.WorkStep;

public class FacilityImpl implements Facility {

	
private int facilityId;
	
	private String facilityName;
	
	ArrayList<Machine> machines;
	
	ArrayList<Material> materials;
	
	ArrayList<WorkStep> processes;
	
	ArrayList<CostModel> costModels;
	
	@Override
	public int getFacilityId() {
		// TODO Auto-generated method stub
		return facilityId;
	}

	@Override
	public ArrayList<CostModel> getCostModels() {
		// TODO Auto-generated method stub
		return costModels;
	}

	@Override
	public void setCostModels(ArrayList<CostModel> costModels) {
		// TODO Auto-generated method stub
		this.costModels = costModels;
	}

	@Override
	public String getFacilityName() {
		// TODO Auto-generated method stub
		return facilityName;
	}

	@Override
	public void setFacilityName(String facilityName) {
		// TODO Auto-generated method stub
		this.facilityName = facilityName;
	}
}
