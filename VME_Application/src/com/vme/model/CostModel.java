package com.vme.model;

import java.util.ArrayList;

public class CostModel {
	
	private ArrayList<WorkStep> workSteps; /*all work steps belong to current cost model*/
	
	private ArrayList<Integer> workStepIds; /*use these ids to find the work steps */
	
	
	
	public ArrayList<WorkStep> getWorkSteps() {
		return workSteps;
	}



	public void setWorkSteps(ArrayList<WorkStep> workSteps) {
		this.workSteps = workSteps;
	}



	public ArrayList<Integer> getWorkStepIds() {
		return workStepIds;
	}



	public void setWorkStepIds(ArrayList<Integer> workStepIds) {
		this.workStepIds = workStepIds;
	}



	public String GetWokStepName(Integer workStepId)
	{
		//traverse worksteps and find work steps with given ids
		workStepId.intValue();
		
		return "";
	}
}
