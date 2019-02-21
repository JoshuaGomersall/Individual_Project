package com.qa.persistence.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void constructor()
	{
		Player john = new Player(1l, "John", "Elf", "Bard");		
	}
	
	@Test
	public void SettersAndGettersTest() 
	{
		Player john = new Player();
		john.setAttackBonus(0);
		john.setCharmBonus(0);
		john.setClassname("Bard");
		john.setDodgeBonus(0);
		john.setId(1l);
		john.setPlayerName("John");
		john.setRacename("Human");
		john.setVigorBonus(0);
		john.setSmartsBonus(0);
		
		assertEquals(0, john.getAttackBonus());
		assertEquals(0, john.getCharmBonus());
		assertEquals("Bard", john.getClassname());
		assertEquals(0, john.getDodgeBonus());
		john.getId();
		assertEquals("John", john.getPlayerName());
		assertEquals("Human", john.getRacename());
		assertEquals(0, john.getVigorBonus());
		assertEquals(0, john.getSmartsBonus());
	}

}
