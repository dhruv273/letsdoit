package com.letsdoit.letsdoit;

public final class ImmutableClass {

	private String name;
	private String password;

	private ImmutableClass() {

	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

}
