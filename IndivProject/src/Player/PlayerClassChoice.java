package Player;

public class PlayerClassChoice extends PlayerAspects {

	// Class Bonus
	private String playerclass = "bard";

	public PlayerClassChoice(int startFightBonus, int attackBonus, int sightBonus, int smartsBonus, int charmBonus,
			int dodgeBonus, String playerclass) {
		super(startFightBonus, attackBonus, sightBonus, smartsBonus, charmBonus, dodgeBonus);
		this.playerclass = playerclass;
	}

	public String getPlayerclass() {
		return playerclass;
	}

	public void setPlayerclass(String playerclass) {
		this.playerclass = playerclass;
	}

}
