package com.qa.persistence.domain;

import AdventureGame.GameCharacter;

public class Player extends GameCharacter {

	

	

	public Player(int hp, int attack, int defence, int xp, String racename, String classname, int attackBonus,
			int dodgeBonus, int sightBonus, int smartsBonus, int charmBonus) 
	{
		super(hp, attack, defence);
		this.xp = xp;
		this.racename = racename;
		this.classname = classname;
		this.attackBonus = attackBonus;
		this.dodgeBonus = dodgeBonus;
		this.sightBonus = sightBonus;
		this.smartsBonus = smartsBonus;
		this.charmBonus = charmBonus;
	}

	
	// Player Stats
	private static String playerName = "John";
	private int xp = 0;
	private static float playerLevel = 6;
	private static int playerKills = 0;
	private String racename = "";
	private String classname = "";

	// Player Bonus
	private int attackBonus = 0;
	private int dodgeBonus = 0;
	private int sightBonus = 0;
	private int smartsBonus = 0;
	private int charmBonus = 0;

	private static boolean shopping = false;

	public static int heal(int hp) 
	{
		if (getHp() < 4) {
			setHp(getHp() + 1);

//			 if (PlayerRaceChoice.getPlayerRace() == "vamp") {
//			 System.out.println("You Drink Some Blood "); } else {
//			 System.out.println("You Drink A Potion "); }

		} else {
			System.out.println("You Are At Full Health ");
			System.out.println("Not Valid Input");
		}
		return hp;
	}

	public int gainxp(int bonusxp) {
		xp = bonusxp + xp;
		return xp;
	}

	public static String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	public static float getPlayerLevel() {
		return playerLevel;
	}

	public void setPlayerLevel(float playerLevel) {
		this.playerLevel = playerLevel;
	}

	public static int getPlayerKills() {
		return playerKills;
	}

	public static void setPlayerKills(int playerKills) {
		Player.playerKills = playerKills;
	}

	public int getAttackBonus() {
		return attackBonus;
	}

	public void setAttackBonus(int attackBonus) {
		this.attackBonus = attackBonus;
	}

	public int getSightBonus() {
		return sightBonus;
	}

	public void setSightBonus(int sightBonus) {
		this.sightBonus = sightBonus;
	}

	public int getSmartsBonus() {
		return smartsBonus;
	}

	public void setSmartsBonus(int smartsBonus) {
		this.smartsBonus = smartsBonus;
	}

	public int getCharmBonus() {
		return charmBonus;
	}

	public void setCharmBonus(int charmBonus) {
		this.charmBonus = charmBonus;
	}

	public int getDodgeBonus() {
		return dodgeBonus;
	}

	public void setDodgeBonus(int dodgeBonus) {
		this.dodgeBonus = dodgeBonus;
	}

	public static boolean isShopping() {
		return shopping;
	}

	public static void setShopping(boolean shopping) {
		Player.shopping = shopping;
	}

	public String getRacename() {
		return racename;
	}

	public void setRacename(String racename) {
		this.racename = racename;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}
	

}
