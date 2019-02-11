package Player;

import AdventureGame.GameCharacter;

public class Player extends GameCharacter {

	public Player(int hp, int attack, int defence, boolean inCombat, boolean ranged, boolean aimed, int weaponDamage,
			String playerName, int xp, float playerLevel,
			int playerKills, int startFightBonus, int attackBonus, int sightBonus, int smartsBonus, int charmBonus,
			int dodgeBonus, boolean shopping) {
		super(hp, attack, defence);
		this.inCombat = inCombat;
		this.ranged = ranged;
		this.aimed = aimed;
		this.weaponDamage = weaponDamage;
		this.playerName = playerName;
		this.xp = xp;
		this.playerLevel = playerLevel;
		this.playerKills = playerKills;
		this.startFightBonus = startFightBonus;
		this.attackBonus = attackBonus;
		this.sightBonus = sightBonus;
		this.smartsBonus = smartsBonus;
		this.charmBonus = charmBonus;
		this.dodgeBonus = dodgeBonus;
		this.shopping = shopping;
	}

	// Player Attack
	private static boolean inCombat = true;
	private static boolean ranged = true;
	private static boolean aimed = false;
	private static int weaponDamage = 2;

	// Player Stats
	private static String playerName = "John";
	private int xp = 0;
	private static float playerLevel = 6;
	private static int playerKills = 0;

	// Player Bonus
	private int startFightBonus = 0;
	private int attackBonus = 0;
	private int sightBonus = 0;
	private int smartsBonus = 0;
	private int charmBonus = 0;
	private int dodgeBonus = 0;

	private static boolean shopping = false;

	public static int heal(int hp) {
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

	public static boolean isInCombat() {
		return inCombat;
	}

	public static void setInCombat(boolean inCombat) {
		Player.inCombat = inCombat;
	}

	public static boolean isRanged() {
		return ranged;
	}

	public void setRanged(boolean ranged) {
		this.ranged = ranged;
	}

	public static boolean isAimed() {
		return aimed;
	}

	public static void setAimed(boolean aimed) {
		Player.aimed = aimed;
	}

	public static int getWeaponDamage() {
		return weaponDamage;
	}

	public void setWeaponDamage(int weaponDamage) {
		this.weaponDamage = weaponDamage;
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

	public int getStartFightBonus() {
		return startFightBonus;
	}

	public void setStartFightBonus(int startFightBonus) {
		this.startFightBonus = startFightBonus;
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

}
