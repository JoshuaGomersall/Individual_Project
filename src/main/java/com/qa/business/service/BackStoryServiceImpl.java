package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistence.repository.BackStoryRepository;
import com.qa.util.JSONUtil;

public class BackStoryServiceImpl implements BackStoryService {

	@Inject
	private BackStoryRepository repo;
	private JSONUtil util;

	
	public String getAllBackStorys() 
	{
		return repo.getAllBackStorys();
	}

	public String addBackStory(String backstory) 
	{
		if(backstory.contains("Butt")) {
			return "Can't Add This It's A Bad Word";
		}
		return repo.createBackStory(backstory);
	}

	public String deleteBackStory(Long id) 
	{
		return repo.deleteBackStory(id);
	}

	public void setRepo(BackStoryRepository repo) 
	{
		this.repo = repo;
	}

	public String getABackStory(Long id) 
	{
		return repo.getABackStory(id);
		
	}

	public String updateBackStory(String backstory, Long id) 
	{
		return repo.updateBackStory(backstory, id);
	}

	public void setUtil(JSONUtil util) {
		this.util = util;
	}


}
