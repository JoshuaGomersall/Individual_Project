package Allies;

import java.util.Random;
import java.util.Scanner;

import AdventureGame.GameCharacter;
import Player.Player;

public class Allies extends GameCharacter {

	public Allies(int hp, int attack, int defence) {
		super(hp, attack, defence);
		// TODO Auto-generated constructor stub
	}

	public void dogfreindlyAI() {
		int dogCount = 0;
		int stickCount = 0;

		System.out.println("A Random Dog Appeared");
		int dogfreind = 0;

		int ai = 0;
		ai = 1 + new Random().nextInt(10);
		int r = (int) (Math.random() * 4);
		String dogtalk = new String[] { "Bark ", "Woof ", "Awuuu ", "Grrrrr" }[r];
		System.out.println(ai);

		Scanner s = new Scanner(System.in);
		System.out.println("How Would You Like To Respond");
		String input = s.nextLine();

		if (input.compareTo("play") == 0) {
			dogfreind += 1;
			System.out.println("The Dog Enjoyed That");
		} else if (input.compareTo("pet") == 0) {
			dogfreind += 1;
			System.out.println("The Dog Enjoyed That");
		} else if (input.compareTo("stick") == 0 && stickCount > 0) {
			stickCount--;
			dogfreind += 5;
			System.out.println("The Dog Would Like More Sticks It Made Him Very Happy");
		} else if (input.compareTo("stick") == 0 && stickCount <= 0) {
			System.out.println("You Have No More Sticks , That Made The Dog Sad :(");
			dogfreind -= 2;
		}

		if (dogfreind > 10) {
			dogfreind = 0;
			System.out.println("You Have Gained 1 Dog");
			dogCount = +1;
			System.out.println("You Currently Have :" + dogCount);
			Player.setInCombat(false);
		} else if (ai < 8 - dogfreind) {
			System.out.println("They Attack You");
		} else if (ai <= 10) {
			System.out.println("" + dogtalk);
			// PlayDog Bark Sound;
		}
	}
}
