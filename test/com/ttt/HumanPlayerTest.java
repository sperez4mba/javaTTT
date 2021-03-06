package com.ttt;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HumanPlayerTest {
	private HumanPlayer humanPlayer;
	private String token;

	@Before
	public void setUp() throws Exception {
		token = "X";
		humanPlayer = new HumanPlayer(token);
	}
	
	@Test
	public void testGetPlayerOrder() {
		assertEquals(1, humanPlayer.getPlayerOrder());
	}
	
	@Test
	public void testGetToken() {
		assertEquals("X", humanPlayer.getToken());
	}
	
	@Test
	public void isMachine() {
		assertFalse(humanPlayer.isMachine());
	}

	@Test
	public void testGetNextMove(){
		Board board = new Board(3, 3);
		int position = 9;
		String[] squaresWithNextMove = {"-","-","-","-","-","-","-","-","X"};
		board = humanPlayer.getNextMove(board, position);
		for(int i=0; i < board.getBoardSize(); i++) {
			assertEquals(squaresWithNextMove[i], board.getGivenSquare(i + 1));
		}
	}
}
