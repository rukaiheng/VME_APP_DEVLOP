package com.vme.model;

public class PrintingProcess {
	
	private int printingProcessId;
	
	private String scanningStrategy;

	public int getPrintingProcessId() {
		return printingProcessId;
	}

	public String getScanningStrategy() {
		return scanningStrategy;
	}

	public void setScanningStrategy(String scanningStrategy) {
		this.scanningStrategy = scanningStrategy;
	}
	
	/**
	 * there are many other parameters saved in printing process object
	 */
}
