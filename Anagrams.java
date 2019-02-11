package com.qa.HelloWorld;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Anagrams {
	public static void main(String[] args) throws IOException 
	{
		ReadFromFile();
		abcsort();
	}
	private static void ReadFromFile() throws IOException 
	{
		String fileName = "ReadTest.txt";
		File file = new File(fileName);
		String lineout;
		List<String> fileWords = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(file));) 
		{
			while ((lineout = br.readLine()) != null) 
			{
				fileWords.add(lineout);
			}
		}
		
		//Remove Dupes
        List<String> newList = fileWords.stream().distinct().collect(Collectors.toList()); 
        fileWords = newList;
         
		System.out.println("Names Currently Used " + fileWords);
	}
	
	private static void abcsort()
	{
		String input = "agxsc";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Some Letters ");
		List<String> wordIn = new ArrayList<>();
		input = s.nextLine();
		
		int i = 0;
		
		
		while (i < input.length())
		{
			wordIn.add("" + input.charAt(i));
			i++;
		}
		System.out.println("Letters" + wordIn);
		List<String> sorted;
		sorted = wordIn.stream().sorted().collect(Collectors.toList());
		System.out.println("Letters Sorted " + sorted);
	}
}