package com.qa.rest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.business.service.PlayerService;
import com.qa.rest.PlayerEndpoint;

@RunWith(MockitoJUnitRunner.class)
public class PlayerEndpointTest {

	private static final String MOCK_VALUE2 = "test_value_2";

	private static final String MOCK_VALUE = "test_value";

	@InjectMocks
	private PlayerEndpoint endpoint;

	@Mock
	private PlayerService service;

	@Before
	public void setup() {
		endpoint.setService(service);
	}

	
	@Test
	public void JAXActivator()
	{
		new JAXActivator();
	}
	
	@Test
	public void testGetAllPlayers() {
		Mockito.when(service.getAllPlayers()).thenReturn(MOCK_VALUE);
		Assert.assertEquals(MOCK_VALUE, endpoint.getAllPlayers());
	}

	@Test
	
	public void testCreatePlayer() {
		Mockito.when(service.addPlayer(MOCK_VALUE2)).thenReturn(MOCK_VALUE);
		Assert.assertEquals(MOCK_VALUE, endpoint.addPlayer(MOCK_VALUE2));
		Mockito.verify(service).addPlayer(MOCK_VALUE2);
	}

	@Test
	public void testGetAPlayer()
	{
		Mockito.when(service.getAPlayer(1L)).thenReturn(MOCK_VALUE);
		Assert.assertEquals(MOCK_VALUE, endpoint.getAPlayer(1L));
	}
	@Test
	public void testDeletePlayer() {
		Mockito.when(service.deletePlayer(1L)).thenReturn(MOCK_VALUE);
		Assert.assertEquals(MOCK_VALUE, endpoint.deletePlayer(1L));
		Mockito.verify(service).deletePlayer(1L);
	}

}
