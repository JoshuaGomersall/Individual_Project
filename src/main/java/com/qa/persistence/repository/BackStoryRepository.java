package com.qa.persistence.repository;

public interface BackStoryRepository {

	//C
	String createBackStory(String player);
	
	//R
	String getAllBackStorys();
	
	String getABackStory(Long id);
	
	//U
	String updateBackStory(String player, Long id);

	//D
	String deleteBackStory(Long id);
}