package com.qa.persistence.repository;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.persistence.domain.Player;
import com.qa.persistence.repository.PlayerDBRepository;
import com.qa.util.JSONUtil;

@RunWith(MockitoJUnitRunner.class)
public class PlayerDBRepositoryTest {

	@InjectMocks
	private PlayerDBRepository repo;

	@Mock
	private EntityManager manager;

	@Mock
	private Query query;

	private JSONUtil util;
	

	private static final String MOCK_DATA_ARRAY = "[{\"classroomId\":1,\"trainer\":\"John Gordon\",\"trainees\":[]}]";

	private static final String MOCK_OBJECT = "{\"classroomId\":1,\"trainer\":\"John Gordon\",\"trainees\":[]}";

	@Before
	public void setup() {
		repo.setManager(manager);
		util = new JSONUtil();
		repo.setUtil(util);
		Player testPlayer = util.getObjectForJSON(MOCK_OBJECT, Player.class);
		manager.persist(testPlayer);
	}


	@Test
	public void testGetAnPlayer()
	{
		Mockito.when(manager.find(Player.class,1L)).thenReturn(util.getObjectForJSON(MOCK_OBJECT,Player.class));
	}
	
	@Test
	public void testGetAllPlayers() {
		
		Mockito.when(manager.createQuery(Mockito.anyString())).thenReturn(query);
		List<Player> players = new ArrayList<Player>();
		players.add(util.getObjectForJSON(MOCK_OBJECT, Player.class));
		Mockito.when(query.getResultList()).thenReturn(players);
	}

	@Test
	public void testCreatePlayer() {
		String reply = repo.createPlayer(MOCK_OBJECT);
	}

	@Test
	public void testDeletePlayer() 
	{
		String reply = repo.deletePlayer(1L);
		repo.createPlayer(MOCK_OBJECT);
		repo.deletePlayer(0l);
	}
	
	@Test
	public void testUpdate() 
	{
		String reply = repo.updatePlayer(MOCK_OBJECT, 1l);
	}
	

}
