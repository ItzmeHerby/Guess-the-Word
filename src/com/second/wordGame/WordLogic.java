package com.second.wordGame;

import java.util.Arrays;
import java.util.Scanner;

public class WordLogic extends MenuLogic {

	String word;
	String placeholder; // for user 2 to guess
	String copyWord; // used for matching purpose

	Scanner sc = new Scanner(System.in);
	int x = 30;

	public String actualWord() {

		System.out.println(super.user1 + " Please enter a word for " + super.user2 + " to guess");
		this.word = sc.nextLine();
		System.out.println(this.word); // actualword
		while (x > 0) {
			System.out.println(" ");
			x--;
		}
		wordDescription();
		return word;

	}

	public void wordDescription() {
		char letter[] = this.word.toCharArray();
		int count = 0;
		for (int i = 0; i < letter.length; i++) {
			count++;
		}
		System.out.println(super.user1 + " has entered the word containing " + count + " letters"
				+ " starting from letter " + letter[0] + " ending with letter " + letter[letter.length - 1]);
	}

	public void placeHolder() {
		char arr1[] = word.toCharArray();
		char arr2[] = new char[arr1.length];

		{
			for (int i = 0; i < arr2.length; i++) {
				arr2[i] = '#';
			}
		}

		System.out.println(arr2);
		
		gameLogic(arr1, arr2);
	}

	public void gameLogic(char arr1[], char arr2[]) {
		
		while (!Arrays.equals(arr1, arr2))
		{
			
		System.out.println("Please enter a letter");
		char userLetter = sc.nextLine().charAt(0);
		
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == userLetter) {
				System.out.println("You have entered correct letter " + userLetter);
				arr2[i] = arr1[i];
			}
			
		}
		System.out.println(arr2);
		
		}
		
		winner(arr1 , arr2 , word);
	}
	
	public void winner(char arr1[] , char arr2[] , String word)
	{
		this.copyWord = this.word ;
		System.out.println("Congratulation the word was "+this.copyWord+ " you have guessed it right");
	}

}
