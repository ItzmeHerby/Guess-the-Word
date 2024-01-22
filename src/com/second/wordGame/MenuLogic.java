package com.second.wordGame;

import java.util.Scanner;

public class MenuLogic {

	
	Scanner sc = new Scanner(System.in);
	static String user1;
	static String user2;
	int option;
	// 1. Welcome
	// 2. Menu selecting adding names for User.
	// 3. Exiting the game

	public void welcomeMenu() throws InterruptedException

	{
		System.out.println("Hello players welcome to Guess the Word Game");
		Thread.sleep(1500);
		menu();

	}

	public int menu() {
		System.out.println("\nMenu");
		System.out.println("Select 1 for adding user names for the game");
		System.out.println("Select 2 for exiting the game");
		int opt = sc.nextInt() ;
		this.option = opt ;
		sc.nextLine();
		System.out.println(option);
		if (option == 1 || option == 2)
		{
			// handle exception if other than int is entered
			menuChoice();
			
		}
		else 
		{
			System.out.println("\nSelect 1 or 2 for menu selection");
			menu();
		}
		
		return option ;
		
	}

	
	public void menuChoice()
	{
	{
		switch (option) {
		case 1:
			selectUserName();
			break;
		case 2:
			exit();
			break ;
		
		}
	}
	}

	public void selectUserName() {
		
		System.out.println("Please enter a user name for Player 1");
		this.user1 = sc.nextLine(); // before this if there's sc.nextInt() it could be a problem
		System.out.println("Please enter a user name for Player 2");
		this.user2 = sc.nextLine();
		System.out.println("*****Welcome Players*****");
		System.out.println("Player 1 : " + this.user1 + "\nPlayer 2 : " + this.user2);
		
	}

	public void exit() {
		System.exit(0);
	}
}
