package com.vme.model;

import java.util.ArrayList;

/**
 * 
 * @author Z003RWCR
 * 
 * Description: this interface was used to query facilities in VME database
 *
 */
public interface Facility {

	public int getFacilityId();

	public ArrayList<CostModel> getCostModels();
	
	public void setCostModels(ArrayList<CostModel> costModels);
	
	public String getFacilityName();

	public void setFacilityName(String facilityName);
}
