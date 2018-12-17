package com.java.project;

public abstract class AbstractWidget implements Widget {

	private SurfaceColor color;
	
	
	public AbstractWidget(SurfaceColor color) {
		this.color = color;
	}

	@Override
	public SurfaceColor getColor() {
		return color;
	}
	
}
