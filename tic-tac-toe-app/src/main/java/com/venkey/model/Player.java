package com.venkey.model;

import lombok.Data;

@Data
public class Player {

	private String login;

	public Player() {
		super();
	}

	public Player(String login) {
		super();
		this.login = login;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Override
	public String toString() {
		return "Player [login=" + login + "]";
	}

}
