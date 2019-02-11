package Player;

import Player.PlayerRaceChoice;

public class Human extends PlayerRaceChoice {

	public Human(int startFightBonus, int attackBonus, int sightBonus, int smartsBonus, int charmBonus, int dodgeBonus,
			String playerRace) {
		super(startFightBonus, attackBonus, sightBonus, smartsBonus, charmBonus, dodgeBonus, playerRace);
		setPlayerRace("Human");
		setStartFightBonus(1);
		setAttackBonus(1);
		setSightBonus(1);
		setSmartsBonus(1);
		setCharmBonus(1);
		setDodgeBonus(1);
	}
}
