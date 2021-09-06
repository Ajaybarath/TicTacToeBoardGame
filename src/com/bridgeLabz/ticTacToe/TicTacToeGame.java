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
		if (Math.floor(Math.random() * 10) % 2 == toss) {
			System.out.println("Winner! you can start the game");
		} else {
			System.out.println("Oooh! computer will start the game");
		}

	}

	void play(int position, int turn) {

		if (board[position] == ' ' && position < 10) {
			if (turn == 0) {
				board[position] = player;
			} else {
				board[position] = computer;
			}
		} else {
			System.out.println("choose a valid position");
		}

	}

	char checkStatus() {

		if (board[1] == board[2] && board[2] == board[3]) {
			return board[0];
		}

		else if (board[4] == board[5] && board[5] == board[6]) {
			return board[6];
		}

		else if (board[7] == board[8] && board[8] == board[9]) {
			return board[9];
		}

		else if (board[1] == board[4] && board[4] == board[7]) {
			return board[7];
		}

		else if (board[2] == board[5] && board[5] == board[8]) {
			return board[8];
		}

		else if (board[3] == board[6] && board[6] == board[9]) {
			return board[9];
		}

		else if (board[1] == board[5] && board[5] == board[9]) {
			return board[9];
		}

		else if (board[3] == board[4] && board[5] == board[7]) {
			return board[7];
		}

		return ' ';

	}

	void printBoard() {
		for (int i = 1; i < 10; i++) {

			if (board[i] == ' ')
				System.out.print("_");
			System.out.print(board[i] + " ");

			if (i % 3 == 0)
				System.out.println();
		}
	}

}
