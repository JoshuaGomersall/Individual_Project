package com.qa.persistence.repository;

public interface PlayerRepository {

	//C
	String createPlayer(String player);
	
	//R
	String getAllPlayers();
	
	String getAPlayer(Long id);
	
	String getAPlayerbyname(String name);
	
	//U
	String updatePlayer(String player, Long id);

	//D
	String deletePlayer(Long id);
}