package com.vme.model;



public class Machine {
	
	public enum MachineCategory{
		SLM_MACHINE,
		TURNING_LATHE,
		MILLING_MACHINE,
		EDM_MACHINE
	}
	
	public enum MachineStatus{
		SETTING,
		WORKING
	}
	
	int machineId; /*save the id of the machine*/
	
	String machineName;
	
	MachineCategory machineCategory;
	
	double workingHourPrice;
	
	double settingHourPrice;
	
	ChamferSize chamfersize;

	public ChamferSize getChamfersize() {
		return chamfersize;
	}

	public void setChamfersize(ChamferSize chamfersize) {
		this.chamfersize = chamfersize;
	}

	public int getMachineId() {
		return machineId;
	}

	public String getMachineName() {
		return machineName;
	}

	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}

	public MachineCategory getMachineCategory() {
		return machineCategory;
	}

	public void setMachineCategory(MachineCategory machineCategory) {
		this.machineCategory = machineCategory;
	}

	public double getWorkingHourPrice() {
		return workingHourPrice;
	}

	public void setWorkingHourPrice(double workingHourPrice) {
		this.workingHourPrice = workingHourPrice;
	}

	public double getSettingHourPrice() {
		return settingHourPrice;
	}

	public void setSettingHourPrice(double settingHourPrice) {
		this.settingHourPrice = settingHourPrice;
	}
}
