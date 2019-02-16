package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistence.repository.PlayerRepository;
import com.qa.util.JSONUtil;

public class PlayerServiceImpl implements PlayerService {

	@Inject
	private PlayerRepository repo;
	private JSONUtil util;

	
	public String getAllPlayers() 
	{
		return repo.getAllPlayers();
	}

	public String addPlayer(String player) 
	{
		if(player.contains("Butt")) {
			return "Can't Add This It's A Bad Word";
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

	public void setUtil(JSONUtil util) {
		this.util = util;
	}


}
