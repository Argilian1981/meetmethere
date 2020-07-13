package com.myproject.meetmethere.model;

import javax.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
public class Socialite {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String nick;
	private String email;
	private String contact;
	private String password;
	private String status;
	@ManyToMany
	@JoinTable(name = "socialite_social_group" , joinColumns = @JoinColumn(name = "socialite_id") ,
	inverseJoinColumns = @JoinColumn(name = "social_group_id"))
	private Set<SocialGroup> socialGroups;
	
	protected Socialite() {
		
	}

	public Socialite(Integer id, String name, String nick, String email, String contact, String password, String status,
			Set<SocialGroup> socialGroups) {
		super();
		this.id = id;
		this.name = name;
		this.nick = nick;
		this.email = email;
		this.contact = contact;
		this.password = password;
		this.status = status;
		this.socialGroups = socialGroups;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set<SocialGroup> getSocialGroups() {
		return socialGroups;
	}

	public void setSocialGroups(Set<SocialGroup> socialGroups) {
		this.socialGroups = socialGroups;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Socialite socialite = (Socialite) o;
		return id.equals(socialite.id) &&
				Objects.equals(name, socialite.name) &&
				Objects.equals(nick, socialite.nick) &&
				Objects.equals(email, socialite.email) &&
				Objects.equals(contact, socialite.contact) &&
				Objects.equals(password, socialite.password) &&
				Objects.equals(status, socialite.status) &&
				Objects.equals(socialGroups, socialite.socialGroups);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, nick, email, contact, password, status, socialGroups);
	}
}
