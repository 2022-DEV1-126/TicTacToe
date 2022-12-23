package com.venkey.model;

import java.util.Arrays;

import lombok.Data;

@Data
public class Game {

	private String gameId;
	private Player player1;
	private Player player2;
	private GameStatus status;
	private int[][] board;
	private TicToe winner;

	public Game() {
		super();
	}

	public Game(String gameId, Player player1, Player player2, GameStatus status, int[][] board, TicToe winner) {
		super();
		this.gameId = gameId;
		this.player1 = player1;
		this.player2 = player2;
		this.status = status;
		this.board = board;
		this.winner = winner;
	}

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	public GameStatus getStatus() {
		return status;
	}

	public void setStatus(GameStatus status) {
		this.status = status;
	}

	public int[][] getBoard() {
		return board;
	}

	public void setBoard(int[][] board) {
		this.board = board;
	}

	public TicToe getWinner() {
		return winner;
	}

	public void setWinner(TicToe winner) {
		this.winner = winner;
	}

	@Override
	public String toString() {
		return "Game [gameId=" + gameId + ", player1=" + player1 + ", player2=" + player2 + ", status=" + status
				+ ", board=" + Arrays.toString(board) + ", winner=" + winner + "]";
	}

}
