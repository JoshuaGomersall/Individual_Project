package Saving_Loading;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

import GameMechanics.DiceRoller;
import Player.Player;

public class Save_Load extends DiceRoller 
{

	public String SaveGame(String playerName)
	{
		File statText = new File("" + Player.getPlayerName() + Player.getPlayerLevel() + ".txt");
		FileOutputStream is = new FileOutputStream(statText);
		OutputStreamWriter osw = new OutputStreamWriter(is);
		Writer w = new BufferedWriter(osw);

		// Player Attack
		w.write("" + Player.isInCombat());
		((BufferedWriter) w).newLine();
		w.write("" + Player.isRanged());
		((BufferedWriter) w).newLine();
		w.write("" + isAimed());
		((BufferedWriter) w).newLine();
		w.write("" + getWeaponDamage());
		((BufferedWriter) w).newLine();
		// w.write("" + damagetotal);

		// Player Stats
		w.write("" + Player.getPlayerName());
		((BufferedWriter) w).newLine();
		w.write("" + getPlayerHp());
		((BufferedWriter) w).newLine();
		w.write("" + getPlayerArmor());
		((BufferedWriter) w).newLine();
		w.write("" + getXp());
		((BufferedWriter) w).newLine();
		w.write("" + getPlayerLevel());
		((BufferedWriter) w).newLine();
		w.write("" + getPlayerKills());
		((BufferedWriter) w).newLine();

		// Player Bonus
		w.write("" + getStartFightBonus());
		((BufferedWriter) w).newLine();
		w.write("" + getAttackBonus());
		((BufferedWriter) w).newLine();
		w.write("" + getSightBonus());
		((BufferedWriter) w).newLine();
		w.write("" + getSmartsBonus());
		((BufferedWriter) w).newLine();
		w.write("" + getCharmBonus());
		((BufferedWriter) w).newLine();
		w.write("" + getDodgeBonus());
		((BufferedWriter) w).newLine();

		// PlayerRace/Class
		w.write("" + getPlayerRace());
		((BufferedWriter) w).newLine();
		w.write("" + getRaceStartFightBonus());
		((BufferedWriter) w).newLine();
		w.write("" + getRaceAttackBonus());
		((BufferedWriter) w).newLine();
		w.write("" + getRaceSightBonus());
		((BufferedWriter) w).newLine();
		w.write("" + getRaceSmartsBonus());
		((BufferedWriter) w).newLine();
		w.write("" + getRaceCharmBonus());
		((BufferedWriter) w).newLine();
		w.write("" + getRaceDodgeBonus());
		((BufferedWriter) w).newLine();

		// Class Bonus
		w.write("" + getPlayerclass());
		((BufferedWriter) w).newLine();
		w.write("" + getClassStartFightBonus());
		((BufferedWriter) w).newLine();
		w.write("" + getClassAttackBonus());
		((BufferedWriter) w).newLine();
		w.write("" + getClassSightBonus());
		((BufferedWriter) w).newLine();
		w.write("" + getClassSmartsBonus());
		((BufferedWriter) w).newLine();
		w.write("" + getClassCharmBonus());
		((BufferedWriter) w).newLine();
		w.write(Player.getClassDodgeBonus());
		((BufferedWriter) w).newLine();
		w.write(Player.getPlayerName());
		((BufferedWriter) w).newLine();
		w.close();
		return playerName;
	}

	public static void LoadGame() throws IOException {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Characters Name To Load");
		String playernameload = s.nextLine();

		System.out.println("Enter Characters Class To Load");
		String playerclassload = s.nextLine();

		System.out.println("Enter Characters Race To Load");
		String playerraceload = s.nextLine();

		System.out.println("Enter Characters Level To Load");
		String playerlevelload = s.nextLine();

		FileReader reader = new FileReader(
				"" + playernameload + playerclassload + playerraceload + playerlevelload + ".txt");
		BufferedReader bufferedReader = new BufferedReader(reader);

		// Player Attack
		String incombattxt = bufferedReader.readLine();
		if (incombattxt.compareTo("true") == 0) {
			setInCombat(true);
			System.out.println("You Are In Combat ");
		} else {
			setInCombat(false);
			System.out.println("You Are Not In Combat ");
		}

		String rangedtxt = bufferedReader.readLine();
		if (rangedtxt.compareTo("true") == 0) {
			setRanged(true);
			System.out.println("You Have A Bow ");
		} else {
			setRanged(false);
			System.out.println("You Do Not Have A Bow ");
		}
		String aimedtxt = bufferedReader.readLine();
		if (aimedtxt.compareTo("true") == 0) {
			setAimed(true);
			System.out.println("You Have Aimed A Bow ");
		} else {
			setAimed(false);
		}

		setWeaponDamage(Integer.parseInt(bufferedReader.readLine()));

		// Player Stats
		setPlayerName(bufferedReader.readLine());
		setPlayerHp(Integer.parseInt(bufferedReader.readLine()));
		setPlayerArmor(Integer.parseInt(bufferedReader.readLine()));
		setXp(Integer.parseInt(bufferedReader.readLine()));
		setPlayerLevel(Float.parseFloat(bufferedReader.readLine()));
		setPlayerKills(Integer.parseInt(bufferedReader.readLine()));

		// Player Bonus
		setStartFightBonus(Integer.parseInt(bufferedReader.readLine()));
		setAttackBonus(Integer.parseInt(bufferedReader.readLine()));
		setSightBonus(Integer.parseInt(bufferedReader.readLine()));
		setSmartsBonus(Integer.parseInt(bufferedReader.readLine()));
		setCharmBonus(Integer.parseInt(bufferedReader.readLine()));
		setDodgeBonus(Integer.parseInt(bufferedReader.readLine()));

		// PlayerRace/Class
		setPlayerRace(bufferedReader.readLine());
		setRaceStartFightBonus(Integer.parseInt(bufferedReader.readLine()));
		setRaceAttackBonus(Integer.parseInt(bufferedReader.readLine()));
		setRaceSightBonus(Integer.parseInt(bufferedReader.readLine()));
		setRaceSmartsBonus(Integer.parseInt(bufferedReader.readLine()));
		setRaceCharmBonus(Integer.parseInt(bufferedReader.readLine()));
		setRaceDodgeBonus(Integer.parseInt(bufferedReader.readLine()));

		// Class Bonus
		setPlayerclass(bufferedReader.readLine());
		setClassStartFightBonus(Integer.parseInt(bufferedReader.readLine()));
		setClassAttackBonus(Integer.parseInt(bufferedReader.readLine()));
		setClassSightBonus(Integer.parseInt(bufferedReader.readLine()));
		setClassSmartsBonus(Integer.parseInt(bufferedReader.readLine()));
		setClassCharmBonus(Integer.parseInt(bufferedReader.readLine()));
		setClassDodgeBonus(Integer.parseInt(bufferedReader.readLine()));
		Player.setPlayerName(bufferedReader.readLine());
	}
}