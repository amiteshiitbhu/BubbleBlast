package com.amitesh.bubbleBlast;

public class Main {

	public static void main(String[] args) {

		BubbleBlastBoard blastBoard = new BubbleBlastBoard(10, 10);

		blastBoard.fillColour(2);

		blastBoard.print();

		blastBoard.printColourBoard();

		blastBoard.blastIndex(9, 0);

		blastBoard.printColourBoard();

//		blastBoard.print();

		blastBoard.shiftColours();

		blastBoard.printColourBoard();
		
		

	}

}
