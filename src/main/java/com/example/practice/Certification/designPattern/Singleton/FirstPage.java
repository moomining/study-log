package com.example.practice.Certification.designPattern.Singleton;

public class FirstPage {
	//new Settings()로 객체를 매번 생성해주는 게 아니라 getSettings() 메소드를 이용한다.
	private Settings settings = Settings.getSettings();
	
	public void setAndPrintSettings () {
	    settings.setDarkMode(true);
	    settings.setFontSize(15);
	    System.out.println(settings.getDarkMode() + " " + settings.getFontSize());
	}
}