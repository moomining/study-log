package com.example.practice.Certification.designPattern.Strategy;

public class MyProgram {
	private SearchButton searchButton = new SearchButton(this);
	
	public void setModeAll() {
		searchButton.setSearchStrategy(new SearchStrategyAll());
	}
	
	public void setModeImage() {
		searchButton.setSearchStrategy(new SearchStrategyImage());
	}
	
	public void setModeNews() {
		searchButton.setSearchStrategy(new SearchStrategyNews());
	}
	
	public void setModeMap() {
		searchButton.setSearchStrategy(new SearchStrategyMap());
	}
	
	
	public void clickAll() {
		setModeAll();
		searchButton.onClick();
	}
	
	public void clickImage() {
		setModeImage();
		searchButton.onClick();
	}
	
}

