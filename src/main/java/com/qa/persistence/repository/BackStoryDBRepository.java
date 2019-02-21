package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;
import com.qa.persistence.domain.BackStory;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.qa.util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class BackStoryDBRepository implements BackStoryRepository {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;


	public String getAllBackStorys() 
	{
		Query query = manager.createQuery("SELECT q FROM BackStory q");
		Collection<BackStory> BACKSTORY = (Collection<BackStory>) query.getResultList();
		return util.getJSONForObject(BACKSTORY);
	}

	@Transactional(REQUIRED)
	public String createBackStory(String backstory) 
	{
		BackStory abackstory = util.getObjectForJSON(backstory, BackStory.class);
		manager.persist(abackstory);
		return "{\"message\": \"backstory has been sucessfully added\"}";
	}
	
	@Transactional(REQUIRED)
	public String deleteBackStory(Long id) 
	{
		if (manager.contains(manager.find(BackStory.class, id))) {

			manager.remove(manager.find(BackStory.class, id));
			return "{\"message\": \"backstory sucessfully deleted\"}";
		}
		return "{\"message\": \"No BackStory With That Id Can Be Found\"}";
	}

	public String getABackStory(Long id) 
	{
		return util.getJSONForObject(manager.find(BackStory.class, id));
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	public void setUtil(JSONUtil util) 
	{
		this.util = util;
	}

	public String updateBackStory(String backstory, Long id) {
		deleteBackStory(id);
		createBackStory(backstory);
		return "{\"message\": \"backstory sucessfully updated\"}";
	}
}
