package com.qa.business.service;

public interface BackStoryService {

	//C
	String addBackStory(String BackStory);
	
	//R
	String getAllBackStorys();
	
	String getABackStory(Long id);

	//U
	String updateBackStory(String BackStory, Long id);

	//D
	String deleteBackStory(Long id);

}