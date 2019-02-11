package GameMechanics;

import java.util.*;

import Player.Player;

public class DiceRoller {
	// Dice Roller
	private static int roll = 0;
	private static int rolltotal = 0;
	private static int total = 0;

	public static int search(int searchbonus) {
		basicroll(0);
		setTotal(getRolltotal() + searchbonus);
		System.out.println("total Sight Roll Is : " + getTotal());
		if (getTotal() > 16) {
			System.out.println("You see other dimensions and all the possible futures , +1 to any stat");
		} else if (getTotal() > 12) {
			System.out.println("You Found a cool thing like a trap door or secret bookcase");
		} else if (getTotal() > 8) {
			System.out.println("You Found the thing and a bonus");
		} else if (getTotal() >= 4) {
			System.out.println("You Found a what you are looking for");
		} else if (getTotal() < 4) {
			System.out.println("hmmm , this wall is made of bricks");
		}
		return total;
	}

	public static int think(int smartbonus) {
		basicroll(0);
		setTotal(getRolltotal() + smartbonus);
		System.out.println("total Smarts Roll Is : " + getTotal());
		if (getTotal() > 16) {
			System.out.println("You have a big think , +1 to any stat");
		} else if (getTotal() > 12) {
			System.out.println("You Found a cool thing like a trap door or secret bookcase");
		} else if (getTotal() > 8) {
			System.out.println("You Found the thing and a bonus");
		} else if (getTotal() >= 4) {
			System.out.println("You Found a what you are looking for");
		} else if (getTotal() < 4) {
			System.out.println("hmmm , this wall is made of bricks");
		}
		return getTotal();
	}

	public static int charm(int charmbonus) {
		basicroll(0);
		setTotal(getRolltotal() + charmbonus);
		System.out.println("total Charm Roll Is : " + getTotal());
		if (getTotal() > 16) {
			System.out.println("*Censored Content*  , you might have just made a 'freind' for life ");
			Player.setInCombat(false);
		} else if (getTotal() > 12) {
			System.out.println("well I guess it wont be attacking you now");
			Player.setInCombat(false);
		} else if (getTotal() > 8) {
			System.out.println("You seem to be quite persuasive");
			Player.setInCombat(false);
		} else if (getTotal() >= 4) {
			System.out.println("I guess you can try and make freinds instead of attacking");
		} else if (getTotal() < 4) {
			System.out.println("ummm , calling his mother that was most likly a bad idea");
		}
		return total;
	}

	public static int attack(int attackbonus) {
		basicroll(0);
		setTotal(getRolltotal() + attackbonus + Player.getWeaponDamage());
		return total;
	}

	public static int startfight(int startfightbonus) {
		basicroll(0);
		setTotal(getRolltotal() + startfightbonus);
		System.out.println(getTotal());
		if (getTotal() > 16) {
			System.out.print("You Find A Legendary Creature");
		} else if (getTotal() > 12) {
			System.out.print("You Find A Rare Item Protected By A Knight");
		} else if (getTotal() > 8) {
			System.out.print("You Find A Old Man ,Thats It Just A Normal Old Man");
		} else if (getTotal() >= 4) {
			System.out.print("You Find A Basic Enemy");
		} else if (getTotal() < 4) {
			System.out.print("You Find A Small Creature , and he also smells bad");
		}
		return total;
	}

	public static int basicroll(int basicrollbonus) {
		setRolltotal(0);
		setRoll(0);
		setRoll(1 + new Random().nextInt(6)); // [0...6]
		setRolltotal(getRolltotal() + getRoll());
		if (getRoll() == 6) {
			while (getRoll() == 6) {
				setRoll(0);
				setRoll(1 + new Random().nextInt(6)); // [0...6]
				setRolltotal(getRolltotal() + getRoll());
				System.out.println("You did a critical strike");
			}
			if (getRoll() != 6) {
				System.out.println(getRolltotal());
			}
		}
		return rolltotal;
	}

	public static int getRoll() {
		return roll;
	}

	public static void setRoll(int roll) {
		DiceRoller.roll = roll;
	}

	public static int getRolltotal() {
		return rolltotal;
	}

	public static void setRolltotal(int rolltotal) {
		DiceRoller.rolltotal = rolltotal;
	}

	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		DiceRoller.total = total;
	}

	public DiceRoller() {
		super();
		// TODO Auto-generated constructor stub
	}

}