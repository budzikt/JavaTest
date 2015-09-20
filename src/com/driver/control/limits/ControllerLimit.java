package com.driver.control.limits;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Dictionary;

abstract interface LimitCallbacks{
	abstract boolean HighThreshReached();
	abstract boolean LowThreshReached();
	abstract boolean DeadZoneReached();
}

public abstract class ControllerLimit implements LimitCallbacks {

	Hashtable<String, Double> LimitTable;
	
	double LowLimit;
	double HighLimit;
	double CurrValue;
	
	
	int ConsecutiveSamples = 0;
	
	public double getLowLimit() {
		return LowLimit;
	}

	public void setLowLimit(double lowLimit) {
		LowLimit = lowLimit;
	}

	public double getHighLimit() {
		return HighLimit;
	}

	public void setHighLimit(double highLimit) {
		HighLimit = highLimit;
	}
	
	public ControllerLimit() {
		LimitTable = new Hashtable<String, Double>();
		loadMap();
		
	}
	
	private void loadMap() {
		
	}
	
	private void LimitLogic() {
		
	}
	
}
