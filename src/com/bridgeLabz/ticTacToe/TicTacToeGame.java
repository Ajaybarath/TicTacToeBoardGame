package com.bridgeLabz.ticTacToe;

import java.util.Scanner;

public class TicTacToeGame {
	
	char[][] board;
	
	public TicTacToeGame() {
		board = new char[3][3];
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				board[i][j] = ' ';
			}
		}
	}
	
	public static void main(String args[]) {
		TicTacToeGame ticTacToe = new TicTacToeGame();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your position player 1");
		ticTacToe.play(s.nextInt(), s.nextInt(), 1);
		
		System.out.println("Enter your position player 2");
		ticTacToe.play(s.nextInt(), s.nextInt(), 2);
		
		ticTacToe.printBoard();
		
	}
	
	void play(int r, int c, int player) {
		r--;
		c--;
		
		if (player == 1) {
			board[r][c] = 'X';
		}
		else {
			board[r][c] = 'O';
		}
	}
	
	char checkStatus() {
		char winner = ' ';
		int flag = 0;
		for (int i=0;i<3;i++) {
			char temp = board[i][0];
			flag = 0;
			for (int j=0;j<3;j++) {
				if (board[i][j] == temp) {
					winner = temp;
				}
				else {
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
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				if (board[i][j] == ' ')
					System.out.print(" ");
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	

}
