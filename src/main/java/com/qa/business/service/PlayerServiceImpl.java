package com.qa.business.service;

import javax.inject.Inject;

import org.apache.log4j.Logger;

import com.qa.persistence.repository.PlayerRepository;

public class PlayerServiceImpl implements PlayerService {

	@Inject
	private PlayerRepository repo;

	
	public String getAllPlayers() 
	{
		return repo.getAllPlayers();
	}

	public String addPlayer(String player) 
	{
		if(player.contains("Butt")) {
			return "Can't Add This Its A Bad Word";
		}
		return repo.createPlayer(player);
	}

	public String deletePlayer(Long id) 
	{
		return repo.deletePlayer(id);
	}

	public void setRepo(PlayerRepository repo) 
	{
		this.repo = repo;
	}

	public String getAPlayer(Long id) 
	{
		return repo.getAPlayer(id);
		
	}

	public String updatePlayer(String player, Long id) 
	{
		return repo.updatePlayer(player, id);
	}


}
