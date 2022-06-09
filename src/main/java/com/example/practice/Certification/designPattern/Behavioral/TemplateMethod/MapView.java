package com.example.practice.Certification.designPattern.Behavioral.TemplateMethod;

public abstract class MapView {
	protected abstract void connectMapServer();
    protected abstract void showMapOnScreen();
    protected abstract void moveToCurrentLocation();

    public void initMap () {
	    connectMapServer();
	    showMapOnScreen();
	    moveToCurrentLocation();
    }
}
