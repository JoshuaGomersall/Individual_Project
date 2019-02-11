package com.qa.HelloWorld;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Save_LoadTest 
{
	public static String playername = "Jeff";
	public static String overwritesave;	
	
	public static void main(String[] args) throws FileNotFoundException
	{
		int i = 1;
		while (i == 1)
		{
		SaveGame();
		}
	}
	public static void SaveGame() throws FileNotFoundException
	{
		Scanner s = new Scanner(System.in);
    	System.out.println("Enter Character Name");
    	playername = s.nextLine();
		
		
		
		File tmpDir = new File(playername + ".txt");
	    boolean exists = tmpDir.exists();
	    if (exists)
	    {
	    	System.out.println(playername+ " Is Already Saved ");	
	    	System.out.println("Would You Like To Overwrite The Save "+playername);
	    	overwritesave = s.nextLine(); 
	    	
	    	
	    	if (overwritesave.toLowerCase().equals("yes"))
	    	{
	    		PrintWriter out = new PrintWriter(playername + ".txt");
		    	System.out.println(playername + " Has Been Saved");
	    	}
	    	else 
	    	{
	    		System.out.println("Would You Like To Load " + playername);
	    		overwritesave = s.nextLine(); 
	    		System.out.println(playername + " Has Been Saved");
	    	}
	    }
	    else 
	    {
	    	PrintWriter out = new PrintWriter(playername + ".txt");
	    	System.out.println(playername+ " Is Now Made");
	    }
	}
}
