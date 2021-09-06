package com.bridgeLabz.ticTacToe;

import java.util.Scanner;

public class TicTacToeGame {

	char[] board;
	char player = 'X';
	char computer = 'O';

	public TicTacToeGame() {
		board = new char[10];

		for (int i = 0; i < 10; i++) {
			board[i] = ' ';
		}
	}

	public static void main(String args[]) {
		TicTacToeGame ticTacToe = new TicTacToeGame();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your symbol");
		ticTacToe.player = s.next().toUpperCase().charAt(0);
		ticTacToe.computer = ticTacToe.player == 'X' ? 'O' : 'X';

		ticTacToe.printBoard();

		System.out.println("Do you choose heads or tail (1 or 0) to start the game");
		int toss = s.nextInt();
		int turn = 0;
		if (Math.floor(Math.random() * 10) % 2 == toss) {
			System.out.println("Winner! you can start the game");
			turn = 1;
		} else {
			System.out.println("Oooh! computer will start the game");
		}

		while (ticTacToe.checkStatus() == ' ') {

			if (turn == 1) {
				System.out.println("Enter your position to play");
				int position = s.nextInt();
				ticTacToe.play(position, turn);
				turn = 0;
			} else {
				System.out.println("Computer making a play");
				ticTacToe.computerPlay();
				turn = 1;
			}
			ticTacToe.printBoard();
		}
		
		System.out.println(ticTacToe.checkStatus() + " won the game");

	}

	void computerPlay() {
		int position = 0;
		position = winningPosition();
		if (position == 0) {
			position = opponentWiningPosition();
		}

		if (position == 0) {
			if (board[1] == ' ')
				position = 1;
			else if (board[3] == ' ')
				position = 3;
			else if (board[7] == ' ')
				position = 7;
			else if (board[9] == ' ')
				position = 9;
			else if (board[5] == ' ')
				position = 5;
		}
		play(position, 0);
	}

	private int opponentWiningPosition() {
		if (board[1] == board[2] && board[3] == ' ' && board[1] == player) {
			return 3;
		}
		if (board[2] == board[3] && board[1] == ' ' && board[2] == player) {
			return 1;
		}
		if (board[1] == board[3] && board[2] == ' ' && board[1] == player) {
			return 2;
		}

		if (board[4] == board[5] && board[6] == ' ' && board[4] == player) {
			return 6;
		}
		if (board[6] == board[5] && board[4] == ' ' && board[6] == player) {
			return 4;
		}
		if (board[4] == board[6] && board[5] == ' ' && board[4] == player) {
			return 5;
		}

		if (board[7] == board[8] && board[9] == ' ' && board[7] == player) {
			return 9;
		}
		if (board[9] == board[8] && board[7] == ' ' && board[9] == player) {
			return 7;
		}
		if (board[7] == board[9] && board[8] == ' ' && board[7] == player) {
			return 8;
		}

		if (board[1] == board[4] && board[7] == ' ' && board[1] == player) {
			return 7;
		}
		if (board[7] == board[4] && board[1] == ' ' && board[7] == player) {
			return 1;
		}
		if (board[1] == board[7] && board[4] == ' ' && board[1] == player) {
			return 4;
		}

		if (board[2] == board[5] && board[8] == ' ' && board[2] == player) {
			return 8;
		}
		if (board[8] == board[5] && board[2] == ' ' && board[5] == player) {
			return 2;
		}
		if (board[2] == board[8] && board[5] == ' ' && board[2] == player) {
			return 5;
		}

		if (board[3] == board[6] && board[9] == ' ' && board[3] == player) {
			return 9;
		}
		if (board[9] == board[6] && board[3] == ' ' && board[9] == player) {
			return 3;
		}
		if (board[3] == board[9] && board[6] == ' ' && board[3] == player) {
			return 6;
		}

		if (board[1] == board[5] && board[9] == ' ' && board[1] == player) {
			return 9;
		}
		if (board[9] == board[5] && board[1] == ' ' && board[9] == player) {
			return 1;
		}
		if (board[1] == board[7] && board[5] == ' ' && board[1] == player) {
			return 5;
		}

		if (board[3] == board[4] && board[7] == ' ' && board[3] == player) {
			return 7;
		}
		if (board[5] == board[4] && board[3] == ' ' && board[5] == player) {
			return 3;
		}
		if (board[3] == board[7] && board[5] == ' ' && board[3] == player) {
			return 5;
		}

		return 0;
	}

