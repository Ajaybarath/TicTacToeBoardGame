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

	}

	void play(int r, int c, int player) {
		r--;
		c--;

		if (player == 1) {
			board[r] = 'X';
		} else {
			board[r] = 'O';
		}
	}

	char checkStatus() {
		char winner = ' ';
		int flag = 0;
		for (int i = 0; i < 3; i++) {
			char temp = board[i];
			flag = 0;
			for (int j = 0; j < 3; j++) {
				if (board[i] == temp) {
					winner = temp;
				} else {
					flag = 1;
					break;
				}
			}
		}

		if (flag == 0) {
			return winner;
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
