package com.example.practice.Certification.designPattern.Singleton;

public class SecondPage {
	//firstPage의 setting을 그대로 가져와 쓴다.
	private Settings settings = Settings.getSettings();
	
	public void printSettings () {
	    System.out.println(settings.getDarkMode() + " " + settings.getFontSize());
	}

}
