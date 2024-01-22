package com.second.wordGame;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		MenuLogic ml = new MenuLogic();
		WordLogic wl = new WordLogic();
		ml.welcomeMenu();
		wl.actualWord();
		wl.placeHolder();
		
		
		
	}
}