	private int winningPosition() {

		if (board[1] == board[2] && board[3] == ' ' && board[1] == computer) {
			return 3;
		}
		if (board[2] == board[3] && board[1] == ' ' && board[2] == computer) {
			return 1;
		}
		if (board[1] == board[3] && board[2] == ' ' && board[1] == computer) {
			return 2;
		}

		if (board[4] == board[5] && board[6] == ' ' && board[4] == computer) {
			return 6;
		}
		if (board[6] == board[5] && board[4] == ' ' && board[6] == computer) {
			return 4;
		}
		if (board[4] == board[6] && board[5] == ' ' && board[4] == computer) {
			return 5;
		}

		if (board[7] == board[8] && board[9] == ' ' && board[7] == computer) {
			return 9;
		}
		if (board[9] == board[8] && board[7] == ' ' && board[9] == computer) {
			return 7;
		}
		if (board[7] == board[9] && board[8] == ' ' && board[7] == computer) {
			return 8;
		}

		if (board[1] == board[4] && board[7] == ' ' && board[1] == computer) {
			return 7;
		}
		if (board[7] == board[4] && board[1] == ' ' && board[7] == computer) {
			return 1;
		}
		if (board[1] == board[7] && board[4] == ' ' && board[1] == computer) {
			return 4;
		}

		if (board[2] == board[5] && board[8] == ' ' && board[2] == computer) {
			return 8;
		}
		if (board[8] == board[5] && board[2] == ' ' && board[5] == computer) {
			return 2;
		}
		if (board[2] == board[8] && board[5] == ' ' && board[2] == computer) {
			return 5;
		}

		if (board[3] == board[6] && board[9] == ' ' && board[3] == computer) {
			return 9;
		}
		if (board[9] == board[6] && board[3] == ' ' && board[9] == computer) {
			return 3;
		}
		if (board[3] == board[9] && board[6] == ' ' && board[3] == computer) {
			return 6;
		}

		if (board[1] == board[5] && board[9] == ' ' && board[1] == computer) {
			return 9;
		}
		if (board[9] == board[5] && board[1] == ' ' && board[9] == computer) {
			return 1;
		}
		if (board[1] == board[7] && board[5] == ' ' && board[1] == computer) {
			return 5;
		}

		if (board[3] == board[4] && board[7] == ' ' && board[3] == computer) {
			return 7;
		}
		if (board[5] == board[4] && board[3] == ' ' && board[5] == computer) {
			return 3;
		}
		if (board[3] == board[7] && board[5] == ' ' && board[3] == computer) {
			return 5;
		}

		return 0;
	}

	void play(int position, int turn) {

		if (board[position] == ' ' && position < 10) {
			if (turn == 1) {
				board[position] = player;
			} else {
				board[position] = computer;
			}
		} else {
			System.out.println("choose a valid position");
		}

	}

	char checkStatus() {

		if (board[1] == board[2] && board[2] == board[3] && board[3] != ' ') {
			return board[0];
		}

		else if (board[4] == board[5] && board[5] == board[6] && board[5] != ' ') {
			return board[6];
		}

		else if (board[7] == board[8] && board[8] == board[9] && board[8] != ' ') {
			return board[9];
		}

		else if (board[1] == board[4] && board[4] == board[7] && board[4] != ' ') {
			return board[7];
		}

		else if (board[2] == board[5] && board[5] == board[8] && board[8] != ' ') {
			return board[8];
		}

		else if (board[3] == board[6] && board[6] == board[9] && board[6] != ' ') {
			return board[9];
		}

		else if (board[1] == board[5] && board[5] == board[9] && board[5] != ' ') {
			return board[9];
		}

		else if (board[3] == board[4] && board[5] == board[7] && board[7] != ' ') {
			return board[7];
		}

		return ' ';

	}

	void printBoard() {
		for (int i = 1; i < 10; i++) {

			if (board[i] == ' ')
				System.out.print("|");
			System.out.print(board[i] + " ");

			if (i % 3 == 0)
				System.out.println();
		}
	}

}
