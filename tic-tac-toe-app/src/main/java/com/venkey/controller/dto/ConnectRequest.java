package com.venkey.controller.dto;

import com.venkey.model.Player;
import lombok.Data;

@Data
public class ConnectRequest {
	private Player player;
	private String gameId;

	public ConnectRequest() {
		super();
	}

	public ConnectRequest(Player player) {
		super();
		this.player = player;
	}

	public ConnectRequest(String gameId) {
		super();
		this.gameId = gameId;
	}

	public ConnectRequest(Player player, String gameId) {
		super();
		this.player = player;
		this.gameId = gameId;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	@Override
	public String toString() {
		return "ConnectRequest [player=" + player + ", gameId=" + gameId + "]";
	}

}
