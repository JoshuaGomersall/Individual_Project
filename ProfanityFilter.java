package com.qa.HelloWorld;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ProfanityFilter {
	public static void main(String[] args) throws IOException {

		String word;

		Scanner s = new Scanner(System.in);
		System.out.println("Input A Name");
		word = s.nextLine();

		if (word.toUpperCase().contains("")) {
			System.out.println("You Did Not Input A Name Or You Had A Space In It");
		}

		File file = new File("fileName.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		while (word != "") {
			if ((word.toUpperCase().contains("" + br.readLine()))) {
				System.out.println("You Did Not Input A Name Or You Had A Space In It");
			}
		}

	}
}