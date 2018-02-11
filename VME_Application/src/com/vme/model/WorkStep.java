package com.vme.model;

import com.vme.model.Machine.MachineStatus;

public class WorkStep {
	
	private int workStepId;
	
	private String workStepName;
	
	private Machine machine;
	
	private Labor labor;
	
	private MachineStatus machineStatus;
	
	private double laborHour;
	
	private double machineHour;
	
	private Material material;
	
	private double mateiralConsuming;
	
	private double TotalCost = 0;

	public String getWorkStepName() {
		return workStepName;
	}

	public void setWorkStepName(String workStepName) {
		this.workStepName = workStepName;
	}

	public Machine getMachine() {
		return machine;
	}

	public void setMachine(Machine machine) {
		this.machine = machine;
	}

	public Labor getLabor() {
		return labor;
	}

	public void setLabor(Labor labor) {
		this.labor = labor;
	}

	public MachineStatus getMachineStatus() {
		return machineStatus;
	}

	public void setMachineStatus(MachineStatus machineStatus) {
		this.machineStatus = machineStatus;
	}

	public double getLaborHour() {
		return laborHour;
	}

	public void setLaborHour(double laborHour) {
		this.laborHour = laborHour;
	}

	public double getMachineHour() {
		return machineHour;
	}

	public void setMachineHour(double machineHour) {
		this.machineHour = machineHour;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public double getMateiralConsuming() {
		return mateiralConsuming;
	}

	public void setMateiralConsuming(double mateiralConsuming) {
		this.mateiralConsuming = mateiralConsuming;
	}

	public double getTotalCost() {
		return TotalCost;
	}

	public void setTotalCost(double totalCost) {
		TotalCost = totalCost;
	}

	public int getWorkStepId() {
		return workStepId;
	}
}
