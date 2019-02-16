package com.qa.business.service;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.persistence.repository.PlayerRepository;
import com.qa.util.JSONUtil;

@RunWith(MockitoJUnitRunner.class)
public class PlayerServiceImplTest {

	@InjectMocks
	PlayerServiceImpl service;
	
	@Mock
	PlayerRepository repo;
	
	JSONUtil util;
	private static final String MOCK_VALUE = "1";
	private static final String MOCK_OBJECT = "{\"classroomId\":1,\"trainer\":\"John Gordon\"}";

	@Before
	public void setup() {
		service.setRepo(repo);
		util = new JSONUtil();
		service.setUtil(util);
	}
	
	@Test
	public void testCreate() {
	Mockito.when(repo.createPlayer(MOCK_OBJECT)).thenReturn(MOCK_OBJECT);
	assertEquals(MOCK_OBJECT,service.addPlayer(MOCK_OBJECT));
	Mockito.verify(repo).createPlayer(MOCK_OBJECT);
	}
	
	@Test
	public void testDelete() {
		Mockito.when(repo.deletePlayer(1L)).thenReturn(MOCK_VALUE);
		assertEquals(MOCK_VALUE, service.deletePlayer(1L));
		Mockito.verify(repo).deletePlayer(1L);
	}
	@Test
	public void testUpdate() {
		Mockito.when(repo.updatePlayer(MOCK_VALUE, 1L)).thenReturn(MOCK_VALUE);
		assertEquals(MOCK_VALUE, service.updatePlayer(MOCK_VALUE, 1L));
		Mockito.verify(repo).updatePlayer(MOCK_VALUE, 1L);
	}

	
	@Test
	public void testGetAll() {
		Mockito.when(repo.getAllPlayers()).thenReturn(MOCK_VALUE);
		assertEquals(MOCK_VALUE, service.getAllPlayers());
	}
	@Test
	public void testGetA()	{
		Mockito.when(repo.getAPlayer(1L)).thenReturn(MOCK_OBJECT);
		assertEquals(MOCK_OBJECT, repo.getAPlayer(1l));
	}
}
