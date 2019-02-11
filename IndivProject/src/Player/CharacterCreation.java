package Player;

import java.io.IOException;

public class CharacterCreation 
{
	public void charactergen() throws IOException {
		int pointbuy = 0;
		// sight rolls
		boolean blind = false;
		boolean mildblind = false;
		boolean badeyes = false;

		// smarts rolls
		boolean zombie = true;
		boolean cloudBrain = false;
		boolean clueless = false;

		// doubleedge
		boolean large = false;
		boolean small = false;

//		// sight
//		if (blind == true) {
//			Player.setSightBonus(-6);
//			pointbuy += 3;
//		} else if (mildblind == true) {
//			setSightBonus(-4);
//			pointbuy += 2;
//		} else if (badeyes == true) {
//			setSightBonus(-2);
//			pointbuy += 1;
//		}
//
//		// smarts
//		if (zombie == true) {
//			setSmartsBonus(-6);
//			pointbuy += 3;
//		} else if (cloudBrain == true) {
//			setSmartsBonus(-4);
//			pointbuy += 2;
//		} else if (clueless == true) {
//			setSmartsBonus(-2);
//			pointbuy += 1;
//		}
//
//		// double edge
//		if (large == true) {
//			setAttackBonus(1);
//			setDodgeBonus(-1);
//		} else if (small == true) {
//			setAttackBonus(-1);
//			setDodgeBonus(1);
//		}

//		// Racestats Mods
//		if (getPlayerRace() == "vamp") {
//			setRaceStartFightBonus(2);
//			setRaceAttackBonus(2);
//			setRaceSightBonus(1);
//			setRaceSmartsBonus(2);
//			setRaceCharmBonus(0);
//			setRaceDodgeBonus(2);
//		} else if (getPlayerRace() == "warewolf") {
//			setRaceStartFightBonus(6);
//			setRaceAttackBonus(6);
//			setWeaponDamage(0);
//			setRaceSightBonus(1);
//			setRaceSmartsBonus(0);
//			setRaceCharmBonus(0);
//			setRaceDodgeBonus(0);
//		} else if (getPlayerRace() == "frog") {
//			setRaceStartFightBonus(0);
//			setRaceAttackBonus(0);
//			setRaceSightBonus(0);
//			setRaceSmartsBonus(0);
//			setRaceCharmBonus(0);
//			setRaceDodgeBonus(0);
//		}
//		
//		} else if (getPlayerRace() == "elf") {
//			setRaceStartFightBonus(0);
//			setRaceAttackBonus(0);
//			setRaceSightBonus(2);
//			setRaceSmartsBonus(2);
//			setRaceCharmBonus(2);
//			setRaceDodgeBonus(2);
//		} else if (getPlayerRace() == "dwarf") {
//			setRaceStartFightBonus(3);
//			setRaceAttackBonus(3);
//			setRaceSightBonus(0);
//			setRaceSmartsBonus(0);
//			setRaceCharmBonus(0);
//			setRaceDodgeBonus(0);
//		}
//
//		// classes
//		if (getPlayerclass() == "fighter") {
//			setClassStartFightBonus(0);
//			setClassAttackBonus(2);
//			setClassSightBonus(0);
//			setClassSmartsBonus(0);
//			setClassCharmBonus(1);
//			setClassDodgeBonus(1);
//		} else if (getPlayerclass() == "barbarian") {
//			setClassStartFightBonus(0);
//			setClassAttackBonus(4);
//			setClassSightBonus(0);
//			setClassSmartsBonus(-2);
//			setClassCharmBonus(0);
//			setClassDodgeBonus(0);
//		} else if (getPlayerclass() == "bard") {
//			setClassStartFightBonus(0);
//			setClassAttackBonus(0);
//			setClassSightBonus(0);
//			setClassSmartsBonus(1);
//			setClassCharmBonus(2);
//			setClassDodgeBonus(1);
//		} else if (getPlayerclass() == "theif") {
//			setClassStartFightBonus(0);
//			setClassAttackBonus(1);
//			setClassSightBonus(1);
//			setClassSmartsBonus(0);
//			setClassCharmBonus(0);
//			setClassDodgeBonus(2);
//		} else if (getPlayerclass() == "wizard") {
//			setClassStartFightBonus(0);
//			setClassAttackBonus(-4);
//			setClassSightBonus(0);
//			setClassSmartsBonus(4);
//			setClassCharmBonus(1);
//			setClassDodgeBonus(1);
//		}

		System.out.println("Points Left Is : " + pointbuy);

//		if (pointbuy >= 0) {
//			Save_Load.SaveGame();
//			System.out.println("Character " + Player.getPlayerName() + " Saved");
//		} else 
//		{
//			System.out.println("You Spent Too Many Points");
//		}
	}
}
