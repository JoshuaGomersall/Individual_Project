package EquitmentAndShops;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import Player.Player;

public class MeleeWeapon {

	public static void main(String[] args) throws IOException {
		String jeff = null;

		File statText = new File("meleeweaponlist.html");
		FileOutputStream is = new FileOutputStream(statText);
		OutputStreamWriter osw = new OutputStreamWriter(is);
		Writer w = new BufferedWriter(osw);
		w.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css.css\">\r\n" + "<h4>");
		((BufferedWriter) w).newLine();

		for (int i = 0; i < 10; i++) {
			int r = (int) (Math.random() * 10);
			if (r > 7) {
				w.write("<input type=\"checkbox\" >" + MakeMeleeWeapon(jeff, true));
			} else {
				w.write("<input type=\"checkbox\" >" + MakeMeleeWeapon(jeff, false));
			}
			((BufferedWriter) w).newLine();
			w.write("</br>");
			((BufferedWriter) w).newLine();
			w.write("</br>");
			((BufferedWriter) w).newLine();
		}
		w.close();
	}

	public static String MakeMeleeWeapon(String weaponName, boolean magical) {
		int r = (int) (Math.random() * 10);
		int r1 = (int) (Math.random() * 4);
		int r2 = (int) (Math.random() * 5);

		String prefix = new String[] { "Sharp", "Blunt", "Cursed", "Brocken", "Nasty", "Ferocious", "Contingent",
				"Sublime", "Dirty", "Clean" }[r];
		String Weapon = new String[] { "Sword", "Axe", "Hammer", "Rod" }[r1];
		String Suffix = new String[] { "Fire", "Ice", "Thunder", "Acid", "Dragon Slaying" }[r2];

		if (magical) {
			weaponName = prefix + " " + Weapon + " Of " + Suffix;
		} else {
			weaponName = prefix + " " + Weapon;
		}
		System.out.println(weaponName);
		return weaponName;
	}
}
