package com.qa.business.service;

public interface PlayerService {

	//C
	String addPlayer(String Player);
	
	//R
	String getAllPlayers();
	
	String getAPlayer(Long id);

	//U
	String updatePlayer(String Player, Long id);

	//D
	String deletePlayer(Long id);

}