package com.antra.conversion.roles;

/**
 * @author Sivakanth
 */
public class User {

	public User(Integer uId, String role) {
		super();
		this.uId = uId;
		this.role = role;
	}

	private Integer uId;

	private String role;

	public Integer getuId() {
		return uId;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [uId=" + uId + ", role=" + role + "]";
	}
}