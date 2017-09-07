package com.amitesh.bubbleBlast;

import java.util.Random;

public class BubbleBlastBoard {

	int[][] board;

	public BubbleBlastBoard(int row, int col) {
		this.board = new int[row][col];
	}

	public void fillColour(int noOfColour) {

		Random r = new Random();

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				int x = r.nextInt(board.length);
				int y = r.nextInt(board[0].length);
				board[i][j] = r.nextInt(noOfColour);
			}
		}
	}

	public void print() {

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(" " + board[i][j]);
			}
			System.out.println();
		}
	}

	public void printColourBoard() {
		for (int i = 0; i < board[0].length; i++) {
			System.out.print(" _ _");
		}
		System.out.println();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length + 1; j++) {
				System.out.print("|");
				if (j != board[0].length) {
					if (board[i][j] == 0) {
						System.out.print("_" + "R" + "_");
					}
					if (board[i][j] == 1) {
						System.out.print("_" + "G" + "_");
					}
					if (board[i][j] == 2) {
						System.out.print("_" + "B" + "_");
					}
					if (board[i][j] == 3) {
						System.out.print("_" + "Y" + "_");
					}
					if (board[i][j] == -1) {
						System.out.print("_" + " " + "_");
					}
				}

			}
			System.out.println();
		}

	}

	public void blastIndex(int row, int col) {
		int colour = board[row][col];
		board[row][col] = -1;

		if (board[row][col] != colour) {

			if (row - 1 >= 0 && row - 1 < board.length && col < board[0].length
					&& col >= 0) {
				if (board[row - 1][col] == colour) {
					blastIndex(row - 1, col);

				}

			}
			if (row >= 0 && row < board.length && col - 1 >= 0
					&& col - 1 < board[0].length) {
				if (board[row][col - 1] == colour) {
					blastIndex(row, col - 1);
				}

			}
			if (row >= 0 && row < board.length && col + 1 < board[0].length
					&& col + 1 >= 0) {
				if (board[row][col + 1] == colour) {
					blastIndex(row, col + 1);
				}

			}

		}
	}

	// private int count = 0;
	// int[] arr = new int[5];
	// public void shiftColours() {
	//
	// for (int j = 0; j < board[0].length; j++) {
	// count=0;
	// for (int i = 0; i < board.length; i++) {
	//
	// if (board[i][j] == -1) {
	// count++;
	// }
	// arr[j]=count;
	// }
	// // System.out.println(count);
	//
	// }
	// for (int i = 0; i < arr.length; i++) {
	// System.out.println(arr[i]);
	// }
	//
	// }

	/**
	 * 
	 */
	public void shiftColours() {

		for (int j = 0; j < board[0].length; j++) {
			for (int i = 0; i < board.length; i++) {
				if (board[i][j] == -1) {
					int k = i;
					for (; k > 0; k--) {
						board[k][j] = board[k - 1][j];
					}
					board[k][j] = -1;
				}
			}
		}
	}

}