package com.example.practice.Certification.designPattern.Strategy;

interface SearchStrategy {
	public void search();
}

class SearchStrategyAll implements SearchStrategy{
	@Override
	public void search() {
		System.out.println("search All");
	} 
}

class SearchStrategyImage implements SearchStrategy{
	@Override
	public void search() {
		System.out.println("search Image");
	}
}

class SearchStrategyNews implements SearchStrategy{
	@Override
	public void search() {
		System.out.println("search News");
	}
}

class SearchStrategyMap implements SearchStrategy{
	@Override
	public void search() {
		System.out.println("search Map");
	}
}