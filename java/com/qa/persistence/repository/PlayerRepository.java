package com.qa.persistence.repository;

public interface PlayerRepository {

	//C
	String createPlayer(String player);
	
	//R
	String getAllPlayers();
	
	String getAPlayer(Long id);
	
	//U
	String updatePlayer(String player, Long id);

	//D
	String deletePlayer(Long id);
}