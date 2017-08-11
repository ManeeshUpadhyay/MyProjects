package com.aartek.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserLogin")
public class UserLoginDto {
	private Integer id;
	private String emailId = null;
	private String password = null;

	@Id
	@GeneratedValue 
	@Column(name = "id", nullable = false)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmailId() {
		return emailId;
	}

	@Column(name = "EmailId", length = 20, nullable = false)
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Column(name = "Password", length = 8, nullable = false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
