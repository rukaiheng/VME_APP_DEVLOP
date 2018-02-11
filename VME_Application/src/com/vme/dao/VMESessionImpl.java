package com.vme.dao;

import java.sql.Connection;
import java.util.ArrayList;

import com.vme.model.Facility;
import com.vme.model.VMESession;
import com.vme.util.DatabaseUtil;

public class VMESessionImpl implements VMESession {

	private Connection connection = null;
	@Override
	public boolean InitializeSession() {
		// TODO Auto-generated method stub
		connection = DatabaseUtil.GetConnection();
		if(connection != null)
		{
			return true;
		}
		return false;
	}

	@Override
	public ArrayList<Facility> Facilities() {
		// TODO Auto-generated method stub
		if(connection == null)
		{
			
		}
		return null;
	}

	@Override
	public Boolean TerminateSession() {
		// TODO Auto-generated method stub
		return null;
	}

}
