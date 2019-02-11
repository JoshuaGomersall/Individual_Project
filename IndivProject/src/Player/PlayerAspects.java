package Player;

public class PlayerAspects 
{
	private int startFightBonus = 0;
	private int attackBonus = 2;
	private int sightBonus = 0;
	private int smartsBonus = 0;
	private int charmBonus = 0;
	private int dodgeBonus = 0;
	
	public void main(String[] args) {
		
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

	public PlayerAspects(int startFightBonus, int attackBonus, int sightBonus, int smartsBonus, int charmBonus,
			int dodgeBonus) {
		super();
		this.startFightBonus = startFightBonus;
		this.attackBonus = attackBonus;
		this.sightBonus = sightBonus;
		this.smartsBonus = smartsBonus;
		this.charmBonus = charmBonus;
		this.dodgeBonus = dodgeBonus;
	}

}
