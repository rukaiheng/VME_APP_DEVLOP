package com.vme.model;

public class Labor {
	
	private int laborId;
	
	private String jobTittle;
	
	private double hourPrice;

	public int getLaborId() {
		return laborId;
	}

	public String getJobTittle() {
		return jobTittle;
	}

	public void setJobTittle(String jobTittle) {
		this.jobTittle = jobTittle;
	}

	public double getHourPrice() {
		return hourPrice;
	}

	public void setHourPrice(double hourPrice) {
		this.hourPrice = hourPrice;
	}
	
}
