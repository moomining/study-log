package com.example.practice.Certification.designPattern.FactoryMethod;

public class FactoryMethod {
	
	public static void main(String[] args) {
		new Console().withoutFactory();
		new Console().withFactory();
	}

}
