package com.bridgeLabz.ticTacToe;

public class TicTacToeGame {
	
	char[][] board;
	
	public TicTacToeGame() {
		board = new char[10][10];
		
		for (int i=0;i<10;i++) {
			for (int j=0;j<10;j++) {
				board[i][j] = ' ';
			}
		}
	}
	
	public static void main(String args[]) {
		TicTacToeGame ticTacToe = new TicTacToeGame();
	}
	
	void play(int r, int c, int player) {
		
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
		for (int i=0;i<10;i++) {
			char temp = board[i][0];
			flag = 0;
			for (int j=0;j<10;j++) {
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
	
	

}
