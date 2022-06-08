package com.example.practice.Certification.designPattern.Singleton;

public class Settings {


	  private Settings () {};
	  
	  //static으로 선언하는 게 Point!
	  private static Settings settings = null;
	  
	  //static으로 선언해 정적 메모리 공간에 할당해
	  //매번 객체를 생성할 필요가 없고, 메모리 공간을 절약할 수 있음
	  public static Settings getSettings () {
	    if (settings == null) {
	      settings = new Settings();
	    }
	    return settings;
	  }

	  private boolean darkMode = false;
	  private int fontSize = 13;

	  public boolean getDarkMode () { return darkMode; }
	  public int getFontSize () { return fontSize; }

	  public void setDarkMode (boolean _darkMode) { 
	    darkMode = _darkMode; }
	  public void setFontSize (int _fontSize) { 
	    fontSize = _fontSize; }
}
