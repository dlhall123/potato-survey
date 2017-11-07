package com.libertymutual.goforcode.hello_world_again.models;

public class SurveyResults {
	
	private int russetCount;
	private int goldenCount;
	private int sweetCount;
	
	public int getRussetCount() {
		return russetCount;
	}

	public int getGoldenCount() {
		return goldenCount;
	}

	public int getSweetCount() {
		return sweetCount;
	}

	public void registerRussetVote() {
		russetCount += 1;
	}
	
	public void registerSweetVote() {
		sweetCount += 1;
	}
	
	public void registerGoldenCount() {
		goldenCount += 1;
	}

}
