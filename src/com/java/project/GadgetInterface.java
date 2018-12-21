package com.java.project;

import java.util.List;

public interface GadgetInterface {
	
	public List<Widget> getWidgets(SurfaceColor color);
	public String getSerialNumber();
	public SurfaceColor getColor();
	public float getPrice();
	public String getPowerSource();
	public int getSwitches();
	public int getButtons();
	public int getLights();
	

}
