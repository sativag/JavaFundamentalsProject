package com.java.project;

public abstract class AbstractWidget implements Widget {

	private SurfaceColor color;
	protected String serialNumber;
	
	public AbstractWidget(SurfaceColor color) {
		this.color = color;
	}

	@Override
	public SurfaceColor getColor() {
		return color;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
}
