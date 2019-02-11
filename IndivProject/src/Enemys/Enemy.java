package Enemys;

import java.util.Random;

import AdventureGame.GameCharacter;

public class Enemy extends GameCharacter 
{
	public Enemy(int hp, int attack, int defence) {
		super(hp, attack, defence);
	}

	private int expgiven = 10;

	public void basicenemyAI() {
		int ai = 0;
		ai = 1 + new Random().nextInt(10); // [0...6]
		int r = (int) (Math.random() * 4);
		String taunt = new String[] { "Butt Face", "Smelly Poop", "Can't Hit Me :p ", "Get Rekt Scrub" }[r];
		System.out.println(ai);
		if (ai < 7) {
			System.out.println("They Attack You");
		} 
		else if (ai <= 10) {
			System.out.println("Taunt : ");
			System.out.println("" + taunt);
		} 
		else if (ai > 10 && getHp() > 0 && getHp() < 2) 
		{
			System.out.println("Run Away");
		}
	}

	public int getExpgiven() {
		return expgiven;
	}

	public void setExpgiven(int expgiven) {
		this.expgiven = expgiven;
	}
}
