package org.lessons.java.charscounter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci una parola");
		
//		Vars
		String word = in.nextLine();

//		Scanner close
		in.close();
		
//		Arrays
        Map<Character, Integer> countedChars = new HashMap<>();

//      Check characters
        for (char character : word.toCharArray()) {
            countedChars.put(character, countedChars.getOrDefault(character, 0) + 1);
        }

//      Print characters
        for (Map.Entry<Character, Integer> entry : countedChars.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
	}
}
