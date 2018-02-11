package com.vme.model;

public class ChamferSize {

	public enum ChamferType{
		CUBOID,
		CYLINDER
	}
	
	private int chamferSizeId;
	
	private ChamferType chamferType;
	
	private double xLength;
	
	private double yLength;
	
	private double zLength;
	
	private double diameter;
	
	private double height;

	public int getChamferSizeId() {
		return chamferSizeId;
	}

	public void setChamferSizeId(int chamferSizeId) {
		this.chamferSizeId = chamferSizeId;
	}

	public ChamferType getChamferType() {
		return chamferType;
	}

	public void setChamferType(ChamferType chamferType) {
		this.chamferType = chamferType;
	}

	public double getxLength() {
		return xLength;
	}

	public void setxLength(double xLength) {
		this.xLength = xLength;
	}

	public double getyLength() {
		return yLength;
	}

	public void setyLength(double yLength) {
		this.yLength = yLength;
	}

	public double getzLength() {
		return zLength;
	}

	public void setzLength(double zLength) {
		this.zLength = zLength;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}
