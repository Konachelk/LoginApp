package org.konach.mf.service;

import java.util.HashMap;

import org.konach.mf.dto.User;

public class LoginService {
	HashMap<String, String> users = new HashMap<>();

	public LoginService() {
		users.put("jan", "Jan Kowalski");
		users.put("adam", "Adam Mickiewicz");

	}

	public boolean authenticate(String login, String password) {
		if (login == null || login.trim() == "" || password == null || password.trim() == "") {
			return false;
		}
		return true;
	}

	public User getUserDetails(String login) {
		User user = new User();
		user.setLogin(users.get(login));
		user.setUserId(login);
		return user;
	}
}