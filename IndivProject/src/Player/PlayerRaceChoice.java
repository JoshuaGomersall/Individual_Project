package Player;

public class PlayerRaceChoice extends PlayerAspects {

	// PlayerRace/Class
	private String playerRace = "human";

	public PlayerRaceChoice(int startFightBonus, int attackBonus, int sightBonus, int smartsBonus, int charmBonus,
			int dodgeBonus, String playerRace) {
		super(startFightBonus, attackBonus, sightBonus, smartsBonus, charmBonus, dodgeBonus);
		this.playerRace = playerRace;
	}

	public String getPlayerRace() {
		return playerRace;
	}

	public void setPlayerRace(String playerRace) {
		this.playerRace = playerRace;
	}
}
