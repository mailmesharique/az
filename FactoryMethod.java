package com.dss;

public class FactoryMethod {
	
	
	public   OS getInstance(String str) {
		
		if(str.equals("open")) {
		return new Window();
		}
		else if (str.equals("closed")) {
			return new Andriod();
		}
		else 
		    return new IOS();
		
		
	}

}
