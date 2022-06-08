package com.example.practice.Certification.designPattern.Adapter;

public class SearchButton {
	
	private MyProgram myProgram;
	
	public SearchButton(MyProgram myProgram) {
		this.myProgram = myProgram;
	}
	
	private SearchStrategy searchStrategy = new SearchStrategyAll();
	
	public void setSearchStrategy(SearchStrategy _searchStrategy) {
		searchStrategy = _searchStrategy;
	}
	
	public void onClick() {
		searchStrategy.search();
	}

}
