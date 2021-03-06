package com.ttt;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MachinePlayerTest {

	private MachinePlayer machinePlayer;
	private String token;

	@Before
	public void setUp() throws Exception {
		token = "O";
		machinePlayer = new MachinePlayer(token);
	}
	
	@Test
	public void testGetPlayerOrder() {
		assertEquals(2, machinePlayer.getPlayerOrder());
	}
	
	@Test
	public void testGetToken() {
		assertEquals("O", machinePlayer.getToken());
	}
	
	@Test
	public void isMachine() {
		assertTrue(machinePlayer.isMachine());
	}

	@Test
	public void testGetNextMove(){
		Board board = new Board(3, 3);
		int position = -1;
		String[] squaresWithNextMove = {"O","-","-","-","-","-","-","-","-"};
		board = machinePlayer.getNextMove(board, position);
		for(int i=0; i < board.getBoardSize(); i++) {
			assertEquals(squaresWithNextMove[i], board.getGivenSquare(i + 1));
		}
	}
}
