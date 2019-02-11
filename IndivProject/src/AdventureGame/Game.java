package AdventureGame;

import java.util.Dictionary;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

import GameMechanics.DiceRoller;
import Player.Player;

public class Game {

	public boolean play(boolean playing) 
	{
		Scanner s = new Scanner(System.in);

		Player player1 = new Player(5, 2, 2, false, false, false, 2, null, 0, 0, 0, 3, 1, 1, 1, 3, 2, false);

		while (playing) {
			System.out.println("Input An Action");
			String rolltype = s.nextLine();

			if (rolltype.compareTo("start") == 0 && Player.isInCombat() == false) {
				System.out.println("Start Looking For Fight");
				DiceRoller.startfight(player1.getStartFightBonus());
			} else if (rolltype.compareTo("start") == 0 && Player.isInCombat() == true) {
				System.out.println("You Are Currently In Combat");
				System.out.println("Not Valid Input");
			} else if (rolltype.compareTo("attack") == 0 && Player.isInCombat() == true) {
				System.out.println("start attack");
				DiceRoller.attack(player1.getAttackBonus());
			} else if (rolltype.compareTo("attack") == 0 && Player.isInCombat() == false) {
				System.out.println("You Are Not In combat");
				System.out.println("Not Valid Input");
			} else if (rolltype.compareTo("aim") == 0 && Player.isRanged() == true) {
				Player.setAimed(true);
				System.out.println("Aiming Weapon");
			} else if (rolltype.compareTo("aim") == 0 && Player.isRanged() == false) {
				System.out.println("I Can't Aim A Sword");
				System.out.println("Not Valid Input");
			} else if (rolltype.compareTo("search") == 0) {
				System.out.println("Start Searching");
				DiceRoller.search(player1.getSightBonus());
			} else if (rolltype.compareTo("think") == 0) {
				System.out.println("Start Thinking");
				DiceRoller.think(player1.getSmartsBonus());
			} 
			else if (rolltype.compareTo("charm") == 0 && Player.isInCombat() == true) {
				System.out.println("Start 'Charming' ");
				DiceRoller.charm(player1.getCharmBonus());
			}
			else if (rolltype.compareTo("charm") == 0 && Player.isInCombat() == false) {
				System.out.println("Need A Person To Charm 1st ");
				System.out.println("Not Valid Input");
			} 
			else if (rolltype.compareTo("heal") == 0) 
			{
				Player.heal(player1.getHp());
			}
			else if (rolltype.compareTo("quit") == 0) 
			{
				playing = false;
			} else {
				System.out.println("Not Valid Input");
			}
		}
		return playing;
	}
}