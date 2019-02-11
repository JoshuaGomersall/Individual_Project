package EquitmentAndShops;

import java.awt.print.Paper;
import java.util.Random;
import java.util.Scanner;

import Player.Player;

public class Shop
{
	
	public static void main(String[] args) {
		
	}
	
	public static void Shop() 
	{
		Player.setShopping(true);
		int shopgold = 20 + new Random().nextInt(150); // [0...6]
		int itemcost = 10;
		int r = (int) (Math.random() * 4);
		int quant = 1 + (int) (Math.random() * 10);
		String items = new String[] { "Iron Sword", "Arrow", "Undergarment", "Stick" }[r];
		String itemscosts = new String[] { "10", "2", "5", "1" }[r];
		Scanner s = new Scanner(System.in);
		System.out.println("");
		System.out.println("Shop Gold : " + shopgold);
		System.out.println("Greeting , Are You Interested In My Items");
		itemcost = Integer.parseInt(itemscosts) * quant;
		// 10%off
		itemcost *= 0.90;

		if (quant > 1) {
			System.out.println("I Have " + quant + " " + items + "s");
			System.out.println("Ill Give Em' All To You For " + itemcost + " Gold");
		} else if (quant == 1) {
			System.out.println("I Have A " + items);
			System.out.println("Ill Give It To You For " + itemcost + " Gold");
		} else {
			System.out.println("I Have A Error Message :( ");
		}

		String input = s.nextLine();
		if (input.toLowerCase().compareTo("yes") == 0) {
			System.out.println("You Got " + quant + " " + items + "s " + "For The Cost Of " + itemcost);
		} else if (input.toLowerCase().compareTo("no") == 0) 
		{
			System.out.println("Bye I Will See You Later ");
			Player.setShopping(false);
		}
	}
}
