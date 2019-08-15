package com.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {
	//@JsonProperty
	@Id
	@Column(name="username")
	private String userName;
	//@JsonProperty
	@Column(name="username")
	private String pass;

}
