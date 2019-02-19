package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Player")
public class Player {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	private String playerName = "John";
	private String racename = "";
	private String classname = "";

	// Player Bonus
	private int attackBonus = 0;
	private int dodgeBonus = 0;
	private int vigorBonus = 0;
	private int smartsBonus = 0;
	private int charmBonus = 0;

	public Player() {
	}

	public Player(Long id, String playerName, String racename, String classname) {
		super();
		this.id = id;
		this.playerName = playerName;
		this.racename = racename;
		this.classname = classname;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getAttackBonus() {
		return attackBonus;
	}

	public void setAttackBonus(int attackBonus) {
		this.attackBonus = attackBonus;
	}

	public int getVigorBonus() {
		return vigorBonus;
	}

	public void setVigorBonus(int vigorBonus) {
		this.vigorBonus = vigorBonus;
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
