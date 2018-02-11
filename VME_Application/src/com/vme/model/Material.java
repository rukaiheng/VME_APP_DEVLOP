package com.vme.model;

public class Material {

	private int materialId;
	
	private String machineName;
	
	private String materialType;
	
	private double mateiralPrice;
	
	private String vendorName;

	public int getMaterialId() {
		return materialId;
	}

	public String getMachineName() {
		return machineName;
	}

	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}

	public String getMaterialType() {
		return materialType;
	}

	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	public double getMateiralPrice() {
		return mateiralPrice;
	}

	public void setMateiralPrice(double mateiralPrice) {
		this.mateiralPrice = mateiralPrice;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
}
