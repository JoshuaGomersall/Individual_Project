package AdventureGame;

public class GameCharacter 
{
	private static int hp;
	private int attack;
	private int defence;

	public static void main(String[] args) 
	{

	}

	public int takeDamage(int damageAmount) 
	{
		int reduce = damageAmount - getDefence();
		setHp(getHp() - reduce);
		return hp;
	}

	public GameCharacter(int hp, int attack, int defence) {
		super();
		this.hp = hp;
		this.attack = attack;
		this.defence = defence;
	}

	public static int getHp() {
		return hp;
	}

	

	public static void setHp(int hp) {
		GameCharacter.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}
}
