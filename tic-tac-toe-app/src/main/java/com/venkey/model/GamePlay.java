package com.venkey.model;

import lombok.Data;

@Data
public class GamePlay {

	private TicToe type;
	private Integer coordinateX;
	private Integer coordinateY;
	private String gameId;

	public GamePlay() {
		super();
	}

	public GamePlay(TicToe type, Integer coordinateX, Integer coordinateY, String gameId) {
		super();
		this.type = type;
		this.coordinateX = coordinateX;
		this.coordinateY = coordinateY;
		this.gameId = gameId;
	}

	public TicToe getType() {
		return type;
	}

	public void setType(TicToe type) {
		this.type = type;
	}

	public Integer getCoordinateX() {
		return coordinateX;
	}

	public void setCoordinateX(Integer coordinateX) {
		this.coordinateX = coordinateX;
	}

	public Integer getCoordinateY() {
		return coordinateY;
	}

	public void setCoordinateY(Integer coordinateY) {
		this.coordinateY = coordinateY;
	}

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	@Override
	public String toString() {
		return "GamePlay [type=" + type + ", coordinateX=" + coordinateX + ", coordinateY=" + coordinateY + ", gameId="
				+ gameId + "]";
	}

}
