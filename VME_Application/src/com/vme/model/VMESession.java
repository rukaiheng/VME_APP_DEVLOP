package com.vme.model;

import java.util.ArrayList;

public interface VMESession {
	
	/*
	 * this method was used to initialize the VME session. only the session was initialized, we can manipulate the VME database
	 * 
	 * If initialize succeed return true. Or return false.
	 */
	public boolean InitializeSession();
	
	/**
	 *  return the exist facilities
	 */
	ArrayList<Facility> Facilities();
	
	/**
	 * Description: use this method to release resource and close connection
	 * 
	 * @return true if terminate operation succeed.
	 */
	public Boolean TerminateSession();
}
