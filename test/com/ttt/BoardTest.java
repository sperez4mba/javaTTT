package com.ttt;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BoardTest {
	private Board board;

	@Before
	public void setUp() throws Exception {
		board = new Board(3, 3);
	}

	@Test
	public void testInitSquares() {
		for(int m=1; m <= board.getBoardSize(); m++) {
			assertEquals("-", board.getGivenSquare(m));
		}
	}

	@Test
	public void testGetSquares() {
		board.setGivenSquare(1, "O");
		board.setGivenSquare(2, "-");
		board.setGivenSquare(3, "-");
		board.setGivenSquare(4, "X");
		board.setGivenSquare(5, "X");
		board.setGivenSquare(6, "X");
		board.setGivenSquare(7, "-");
		board.setGivenSquare(8, "-");
		board.setGivenSquare(9, "O");
		String[] squares = {"O", "-", "-", "X", "X", "X", "-", "-", "O"};
		for(int k=1; k <= board.getBoardSize(); k++) {
			assertEquals(squares[k - 1], board.getGivenSquare(k));
		}
	}

	@Test
	public void testIsSquareEmpty() {
		board.setGivenSquare(1, "O");
		board.setGivenSquare(2, "O");
		board.setGivenSquare(3, "X");
		board.setGivenSquare(4, "X");
		board.setGivenSquare(5, "X");
		board.setGivenSquare(6, "X");
		board.setGivenSquare(7, "O");
		board.setGivenSquare(8, "-");
		board.setGivenSquare(9, "O");
		assertTrue(board.isSquareEmpty(8));
	}

	@Test
	public void testGetBoardSize() {
		assertEquals(9, board.getBoardSize());
	}
}
