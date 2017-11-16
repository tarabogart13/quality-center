package de.logicline.splash.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

/** 
 * Type representing the User database table.
 * 
 */
@Entity
public class UserEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(nullable = false)
	private String userId;

	private String username;

	private String password;
	
	@Transient
	private String clearTextPasswd;


	private String token;

	private String role;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getClearTextPasswd() {
		return clearTextPasswd;
	}
	
	public void setClearTextPasswd(String clearTextPasswd) {
		this.clearTextPasswd = clearTextPasswd;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
